package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Additional party appointed to distribute payment or securities on behalf of
 * the issuer.
 */
public class PayingAgentRole {

	private CurrencyAndAmount CommissionAmount;

	public CurrencyAndAmount getCommissionAmount() {
		return CommissionAmount;
	}

	public void setCommissionAmount(CurrencyAndAmount CommissionAmount) {
		this.CommissionAmount = CommissionAmount;
	}
}