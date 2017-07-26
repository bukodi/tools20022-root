package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.entity.Commission;

/**
 * The definition of all the charges related to a corporate action event.
 */
public class CorporateActionFeesAndCharges extends Charges {

	private CorporateActionEvent CorporateAction;
	private RateAndAmount SolicitationFee;
	private RateAndAmount EarlySolicitationFeeRate;
	private Commission Commission;

	public CorporateActionEvent getCorporateAction() {
		return CorporateAction;
	}

	public void setCorporateAction(CorporateActionEvent CorporateAction) {
		this.CorporateAction = CorporateAction;
	}

	public RateAndAmount getSolicitationFee() {
		return SolicitationFee;
	}

	public void setSolicitationFee(RateAndAmount SolicitationFee) {
		this.SolicitationFee = SolicitationFee;
	}

	public RateAndAmount getEarlySolicitationFeeRate() {
		return EarlySolicitationFeeRate;
	}

	public void setEarlySolicitationFeeRate(
			RateAndAmount EarlySolicitationFeeRate) {
		this.EarlySolicitationFeeRate = EarlySolicitationFeeRate;
	}

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}
}