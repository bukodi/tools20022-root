package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DiscountTypeCode;

/**
 * Decrease of the value of goods and / or services by applying a discount rate
 * to the original amount.
 */
public class Discount extends Adjustment {

	private CurrencyAndAmount DiscountAppliedAmount;
	private DiscountTypeCode DiscountType;
	private CurrencyAndAmount DiscountBasisAmount;

	public CurrencyAndAmount getDiscountAppliedAmount() {
		return DiscountAppliedAmount;
	}

	public void setDiscountAppliedAmount(CurrencyAndAmount DiscountAppliedAmount) {
		this.DiscountAppliedAmount = DiscountAppliedAmount;
	}

	public DiscountTypeCode getDiscountType() {
		return DiscountType;
	}

	public void setDiscountType(DiscountTypeCode DiscountType) {
		this.DiscountType = DiscountType;
	}

	public CurrencyAndAmount getDiscountBasisAmount() {
		return DiscountBasisAmount;
	}

	public void setDiscountBasisAmount(CurrencyAndAmount DiscountBasisAmount) {
		this.DiscountBasisAmount = DiscountBasisAmount;
	}
}