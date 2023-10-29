<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
ClickToChatConfiguration clickToChatConfiguration = (ClickToChatConfiguration)request.getAttribute(ClickToChatConfiguration.class.getName());
%>

<div class="row">
	<div class="col-md-12">
		<aui:input checked="<%= clickToChatConfiguration.enabled() %>" inlineLabel="right" label='<%= LanguageUtil.get(resourceBundle, "enable-click-to-chat") %>' labelCssClass="simple-toggle-switch" name="enabled" type="toggle-switch" value="<%= clickToChatConfiguration.enabled() %>" />
	</div>
</div>

<div class="form-group row">
	<div class="col-md-12">
		<aui:select label="site-settings-strategy" name="siteSettingsStrategy" onchange='<%= liferayPortletResponse.getNamespace() + "onChangeClickToChatSiteSettingsStrategy(event);" %>' required="<%= true %>" value="<%= clickToChatConfiguration.siteSettingsStrategy() %>">
			<aui:option label="" value="" />

			<%
			for (String clickToChatSiteSettingsStrategy : ClickToChatConstants.SITE_SETTINGS_STRATEGIES) {
			%>

				<aui:option label='<%= "site-settings-strategy-" + clickToChatSiteSettingsStrategy %>' value="<%= clickToChatSiteSettingsStrategy %>" />

			<%
			}
			%>

		</aui:select>

		<label class="text-secondary">
			<liferay-ui:message arguments="click-to-chat" key="site-settings-strategy-description" />
		</label>
	</div>
</div>

<div class="form-group row" id="<portlet:namespace />clickToChatChatProviders">
	<div class="col-md-6">
		<aui:select id="chatProviderId" label="chat-provider" name="chatProviderId" onchange='<%= liferayPortletResponse.getNamespace() + "onChangeClickToChatChatProviderId(event);" %>' value="<%= clickToChatConfiguration.chatProviderId() %>">
			<aui:option label="" value="" />

			<%
			for (String clickToChatChatProviderId : ClickToChatConstants.CHAT_PROVIDER_IDS) {
			%>

				<aui:option label='<%= "chat-provider-" + clickToChatChatProviderId %>' value="<%= clickToChatChatProviderId %>" />

			<%
			}
			%>

		</aui:select>
	</div>

	<div class="col-md-6">
		<aui:input label="chat-provider-account-id" name="chatProviderAccountId" type="text" value="<%= clickToChatConfiguration.chatProviderAccountId() %>" />

		<%
		for (String clickToChatChatProviderId : ClickToChatConstants.CHAT_PROVIDER_IDS) {
		%>

			<div class="hide mb-2" id="<portlet:namespace />clickToChatChatProviderLearnMessage<%= clickToChatChatProviderId %>">
				<liferay-learn:message
					key='<%= "chat-provider-account-id-" + clickToChatChatProviderId %>'
					resource="click-to-chat-web"
				/>
			</div>

		<%
		}
		%>

	</div>
</div>

<div class="form-group hide row" id="<portlet:namespace />zendeskWebWidgetFields">
	<div class="col-md-6">
		<aui:input id="chatProviderKeyId" label="chat-provider-key-id" name="chatProviderKeyId" type="text" value="<%= clickToChatConfiguration.chatProviderKeyId() %>" />
	</div>

	<div class="col-md-6">
		<aui:input id="chatProviderSecretKey" label="chat-provider-secret-key" name="chatProviderSecretKey" type="text" value="<%= clickToChatConfiguration.chatProviderSecretKey() %>" />
	</div>
</div>

<div class="form-group row">
	<div class="col-md-6">
		<aui:input checked="<%= clickToChatConfiguration.guestUsersAllowed() %>" inlineLabel="right" label='<%= LanguageUtil.get(resourceBundle, "guest-users-allowed") %>' labelCssClass="simple-toggle-switch" name="guestUsersAllowed" type="toggle-switch" value="<%= clickToChatConfiguration.guestUsersAllowed() %>" />

		<aui:input checked="<%= clickToChatConfiguration.hideInControlPanel() %>" inlineLabel="right" label='<%= LanguageUtil.get(resourceBundle, "hide-in-control-panel") %>' labelCssClass="simple-toggle-switch" name="hideInControlPanel" type="toggle-switch" value="<%= clickToChatConfiguration.hideInControlPanel() %>" />
	</div>
