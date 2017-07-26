package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.IndividualPayment;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.CashStandingOrder;

/**
 * Payment made by transferring an amount of money from a debtor to a creditor.
 * The payment flows through one or more financial institutions or systems.
 */
public class CreditTransfer extends IndividualPayment {

	private YesNoIndicator StandingOrder;
	private CashStandingOrder RelatedStandingOrder;

	public YesNoIndicator getStandingOrder() {
		return StandingOrder;
	}

	public void setStandingOrder(YesNoIndicator StandingOrder) {
		this.StandingOrder = StandingOrder;
	}

	public CashStandingOrder getRelatedStandingOrder() {
		return RelatedStandingOrder;
	}

	public void setRelatedStandingOrder(CashStandingOrder RelatedStandingOrder) {
		this.RelatedStandingOrder = RelatedStandingOrder;
	}
}