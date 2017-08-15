package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.AccountIdentification;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 */
public class Account implements InstanceOf<MMBusinessComponent> {

	private CurrencyCode BaseCurrency;
	private AccountIdentification Identification;

	public CurrencyCode getBaseCurrency() {
		return BaseCurrency;
	}

	public void setBaseCurrency(CurrencyCode BaseCurrency) {
		this.BaseCurrency = BaseCurrency;
	}

	public AccountIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(AccountIdentification Identification) {
		this.Identification = Identification;
	}
}