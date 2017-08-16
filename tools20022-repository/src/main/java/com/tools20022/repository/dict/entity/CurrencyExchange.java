package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.dict.entity.LiquidityManagementLimit;
import com.tools20022.repository.dict.entity.FixingCondition;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.TransactionAdministrator;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.CorporateActionCashEntitlement;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.CashDistribution;
import com.tools20022.repository.dict.entity.Adjustment;

/**
 * Information needed to process a currency exchange or conversion.
 */
public class CurrencyExchange extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount OriginalAmount;
	private ForeignExchangeTrade CurrencyExchangeForForeignExchangeTrade;
	private CurrencyCode UnitCurrency;
	private CurrencyCode QuotedCurrency;
	private BaseOneRate ExchangeRate;
	private CurrencyAndAmount ResultingAmount;
	private CorporateActionEvent RelatedCorporateActionEvent;
	private SecuritiesBalance CurrencyExchangeForSecuritiesBalance;
	private ISODateTime QuotationDate;
	private AssetHolding CalculatedAssetValue;
	private CurrencyCode SourceCurrency;
	private CurrencyCode TargetCurrency;
	private CashEntry CurrencyExchangeForCashEntry;
	private Payment RelatedPayment;
	private ExchangeRateTypeCode RateType;
	private LiquidityManagementLimit RelatedLimitManagement;
	private FixingCondition FixingConditions;
	private Tax Tax;
	private Invoice RelatedInvoice;
	private TransactionAdministrator CurrencyExchangeForTransactionAdministrator;
	private Account ReportedAccount;
	private CorporateActionCashEntitlement CurrencyExchangeForCorporateActionCashEntitlement;
	private PaymentExecution PaymentExecution;
	private Quote CurrencyExchangeForSecuritiesQuote;
	private SecuritiesConversion CurrencyExchangeForSecuritiesConversion;
	private CashDistribution CurrencyExchangeForCashDistribution;
	private Adjustment Adjustment;

	public CurrencyAndAmount getOriginalAmount() {
		return OriginalAmount;
	}

	public void setOriginalAmount(CurrencyAndAmount OriginalAmount) {
		this.OriginalAmount = OriginalAmount;
	}

	public ForeignExchangeTrade getCurrencyExchangeForForeignExchangeTrade() {
		return CurrencyExchangeForForeignExchangeTrade;
	}

	public void setCurrencyExchangeForForeignExchangeTrade(
			ForeignExchangeTrade CurrencyExchangeForForeignExchangeTrade) {
		this.CurrencyExchangeForForeignExchangeTrade = CurrencyExchangeForForeignExchangeTrade;
	}

	public CurrencyCode getUnitCurrency() {
		return UnitCurrency;
	}

	public void setUnitCurrency(CurrencyCode UnitCurrency) {
		this.UnitCurrency = UnitCurrency;
	}

	public CurrencyCode getQuotedCurrency() {
		return QuotedCurrency;
	}

	public void setQuotedCurrency(CurrencyCode QuotedCurrency) {
		this.QuotedCurrency = QuotedCurrency;
	}

	public BaseOneRate getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(BaseOneRate ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}

	public CurrencyAndAmount getResultingAmount() {
		return ResultingAmount;
	}

	public void setResultingAmount(CurrencyAndAmount ResultingAmount) {
		this.ResultingAmount = ResultingAmount;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return RelatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(
			CorporateActionEvent RelatedCorporateActionEvent) {
		this.RelatedCorporateActionEvent = RelatedCorporateActionEvent;
	}

	public SecuritiesBalance getCurrencyExchangeForSecuritiesBalance() {
		return CurrencyExchangeForSecuritiesBalance;
	}

	public void setCurrencyExchangeForSecuritiesBalance(
			SecuritiesBalance CurrencyExchangeForSecuritiesBalance) {
		this.CurrencyExchangeForSecuritiesBalance = CurrencyExchangeForSecuritiesBalance;
	}

	public ISODateTime getQuotationDate() {
		return QuotationDate;
	}

	public void setQuotationDate(ISODateTime QuotationDate) {
		this.QuotationDate = QuotationDate;
	}

	public AssetHolding getCalculatedAssetValue() {
		return CalculatedAssetValue;
	}

	public void setCalculatedAssetValue(AssetHolding CalculatedAssetValue) {
		this.CalculatedAssetValue = CalculatedAssetValue;
	}

	public CurrencyCode getSourceCurrency() {
		return SourceCurrency;
	}

	public void setSourceCurrency(CurrencyCode SourceCurrency) {
		this.SourceCurrency = SourceCurrency;
	}

	public CurrencyCode getTargetCurrency() {
		return TargetCurrency;
	}

	public void setTargetCurrency(CurrencyCode TargetCurrency) {
		this.TargetCurrency = TargetCurrency;
	}

	public CashEntry getCurrencyExchangeForCashEntry() {
		return CurrencyExchangeForCashEntry;
	}

	public void setCurrencyExchangeForCashEntry(
			CashEntry CurrencyExchangeForCashEntry) {
		this.CurrencyExchangeForCashEntry = CurrencyExchangeForCashEntry;
	}

	public Payment getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(Payment RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}

	public ExchangeRateTypeCode getRateType() {
		return RateType;
	}

	public void setRateType(ExchangeRateTypeCode RateType) {
		this.RateType = RateType;
	}

	public LiquidityManagementLimit getRelatedLimitManagement() {
		return RelatedLimitManagement;
	}

	public void setRelatedLimitManagement(
			LiquidityManagementLimit RelatedLimitManagement) {
		this.RelatedLimitManagement = RelatedLimitManagement;
	}

	public FixingCondition getFixingConditions() {
		return FixingConditions;
	}

	public void setFixingConditions(FixingCondition FixingConditions) {
		this.FixingConditions = FixingConditions;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}

	public Invoice getRelatedInvoice() {
		return RelatedInvoice;
	}

	public void setRelatedInvoice(Invoice RelatedInvoice) {
		this.RelatedInvoice = RelatedInvoice;
	}

	public TransactionAdministrator getCurrencyExchangeForTransactionAdministrator() {
		return CurrencyExchangeForTransactionAdministrator;
	}

	public void setCurrencyExchangeForTransactionAdministrator(
			TransactionAdministrator CurrencyExchangeForTransactionAdministrator) {
		this.CurrencyExchangeForTransactionAdministrator = CurrencyExchangeForTransactionAdministrator;
	}

	public Account getReportedAccount() {
		return ReportedAccount;
	}

	public void setReportedAccount(Account ReportedAccount) {
		this.ReportedAccount = ReportedAccount;
	}

	public CorporateActionCashEntitlement getCurrencyExchangeForCorporateActionCashEntitlement() {
		return CurrencyExchangeForCorporateActionCashEntitlement;
	}

	public void setCurrencyExchangeForCorporateActionCashEntitlement(
			CorporateActionCashEntitlement CurrencyExchangeForCorporateActionCashEntitlement) {
		this.CurrencyExchangeForCorporateActionCashEntitlement = CurrencyExchangeForCorporateActionCashEntitlement;
	}

	public PaymentExecution getPaymentExecution() {
		return PaymentExecution;
	}

	public void setPaymentExecution(PaymentExecution PaymentExecution) {
		this.PaymentExecution = PaymentExecution;
	}

	public Quote getCurrencyExchangeForSecuritiesQuote() {
		return CurrencyExchangeForSecuritiesQuote;
	}

	public void setCurrencyExchangeForSecuritiesQuote(
			Quote CurrencyExchangeForSecuritiesQuote) {
		this.CurrencyExchangeForSecuritiesQuote = CurrencyExchangeForSecuritiesQuote;
	}

	public SecuritiesConversion getCurrencyExchangeForSecuritiesConversion() {
		return CurrencyExchangeForSecuritiesConversion;
	}

	public void setCurrencyExchangeForSecuritiesConversion(
			SecuritiesConversion CurrencyExchangeForSecuritiesConversion) {
		this.CurrencyExchangeForSecuritiesConversion = CurrencyExchangeForSecuritiesConversion;
	}

	public CashDistribution getCurrencyExchangeForCashDistribution() {
		return CurrencyExchangeForCashDistribution;
	}

	public void setCurrencyExchangeForCashDistribution(
			CashDistribution CurrencyExchangeForCashDistribution) {
		this.CurrencyExchangeForCashDistribution = CurrencyExchangeForCashDistribution;
	}

	public Adjustment getAdjustment() {
		return Adjustment;
	}

	public void setAdjustment(Adjustment Adjustment) {
		this.Adjustment = Adjustment;
	}
}