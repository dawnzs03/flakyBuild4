/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.remote.soap.extender.test;

import com.liferay.portal.kernel.security.xml.SecureXMLFactoryProviderUtil;

import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

/**
 * @author Carlos Sierra Andrés
 */
public class SampleHandler implements LogicalHandler<LogicalMessageContext> {

	public SampleHandler() {
		_transformerFactory =
			SecureXMLFactoryProviderUtil.newTransformerFactory();

		_url = SampleHandler.class.getResource("dependencies/template.xsl");
	}

	@Override
	public void close(MessageContext messageContext) {
	}

	@Override
	public boolean handleFault(LogicalMessageContext logicalMessageContext) {
		return true;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext logicalMessageContext) {
		try {
			boolean outboundMessage = (boolean)logicalMessageContext.get(
				MessageContext.MESSAGE_OUTBOUND_PROPERTY);

			if (!outboundMessage) {
				return true;
			}

			LogicalMessage logicalMessage = logicalMessageContext.getMessage();

			Transformer transformer = _transformerFactory.newTransformer(
				new StreamSource(_url.openStream()));

			DOMResult domResult = new DOMResult();

			transformer.transform(logicalMessage.getPayload(), domResult);

			logicalMessage.setPayload(new DOMSource(domResult.getNode()));

			return true;
		}
		catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	private final TransformerFactory _transformerFactory;
	private final URL _url;

}