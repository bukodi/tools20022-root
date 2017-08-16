package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.entity.ServiceLevel;
import com.tools20022.repository.dict.codeset.ClearingChannelCode;
import com.tools20022.repository.dict.codeset.ExternalCode;
import com.tools20022.repository.dict.codeset.PaymentCategoryPurposeCode;
import com.tools20022.repository.dict.codeset.SequenceTypeCode;

/**
 * Specifies how a payment must be processed, for instance through which
 * specific clearing channel.
 */
public class PaymentProcessing extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PriorityCode Priority;
	private ServiceLevel ServiceLevel;
	private ClearingChannelCode ClearingChannel;
	private ExternalCode LocalInstrument;
	private PaymentCategoryPurposeCode CategoryPurpose;
	private SequenceTypeCode SequenceType;

	public PriorityCode getPriority() {
		return Priority;
	}

	public void setPriority(PriorityCode Priority) {
		this.Priority = Priority;
	}

	public ServiceLevel getServiceLevel() {
		return ServiceLevel;
	}

	public void setServiceLevel(ServiceLevel ServiceLevel) {
		this.ServiceLevel = ServiceLevel;
	}

	public ClearingChannelCode getClearingChannel() {
		return ClearingChannel;
	}

	public void setClearingChannel(ClearingChannelCode ClearingChannel) {
		this.ClearingChannel = ClearingChannel;
	}

	public ExternalCode getLocalInstrument() {
		return LocalInstrument;
	}

	public void setLocalInstrument(ExternalCode LocalInstrument) {
		this.LocalInstrument = LocalInstrument;
	}

	public PaymentCategoryPurposeCode getCategoryPurpose() {
		return CategoryPurpose;
	}

	public void setCategoryPurpose(PaymentCategoryPurposeCode CategoryPurpose) {
		this.CategoryPurpose = CategoryPurpose;
	}

	public SequenceTypeCode getSequenceType() {
		return SequenceType;
	}

	public void setSequenceType(SequenceTypeCode SequenceType) {
		this.SequenceType = SequenceType;
	}
}