package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.dict.entity.BookEntry;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, for example, subscriptions or redemptions.
 */
public class FundsCashFlow {

	private YesNoIndicator ExceptionalCashFlowIndicator;
	private FlowDirectionTypeCode FlowDirection;
	private BookEntry FundSubscriptionAccountEntry;
	private BookEntry FundRedemptionAccountEntry;
	private InvestmentFundOrderExecution RelatedOrder;
	private YesNoIndicator NetIndicator;
	private NetAssetValueCalculation NetAssetValueCalculation;
	private SecuritiesQuantity CashFlowQuantity;

	public YesNoIndicator getExceptionalCashFlowIndicator() {
		return ExceptionalCashFlowIndicator;
	}

	public void setExceptionalCashFlowIndicator(
			YesNoIndicator ExceptionalCashFlowIndicator) {
		this.ExceptionalCashFlowIndicator = ExceptionalCashFlowIndicator;
	}

	public FlowDirectionTypeCode getFlowDirection() {
		return FlowDirection;
	}

	public void setFlowDirection(FlowDirectionTypeCode FlowDirection) {
		this.FlowDirection = FlowDirection;
	}

	public BookEntry getFundSubscriptionAccountEntry() {
		return FundSubscriptionAccountEntry;
	}

	public void setFundSubscriptionAccountEntry(
			BookEntry FundSubscriptionAccountEntry) {
		this.FundSubscriptionAccountEntry = FundSubscriptionAccountEntry;
	}

	public BookEntry getFundRedemptionAccountEntry() {
		return FundRedemptionAccountEntry;
	}

	public void setFundRedemptionAccountEntry(
			BookEntry FundRedemptionAccountEntry) {
		this.FundRedemptionAccountEntry = FundRedemptionAccountEntry;
	}

	public InvestmentFundOrderExecution getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(InvestmentFundOrderExecution RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public YesNoIndicator getNetIndicator() {
		return NetIndicator;
	}

	public void setNetIndicator(YesNoIndicator NetIndicator) {
		this.NetIndicator = NetIndicator;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public SecuritiesQuantity getCashFlowQuantity() {
		return CashFlowQuantity;
	}

	public void setCashFlowQuantity(SecuritiesQuantity CashFlowQuantity) {
		this.CashFlowQuantity = CashFlowQuantity;
	}
}