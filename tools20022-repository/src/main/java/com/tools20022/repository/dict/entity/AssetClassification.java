package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CFIOct2015Identifier;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.codeset.ProductTypeCode;
import com.tools20022.repository.dict.entity.AssetClassStrategy;

/**
 * Other classification type of the security, ie, other than ISO 10962.
 */
public class AssetClassification {

	private CFIOct2015Identifier ClassificationType;
	private Asset Asset;
	private LanguageCode Language;
	private Scheme AssetClassScheme;
	private ProductTypeCode ProductType;
	private AssetClassStrategy Strategy;

	public CFIOct2015Identifier getClassificationType() {
		return ClassificationType;
	}

	public void setClassificationType(CFIOct2015Identifier ClassificationType) {
		this.ClassificationType = ClassificationType;
	}

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}

	public LanguageCode getLanguage() {
		return Language;
	}

	public void setLanguage(LanguageCode Language) {
		this.Language = Language;
	}

	public Scheme getAssetClassScheme() {
		return AssetClassScheme;
	}

	public void setAssetClassScheme(Scheme AssetClassScheme) {
		this.AssetClassScheme = AssetClassScheme;
	}

	public ProductTypeCode getProductType() {
		return ProductType;
	}

	public void setProductType(ProductTypeCode ProductType) {
		this.ProductType = ProductType;
	}

	public AssetClassStrategy getStrategy() {
		return Strategy;
	}

	public void setStrategy(AssetClassStrategy Strategy) {
		this.Strategy = Strategy;
	}
}