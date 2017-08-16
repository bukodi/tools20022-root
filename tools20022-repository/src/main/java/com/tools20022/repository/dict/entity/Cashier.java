package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.datatype.Max2NumericText;

/**
 * Cashier who carried out the payment card transaction.
 */
public class Cashier extends CardPaymentPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max2NumericText ShiftNumber;

	public Max2NumericText getShiftNumber() {
		return ShiftNumber;
	}

	public void setShiftNumber(Max2NumericText ShiftNumber) {
		this.ShiftNumber = ShiftNumber;
	}
}