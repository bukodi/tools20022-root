package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference3;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification3;
import com.tools20022.repository.dict.msg.SafekeepingAccount3;

/**
 * Scope The MeetingInstructionCancellationRequest message is sent by the same
 * party that sent the MeetingInstruction message. It is sent to request the
 * cancellation of all instructions included in the original the
 * MeetingInstruction message. Usage This message must be answered by a
 * MeetingInstructionStatus message. Some instructions in the previously sent
 * MeetingInstruction message may have already been executed and cannot be
 * cancelled. This information should appear clearly in the status message.
 */
@NextVersion(MeetingInstructionCancellationRequestV03.class)
public class MeetingInstructionCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 InstructionCancellationIdentification;
	private MessageIdentification PreviousReference;
	private Optional<MeetingReference3> MeetingReference;
	private Optional<PartyIdentification9Choice> RequestingParty;
	private Optional<SecurityIdentification3> SecurityIdentification;
	private Optional<SafekeepingAccount3> InstructedPosition;

	public MessageIdentification1 getInstructionCancellationIdentification() {
		return InstructionCancellationIdentification;
	}

	public void setInstructionCancellationIdentification(
			MessageIdentification1 InstructionCancellationIdentification) {
		this.InstructionCancellationIdentification = InstructionCancellationIdentification;
	}

	public MessageIdentification getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(MessageIdentification PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<MeetingReference3> getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(Optional<MeetingReference3> MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public Optional<PartyIdentification9Choice> getRequestingParty() {
		return RequestingParty;
	}

	public void setRequestingParty(
			Optional<PartyIdentification9Choice> RequestingParty) {
		this.RequestingParty = RequestingParty;
	}

	public Optional<SecurityIdentification3> getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			Optional<SecurityIdentification3> SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public Optional<SafekeepingAccount3> getInstructedPosition() {
		return InstructedPosition;
	}

	public void setInstructedPosition(
			Optional<SafekeepingAccount3> InstructedPosition) {
		this.InstructedPosition = InstructedPosition;
	}
}