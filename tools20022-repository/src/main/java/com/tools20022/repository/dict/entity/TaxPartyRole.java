package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Role played by a party in the context of a tax due.
 */
public class TaxPartyRole extends Role {

	private Tax Tax;
	private Max35Text VATRegistrationNumber;

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public Max35Text getVATRegistrationNumber() {
		return VATRegistrationNumber;
	}

	public void setVATRegistrationNumber(Max35Text VATRegistrationNumber) {
		this.VATRegistrationNumber = VATRegistrationNumber;
	}
}