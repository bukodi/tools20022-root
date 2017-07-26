package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Presentation;

/**
 * Address which is accessed by electronic means.
 */
public class ElectronicAddress extends ContactPoint {

	private Max256Text EmailAddress;
	private Max256Text URLAddress;
	private Max35Text TelexAddress;
	private Presentation RelatedPresentation;
	private Max35Text TeletextAddress;
	private Max35Text ISDNAddress;

	public Max256Text getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(Max256Text EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	public Max256Text getURLAddress() {
		return URLAddress;
	}

	public void setURLAddress(Max256Text URLAddress) {
		this.URLAddress = URLAddress;
	}

	public Max35Text getTelexAddress() {
		return TelexAddress;
	}

	public void setTelexAddress(Max35Text TelexAddress) {
		this.TelexAddress = TelexAddress;
	}

	public Presentation getRelatedPresentation() {
		return RelatedPresentation;
	}

	public void setRelatedPresentation(Presentation RelatedPresentation) {
		this.RelatedPresentation = RelatedPresentation;
	}

	public Max35Text getTeletextAddress() {
		return TeletextAddress;
	}

	public void setTeletextAddress(Max35Text TeletextAddress) {
		this.TeletextAddress = TeletextAddress;
	}

	public Max35Text getISDNAddress() {
		return ISDNAddress;
	}

	public void setISDNAddress(Max35Text ISDNAddress) {
		this.ISDNAddress = ISDNAddress;
	}
}