package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 */
public class Deadline extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionEvent MISSING;
	private ISODateTime MarketDeadline;
	private ISODateTime IntermediaryDeadline;
	private ISODateTime STPDeadline;
	private Meeting RelatedMeeting;

	public ISODateTime getMarketDeadline() {
		return MarketDeadline;
	}

	public void setMarketDeadline(ISODateTime MarketDeadline) {
		this.MarketDeadline = MarketDeadline;
	}

	public ISODateTime getIntermediaryDeadline() {
		return IntermediaryDeadline;
	}

	public void setIntermediaryDeadline(ISODateTime IntermediaryDeadline) {
		this.IntermediaryDeadline = IntermediaryDeadline;
	}

	public ISODateTime getSTPDeadline() {
		return STPDeadline;
	}

	public void setSTPDeadline(ISODateTime STPDeadline) {
		this.STPDeadline = STPDeadline;
	}

	public Meeting getRelatedMeeting() {
		return RelatedMeeting;
	}

	public void setRelatedMeeting(Meeting RelatedMeeting) {
		this.RelatedMeeting = RelatedMeeting;
	}
}