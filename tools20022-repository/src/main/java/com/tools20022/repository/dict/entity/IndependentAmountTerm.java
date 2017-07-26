package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ExposureTerm;
import com.tools20022.repository.dict.codeset.IndependentAmountConventionTypeCode;

/**
 * Defines the specific terms used to calculate an independent amount.
 */
public class IndependentAmountTerm extends ExposureTerm {

	private IndependentAmountConventionTypeCode Convention;

	public IndependentAmountConventionTypeCode getConvention() {
		return Convention;
	}

	public void setConvention(IndependentAmountConventionTypeCode Convention) {
		this.Convention = Convention;
	}
}