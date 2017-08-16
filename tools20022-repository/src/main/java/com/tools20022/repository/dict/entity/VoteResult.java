package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Vote;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.MeetingResultDissemination;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Specifies whether an agenda item of a general meeting has been accepted or
 * rejected, together with the number of votes.
 */
public class VoteResult extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Vote Vote;
	private YesNoIndicator Accepted;
	private MeetingResultDissemination VoteDissemination;
	private Number TotalVotesCast;

	public Vote getVote() {
		return Vote;
	}

	public void setVote(Vote Vote) {
		this.Vote = Vote;
	}

	public YesNoIndicator getAccepted() {
		return Accepted;
	}

	public void setAccepted(YesNoIndicator Accepted) {
		this.Accepted = Accepted;
	}

	public MeetingResultDissemination getVoteDissemination() {
		return VoteDissemination;
	}

	public void setVoteDissemination(
			MeetingResultDissemination VoteDissemination) {
		this.VoteDissemination = VoteDissemination;
	}

	public Number getTotalVotesCast() {
		return TotalVotesCast;
	}

	public void setTotalVotesCast(Number TotalVotesCast) {
		this.TotalVotesCast = TotalVotesCast;
	}
}