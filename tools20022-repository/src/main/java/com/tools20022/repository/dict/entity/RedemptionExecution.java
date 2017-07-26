package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Execution of a redemption order.
 */
public class RedemptionExecution extends InvestmentFundOrderExecution {

	private CurrencyAndAmount RedeemedNetAmount;
	private CurrencyAndAmount PartialRedemptionWithholdingAmount;
	private ISODate SettlementDate;

	public CurrencyAndAmount getRedeemedNetAmount() {
		return RedeemedNetAmount;
	}

	public void setRedeemedNetAmount(CurrencyAndAmount RedeemedNetAmount) {
		this.RedeemedNetAmount = RedeemedNetAmount;
	}

	public CurrencyAndAmount getPartialRedemptionWithholdingAmount() {
		return PartialRedemptionWithholdingAmount;
	}

	public void setPartialRedemptionWithholdingAmount(
			CurrencyAndAmount PartialRedemptionWithholdingAmount) {
		this.PartialRedemptionWithholdingAmount = PartialRedemptionWithholdingAmount;
	}

	public ISODate getSettlementDate() {
		return SettlementDate;
	}

	public void setSettlementDate(ISODate SettlementDate) {
		this.SettlementDate = SettlementDate;
	}
}