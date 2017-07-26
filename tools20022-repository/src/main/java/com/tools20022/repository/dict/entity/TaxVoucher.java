package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesTax;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CorporateActionDistribution;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;

/**
 * Statement showing the amount or value of a distribution and either the tax
 * credit to which the recipient is entitled in respect of that distribution; or
 * the amount of tax deducted from the distribution.
 */
public class TaxVoucher {

	private PercentageRate RequestedTaxationRate;
	private PercentageRate CreditRate;
	private SecuritiesTax RelatedSecurityTax;
	private CurrencyAndAmount SundryOrOtherAmount;
	private CurrencyAndAmount CreditAmount;
	private CurrencyAndAmount CashAmountBroughtForward;
	private CurrencyAndAmount CashAmountCarriedForward;
	private CurrencyAndAmount NotionalTaxAmount;
	private CorporateActionDistribution Distribution;
	private Max35Text Identification;
	private ISODate BargainDate;
	private ISODate BargainSettlementDate;
	private BaseOneRate TaxVoucherRate;
	private SecuritiesQuantity RecordDateHolding;
	private SecuritiesPricing ScripDividendReinvestmentPricePerShare;
	private ActiveCurrencyAndAmount AllotedSharesCost;
	private ForeignExchangeTrade ForeignExchangeTransaction;

	public PercentageRate getRequestedTaxationRate() {
		return RequestedTaxationRate;
	}

	public void setRequestedTaxationRate(PercentageRate RequestedTaxationRate) {
		this.RequestedTaxationRate = RequestedTaxationRate;
	}

	public PercentageRate getCreditRate() {
		return CreditRate;
	}

	public void setCreditRate(PercentageRate CreditRate) {
		this.CreditRate = CreditRate;
	}

	public SecuritiesTax getRelatedSecurityTax() {
		return RelatedSecurityTax;
	}

	public void setRelatedSecurityTax(SecuritiesTax RelatedSecurityTax) {
		this.RelatedSecurityTax = RelatedSecurityTax;
	}

	public CurrencyAndAmount getSundryOrOtherAmount() {
		return SundryOrOtherAmount;
	}

	public void setSundryOrOtherAmount(CurrencyAndAmount SundryOrOtherAmount) {
		this.SundryOrOtherAmount = SundryOrOtherAmount;
	}

	public CurrencyAndAmount getCreditAmount() {
		return CreditAmount;
	}

	public void setCreditAmount(CurrencyAndAmount CreditAmount) {
		this.CreditAmount = CreditAmount;
	}

	public CurrencyAndAmount getCashAmountBroughtForward() {
		return CashAmountBroughtForward;
	}

	public void setCashAmountBroughtForward(
			CurrencyAndAmount CashAmountBroughtForward) {
		this.CashAmountBroughtForward = CashAmountBroughtForward;
	}

	public CurrencyAndAmount getCashAmountCarriedForward() {
		return CashAmountCarriedForward;
	}

	public void setCashAmountCarriedForward(
			CurrencyAndAmount CashAmountCarriedForward) {
		this.CashAmountCarriedForward = CashAmountCarriedForward;
	}

	public CurrencyAndAmount getNotionalTaxAmount() {
		return NotionalTaxAmount;
	}

	public void setNotionalTaxAmount(CurrencyAndAmount NotionalTaxAmount) {
		this.NotionalTaxAmount = NotionalTaxAmount;
	}

	public CorporateActionDistribution getDistribution() {
		return Distribution;
	}

	public void setDistribution(CorporateActionDistribution Distribution) {
		this.Distribution = Distribution;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public ISODate getBargainDate() {
		return BargainDate;
	}

	public void setBargainDate(ISODate BargainDate) {
		this.BargainDate = BargainDate;
	}

	public ISODate getBargainSettlementDate() {
		return BargainSettlementDate;
	}

	public void setBargainSettlementDate(ISODate BargainSettlementDate) {
		this.BargainSettlementDate = BargainSettlementDate;
	}

	public BaseOneRate getTaxVoucherRate() {
		return TaxVoucherRate;
	}

	public void setTaxVoucherRate(BaseOneRate TaxVoucherRate) {
		this.TaxVoucherRate = TaxVoucherRate;
	}

	public SecuritiesQuantity getRecordDateHolding() {
		return RecordDateHolding;
	}

	public void setRecordDateHolding(SecuritiesQuantity RecordDateHolding) {
		this.RecordDateHolding = RecordDateHolding;
	}

	public SecuritiesPricing getScripDividendReinvestmentPricePerShare() {
		return ScripDividendReinvestmentPricePerShare;
	}

	public void setScripDividendReinvestmentPricePerShare(
			SecuritiesPricing ScripDividendReinvestmentPricePerShare) {
		this.ScripDividendReinvestmentPricePerShare = ScripDividendReinvestmentPricePerShare;
	}

	public ActiveCurrencyAndAmount getAllotedSharesCost() {
		return AllotedSharesCost;
	}

	public void setAllotedSharesCost(ActiveCurrencyAndAmount AllotedSharesCost) {
		this.AllotedSharesCost = AllotedSharesCost;
	}

	public ForeignExchangeTrade getForeignExchangeTransaction() {
		return ForeignExchangeTransaction;
	}

	public void setForeignExchangeTransaction(
			ForeignExchangeTrade ForeignExchangeTransaction) {
		this.ForeignExchangeTransaction = ForeignExchangeTransaction;
	}
}