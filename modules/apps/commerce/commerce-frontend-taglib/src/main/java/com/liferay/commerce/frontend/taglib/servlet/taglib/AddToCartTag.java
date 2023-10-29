/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.frontend.taglib.servlet.taglib;

import com.liferay.account.model.AccountEntry;
import com.liferay.commerce.configuration.CommerceOrderCheckoutConfiguration;
import com.liferay.commerce.constants.CommerceConstants;
import com.liferay.commerce.constants.CommerceOrderActionKeys;
import com.liferay.commerce.constants.CommercePortletKeys;
import com.liferay.commerce.constants.CommerceWebKeys;
import com.liferay.commerce.context.CommerceContext;
import com.liferay.commerce.currency.model.CommerceCurrency;
import com.liferay.commerce.frontend.model.ProductSettingsModel;
import com.liferay.commerce.frontend.taglib.internal.servlet.ServletContextUtil;
import com.liferay.commerce.frontend.util.ProductHelper;
import com.liferay.commerce.inventory.engine.CommerceInventoryEngine;
import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.model.CommerceOrderItem;
import com.liferay.commerce.order.CommerceOrderHttpHelper;
import com.liferay.commerce.product.catalog.CPCatalogEntry;
import com.liferay.commerce.product.catalog.CPSku;
import com.liferay.commerce.product.constants.CommerceChannelConstants;
import com.liferay.commerce.product.content.helper.CPContentHelper;
import com.liferay.commerce.product.model.CommerceChannel;
import com.liferay.commerce.product.service.CPDefinitionOptionRelLocalService;
import com.liferay.commerce.product.service.CommerceChannelLocalService;
import com.liferay.commerce.product.util.CPJSONUtil;
import com.liferay.commerce.service.CommerceOrderItemLocalService;
import com.liferay.commerce.service.CommerceOrderTypeLocalService;
import com.liferay.commerce.util.CommerceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.settings.GroupServiceSettingsLocator;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.BigDecimalUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.taglib.util.IncludeTag;

import java.math.BigDecimal;

import java.util.List;

import javax.portlet.PortletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * @author Fabio Diego Mastrorilli
 * @author Gianmarco Brunialti Masera
 * @author Ivica Cardic
 */
public class AddToCartTag extends IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		try {
			HttpServletRequest httpServletRequest = getRequest();

			CommerceContext commerceContext =
				(CommerceContext)httpServletRequest.getAttribute(
					CommerceWebKeys.COMMERCE_CONTEXT);

			_commerceAccountId = CommerceUtil.getCommerceAccountId(
				commerceContext);

			_commerceChannelGroupId =
				commerceContext.getCommerceChannelGroupId();
			_commerceChannelId = commerceContext.getCommerceChannelId();

			CommerceCurrency commerceCurrency =
				commerceContext.getCommerceCurrency();

			_commerceCurrencyCode = commerceCurrency.getCode();

			CommerceOrder commerceOrder = commerceContext.getCommerceOrder();

			if (commerceOrder != null) {
				_commerceOrderId = commerceOrder.getCommerceOrderId();
			}

			CPSku cpSku = null;

			if (_cpCatalogEntry != null) {
				cpSku = _cpContentHelper.getDefaultCPSku(_cpCatalogEntry);

				_productSettingsModel = _productHelper.getProductSettingsModel(
					_cpCatalogEntry.getCPDefinitionId());

				BigDecimal multipleQuantity =
					_productSettingsModel.getMultipleQuantity();

				BigDecimal[] allowedQuantities = ArrayUtil.filter(
					_productSettingsModel.getAllowedQuantities(),
					quantity ->
						BigDecimalUtil.gte(
							quantity, _productSettingsModel.getMinQuantity()) &&
						BigDecimalUtil.lte(
							quantity, _productSettingsModel.getMaxQuantity()) &&
						BigDecimalUtil.eq(
							quantity.remainder(multipleQuantity),
							BigDecimal.ZERO));

				_productSettingsModel.setAllowedQuantities(allowedQuantities);
			}

