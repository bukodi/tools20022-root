package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MeetingReference7;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.Instruction3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope A party holding the right to vote sends the MeetingInstruction message
 * to an intermediary, the issuer or its agent to request the receiving party to
 * act upon one or several instructions. Usage The MeetingInstruction message is
 * used to register for a shareholders meeting, request blocking or registration
 * of securities. It is used to assign a proxy, to specify the names of meeting
 * attendees and to relay vote instructions per resolution electronically. The
 * MeetingInstruction message may only be sent for one security, though several
 * safekeeping places may be specified. Once the message is sent, it cannot be
 * modified. It must be cancelled by a MeetingInstructionCancellationRequest.
 * Only after receipt of a confirmed cancelled status via the
 * MeetingInstructionStatus message, a new MeetingInstruction message can be
 * sent. This message definition is intended for use with the Business
 * Application Header (head.001.001.01).
 */
@PreviousVersion(MeetingInstructionV04.class)
public class MeetingInstructionV05 {

	private MeetingReference7 MeetingReference;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Instruction3 Instruction;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public Instruction3 getInstruction() {
		return Instruction;
	}

	public void setInstruction(Instruction3 Instruction) {
		this.Instruction = Instruction;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}