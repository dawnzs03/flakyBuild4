/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.digital.signature.model;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.time.LocalDateTime;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 * @author José Abelenda
 */
public class DSEnvelope {

	public LocalDateTime getCreatedLocalDateTime() {
		return createdLocalDateTime;
	}

	public List<DSDocument> getDSDocuments() {
		return dsDocuments;
	}

	public String getDSEnvelopeId() {
		return dsEnvelopeId;
	}

	public List<DSRecipient> getDSRecipients() {
		return dsRecipients;
	}

	public String getEmailBlurb() {
		return emailBlurb;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public String getName() {
		return name;
	}

	public String getSenderEmailAddress() {
		return senderEmailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setCreatedLocalDateTime(LocalDateTime createdLocalDateTime) {
		this.createdLocalDateTime = createdLocalDateTime;
	}

	public void setDSDocuments(List<DSDocument> dsDocuments) {
		this.dsDocuments = dsDocuments;
	}

	public void setDSEnvelopeId(String dsEnvelopeId) {
		this.dsEnvelopeId = dsEnvelopeId;
	}

	public void setDSRecipients(List<DSRecipient> dsRecipients) {
		this.dsRecipients = dsRecipients;
	}

	public void setEmailBlurb(String emailBlurb) {
		this.emailBlurb = emailBlurb;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSenderEmailAddress(String senderEmailAddress) {
		this.senderEmailAddress = senderEmailAddress;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JSONObject toJSONObject() {
		return JSONUtil.put(
			"createdLocalDateTime", getCreatedLocalDateTime()
		).put(
			"documents",
			JSONUtil.toJSONArray(
				getDSDocuments(), dsDocument -> dsDocument.toJSONObject(), _log)
		).put(
			"emailBlurb", getEmailBlurb()
		).put(
			"emailSubject", getEmailSubject()
		).put(
			"envelopeId", getDSEnvelopeId()
		).put(
			"name", getName()
		).put(
			"recipients",
			JSONUtil.put(
				"signers",
				JSONUtil.toJSONArray(
					getDSRecipients(),
					dsRecipient -> dsRecipient.toJSONObject(), _log))
		).put(
			"senderEmailAddress", getSenderEmailAddress()
		).put(
			"status", getStatus()
		);
	}

	@Override
	public String toString() {
		return toJSONObject().toString();
	}

	protected LocalDateTime createdLocalDateTime;
	protected List<DSDocument> dsDocuments;
	protected String dsEnvelopeId;
	protected List<DSRecipient> dsRecipients;
	protected String emailBlurb;
	protected String emailSubject;
	protected String name;
	protected String senderEmailAddress;
	protected String status;

	private static final Log _log = LogFactoryUtil.getLog(DSEnvelope.class);

}