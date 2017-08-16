package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionCancellationRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification;
import com.tools20022.repository.dict.msg.MeetingReference7;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.SafekeepingAccount6;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The MeetingInstructionCancellationRequest message is sent by the same
 * party that sent the MeetingInstruction message. It is sent to request the
 * cancellation of all instructions included in the original the
 * MeetingInstruction message. Usage This message must be answered by a
 * MeetingInstructionStatus message. Some instructions in the previously sent
 * MeetingInstruction message may have already been executed and cannot be
 * cancelled. This information should appear clearly in the status message. This
 * message definition is intended for use with the Business Application Header
 * (head.001.001.01).
 */
@PreviousVersion(MeetingInstructionCancellationRequestV04.class)
public class MeetingInstructionCancellationRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification PreviousReference;
	private Optional<MeetingReference7> MeetingReference;
	private Optional<SecurityIdentification14> FinancialInstrumentIdentification;
	private Optional<SafekeepingAccount6> InstructedPosition;
	private Optional<SupplementaryData1> SupplementaryData;

	public MessageIdentification getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(MessageIdentification PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<MeetingReference7> getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(Optional<MeetingReference7> MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			Optional<SecurityIdentification14> FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<SafekeepingAccount6> getInstructedPosition() {
		return InstructedPosition;
	}

	public void setInstructedPosition(
			Optional<SafekeepingAccount6> InstructedPosition) {
		this.InstructedPosition = InstructedPosition;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}