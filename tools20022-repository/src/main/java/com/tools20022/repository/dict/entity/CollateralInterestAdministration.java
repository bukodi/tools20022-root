package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InterestManagement;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.CollateralBalance;

/**
 * Calculation and request of interest linked to collateral.
 */
public class CollateralInterestAdministration extends InterestManagement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CollateralManagement CollateralManagement;
	private CollateralBalance ClosingCollateralBalance;
	private CollateralBalance OpeningCollateralBalance;

	public CollateralManagement getCollateralManagement() {
		return CollateralManagement;
	}

	public void setCollateralManagement(
			CollateralManagement CollateralManagement) {
		this.CollateralManagement = CollateralManagement;
	}

	public CollateralBalance getClosingCollateralBalance() {
		return ClosingCollateralBalance;
	}

	public void setClosingCollateralBalance(
			CollateralBalance ClosingCollateralBalance) {
		this.ClosingCollateralBalance = ClosingCollateralBalance;
	}

	public CollateralBalance getOpeningCollateralBalance() {
		return OpeningCollateralBalance;
	}

	public void setOpeningCollateralBalance(
			CollateralBalance OpeningCollateralBalance) {
		this.OpeningCollateralBalance = OpeningCollateralBalance;
	}
}