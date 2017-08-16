package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ProceedsDefinition;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.PaymentCode;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.codeset.CurrencyCode;

/**
 * Definition of the cash proceeds for a corporate action in generic terms; that
 * is, before applying it to specific securities holding. An example would be
 * the definition of a dividend payment where all the information will be given
 * in general on a per share basis.
 */
public class CashProceedsDefinition extends ProceedsDefinition
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PercentageRate CashIncentiveRate;
	private PaymentCode ContractualPaymentIndicator;
	private GenericIdentification IncomeType;
	private CurrencyAndAmount IndemnityAmount;
	private ActiveCurrencyAndAmount CashIncentiveAmount;
	private CurrencyAndAmount PrincipalOrCorpus;
	private CurrencyAndAmount RedemptionPremiumAmount;
	private CurrencyAndAmount IncomePortion;
	private Interest Interest;
	private CurrencyAndAmount Amount;
	private Dividend Dividend;
	private CurrencyCode PaymentCurrency;

	public PercentageRate getCashIncentiveRate() {
		return CashIncentiveRate;
	}

	public void setCashIncentiveRate(PercentageRate CashIncentiveRate) {
		this.CashIncentiveRate = CashIncentiveRate;
	}

	public PaymentCode getContractualPaymentIndicator() {
		return ContractualPaymentIndicator;
	}

	public void setContractualPaymentIndicator(
			PaymentCode ContractualPaymentIndicator) {
		this.ContractualPaymentIndicator = ContractualPaymentIndicator;
	}

	public GenericIdentification getIncomeType() {
		return IncomeType;
	}

	public void setIncomeType(GenericIdentification IncomeType) {
		this.IncomeType = IncomeType;
	}

	public CurrencyAndAmount getIndemnityAmount() {
		return IndemnityAmount;
	}

	public void setIndemnityAmount(CurrencyAndAmount IndemnityAmount) {
		this.IndemnityAmount = IndemnityAmount;
	}

	public ActiveCurrencyAndAmount getCashIncentiveAmount() {
		return CashIncentiveAmount;
	}

	public void setCashIncentiveAmount(
			ActiveCurrencyAndAmount CashIncentiveAmount) {
		this.CashIncentiveAmount = CashIncentiveAmount;
	}

	public CurrencyAndAmount getPrincipalOrCorpus() {
		return PrincipalOrCorpus;
	}

	public void setPrincipalOrCorpus(CurrencyAndAmount PrincipalOrCorpus) {
		this.PrincipalOrCorpus = PrincipalOrCorpus;
	}

	public CurrencyAndAmount getRedemptionPremiumAmount() {
		return RedemptionPremiumAmount;
	}

	public void setRedemptionPremiumAmount(
			CurrencyAndAmount RedemptionPremiumAmount) {
		this.RedemptionPremiumAmount = RedemptionPremiumAmount;
	}

	public CurrencyAndAmount getIncomePortion() {
		return IncomePortion;
	}

	public void setIncomePortion(CurrencyAndAmount IncomePortion) {
		this.IncomePortion = IncomePortion;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Dividend getDividend() {
		return Dividend;
	}

	public void setDividend(Dividend Dividend) {
		this.Dividend = Dividend;
	}

	public CurrencyCode getPaymentCurrency() {
		return PaymentCurrency;
	}

	public void setPaymentCurrency(CurrencyCode PaymentCurrency) {
		this.PaymentCurrency = PaymentCurrency;
	}
}