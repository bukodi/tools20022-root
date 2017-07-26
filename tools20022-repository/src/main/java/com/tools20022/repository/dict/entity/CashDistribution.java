package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.SecuritiesAndCashDistribution;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.PaymentTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Distribution of cash pay-out.
 */
public class CashDistribution extends Distribution {

	private CurrencyExchange DistributionCurrencyExchangeInformation;
	private SecuritiesAndCashDistribution SecuritiesAndCashDistribution;
	private BaseOneRate AmortisedRate;
	private PercentageRate Rate;
	private PercentageRate CashIndemnityRate;
	private YesNoIndicator DividendReinvestmentIndicator;
	private CurrencyAndAmount InterestAmount;
	private PercentageRate InterestRate;
	private YesNoIndicator LoyaltyPremiumIndicator;
	private PaymentTypeCode PaymentType;
	private ISODateTime SelectionDate;
	private PercentageRate CashDistributionRate;
	private CurrencyAndAmount CashDistributionAmount;

	public CurrencyExchange getDistributionCurrencyExchangeInformation() {
		return DistributionCurrencyExchangeInformation;
	}

	public void setDistributionCurrencyExchangeInformation(
			CurrencyExchange DistributionCurrencyExchangeInformation) {
		this.DistributionCurrencyExchangeInformation = DistributionCurrencyExchangeInformation;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return SecuritiesAndCashDistribution;
	}

	public void setSecuritiesAndCashDistribution(
			SecuritiesAndCashDistribution SecuritiesAndCashDistribution) {
		this.SecuritiesAndCashDistribution = SecuritiesAndCashDistribution;
	}

	public BaseOneRate getAmortisedRate() {
		return AmortisedRate;
	}

	public void setAmortisedRate(BaseOneRate AmortisedRate) {
		this.AmortisedRate = AmortisedRate;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public PercentageRate getCashIndemnityRate() {
		return CashIndemnityRate;
	}

	public void setCashIndemnityRate(PercentageRate CashIndemnityRate) {
		this.CashIndemnityRate = CashIndemnityRate;
	}

	public YesNoIndicator getDividendReinvestmentIndicator() {
		return DividendReinvestmentIndicator;
	}

	public void setDividendReinvestmentIndicator(
			YesNoIndicator DividendReinvestmentIndicator) {
		this.DividendReinvestmentIndicator = DividendReinvestmentIndicator;
	}

	public CurrencyAndAmount getInterestAmount() {
		return InterestAmount;
	}

	public void setInterestAmount(CurrencyAndAmount InterestAmount) {
		this.InterestAmount = InterestAmount;
	}

	public PercentageRate getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(PercentageRate InterestRate) {
		this.InterestRate = InterestRate;
	}

	public YesNoIndicator getLoyaltyPremiumIndicator() {
		return LoyaltyPremiumIndicator;
	}

	public void setLoyaltyPremiumIndicator(
			YesNoIndicator LoyaltyPremiumIndicator) {
		this.LoyaltyPremiumIndicator = LoyaltyPremiumIndicator;
	}

	public PaymentTypeCode getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(PaymentTypeCode PaymentType) {
		this.PaymentType = PaymentType;
	}

	public ISODateTime getSelectionDate() {
		return SelectionDate;
	}

	public void setSelectionDate(ISODateTime SelectionDate) {
		this.SelectionDate = SelectionDate;
	}

	public PercentageRate getCashDistributionRate() {
		return CashDistributionRate;
	}

	public void setCashDistributionRate(PercentageRate CashDistributionRate) {
		this.CashDistributionRate = CashDistributionRate;
	}

	public CurrencyAndAmount getCashDistributionAmount() {
		return CashDistributionAmount;
	}

	public void setCashDistributionAmount(
			CurrencyAndAmount CashDistributionAmount) {
		this.CashDistributionAmount = CashDistributionAmount;
	}
}