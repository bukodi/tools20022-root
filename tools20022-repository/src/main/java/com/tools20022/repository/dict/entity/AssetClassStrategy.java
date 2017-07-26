package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.AssetClassification;

/**
 * Strategy is asset class based.
 */
public class AssetClassStrategy extends PortfolioStrategy {

	private AssetClassification AssetClass;

	public AssetClassification getAssetClass() {
		return AssetClass;
	}

	public void setAssetClass(AssetClassification AssetClass) {
		this.AssetClass = AssetClass;
	}
}