package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max256Text;

/**
 * Address which is accessed by electronic means.
 */
public class ElectronicAddress {

	private Max256Text EmailAddress;

	public Max256Text getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(Max256Text EmailAddress) {
		this.EmailAddress = EmailAddress;
	}
}