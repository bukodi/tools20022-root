package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.codeset.POIComponentAssessmentCode;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Assessment for the components of a system.
 */
public class Assessment extends Document
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private POIComponentAssessmentCode AssessmentType;
	private System System;
	private ISODateTime ExpiryDate;
	private ISODateTime DeliveryDate;

	public POIComponentAssessmentCode getAssessmentType() {
		return AssessmentType;
	}

	public void setAssessmentType(POIComponentAssessmentCode AssessmentType) {
		this.AssessmentType = AssessmentType;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public ISODateTime getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODateTime ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public ISODateTime getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(ISODateTime DeliveryDate) {
		this.DeliveryDate = DeliveryDate;
	}
}