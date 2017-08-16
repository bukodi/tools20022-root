package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingVoteExecutionConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingVoteExecutionConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference4;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.DetailedInstructionStatus9;

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
@PreviousVersion(MeetingVoteExecutionConfirmationV02.class)
@NextVersion(MeetingVoteExecutionConfirmationV04.class)
public class MeetingVoteExecutionConfirmationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private MessageIdentification RelatedReference;
	private MeetingReference4 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private SecurityIdentification11 SecurityIdentification;
	private DetailedInstructionStatus9 VoteInstructions;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public MessageIdentification getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(MessageIdentification RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference4 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference4 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getReportingParty() {
		return ReportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice ReportingParty) {
		this.ReportingParty = ReportingParty;
	}

	public SecurityIdentification11 getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			SecurityIdentification11 SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public DetailedInstructionStatus9 getVoteInstructions() {
		return VoteInstructions;
	}

	public void setVoteInstructions(DetailedInstructionStatus9 VoteInstructions) {
		this.VoteInstructions = VoteInstructions;
	}
}