package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.MeetingServicing;
import com.tools20022.repository.dict.entity.VoteResult;

/**
 * Provides information on the voting results of a shareholders meeting.
 */
public class MeetingResultDissemination extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private MeetingServicing RelatedServicing;
	private VoteResult VoteResult;

	public MeetingServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(MeetingServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public VoteResult getVoteResult() {
		return VoteResult;
	}

	public void setVoteResult(VoteResult VoteResult) {
		this.VoteResult = VoteResult;
	}
}