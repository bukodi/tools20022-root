package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.codeset.AssetClassProductTypeCode;
import com.tools20022.repository.dict.codeset.AssetClassDetailedSubProductTypeCode;
import com.tools20022.repository.dict.codeset.AssetClassSubProductTypeCode;

/**
 * Basic good used in commerce that is interchangeable with other commodities of
 * the same type. Commodities are most often used as inputs in the production of
 * other goods or services. The quality of a given commodity may differ
 * slightly, but it is essentially uniform across producers. When they are
 * traded on an exchange, commodities must also meet specified minimum
 * standards, also known as a basis grade.
 */
public class Commodity extends Asset {

	private AssetClassProductTypeCode BaseProduct;
	private AssetClassDetailedSubProductTypeCode DetailedSubProduct;
	private AssetClassSubProductTypeCode SubProduct;

	public AssetClassProductTypeCode getBaseProduct() {
		return BaseProduct;
	}

	public void setBaseProduct(AssetClassProductTypeCode BaseProduct) {
		this.BaseProduct = BaseProduct;
	}

	public AssetClassDetailedSubProductTypeCode getDetailedSubProduct() {
		return DetailedSubProduct;
	}

	public void setDetailedSubProduct(
			AssetClassDetailedSubProductTypeCode DetailedSubProduct) {
		this.DetailedSubProduct = DetailedSubProduct;
	}

	public AssetClassSubProductTypeCode getSubProduct() {
		return SubProduct;
	}

	public void setSubProduct(AssetClassSubProductTypeCode SubProduct) {
		this.SubProduct = SubProduct;
	}
}