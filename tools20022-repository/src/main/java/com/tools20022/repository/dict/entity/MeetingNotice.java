package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.MeetingServicing;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Information about the general meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 */
public class MeetingNotice extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private MeetingServicing RelatedServicing;
	private YesNoIndicator BeneficialOwnerExclusiveIndicator;

	public MeetingServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(MeetingServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public YesNoIndicator getBeneficialOwnerExclusiveIndicator() {
		return BeneficialOwnerExclusiveIndicator;
	}

	public void setBeneficialOwnerExclusiveIndicator(
			YesNoIndicator BeneficialOwnerExclusiveIndicator) {
		this.BeneficialOwnerExclusiveIndicator = BeneficialOwnerExclusiveIndicator;
	}
}