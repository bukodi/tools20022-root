package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.ProcessingPositionCode;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.OffMarketCode;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.dict.codeset.ReportingCode;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 */
public class SecuritiesTradeExecution {

	private YesNoIndicator StampDutyIndicator;
	private ProcessingPositionCode ProcessingPosition;
	private SecuritiesSettlement SecuritiesSettlement;
	private SecuritiesPricing DealPrice;
	private CurrencyAndAmount MarginAmount;
	private SecuritiesQuantity ExecutedTradeQuantity;
	private OffMarketCode OffMarketReason;
	private SecuritiesTrade RelatedTrade;
	private CurrencyAndAmount DealExecutionAmount;
	private PaymentObligation PaymentObligation;
	private SecuritiesDeliveryObligation SecuritiesDeliveryObligation;
	private ReportingCode ReportingType;

	public YesNoIndicator getStampDutyIndicator() {
		return StampDutyIndicator;
	}

	public void setStampDutyIndicator(YesNoIndicator StampDutyIndicator) {
		this.StampDutyIndicator = StampDutyIndicator;
	}

	public ProcessingPositionCode getProcessingPosition() {
		return ProcessingPosition;
	}

	public void setProcessingPosition(ProcessingPositionCode ProcessingPosition) {
		this.ProcessingPosition = ProcessingPosition;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public SecuritiesPricing getDealPrice() {
		return DealPrice;
	}

	public void setDealPrice(SecuritiesPricing DealPrice) {
		this.DealPrice = DealPrice;
	}

	public CurrencyAndAmount getMarginAmount() {
		return MarginAmount;
	}

	public void setMarginAmount(CurrencyAndAmount MarginAmount) {
		this.MarginAmount = MarginAmount;
	}

	public SecuritiesQuantity getExecutedTradeQuantity() {
		return ExecutedTradeQuantity;
	}

	public void setExecutedTradeQuantity(
			SecuritiesQuantity ExecutedTradeQuantity) {
		this.ExecutedTradeQuantity = ExecutedTradeQuantity;
	}

	public OffMarketCode getOffMarketReason() {
		return OffMarketReason;
	}

	public void setOffMarketReason(OffMarketCode OffMarketReason) {
		this.OffMarketReason = OffMarketReason;
	}

	public SecuritiesTrade getRelatedTrade() {
		return RelatedTrade;
	}

	public void setRelatedTrade(SecuritiesTrade RelatedTrade) {
		this.RelatedTrade = RelatedTrade;
	}

	public CurrencyAndAmount getDealExecutionAmount() {
		return DealExecutionAmount;
	}

	public void setDealExecutionAmount(CurrencyAndAmount DealExecutionAmount) {
		this.DealExecutionAmount = DealExecutionAmount;
	}

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public SecuritiesDeliveryObligation getSecuritiesDeliveryObligation() {
		return SecuritiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(
			SecuritiesDeliveryObligation SecuritiesDeliveryObligation) {
		this.SecuritiesDeliveryObligation = SecuritiesDeliveryObligation;
	}

	public ReportingCode getReportingType() {
		return ReportingType;
	}

	public void setReportingType(ReportingCode ReportingType) {
		this.ReportingType = ReportingType;
	}
}