package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionStatusV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionStatusV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.choice.InstructionType1Choice;
import com.tools20022.repository.dict.msg.MeetingReference4;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.choice.InstructionTypeStatus1Choice;

/**
 * Scope The Receiver of the MeetingInstruction or
 * MeetingInstructionCancellationRequest sends the MeetingInstructionStatus
 * message to the Sender of these messages. The message gives the status of a
 * complete message or of one or more specific instructions within the message.
 * Usage The MeetingInstructionStatus message is used for four purposes. First,
 * it provides the status on the processing of a
 * MeetingInstructionCancellationRequest message, for example, whether the
 * request message is rejected or accepted. Second, it is used to provide a
 * global processing or rejection status of a MeetingInstruction message. Third,
 * it is used to provide a detailed processing or rejection status of a
 * MeetingInstruction message, for example, for each instruction in the
 * MeetingInstruction message the processing or rejection status is individually
 * reported by using the InstructionIdentification element. This identification
 * allows the receiver of the status message to link the status confirmation to
 * its original instruction. The blocking of securities should be confirmed via
 * an MT 508 (Intra-Position Advice). Fourth, it is used as a reminder to
 * request voting instructions. This is done by indicating NONREF in the
 * Identification element of the InstructionIdentification component and by
 * using the status code NotReceived in the ProcessingStatus.
 */
@PreviousVersion(MeetingInstructionStatusV02.class)
@NextVersion(MeetingInstructionStatusV04.class)
public class MeetingInstructionStatusV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private InstructionType1Choice InstructionType;
	private MeetingReference4 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private SecurityIdentification11 SecurityIdentification;
	private InstructionTypeStatus1Choice InstructionTypeStatus;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public InstructionType1Choice getInstructionType() {
		return InstructionType;
	}

	public void setInstructionType(InstructionType1Choice InstructionType) {
		this.InstructionType = InstructionType;
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

	public InstructionTypeStatus1Choice getInstructionTypeStatus() {
		return InstructionTypeStatus;
	}

	public void setInstructionTypeStatus(
			InstructionTypeStatus1Choice InstructionTypeStatus) {
		this.InstructionTypeStatus = InstructionTypeStatus;
	}
}