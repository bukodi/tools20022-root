package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Commission;
import com.tools20022.repository.dict.codeset.WaivingInstructionCode;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Non-enforcement of the right to all or part of a commission by the party
 * entitled to the commission.
 */
public class CommissionWaiver extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Commission Commission;
	private WaivingInstructionCode InstructionBasis;
	private PercentageRate WaivedRate;
	private PercentageRate NonWaivedRate;

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}

	public WaivingInstructionCode getInstructionBasis() {
		return InstructionBasis;
	}

	public void setInstructionBasis(WaivingInstructionCode InstructionBasis) {
		this.InstructionBasis = InstructionBasis;
	}

	public PercentageRate getWaivedRate() {
		return WaivedRate;
	}

	public void setWaivedRate(PercentageRate WaivedRate) {
		this.WaivedRate = WaivedRate;
	}

	public PercentageRate getNonWaivedRate() {
		return NonWaivedRate;
	}

	public void setNonWaivedRate(PercentageRate NonWaivedRate) {
		this.NonWaivedRate = NonWaivedRate;
	}
}