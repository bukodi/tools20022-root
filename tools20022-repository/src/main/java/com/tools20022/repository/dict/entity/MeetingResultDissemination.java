package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.MeetingServicing;
import com.tools20022.repository.dict.entity.VoteResult;

/**
 * Provides information on the voting results of a shareholders meeting.
 */
public class MeetingResultDissemination {

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