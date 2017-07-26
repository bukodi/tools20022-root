package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.NonEligibleProceedsIndicatorCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CorporateActionOption;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.codeset.CountryCode;

/**
 * Definition of exchanges of cash and/or securities available in the processing
 * of corporate actions.
 */
public class ProceedsDefinition {

	private CurrencyAndAmount SpecialConcessionAmount;
	private DebitCreditCode CreditDebitIndicator;
	private ISODateTime EarliestPaymentDate;
	private ISODateTime ValueDate;
	private NonEligibleProceedsIndicatorCode NonEligibleProceedsIndicator;
	private Max35Text IssuerOfferorTaxabilityIndicator;
	private ISODateTime OfferPriceFixingDate;
	private CorporateActionOption Option;
	private CorporateActionEvent CorporateAction;
	private CountryCode CountryOfIncomeSource;

	public CurrencyAndAmount getSpecialConcessionAmount() {
		return SpecialConcessionAmount;
	}

	public void setSpecialConcessionAmount(
			CurrencyAndAmount SpecialConcessionAmount) {
		this.SpecialConcessionAmount = SpecialConcessionAmount;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public ISODateTime getEarliestPaymentDate() {
		return EarliestPaymentDate;
	}

	public void setEarliestPaymentDate(ISODateTime EarliestPaymentDate) {
		this.EarliestPaymentDate = EarliestPaymentDate;
	}

	public ISODateTime getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODateTime ValueDate) {
		this.ValueDate = ValueDate;
	}

	public NonEligibleProceedsIndicatorCode getNonEligibleProceedsIndicator() {
		return NonEligibleProceedsIndicator;
	}

	public void setNonEligibleProceedsIndicator(
			NonEligibleProceedsIndicatorCode NonEligibleProceedsIndicator) {
		this.NonEligibleProceedsIndicator = NonEligibleProceedsIndicator;
	}

	public Max35Text getIssuerOfferorTaxabilityIndicator() {
		return IssuerOfferorTaxabilityIndicator;
	}

	public void setIssuerOfferorTaxabilityIndicator(
			Max35Text IssuerOfferorTaxabilityIndicator) {
		this.IssuerOfferorTaxabilityIndicator = IssuerOfferorTaxabilityIndicator;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return OfferPriceFixingDate;
	}

	public void setOfferPriceFixingDate(ISODateTime OfferPriceFixingDate) {
		this.OfferPriceFixingDate = OfferPriceFixingDate;
	}

	public CorporateActionOption getOption() {
		return Option;
	}

	public void setOption(CorporateActionOption Option) {
		this.Option = Option;
	}

	public CorporateActionEvent getCorporateAction() {
		return CorporateAction;
	}

	public void setCorporateAction(CorporateActionEvent CorporateAction) {
		this.CorporateAction = CorporateAction;
	}

	public CountryCode getCountryOfIncomeSource() {
		return CountryOfIncomeSource;
	}

	public void setCountryOfIncomeSource(CountryCode CountryOfIncomeSource) {
		this.CountryOfIncomeSource = CountryOfIncomeSource;
	}
}