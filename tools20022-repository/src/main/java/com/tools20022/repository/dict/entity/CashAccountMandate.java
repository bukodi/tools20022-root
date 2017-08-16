package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.CashAccountContract;

/**
 * Authorisation given to a mandate holder to perform some operation on an
 * account.
 */
public class CashAccountMandate extends Mandate
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccountService Services;
	private CashAccountContract CashAccountContract;

	public CashAccountService getServices() {
		return Services;
	}

	public void setServices(CashAccountService Services) {
		this.Services = Services;
	}

	public CashAccountContract getCashAccountContract() {
		return CashAccountContract;
	}

	public void setCashAccountContract(CashAccountContract CashAccountContract) {
		this.CashAccountContract = CashAccountContract;
	}
}