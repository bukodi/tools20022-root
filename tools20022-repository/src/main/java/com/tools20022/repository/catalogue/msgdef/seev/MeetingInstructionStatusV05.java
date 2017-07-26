package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionStatusV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.InstructionType1Choice;
import com.tools20022.repository.dict.msg.MeetingReference7;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.choice.InstructionTypeStatus2Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
 * using the status code NotReceived in the ProcessingStatus. This message
 * definition is intended for use with the Business Application Header
 * (head.001.001.01).
 */
@PreviousVersion(MeetingInstructionStatusV04.class)
public class MeetingInstructionStatusV05 {

	private InstructionType1Choice InstructionType;
	private MeetingReference7 MeetingReference;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private InstructionTypeStatus2Choice InstructionTypeStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public InstructionType1Choice getInstructionType() {
		return InstructionType;
	}

	public void setInstructionType(InstructionType1Choice InstructionType) {
		this.InstructionType = InstructionType;
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

	public InstructionTypeStatus2Choice getInstructionTypeStatus() {
		return InstructionTypeStatus;
	}

	public void setInstructionTypeStatus(
			InstructionTypeStatus2Choice InstructionTypeStatus) {
		this.InstructionTypeStatus = InstructionTypeStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}