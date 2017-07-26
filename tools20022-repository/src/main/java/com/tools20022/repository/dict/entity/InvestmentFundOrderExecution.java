package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.BestExecutionCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.LateReportCode;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;
import com.tools20022.repository.dict.entity.FundsCashFlow;
import com.tools20022.repository.dict.codeset.SourceOfCashCode;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	private SecuritiesQuantity UnitsNumber;
	private Max350Text NonStandardSettlementInformation;
	private InvestmentFundOrder Order;
	private Max35Text DealIdentification;
	private SecuritiesPricing ExecutedTradePrice;
	private YesNoIndicator PartiallyExecutedIndicator;
	private CurrencyAndAmount InterimProfitAmount;
	private SecuritiesPricing InformativePrice;
	private BestExecutionCode BestExecution;
	private PercentageRate PartialSettlementOfUnits;
	private PercentageRate PartialSettlementOfCash;
	private LateReportCode LateReport;
	private YesNoIndicator SettledIndicator;
	private YesNoIndicator RegisteredIndicator;
	private CurrencyAndAmount ExecutedAmount;
	private InvestmentFundTransaction InvestmentFundTransaction;
	private FundsCashFlow CashFlow;
	private SourceOfCashCode SourceOfCash;

	public SecuritiesQuantity getUnitsNumber() {
		return UnitsNumber;
	}

	public void setUnitsNumber(SecuritiesQuantity UnitsNumber) {
		this.UnitsNumber = UnitsNumber;
	}

	public Max350Text getNonStandardSettlementInformation() {
		return NonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(
			Max350Text NonStandardSettlementInformation) {
		this.NonStandardSettlementInformation = NonStandardSettlementInformation;
	}

	public InvestmentFundOrder getOrder() {
		return Order;
	}

	public void setOrder(InvestmentFundOrder Order) {
		this.Order = Order;
	}

	public Max35Text getDealIdentification() {
		return DealIdentification;
	}

	public void setDealIdentification(Max35Text DealIdentification) {
		this.DealIdentification = DealIdentification;
	}

	public SecuritiesPricing getExecutedTradePrice() {
		return ExecutedTradePrice;
	}

	public void setExecutedTradePrice(SecuritiesPricing ExecutedTradePrice) {
		this.ExecutedTradePrice = ExecutedTradePrice;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return PartiallyExecutedIndicator;
	}

	public void setPartiallyExecutedIndicator(
			YesNoIndicator PartiallyExecutedIndicator) {
		this.PartiallyExecutedIndicator = PartiallyExecutedIndicator;
	}

	public CurrencyAndAmount getInterimProfitAmount() {
		return InterimProfitAmount;
	}

	public void setInterimProfitAmount(CurrencyAndAmount InterimProfitAmount) {
		this.InterimProfitAmount = InterimProfitAmount;
	}

	public SecuritiesPricing getInformativePrice() {
		return InformativePrice;
	}

	public void setInformativePrice(SecuritiesPricing InformativePrice) {
		this.InformativePrice = InformativePrice;
	}

	public BestExecutionCode getBestExecution() {
		return BestExecution;
	}

	public void setBestExecution(BestExecutionCode BestExecution) {
		this.BestExecution = BestExecution;
	}

	public PercentageRate getPartialSettlementOfUnits() {
		return PartialSettlementOfUnits;
	}

	public void setPartialSettlementOfUnits(
			PercentageRate PartialSettlementOfUnits) {
		this.PartialSettlementOfUnits = PartialSettlementOfUnits;
	}

	public PercentageRate getPartialSettlementOfCash() {
		return PartialSettlementOfCash;
	}

	public void setPartialSettlementOfCash(
			PercentageRate PartialSettlementOfCash) {
		this.PartialSettlementOfCash = PartialSettlementOfCash;
	}

	public LateReportCode getLateReport() {
		return LateReport;
	}

	public void setLateReport(LateReportCode LateReport) {
		this.LateReport = LateReport;
	}

	public YesNoIndicator getSettledIndicator() {
		return SettledIndicator;
	}

	public void setSettledIndicator(YesNoIndicator SettledIndicator) {
		this.SettledIndicator = SettledIndicator;
	}

	public YesNoIndicator getRegisteredIndicator() {
		return RegisteredIndicator;
	}

	public void setRegisteredIndicator(YesNoIndicator RegisteredIndicator) {
		this.RegisteredIndicator = RegisteredIndicator;
	}

	public CurrencyAndAmount getExecutedAmount() {
		return ExecutedAmount;
	}

	public void setExecutedAmount(CurrencyAndAmount ExecutedAmount) {
		this.ExecutedAmount = ExecutedAmount;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return InvestmentFundTransaction;
	}

	public void setInvestmentFundTransaction(
			InvestmentFundTransaction InvestmentFundTransaction) {
		this.InvestmentFundTransaction = InvestmentFundTransaction;
	}

	public FundsCashFlow getCashFlow() {
		return CashFlow;
	}

	public void setCashFlow(FundsCashFlow CashFlow) {
		this.CashFlow = CashFlow;
	}

	public SourceOfCashCode getSourceOfCash() {
		return SourceOfCash;
	}

	public void setSourceOfCash(SourceOfCashCode SourceOfCash) {
		this.SourceOfCash = SourceOfCash;
	}
}