			String sku = null;

			if (cpSku != null) {
				_cpInstanceId = cpSku.getCPInstanceId();
				_disabled = !cpSku.isPurchasable() || (_commerceAccountId == 0);
				sku = cpSku.getSku();

				if (commerceOrder != null) {
					List<CommerceOrderItem> commerceOrderItems =
						_commerceOrderItemLocalService.getCommerceOrderItems(
							commerceOrder.getCommerceOrderId(),
							cpSku.getCPInstanceId(), 0, 1);

					if (!commerceOrderItems.isEmpty()) {
						_inCart = true;
					}
				}
			}

			if (sku != null) {
				BigDecimal stockQuantity =
					_commerceInventoryEngine.getStockQuantity(
						PortalUtil.getCompanyId(httpServletRequest),
						_cpCatalogEntry.getGroupId(),
						commerceContext.getCommerceChannelGroupId(), sku,
						StringPool.BLANK);

				_stockQuantity = stockQuantity.intValue();

				if (!_disabled) {
					_disabled =
						(!_productSettingsModel.isBackOrders() &&
						 (_stockQuantity <= 0)) ||
						!cpSku.isPublished() || !cpSku.isPurchasable();
				}

				if (Validator.isNull(_skuOptions) || _skuOptions.equals("[]")) {
					JSONArray jsonArray = CPJSONUtil.toJSONArray(
						_cpDefinitionOptionRelLocalService.
							getCPDefinitionOptionRelKeysCPDefinitionOptionValueRelKeys(
								cpSku.getCPInstanceId()));

					_skuOptions = jsonArray.toString();
				}
			}

			AccountEntry accountEntry = commerceContext.getAccountEntry();

			if (accountEntry != null) {
				if (accountEntry.isBusinessAccount()) {
					ThemeDisplay themeDisplay =
						(ThemeDisplay)httpServletRequest.getAttribute(
							WebKeys.THEME_DISPLAY);

					_disabled =
						_disabled ||
						!_commerceOrderPortletResourcePermission.contains(
							themeDisplay.getPermissionChecker(),
							accountEntry.getAccountEntryGroupId(),
							CommerceOrderActionKeys.ADD_COMMERCE_ORDER);
				}
				else {
					CommerceChannel commerceChannel =
						_commerceChannelLocalService.getCommerceChannel(
							_commerceChannelId);

					CommerceOrderCheckoutConfiguration
						commerceOrderCheckoutConfiguration =
							_configurationProvider.getConfiguration(
								CommerceOrderCheckoutConfiguration.class,
								new GroupServiceSettingsLocator(
									commerceChannel.getGroupId(),
									CommerceConstants.
										SERVICE_NAME_COMMERCE_ORDER));

					_disabled =
						_disabled ||
						(accountEntry.isGuestAccount() &&
						 (CommerceChannelConstants.SITE_TYPE_B2B ==
							 commerceContext.getCommerceSiteType()) &&
						 !commerceOrderCheckoutConfiguration.
							 guestCheckoutEnabled());
				}
			}

			int commerceOrderTypesCount =
				_commerceOrderTypeLocalService.getCommerceOrderTypesCount(
					PortalUtil.getCompanyId(httpServletRequest),
					CommerceChannel.class.getName(), _commerceChannelId, true);

			_showOrderTypeModal = commerceOrderTypesCount > 1;

