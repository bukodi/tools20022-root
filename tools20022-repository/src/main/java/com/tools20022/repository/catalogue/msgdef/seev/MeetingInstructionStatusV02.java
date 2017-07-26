package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionStatusV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference3;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification3;
import com.tools20022.repository.dict.choice.InstructionStatus1Choice;
import com.tools20022.repository.dict.choice.CancellationStatus1Choice;

/**
 * Scope The Receiver of the MeetingInstruction or
 * MeetingInstructionCancellationRequest sends the MeetingInstructionStatus
 * message to the Sender of these messages. The message gives the status of a
 * complete message or of one or more specific instructions within the message.
 * Usage The MeetingInstructionStatus message is used for four purposes. First,
 * it provides the status on the processing of a
 * MeetingInstructionCancellationRequest message, ie, whether the request
 * message is rejected or accepted. Second, it is used to provide a global
 * processing or rejection status of a MeetingInstruction message. Third, it is
 * used to provide a detailed processing or rejection status of a
 * MeetingInstruction message, ie, for each instruction in the
 * MeetingInstruction message the processing or rejection status is individually
 * reported by using the InstructionIdentification element. This identification
 * allows the receiver of the status message to link the status confirmation to
 * its original instruction. The blocking of securities should be confirmed via
 * an MT 508 (Intra-Position Advice). Fourth, it is used as a reminder to
 * request voting instructions. This is done by indicating NONREF in the
 * Identification element of the InstructionIdentification component and by
 * using the status code NotReceived in the ProcessingStatus.
 */
@NextVersion(MeetingInstructionStatusV03.class)
public class MeetingInstructionStatusV02 {

	private MessageIdentification1 MeetingInstructionStatusIdentification;
	private MessageIdentification InstructionIdentification;
	private MessageIdentification InstructionCancellationIdentification;
	private MeetingReference3 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private SecurityIdentification3 SecurityIdentification;
	private InstructionStatus1Choice InstructionStatus;
	private CancellationStatus1Choice CancellationStatus;

	public MessageIdentification1 getMeetingInstructionStatusIdentification() {
		return MeetingInstructionStatusIdentification;
	}

	public void setMeetingInstructionStatusIdentification(
			MessageIdentification1 MeetingInstructionStatusIdentification) {
		this.MeetingInstructionStatusIdentification = MeetingInstructionStatusIdentification;
	}

	public MessageIdentification getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			MessageIdentification InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public MessageIdentification getInstructionCancellationIdentification() {
		return InstructionCancellationIdentification;
	}

	public void setInstructionCancellationIdentification(
			MessageIdentification InstructionCancellationIdentification) {
		this.InstructionCancellationIdentification = InstructionCancellationIdentification;
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

	public InstructionStatus1Choice getInstructionStatus() {
		return InstructionStatus;
	}

	public void setInstructionStatus(InstructionStatus1Choice InstructionStatus) {
		this.InstructionStatus = InstructionStatus;
	}

	public CancellationStatus1Choice getCancellationStatus() {
		return CancellationStatus;
	}

	public void setCancellationStatus(
			CancellationStatus1Choice CancellationStatus) {
		this.CancellationStatus = CancellationStatus;
	}
}