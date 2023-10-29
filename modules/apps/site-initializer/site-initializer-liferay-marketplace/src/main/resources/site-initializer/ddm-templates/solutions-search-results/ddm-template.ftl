<style type="text/css">
	.adt-solutions-search-results .cards-container {
		display: grid;
		grid-column-gap: 1rem;
		grid-row-gap: 1.5rem;
		grid-template-columns: repeat(3, minmax(0, 1fr));
	}

	.adt-solutions-search-results .solutions-search-results-card:hover {
		color: var(--black);
	}

	.adt-solutions-search-results .card-image-title-container .image-container {
		height: 3rem;
	  	min-width: 3rem;
	}

	.adt-solutions-search-results .labels .category-names {
		background-color: #2c3a4b;
		bottom: 26px;
		display: none;
		width: 14.5rem;
	}

	.adt-solutions-search-results .labels .category-names::after {
		border-left: 9px solid transparent;
		border-right: 9px solid transparent;
		border-top: 8px solid var(--neutral-1);
		bottom: -7px;
		content:'';
		left: 0;
		margin: 0 auto;
		position: absolute;
		right: 0;
		width: 0;
	}

	.adt-solutions-search-results .labels .category-label {
		background-color: #ebeef2;
		color: #545D69;
	}

	.adt-solutions-search-results .labels .category-label-remainder:hover .category-names {
		display: block;
	}

	.productSpec{
		color: #545d69;
	}

	@media screen and (max-width: 599px) {
		.adt-solutions-search-results .cards-container {
			grid-row-gap: 1rem;
			grid-template-columns: 288px;
			justify-content: center;
		}
	}

	@media screen and (min-width:600px) and (max-width: 899px) {
		.adt-solutions-search-results .cards-container {
			grid-template-columns: repeat(2, minmax(0, 1fr));
		}
	}
</style>

<script>
	window.onload = () => {
		const numberOfProductsInfo = document.querySelector("#ocerSearchContainerPageIterator_ariaPaginationResults");
		const productsCount = document.querySelector("#freemarkervar").value;
		let infoList = numberOfProductsInfo.textContent.split(" ");
		infoList[infoList.length - 2] = productsCount;
		const newInfo = infoList.join(" ");
		numberOfProductsInfo.textContent = newInfo;
	}
</script>

<#assign siteURL = (themeDisplay.getURLCurrent()?keep_after("?"))! />

<#function getFilterByUrlParams siteURL>
	<#if siteURL??>
		<#assign urlParams = "" />
		<#list siteURL?split("&") as params>
			<#if !params?contains("delta") && !params?contains("start")>
				<#assign categoryId = params?keep_after("=") />
				<#if categoryId?has_content>
					<#assign urlParams = urlParams + " (params eq '" + categoryId + "') and" />
				</#if>
			</#if>
		</#list>
	</#if>

	<#return urlParams?keep_before_last(" ")?trim />
</#function>

<#if siteURL??>
	<#list siteURL?split("&") as params>
		<#if params?contains("delta")>
			<#assign pageSize = params?keep_after("=") />
		</#if>
		<#if params?contains("start")>
			<#assign page = params?keep_after("=") />
		</#if>
	</#list>
</#if>

<#assign
	pageSize = pageSize?has_content?then(pageSize, 15)
	page = page?has_content?then(page, 1)
	taxonomyVocabularyName = "Marketplace Product Type"
	categoryName = "Solution"
	taxonomyVocabulary = restClient.get("/headless-admin-taxonomy/v1.0/sites/${themeDisplay.getCompanyGroupId()}/taxonomy-vocabularies?fields=id&filter=name eq '${taxonomyVocabularyName}'").items
	vocabularyCategory = restClient.get("/headless-admin-taxonomy/v1.0/taxonomy-vocabularies/${taxonomyVocabulary[0].id}/taxonomy-categories?fields=id&filter=name eq '${categoryName}'").items
	productsList = restClient.get("/headless-commerce-admin-catalog/v1.0/products?filter=categoryIds/any(params:params eq '${vocabularyCategory[0].id}')&pageSize=" + pageSize + "&page=" + page)
	numberFilteredProducts = 0
	filterCategoriesByUrlParams = getFilterByUrlParams(siteURL)
/>

<#if filterCategoriesByUrlParams?has_content>
	<#assign
		productsList = restClient.get("/headless-commerce-admin-catalog/v1.0/products?filter=categoryIds/any(params:${filterCategoriesByUrlParams} and (params eq '${vocabularyCategory[0].id}'))&pageSize=" + pageSize + "&page=" + page)
	/>
</#if>

<#if productsList.items?has_content>
	<#list productsList.items as productList>
		<#assign numberFilteredProducts = numberFilteredProducts + 1 />
	</#list>
</#if>

<div class="adt-solutions-search-results">
	<#if productsList.items?has_content>
		<input id="freemarkervar" type="hidden" value="${productsList.totalCount}" />

		<div class="color-neutral-3 d-md-block d-none pb-4">
			<strong class='color-black'>${numberFilteredProducts!}</strong>&nbsp;${categoryName}s Available
		</div>

		<div class="cards-container pb-6">
			<#list productsList.items as product>
				<#assign
					productCategories = product.categories
					productDescription = stringUtil.shorten(htmlUtil.stripHtml(product.description.en_US), 150, "...")
					portalURL = portalUtil.getLayoutURL(themeDisplay)
					productURL = portalURL?replace("home", "p") + "/" + product.urls.en_US
					desiredProductURL = productURL?replace("/solutions-marketplace", "")
					productSpecifications = restClient.get("/headless-commerce-admin-catalog/v1.0/products/" + product.productId + "/productSpecifications").items
				/>

				<a class="bg-white d-flex flex-column mb-0 p-4 rounded solutions-search-results-card text-dark text-decoration-none" href="${desiredProductURL}">
					<div class="align-items-center d-flex image-container justify-content-center rounded">
						<img
							alt="${product.name.en_US}"
							class="h-100 mw-100"
							src="${product.thumbnail}"
						/>
					</div>

					<#if productSpecifications?has_content>
						<#assign productDeveloperName = productSpecifications?filter(item -> item.specificationKey == "developer-name") />

						<#list productDeveloperName as productSpec>
							<div class="productSpec color-neutral-3 font-size-paragraph-small mt-1">
								${productSpec.value.en_US}
							</div>
						</#list>
					</#if>

					<div class="align-items-center card-image-title-container d-flex pb-1">
						<div class="">
							<div class="font-weight-semi-bold h2 mt-1">
								${product.name.en_US}
							</div>
						</div>
					</div>

					<div class="d-flex flex-column font-size-paragraph-small h-100 justify-content-between">
							<div class="font-weight-normal mb-2">
								${productDescription}
							</div>
					</div>
					<#if productCategories?has_content>
						<div class="align-center d-flex labels">
							<div class="border-radius-small category-label font-size-paragraph-small font-weight-semi-bold px-1">
								${productCategories[0].name}
							</div>

							<#if (productCategories?size > 1)>
								<div class="category-label-remainder pl-2 position-relative text-primary">
									+${productCategories?size - 1}
									<div class="category-names font-size-paragraph-base p-4 position-absolute rounded text-white">
										<#list productCategories as category>
											<#if !category?is_first>
												${category.name}<#sep>, </#sep>
											</#if>
										</#list>
									</div>
								</div>
							</#if>
						</div>
					</#if>
				</a>
			</#list>
		</div>
	</#if>
</div>