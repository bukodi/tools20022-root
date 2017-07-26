package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.entity.Scheme;

/**
 * Party to which an amount of money is due.
 */
public class CreditorRole extends PaymentPartyRole {

	private Scheme SchemeIdentification;

	public Scheme getSchemeIdentification() {
		return SchemeIdentification;
	}

	public void setSchemeIdentification(Scheme SchemeIdentification) {
		this.SchemeIdentification = SchemeIdentification;
	}
}