<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
PaymentMethodCheckoutStepDisplayContext paymentMethodCheckoutStepDisplayContext = (PaymentMethodCheckoutStepDisplayContext)request.getAttribute(CommerceCheckoutWebKeys.COMMERCE_CHECKOUT_STEP_DISPLAY_CONTEXT);

List<CommercePaymentMethod> commercePaymentMethods = paymentMethodCheckoutStepDisplayContext.getCommercePaymentMethods();

CommerceOrder commerceOrder = paymentMethodCheckoutStepDisplayContext.getCommerceOrder();

String commercePaymentMethodKey = BeanParamUtil.getString(commerceOrder, request, "commercePaymentMethodKey");
%>

<div id="commercePaymentMethodsContainer">
	<liferay-ui:error exception="<%= CommerceOrderPaymentMethodException.class %>" message="please-select-a-valid-payment-method" />

	<c:choose>
		<c:when test="<%= commercePaymentMethods.isEmpty() %>">
			<clay:row>
				<clay:col
					size="12"
				>
					<clay:alert
						message="there-are-no-available-payment-methods"
					/>
				</clay:col>
			</clay:row>

			<aui:script use="aui-base">
				var continueButton = A.one('#<portlet:namespace />continue');

				if (continueButton) {
					Liferay.Util.toggleDisabled(continueButton, true);
				}
			</aui:script>
		</c:when>
		<c:otherwise>
			<ul class="list-group">

				<%
				for (CommercePaymentMethod commercePaymentMethod : commercePaymentMethods) {
				%>

					<li class="commerce-payment-types list-group-item list-group-item-flex">
						<div class="autofit-col autofit-col-expand">
							<aui:input checked="<%= commercePaymentMethodKey.equals(commercePaymentMethod.getKey()) %>" label="<%= commercePaymentMethod.getName(locale) %>" name="commercePaymentMethodKey" type="radio" value="<%= commercePaymentMethod.getKey() %>" />
						</div>

						<%
						String thumbnailSrc = paymentMethodCheckoutStepDisplayContext.getImageURL(commerceOrder.getGroupId(), commercePaymentMethod.getKey(), themeDisplay);
						%>

						<c:if test="<%= Validator.isNotNull(thumbnailSrc) %>">
							<div class="autofit-col">
								<img alt="<%= HtmlUtil.escapeAttribute(commercePaymentMethod.getName(locale)) %>" class="payment-icon" src="<%= HtmlUtil.escapeAttribute(thumbnailSrc) %>" style="height: 45px; width: auto;" />
							</div>
						</c:if>
					</li>

				<%
				}
				%>

			</ul>
		</c:otherwise>
	</c:choose>
</div>

<c:if test="<%= commercePaymentMethods.isEmpty() %>">
	<aui:script use="aui-base">
		var value = A.one('#<portlet:namespace />continue');

		if (value) {
			Liferay.Util.toggleDisabled(value, true);
		}
	</aui:script>
</c:if>