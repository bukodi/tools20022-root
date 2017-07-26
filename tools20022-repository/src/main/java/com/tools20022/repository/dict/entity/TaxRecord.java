package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.TaxPeriod;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;

/**
 * Record of tax details.
 */
public class TaxRecord {

	private Tax Tax;
	private Max35Text TaxRecordType;
	private Max35Text Category;
	private Max35Text Status;
	private Max35Text FormsCode;
	private TaxPeriod Period;
	private ActiveCurrencyAndAmount Amount;
	private Max35Text CategoryDescription;

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public Max35Text getTaxRecordType() {
		return TaxRecordType;
	}

	public void setTaxRecordType(Max35Text TaxRecordType) {
		this.TaxRecordType = TaxRecordType;
	}

	public Max35Text getCategory() {
		return Category;
	}

	public void setCategory(Max35Text Category) {
		this.Category = Category;
	}

	public Max35Text getStatus() {
		return Status;
	}

	public void setStatus(Max35Text Status) {
		this.Status = Status;
	}

	public Max35Text getFormsCode() {
		return FormsCode;
	}

	public void setFormsCode(Max35Text FormsCode) {
		this.FormsCode = FormsCode;
	}

	public TaxPeriod getPeriod() {
		return Period;
	}

	public void setPeriod(TaxPeriod Period) {
		this.Period = Period;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(ActiveCurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Max35Text getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(Max35Text CategoryDescription) {
		this.CategoryDescription = CategoryDescription;
	}
}