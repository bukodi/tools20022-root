package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Asset;

/**
 * Specifies roles played by a party that are linked to the handling of assets
 * but not related to a specific process.
 */
public class AssetPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Asset Asset;

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}
}