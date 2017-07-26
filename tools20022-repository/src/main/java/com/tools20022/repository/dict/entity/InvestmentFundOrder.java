package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;
import com.tools20022.repository.dict.codeset.FundOrderTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CancellationRightCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.FinancialAdviceCode;
import com.tools20022.repository.dict.codeset.NegotiatedTradeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.OrderWaiverReasonCode;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.entity.SecuritiesOrderStatus;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, for example other assets, into or out of an investment fund.
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	private YesNoIndicator GrossAmountIndicator;
	private InvestmentFundTransaction RelatedTransaction;
	private FundOrderTypeCode OrderType;
	private CurrencyAndAmount GrossAmount;
	private SecuritiesQuantity UnitsNumber;
	private InvestmentFundOrderExecution InvestmentFundOrderExecution;
	private CurrencyAndAmount NetAmount;
	private ISODateTime OrderDateTime;
	private ISODateTime ExpiryDateTime;
	private CancellationRightCode CancellationRight;
	private CurrencyCode RequestedSettlementCurrency;
	private ISODateTime RequestedExecutionDateTime;
	private FinancialAdviceCode FinancialAdvice;
	private NegotiatedTradeCode NegotiatedTrade;
	private PercentageRate HoldingsRate;
	private OrderWaiverReasonCode OrderWaiverReason;
	private YesNoIndicator InitialOrderIndicator;
	private ISODateTime OrderBookingDate;
	private InvestmentPlan InvestmentPlan;
	private SecuritiesOrderStatus OrderStatus;
	private CurrencyAndAmount TotalAmount;

	public YesNoIndicator getGrossAmountIndicator() {
		return GrossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator GrossAmountIndicator) {
		this.GrossAmountIndicator = GrossAmountIndicator;
	}

	public InvestmentFundTransaction getRelatedTransaction() {
		return RelatedTransaction;
	}

	public void setRelatedTransaction(
			InvestmentFundTransaction RelatedTransaction) {
		this.RelatedTransaction = RelatedTransaction;
	}

	public FundOrderTypeCode getOrderType() {
		return OrderType;
	}

	public void setOrderType(FundOrderTypeCode OrderType) {
		this.OrderType = OrderType;
	}

	public CurrencyAndAmount getGrossAmount() {
		return GrossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount GrossAmount) {
		this.GrossAmount = GrossAmount;
	}

	public SecuritiesQuantity getUnitsNumber() {
		return UnitsNumber;
	}

	public void setUnitsNumber(SecuritiesQuantity UnitsNumber) {
		this.UnitsNumber = UnitsNumber;
	}

	public InvestmentFundOrderExecution getInvestmentFundOrderExecution() {
		return InvestmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(
			InvestmentFundOrderExecution InvestmentFundOrderExecution) {
		this.InvestmentFundOrderExecution = InvestmentFundOrderExecution;
	}

	public CurrencyAndAmount getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(CurrencyAndAmount NetAmount) {
		this.NetAmount = NetAmount;
	}

	public ISODateTime getOrderDateTime() {
		return OrderDateTime;
	}

	public void setOrderDateTime(ISODateTime OrderDateTime) {
		this.OrderDateTime = OrderDateTime;
	}

	public ISODateTime getExpiryDateTime() {
		return ExpiryDateTime;
	}

	public void setExpiryDateTime(ISODateTime ExpiryDateTime) {
		this.ExpiryDateTime = ExpiryDateTime;
	}

	public CancellationRightCode getCancellationRight() {
		return CancellationRight;
	}

	public void setCancellationRight(CancellationRightCode CancellationRight) {
		this.CancellationRight = CancellationRight;
	}

	public CurrencyCode getRequestedSettlementCurrency() {
		return RequestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(
			CurrencyCode RequestedSettlementCurrency) {
		this.RequestedSettlementCurrency = RequestedSettlementCurrency;
	}

	public ISODateTime getRequestedExecutionDateTime() {
		return RequestedExecutionDateTime;
	}

	public void setRequestedExecutionDateTime(
			ISODateTime RequestedExecutionDateTime) {
		this.RequestedExecutionDateTime = RequestedExecutionDateTime;
	}

	public FinancialAdviceCode getFinancialAdvice() {
		return FinancialAdvice;
	}

	public void setFinancialAdvice(FinancialAdviceCode FinancialAdvice) {
		this.FinancialAdvice = FinancialAdvice;
	}

	public NegotiatedTradeCode getNegotiatedTrade() {
		return NegotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTradeCode NegotiatedTrade) {
		this.NegotiatedTrade = NegotiatedTrade;
	}

	public PercentageRate getHoldingsRate() {
		return HoldingsRate;
	}

	public void setHoldingsRate(PercentageRate HoldingsRate) {
		this.HoldingsRate = HoldingsRate;
	}

	public OrderWaiverReasonCode getOrderWaiverReason() {
		return OrderWaiverReason;
	}

	public void setOrderWaiverReason(OrderWaiverReasonCode OrderWaiverReason) {
		this.OrderWaiverReason = OrderWaiverReason;
	}

	public YesNoIndicator getInitialOrderIndicator() {
		return InitialOrderIndicator;
	}

	public void setInitialOrderIndicator(YesNoIndicator InitialOrderIndicator) {
		this.InitialOrderIndicator = InitialOrderIndicator;
	}

	public ISODateTime getOrderBookingDate() {
		return OrderBookingDate;
	}

	public void setOrderBookingDate(ISODateTime OrderBookingDate) {
		this.OrderBookingDate = OrderBookingDate;
	}

	public InvestmentPlan getInvestmentPlan() {
		return InvestmentPlan;
	}

	public void setInvestmentPlan(InvestmentPlan InvestmentPlan) {
		this.InvestmentPlan = InvestmentPlan;
	}

	public SecuritiesOrderStatus getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(SecuritiesOrderStatus OrderStatus) {
		this.OrderStatus = OrderStatus;
	}

	public CurrencyAndAmount getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount TotalAmount) {
		this.TotalAmount = TotalAmount;
	}
}