</div>

<script>
	document.addEventListener('DOMContentLoaded', () => {
		<portlet:namespace />toggleClickToChatZendeskWebWidgetFields();
	});

	function <portlet:namespace />toggleClickToChatZendeskWebWidgetFields() {
		var zendeskWebWidgetFieldsElement = document.getElementById(
			'<portlet:namespace />zendeskWebWidgetFields'
		);

		var selectedChat = document.getElementById(
			'<portlet:namespace />chatProviderId'
		);

		if (
			selectedChat.value ===
			'<%= ClickToChatConstants.CHAT_PROVIDER_ID_ZENDESK_WEB_WIDGET %>'
		) {
			zendeskWebWidgetFieldsElement.classList.remove('hide');
		}
		else {
			document.getElementById(
				'<portlet:namespace />chatProviderKeyId'
			).value = '';

			document.getElementById(
				'<portlet:namespace />chatProviderSecretKey'
			).value = '';

			zendeskWebWidgetFieldsElement.classList.add('hide');
		}
	}

	function <portlet:namespace />hideUnselectedClickToChatProviderLearnMessages() {
		<portlet:namespace />toggleClickToChatZendeskWebWidgetFields();

		var clickToChatChatProviderIdElement = document.getElementById(
			'<portlet:namespace />chatProviderId'
		);

		var clickToChatProviderIdOptions = clickToChatChatProviderIdElement.querySelectorAll(
			'option'
		);

		clickToChatProviderIdOptions.forEach((option) => {
			<portlet:namespace />toggleClickToChatChatProviderLearnMessage(
				option.value,
				false
			);
		});
	}

	function <portlet:namespace />onChangeClickToChatChatProviderId(event) {
		<portlet:namespace />hideUnselectedClickToChatProviderLearnMessages();
		<portlet:namespace />toggleClickToChatChatProviderLearnMessage(
			event.target.value,
			true
		);
	}

	function <portlet:namespace />onChangeClickToChatSiteSettingsStrategy(event) {
		var clickToChatChatProvidersElement = document.getElementById(
			'<portlet:namespace />clickToChatChatProviders'
		);

		var clickToChatSiteSettingsStrategyElement = document.getElementById(
			'<portlet:namespace />siteSettingsStrategy'
		);

		var zendeskWebWidgetFieldsElement = document.getElementById(
			'<portlet:namespace />zendeskWebWidgetFields'
		);

		if (clickToChatSiteSettingsStrategyElement.value === 'always-override') {
			clickToChatChatProvidersElement.classList.add('hide');
			zendeskWebWidgetFieldsElement.classList.add('hide');
		}
		else {
			clickToChatChatProvidersElement.classList.remove('hide');
			zendeskWebWidgetFieldsElement.classList.remove('hide');
		}
	}

	function <portlet:namespace />toggleClickToChatChatProviderLearnMessage(
		clickToChatChatProviderAccountId,
		visible
	) {
		var clickToChatChatProviderLearnMessageElement = document.getElementById(
			'<portlet:namespace />clickToChatChatProviderLearnMessage' +
				clickToChatChatProviderAccountId
		);

		if (clickToChatChatProviderLearnMessageElement) {
			if (visible) {
				return clickToChatChatProviderLearnMessageElement.classList.remove(
					'hide'
				);
			}

			clickToChatChatProviderLearnMessageElement.classList.add('hide');
		}
	}

	<portlet:namespace />onChangeClickToChatSiteSettingsStrategy();
	<portlet:namespace />toggleClickToChatChatProviderLearnMessage(
		document.getElementById('<portlet:namespace />chatProviderId').value,
		true
	);
</script>