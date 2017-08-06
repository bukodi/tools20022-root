package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Number, physical or virtual address, used for communication.
 */
public class ContactPoint {

	private AnyBICIdentifier BICAddress;
	private YesNoIndicator TemporaryIndicator;

	public AnyBICIdentifier getBICAddress() {
		return BICAddress;
	}

	public void setBICAddress(AnyBICIdentifier BICAddress) {
		this.BICAddress = BICAddress;
	}

	public YesNoIndicator getTemporaryIndicator() {
		return TemporaryIndicator;
	}

	public void setTemporaryIndicator(YesNoIndicator TemporaryIndicator) {
		this.TemporaryIndicator = TemporaryIndicator;
	}
}