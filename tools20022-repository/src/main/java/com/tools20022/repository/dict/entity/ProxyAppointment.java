package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ProxyTypeCode;
import com.tools20022.repository.dict.entity.InstructionForMeeting;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.VoteInstructionRequest;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Specifies that a proxy has been appointed to represent a party authorised to
 * vote at a general meeting.
 */
public class ProxyAppointment {

	private ProxyTypeCode ProxyType;
	private InstructionForMeeting RelatedMeetingInstruction;
	private Max35Text Identification;
	private VoteInstructionRequest Vote;
	private CurrencyAndAmount AdditionalParticipationCost;

	public ProxyTypeCode getProxyType() {
		return ProxyType;
	}

	public void setProxyType(ProxyTypeCode ProxyType) {
		this.ProxyType = ProxyType;
	}

	public InstructionForMeeting getRelatedMeetingInstruction() {
		return RelatedMeetingInstruction;
	}

	public void setRelatedMeetingInstruction(
			InstructionForMeeting RelatedMeetingInstruction) {
		this.RelatedMeetingInstruction = RelatedMeetingInstruction;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public VoteInstructionRequest getVote() {
		return Vote;
	}

	public void setVote(VoteInstructionRequest Vote) {
		this.Vote = Vote;
	}

	public CurrencyAndAmount getAdditionalParticipationCost() {
		return AdditionalParticipationCost;
	}

	public void setAdditionalParticipationCost(
			CurrencyAndAmount AdditionalParticipationCost) {
		this.AdditionalParticipationCost = AdditionalParticipationCost;
	}
}