			_showOrderTypeModalURL = _getShowOrderTypeModalURL(
				httpServletRequest);
		}
		catch (Exception exception) {
			_log.error(exception);

			return SKIP_BODY;
		}

		return super.doStartTag();
	}

	public String getAlignment() {
		return _alignment;
	}

	public CPCatalogEntry getCPCatalogEntry() {
		return _cpCatalogEntry;
	}

	public long getCPInstanceId() {
		return _cpInstanceId;
	}

	public boolean getIconOnly() {
		return _iconOnly;
	}

	public boolean getInline() {
		return _inline;
	}

	public String getNamespace() {
		return _namespace;
	}

	public BigDecimal getQuantity() {
		return _quantity;
	}

	public String getSize() {
		return _size;
	}

	public String getSkuOptions() {
		return _skuOptions;
	}

	public String getUnitOfMeasureKey() {
		return _unitOfMeasureKey;
	}

	public void setAlignment(String alignment) {
		_alignment = alignment;
	}

	@Override
	public void setAttributes(HttpServletRequest httpServletRequest) {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		setNamespacedAttribute(httpServletRequest, "alignment", _alignment);
		setNamespacedAttribute(
			httpServletRequest, "commerceAccountId", _commerceAccountId);
		setNamespacedAttribute(
			httpServletRequest, "commerceChannelGroupId",
			_commerceChannelGroupId);
		setNamespacedAttribute(
			httpServletRequest, "commerceChannelId", _commerceChannelId);
		setNamespacedAttribute(
			httpServletRequest, "commerceCurrencyCode", _commerceCurrencyCode);
		setNamespacedAttribute(
			httpServletRequest, "commerceOrderId", _commerceOrderId);
		setNamespacedAttribute(
			httpServletRequest, "cpInstanceId", _cpInstanceId);
		setNamespacedAttribute(httpServletRequest, "disabled", _disabled);
		setNamespacedAttribute(httpServletRequest, "iconOnly", _iconOnly);
		setNamespacedAttribute(httpServletRequest, "inCart", _inCart);
		setNamespacedAttribute(httpServletRequest, "inline", _inline);
		setNamespacedAttribute(httpServletRequest, "namespace", _namespace);
		setNamespacedAttribute(
			httpServletRequest, "productSettingsModel", _productSettingsModel);
		setNamespacedAttribute(httpServletRequest, "size", _size);
		setNamespacedAttribute(
			httpServletRequest, "showOrderTypeModal", _showOrderTypeModal);
		setNamespacedAttribute(
			httpServletRequest, "showOrderTypeModalURL",
			_showOrderTypeModalURL);
		setNamespacedAttribute(httpServletRequest, "skuOptions", _skuOptions);
		setNamespacedAttribute(
			httpServletRequest, "stockQuantity", _stockQuantity);
		setNamespacedAttribute(
			httpServletRequest, "unitOfMeasureKey", _unitOfMeasureKey);
	}

	public void setCPCatalogEntry(CPCatalogEntry cpCatalogEntry) {
		_cpCatalogEntry = cpCatalogEntry;
	}

	public void setCPInstanceId(long cpInstanceId) {
		_cpInstanceId = cpInstanceId;
	}

	public void setIconOnly(boolean iconOnly) {
		_iconOnly = iconOnly;
	}

	public void setInline(boolean inline) {
		_inline = inline;
	}

	public void setNamespace(String namespace) {
		_namespace = namespace;
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		super.setPageContext(pageContext);

		setServletContext(ServletContextUtil.getServletContext());

		_commerceChannelLocalService =
			ServletContextUtil.getCommerceChannelLocalService();
		_commerceInventoryEngine =
			ServletContextUtil.getCommerceInventoryEngine();
		_commerceOrderHttpHelper =
			ServletContextUtil.getCommerceOrderHttpHelper();
		_commerceOrderItemLocalService =
			ServletContextUtil.getCommerceOrderItemLocalService();
		_commerceOrderPortletResourcePermission =
			ServletContextUtil.getCommerceOrderPortletResourcePermission();
		_commerceOrderTypeLocalService =
			ServletContextUtil.getCommerceOrderTypeLocalService();
		_configurationProvider = ServletContextUtil.getConfigurationProvider();
		_cpContentHelper = ServletContextUtil.getCPContentHelper();
		_cpDefinitionOptionRelLocalService =
			ServletContextUtil.getCPDefinitionOptionRelLocalService();
		_productHelper = ServletContextUtil.getProductHelper();
	}

	public void setQuantity(BigDecimal quantity) {
		_quantity = quantity;
	}

	public void setSize(String size) {
		_size = size;
	}

	public void setSkuOptions(String skuOptions) {
		_skuOptions = skuOptions;
	}

	public void setUnitOfMeasureKey(String unitOfMeasureKey) {
		_unitOfMeasureKey = unitOfMeasureKey;
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_alignment = "center";
		_commerceAccountId = 0;
		_commerceChannelGroupId = 0;
		_commerceChannelId = 0;
		_commerceChannelLocalService = null;
		_commerceCurrencyCode = null;
		_commerceInventoryEngine = null;
		_commerceOrderHttpHelper = null;
		_commerceOrderId = 0;
		_commerceOrderItemLocalService = null;
		_commerceOrderPortletResourcePermission = null;
		_commerceOrderTypeLocalService = null;
		_configurationProvider = null;
		_cpCatalogEntry = null;
		_cpContentHelper = null;
		_cpDefinitionOptionRelLocalService = null;
		_cpInstanceId = 0;
		_disabled = false;
		_iconOnly = false;
		_inCart = false;
		_inline = false;
		_namespace = StringPool.BLANK;
		_productHelper = null;
		_productSettingsModel = null;
		_quantity = BigDecimal.ZERO;
		_showOrderTypeModal = false;
		_showOrderTypeModalURL = null;
		_size = "md";
		_skuOptions = null;
		_stockQuantity = 0;
		_unitOfMeasureKey = StringPool.BLANK;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	private String _getShowOrderTypeModalURL(
		HttpServletRequest httpServletRequest) {

		if (!_showOrderTypeModal) {
			return StringPool.BLANK;
		}

		return PortletURLBuilder.create(
			PortletURLFactoryUtil.create(
				httpServletRequest,
				CommercePortletKeys.COMMERCE_OPEN_ORDER_CONTENT,
				PortletRequest.RENDER_PHASE)
		).setMVCRenderCommandName(
			"/commerce_order_content/view_commerce_order_order_type_modal"
		).setParameter(
			"addToCart", Boolean.TRUE
		).setWindowState(
			LiferayWindowState.POP_UP
		).buildString();
	}

	private static final String _ATTRIBUTE_NAMESPACE =
		"liferay-commerce:add-to-cart:";

	private static final String _PAGE = "/add_to_cart/page.jsp";

	private static final Log _log = LogFactoryUtil.getLog(AddToCartTag.class);

	private String _alignment = "center";
	private long _commerceAccountId;
	private long _commerceChannelGroupId;
	private long _commerceChannelId;
	private CommerceChannelLocalService _commerceChannelLocalService;
	private String _commerceCurrencyCode;
	private CommerceInventoryEngine _commerceInventoryEngine;
	private CommerceOrderHttpHelper _commerceOrderHttpHelper;
	private long _commerceOrderId;
	private CommerceOrderItemLocalService _commerceOrderItemLocalService;
	private PortletResourcePermission _commerceOrderPortletResourcePermission;
	private CommerceOrderTypeLocalService _commerceOrderTypeLocalService;
	private ConfigurationProvider _configurationProvider;
	private CPCatalogEntry _cpCatalogEntry;
	private CPContentHelper _cpContentHelper;
	private CPDefinitionOptionRelLocalService
		_cpDefinitionOptionRelLocalService;
	private long _cpInstanceId;
	private boolean _disabled;
	private boolean _iconOnly;
	private boolean _inCart;
	private boolean _inline;
	private String _namespace = StringPool.BLANK;
	private ProductHelper _productHelper;
	private ProductSettingsModel _productSettingsModel;
	private BigDecimal _quantity = BigDecimal.ZERO;
	private boolean _showOrderTypeModal;
	private String _showOrderTypeModalURL;
	private String _size = "md";
	private String _skuOptions;
	private int _stockQuantity;
	private String _unitOfMeasureKey = StringPool.BLANK;

}