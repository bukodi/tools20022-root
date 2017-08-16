package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Collection of information that identifies a phone address.
 */
public class PhoneAddress extends ContactPoint
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text PhoneNumber;
	private Max35Text FaxNumber;
	private Max35Text MobileNumber;

	public Max35Text getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Max35Text PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public Max35Text getFaxNumber() {
		return FaxNumber;
	}

	public void setFaxNumber(Max35Text FaxNumber) {
		this.FaxNumber = FaxNumber;
	}

	public Max35Text getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Max35Text MobileNumber) {
		this.MobileNumber = MobileNumber;
	}
}