package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Conditions that must be met to propose a resolution.
 */
public class ResolutionProposal extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max350Text ResolutionProposalThreshold;
	private PercentageRate ResolutionProposalThresholdPercentage;
	private Meeting Meeting;

	public Max350Text getResolutionProposalThreshold() {
		return ResolutionProposalThreshold;
	}

	public void setResolutionProposalThreshold(
			Max350Text ResolutionProposalThreshold) {
		this.ResolutionProposalThreshold = ResolutionProposalThreshold;
	}

	public PercentageRate getResolutionProposalThresholdPercentage() {
		return ResolutionProposalThresholdPercentage;
	}

	public void setResolutionProposalThresholdPercentage(
			PercentageRate ResolutionProposalThresholdPercentage) {
		this.ResolutionProposalThresholdPercentage = ResolutionProposalThresholdPercentage;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}