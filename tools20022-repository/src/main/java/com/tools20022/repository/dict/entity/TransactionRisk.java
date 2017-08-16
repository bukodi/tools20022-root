package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.ExposureCalculation;

/**
 * Calculation of the exposure amount that one party has vis-a-vis one
 * counterparty or a central system, based on the transactions that are not yet
 * settled.
 */
public class TransactionRisk extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Obligation Obligation;
	private ActiveCurrencyAndAmount ExposedAmount;
	private ExposureCalculation ExposureCalculation;

	public Obligation getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation Obligation) {
		this.Obligation = Obligation;
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