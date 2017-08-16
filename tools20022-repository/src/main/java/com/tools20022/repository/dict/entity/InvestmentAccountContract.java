package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.InvestmentAccountService;
import com.tools20022.repository.dict.entity.ManagedAccountProduct;

/**
 * Contract defining the related investment account.
 */
public class InvestmentAccountContract extends AccountContract
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text LetterIntentReference;
	private Max35Text AccumulationRightReference;
	private InvestmentAccount InvestmentAccount;
	private InvestmentAccountService Services;
	private ManagedAccountProduct ModeledAccount;

	public Max35Text getLetterIntentReference() {
		return LetterIntentReference;
	}

	public void setLetterIntentReference(Max35Text LetterIntentReference) {
		this.LetterIntentReference = LetterIntentReference;
	}

	public Max35Text getAccumulationRightReference() {
		return AccumulationRightReference;
	}

	public void setAccumulationRightReference(
			Max35Text AccumulationRightReference) {
		this.AccumulationRightReference = AccumulationRightReference;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public InvestmentAccountService getServices() {
		return Services;
	}

	public void setServices(InvestmentAccountService Services) {
		this.Services = Services;
	}

	public ManagedAccountProduct getModeledAccount() {
		return ModeledAccount;
	}

	public void setModeledAccount(ManagedAccountProduct ModeledAccount) {
		this.ModeledAccount = ModeledAccount;
	}
}