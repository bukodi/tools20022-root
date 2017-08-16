package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingVoteExecutionConfirmationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference7;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.DetailedInstructionStatus10;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope An issuer, its agent or an intermediary sends the
 * MeetingVoteExecutionConfirmation message to confirm to the Sender of the
 * MeetingInstruction message, the execution of their voting instruction. Usage
 * This message is sent after the shareholders meeting has taken place. The
 * Sender of this message confirms the execution of the vote at the meeting and
 * confirms that the vote has been processed as instructed via the
 * MeetingInstruction message. This messages is sent if the Sender of the
 * MeetingInstruction message has requested such a confirmation or if market
 * practice or regulation stipulates the need for a full audit trail. This
 * message definition is intended for use with the Business Application Header
 * (head.001.001.01).
 */
@PreviousVersion(MeetingVoteExecutionConfirmationV04.class)
public class MeetingVoteExecutionConfirmationV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification RelatedReference;
	private MeetingReference7 MeetingReference;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private DetailedInstructionStatus10 VoteInstructions;
	private Optional<SupplementaryData1> SupplementaryData;

	public MessageIdentification getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(MessageIdentification RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference7 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference7 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public DetailedInstructionStatus10 getVoteInstructions() {
		return VoteInstructions;
	}

	public void setVoteInstructions(DetailedInstructionStatus10 VoteInstructions) {
		this.VoteInstructions = VoteInstructions;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}