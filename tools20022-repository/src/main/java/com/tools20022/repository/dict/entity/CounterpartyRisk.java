package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.ExposureCalculation;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on its credit risk.
 */
public class CounterpartyRisk {

	private Role Party;
	private ActiveCurrencyAndAmount ExposedAmount;
	private ExposureCalculation ExposureCalculation;

	public Role getParty() {
		return Party;
	}

	public void setParty(Role Party) {
		this.Party = Party;
	}

	public ActiveCurrencyAndAmount getExposedAmount() {
		return ExposedAmount;
	}

	public void setExposedAmount(ActiveCurrencyAndAmount ExposedAmount) {
		this.ExposedAmount = ExposedAmount;
	}

	public ExposureCalculation getExposureCalculation() {
		return ExposureCalculation;
	}

	public void setExposureCalculation(ExposureCalculation ExposureCalculation) {
		this.ExposureCalculation = ExposureCalculation;
	}
}