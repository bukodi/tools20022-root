package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.codeset.CashClearingSystemCode;

/**
 * Clearing system that processes only cash transfers.
 */
public class CashClearingSystem implements InstanceOf<MMBusinessComponent> {

	private CashClearingSystemCode Identification;

	public CashClearingSystemCode getIdentification() {
		return Identification;
	}

	public void setIdentification(CashClearingSystemCode Identification) {
		this.Identification = Identification;
	}
}