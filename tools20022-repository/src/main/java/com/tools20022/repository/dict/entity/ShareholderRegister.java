package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Contains a list of owners and the quantity of securities they own.
 */
public class ShareholderRegister {

	private Max35Text Identification;
	private DecimalNumber Entry;

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public DecimalNumber getEntry() {
		return Entry;
	}

	public void setEntry(DecimalNumber Entry) {
		this.Entry = Entry;
	}
}