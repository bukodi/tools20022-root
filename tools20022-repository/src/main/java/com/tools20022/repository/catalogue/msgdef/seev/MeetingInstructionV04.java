package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingInstructionV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MeetingReference4;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.Instruction2;
import com.tools20022.repository.dict.msg.Extension2;
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
 * sent.
 */
@PreviousVersion(MeetingInstructionV03.class)
@NextVersion(MeetingInstructionV05.class)
public class MeetingInstructionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private MeetingReference4 MeetingReference;
	private PartyIdentification9Choice InstructingParty;
	private SecurityIdentification11 SecurityIdentification;
	private Instruction2 Instruction;
	private Optional<Extension2> Extension;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public MeetingReference4 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference4 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getInstructingParty() {
		return InstructingParty;
	}

	public void setInstructingParty(PartyIdentification9Choice InstructingParty) {
		this.InstructingParty = InstructingParty;
	}

	public SecurityIdentification11 getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(
			SecurityIdentification11 SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public Instruction2 getInstruction() {
		return Instruction;
	}

	public void setInstruction(Instruction2 Instruction) {
		this.Instruction = Instruction;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}