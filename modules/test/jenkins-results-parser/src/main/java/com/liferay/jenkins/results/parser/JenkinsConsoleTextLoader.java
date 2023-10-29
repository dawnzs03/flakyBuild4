/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.jenkins.results.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * @author Peter Yoo
 */
public class JenkinsConsoleTextLoader {

	public JenkinsConsoleTextLoader(String buildURL) {
		this(buildURL, false);
	}

	public JenkinsConsoleTextLoader(
		String buildURL, boolean bypassConsoleLogSizeLimit) {

		this.buildURL = JenkinsResultsParserUtil.getLocalURL(buildURL);
		this.bypassConsoleLogSizeLimit = bypassConsoleLogSizeLimit;

		consoleLogFileKey = JenkinsResultsParserUtil.combine(
			"jenkins_console_log-", String.valueOf(buildURL.hashCode()),
			".log");

		JenkinsResultsParserUtil.saveToCacheFile(consoleLogFileKey, "");

		serverLogSize = 0;
	}

	public String getConsoleText() {
		if (buildURL.startsWith("file:") || buildURL.contains("mirrors")) {
			try {
				return JenkinsResultsParserUtil.toString(
					buildURL + "/consoleText", false, true);
			}
			catch (IOException ioException) {
				throw new RuntimeException(ioException);
			}
		}

		update();

		String consoleText = JenkinsResultsParserUtil.getCachedText(
			consoleLogFileKey);

		if (truncated) {
			consoleText = consoleText + "\n[TRUNCATED]";
		}

		return consoleText;
	}

	public int getLineCount() {
		String consoleLog = getConsoleText();

		String[] consoleLogLines = consoleLog.split("\n");

		return consoleLogLines.length;
	}

	public boolean hasMoreData() {
		return hasMoreData;
	}

	protected synchronized void update() {
		Retryable<Object> retryable = new Retryable<Object>(true, 3, 5, true) {

			@Override
			public Object execute() {
				try {
					_update();
				}
				catch (IOException ioException) {
					serverLogSize = 0;

					throw new RuntimeException(ioException);
				}

				return null;
			}

		};

		retryable.executeWithRetries();
	}

	protected String buildURL;
	protected boolean bypassConsoleLogSizeLimit;
	protected String consoleLogFileKey;
	protected boolean hasMoreData = true;
	protected long serverLogSize;
	protected boolean truncated;

	private synchronized void _update() throws IOException {
		boolean hasMoreData = true;

		long cacheFileSize = JenkinsResultsParserUtil.getCacheFileSize(
			consoleLogFileKey);

		while (hasMoreData &&
			   (bypassConsoleLogSizeLimit ||
				(cacheFileSize < _BYTES_MAX_SIZE_CONSOLE_LOG))) {

			String url =
				buildURL + "/logText/progressiveHtml?start=" + serverLogSize;

			try {
				URL urlObject = new URL(
					JenkinsResultsParserUtil.getLocalURL(url));

				HttpURLConnection httpURLConnection =
					(HttpURLConnection)urlObject.openConnection();

				long latestServerLogSize = httpURLConnection.getHeaderFieldLong(
					"X-Text-Size", serverLogSize);

				if (latestServerLogSize == serverLogSize) {
					break;
				}

				try (BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
							httpURLConnection.getInputStream()))) {

					String line = bufferedReader.readLine();

					while (line != null) {
						Matcher matcher = _anchorPattern.matcher(line);

						line = matcher.replaceAll("$1") + "\n";

						line = StringEscapeUtils.unescapeHtml(line);

						JenkinsResultsParserUtil.appendToCacheFile(
							consoleLogFileKey, line);

						if (!bypassConsoleLogSizeLimit) {
							cacheFileSize =
								JenkinsResultsParserUtil.getCacheFileSize(
									consoleLogFileKey);

							if (cacheFileSize >= _BYTES_MAX_SIZE_CONSOLE_LOG) {
								try {
									truncated = true;

									break;
								}
								finally {
									String message =
										JenkinsResultsParserUtil.combine(
											"Jenkins console log for ",
											buildURL, " has exceeded ",
											String.valueOf(
												_BYTES_MAX_SIZE_CONSOLE_LOG),
											" bytes.");

									System.out.println(message);

									NotificationUtil.sendEmail(
										message, "jenkins", "Large console log",
										"qa-slave-verify-fail@liferay.com");
								}
							}
						}

						line = bufferedReader.readLine();
					}

					hasMoreData = Boolean.parseBoolean(
						httpURLConnection.getHeaderField("X-More-Data"));

					serverLogSize = latestServerLogSize;
				}
			}
			catch (MalformedURLException malformedURLException) {
				throw new IllegalArgumentException(
					"Invalid buildURL " + buildURL, malformedURLException);
			}
			catch (IOException ioException) {
				String message = ioException.getMessage();

				if (message.contains("Premature EOF")) {
					System.out.println("Premature EOF: " + buildURL);

					throw ioException;
				}

				System.out.println(
					"Unable to update console log for build: " + buildURL);

				ioException.printStackTrace();

				return;
			}
		}
	}

	private static final long _BYTES_MAX_SIZE_CONSOLE_LOG = 1024 * 1024 * 20;

	private static final Pattern _anchorPattern = Pattern.compile(
		"\\<a[^>]*\\>(?<text>[^<]*)\\</a\\>");

}