<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/price/init.jsp" %>

<%
String containerId = StringPool.BLANK;

if (Validator.isNotNull(namespace) || (Validator.isNull(namespace) && !compact)) {
	containerId = namespace + "price";
}
%>

<span class="<%= Validator.isNotNull(namespace) ? namespace + "price price" : "price" %><%= compact ? " compact" : StringPool.BLANK %>" id="<%= containerId %>">
	<liferay-util:include page="/price/default.jsp" servletContext="<%= application %>" />

	<c:if test="<%= !priceModel.isPriceOnApplication() %>">
		<c:choose>
			<c:when test="<%= compact %>">
				<c:choose>
					<c:when test="<%= Validator.isNull(priceModel.getDiscount()) %>">
						<c:if test="<%= Validator.isNotNull(priceModel.getPromoPrice()) %>">
							<liferay-util:include page="/price/promo.jsp" servletContext="<%= application %>" />
						</c:if>
					</c:when>
					<c:otherwise>
						<c:if test="<%= Validator.isNotNull(priceModel.getFinalPrice()) %>">
							<liferay-util:include page="/price/discount.jsp" servletContext="<%= application %>" />
						</c:if>
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:otherwise>
				<c:if test="<%= Validator.isNotNull(priceModel.getPromoPrice()) %>">
					<liferay-util:include page="/price/promo.jsp" servletContext="<%= application %>" />
				</c:if>

				<c:if test="<%= Validator.isNotNull(priceModel.getFinalPrice()) %>">
					<liferay-util:include page="/price/discount.jsp" servletContext="<%= application %>" />
				</c:if>
			</c:otherwise>
		</c:choose>
	</c:if>
</span>

<c:if test="<%= Validator.isNotNull(containerId) %>">
	<aui:script require="commerce-frontend-js/components/price/entry as Price">
		const componentId = '<%= containerId %>';

		const initialProps = {
			displayDiscountLevels: <%= displayDiscountLevels %>,
			namespace: '<%= namespace %>',
			netPrice: <%= netPrice %>,
			price: <%= jsonSerializer.serializeDeep(priceModel) %>,
			standalone: true,
		};

		Price.default(componentId, componentId, initialProps);
	</aui:script>
</c:if>