package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionCancellationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference4;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.SafekeepingAccount4;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope The MeetingInstructionCancellationRequest message is sent by the same
 * party that sent the MeetingInstruction message. It is sent to request the
 * cancellation of all instructions included in the original the
 * MeetingInstruction message. Usage This message must be answered by a
 * MeetingInstructionStatus message. Some instructions in the previously sent
 * MeetingInstruction message may have already been executed and cannot be
 * cancelled. This information should appear clearly in the status message.
 */
@PreviousVersion(MeetingInstructionCancellationRequestV03.class)
@NextVersion(MeetingInstructionCancellationRequestV05.class)
public class MeetingInstructionCancellationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private MessageIdentification PreviousReference;
	private Optional<MeetingReference4> MeetingReference;
	private Optional<PartyIdentification9Choice> RequestingParty;
	private Optional<SecurityIdentification11> SecurityIdentification;
	private Optional<SafekeepingAccount4> InstructedPosition;
	private Optional<Extension2> Extension;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public MessageIdentification getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(MessageIdentification PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<MeetingReference4> getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(Optional<MeetingReference4> MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public Optional<PartyIdentification9Choice> getRequestingParty() {
		return RequestingParty;
	}

	public void setRequestingParty(
			Optional<PartyIdentification9Choice> RequestingParty) {
		this.RequestingParty = RequestingParty;
	}

	public Optional<SecurityIdentification11> getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			Optional<SecurityIdentification11> SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public Optional<SafekeepingAccount4> getInstructedPosition() {
		return InstructedPosition;
	}

	public void setInstructedPosition(
			Optional<SafekeepingAccount4> InstructedPosition) {
		this.InstructedPosition = InstructedPosition;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}