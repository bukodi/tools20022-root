package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Restriction on capability or operations allowed.
 */
public class AccountRestriction {

	private Account Account;
	private Max35Text RestrictionType;
	private DateTimePeriod ValidityPeriod;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Max35Text getRestrictionType() {
		return RestrictionType;
	}

	public void setRestrictionType(Max35Text RestrictionType) {
		this.RestrictionType = RestrictionType;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}
}