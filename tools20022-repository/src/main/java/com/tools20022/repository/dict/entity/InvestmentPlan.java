package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.entity.Instalment;
import com.tools20022.repository.dict.entity.InvestmentAccountService;
import com.tools20022.repository.dict.entity.InsuranceCertificate;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.PlanStatusCode;

/**
 * Plan that allows investors to schedule periodical investments or divestments,
 * according to pre-defined criteria.
 */
public class InvestmentPlan {

	private FrequencyCode Frequency;
	private CurrencyAndAmount Amount;
	private Asset Asset;
	private Instalment Instalment;
	private InvestmentAccountService RelatedService;
	private InsuranceCertificate Insurance;
	private InvestmentFundOrder StandingOrder;
	private YesNoIndicator MultiCurrency;
	private CurrencyCode Currency;
	private Portfolio Portfolio;
	private DateTimePeriod InvestmentPeriod;
	private PlanStatusCode PlanStatus;

	public FrequencyCode getFrequency() {
		return Frequency;
	}

	public void setFrequency(FrequencyCode Frequency) {
		this.Frequency = Frequency;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}

	public Instalment getInstalment() {
		return Instalment;
	}

	public void setInstalment(Instalment Instalment) {
		this.Instalment = Instalment;
	}

	public InvestmentAccountService getRelatedService() {
		return RelatedService;
	}

	public void setRelatedService(InvestmentAccountService RelatedService) {
		this.RelatedService = RelatedService;
	}

	public InsuranceCertificate getInsurance() {
		return Insurance;
	}

	public void setInsurance(InsuranceCertificate Insurance) {
		this.Insurance = Insurance;
	}

	public InvestmentFundOrder getStandingOrder() {
		return StandingOrder;
	}

	public void setStandingOrder(InvestmentFundOrder StandingOrder) {
		this.StandingOrder = StandingOrder;
	}

	public YesNoIndicator getMultiCurrency() {
		return MultiCurrency;
	}

	public void setMultiCurrency(YesNoIndicator MultiCurrency) {
		this.MultiCurrency = MultiCurrency;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public DateTimePeriod getInvestmentPeriod() {
		return InvestmentPeriod;
	}

	public void setInvestmentPeriod(DateTimePeriod InvestmentPeriod) {
		this.InvestmentPeriod = InvestmentPeriod;
	}

	public PlanStatusCode getPlanStatus() {
		return PlanStatus;
	}

	public void setPlanStatus(PlanStatusCode PlanStatus) {
		this.PlanStatus = PlanStatus;
	}
}