package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.datatype.Max2NumericText;

/**
 * Cashier who carried out the payment card transaction.
 */
public class Cashier extends CardPaymentPartyRole {

	private Max2NumericText ShiftNumber;

	public Max2NumericText getShiftNumber() {
		return ShiftNumber;
	}

	public void setShiftNumber(Max2NumericText ShiftNumber) {
		this.ShiftNumber = ShiftNumber;
	}
}