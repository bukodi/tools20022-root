package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ServiceTaxDesignationCode;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Service is the intangible equivalent of a good.
 */
public class Service extends Product {

	private CurrencyAndAmount Amount;
	private Max35Text Type;
	private ServiceTaxDesignationCode TaxDesignation;
	private PercentageRate Rate;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Max35Text getType() {
		return Type;
	}

	public void setType(Max35Text Type) {
		this.Type = Type;
	}

	public ServiceTaxDesignationCode getTaxDesignation() {
		return TaxDesignation;
	}

	public void setTaxDesignation(ServiceTaxDesignationCode TaxDesignation) {
		this.TaxDesignation = TaxDesignation;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}
}