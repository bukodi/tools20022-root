package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.codeset.CrossTradeExecutionCode;
import com.tools20022.repository.dict.codeset.CrossTypeCode;
import com.tools20022.repository.dict.codeset.PrioritisationCode;

/**
 * Transaction where either the buy-broker and the sell-broker are the same, or
 * the buy-broker and the sell-broker belong to the same firm.
 */
public class CrossTrade extends SecuritiesOrder {

	private SecuritiesOrder BuySideOrder;
	private SecuritiesOrder SellSideOrder;
	private CrossTradeExecutionCode ExecutionType;
	private CrossTypeCode CrossType;
	private PrioritisationCode Prioritisation;

	public SecuritiesOrder getBuySideOrder() {
		return BuySideOrder;
	}

	public void setBuySideOrder(SecuritiesOrder BuySideOrder) {
		this.BuySideOrder = BuySideOrder;
	}

	public SecuritiesOrder getSellSideOrder() {
		return SellSideOrder;
	}

	public void setSellSideOrder(SecuritiesOrder SellSideOrder) {
		this.SellSideOrder = SellSideOrder;
	}

	public CrossTradeExecutionCode getExecutionType() {
		return ExecutionType;
	}

	public void setExecutionType(CrossTradeExecutionCode ExecutionType) {
		this.ExecutionType = ExecutionType;
	}

	public CrossTypeCode getCrossType() {
		return CrossType;
	}

	public void setCrossType(CrossTypeCode CrossType) {
		this.CrossType = CrossType;
	}

	public PrioritisationCode getPrioritisation() {
		return Prioritisation;
	}

	public void setPrioritisation(PrioritisationCode Prioritisation) {
		this.Prioritisation = Prioritisation;
	}
}