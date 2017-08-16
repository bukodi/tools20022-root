package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.Clearing;
import com.tools20022.repository.dict.entity.CentralClearingCounterpartyRole;
import com.tools20022.repository.dict.entity.DefaultFund;
import com.tools20022.repository.dict.entity.CollateralManagement;

/**
 * Specifies the system which plays a role in the clearing process.
 */
public class ClearingSystem extends System
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Clearing Clearing;
	private CentralClearingCounterpartyRole CentralClearingCounterparty;
	private DefaultFund DefaultFund;
	private CollateralManagement CollateralManagement;

	public Clearing getClearing() {
		return Clearing;
	}

	public void setClearing(Clearing Clearing) {
		this.Clearing = Clearing;
	}

	public CentralClearingCounterpartyRole getCentralClearingCounterparty() {
		return CentralClearingCounterparty;
	}

	public void setCentralClearingCounterparty(
			CentralClearingCounterpartyRole CentralClearingCounterparty) {
		this.CentralClearingCounterparty = CentralClearingCounterparty;
	}

	public DefaultFund getDefaultFund() {
		return DefaultFund;
	}

	public void setDefaultFund(DefaultFund DefaultFund) {
		this.DefaultFund = DefaultFund;
	}

	public CollateralManagement getCollateralManagement() {
		return CollateralManagement;
	}

	public void setCollateralManagement(
			CollateralManagement CollateralManagement) {
		this.CollateralManagement = CollateralManagement;
	}
}