package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MeetingReference3;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification3;
import com.tools20022.repository.dict.msg.Instruction1;

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
 * sent.
 */
@NextVersion(MeetingInstructionV03.class)
public class MeetingInstructionV02 {

	private MessageIdentification1 MeetingInstructionIdentification;
	private MeetingReference3 MeetingReference;
	private PartyIdentification9Choice InstructingParty;
	private SecurityIdentification3 SecurityIdentification;
	private Instruction1 Instruction;

	public MessageIdentification1 getMeetingInstructionIdentification() {
		return MeetingInstructionIdentification;
	}

	public void setMeetingInstructionIdentification(
			MessageIdentification1 MeetingInstructionIdentification) {
		this.MeetingInstructionIdentification = MeetingInstructionIdentification;
	}

	public MeetingReference3 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference3 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getInstructingParty() {
		return InstructingParty;
	}

	public void setInstructingParty(PartyIdentification9Choice InstructingParty) {
		this.InstructingParty = InstructingParty;
	}

	public SecurityIdentification3 getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			SecurityIdentification3 SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public Instruction1 getInstruction() {
		return Instruction;
	}

	public void setInstruction(Instruction1 Instruction) {
		this.Instruction = Instruction;
	}
}