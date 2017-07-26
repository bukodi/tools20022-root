package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingVoteExecutionConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference3;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification3;
import com.tools20022.repository.dict.msg.DetailedInstructionStatus2;

/**
 * Scope An issuer, its agent or an intermediary sends the
 * MeetingVoteExecutionConfirmation message to confirm to the Sender of the
 * MeetingInstruction message, the execution of their voting instruction. Usage
 * This message is sent after the shareholders meeting has taken place. The
 * Sender of this message confirms the execution of the vote at the meeting and
 * confirms that the vote has been processed as instructed via the
 * MeetingInstruction message. This messages is sent if the Sender of the
 * MeetingInstruction message has requested such a confirmation or if market
 * practice or regulation stipulates the need for a full audit trail.
 */
@NextVersion(MeetingVoteExecutionConfirmationV03.class)
public class MeetingVoteExecutionConfirmationV02 {

	private MessageIdentification1 VoteExecutionConfirmationIdentification;
	private MessageIdentification RelatedReference;
	private MeetingReference3 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private SecurityIdentification3 SecurityIdentification;
	private DetailedInstructionStatus2 VoteInstruction;

	public MessageIdentification1 getVoteExecutionConfirmationIdentification() {
		return VoteExecutionConfirmationIdentification;
	}

	public void setVoteExecutionConfirmationIdentification(
			MessageIdentification1 VoteExecutionConfirmationIdentification) {
		this.VoteExecutionConfirmationIdentification = VoteExecutionConfirmationIdentification;
	}

	public MessageIdentification getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(MessageIdentification RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference3 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference3 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getReportingParty() {
		return ReportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice ReportingParty) {
		this.ReportingParty = ReportingParty;
	}

	public SecurityIdentification3 getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			SecurityIdentification3 SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public DetailedInstructionStatus2 getVoteInstruction() {
		return VoteInstruction;
	}

	public void setVoteInstruction(DetailedInstructionStatus2 VoteInstruction) {
		this.VoteInstruction = VoteInstruction;
	}
}