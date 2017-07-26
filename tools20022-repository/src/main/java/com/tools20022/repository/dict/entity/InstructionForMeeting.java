package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.VoteInstructionRequest;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.MeetingServicing;
import com.tools20022.repository.dict.entity.MeetingAttendance;
import com.tools20022.repository.dict.entity.ProxyAppointment;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.SecuritiesAccount;

/**
 * Identifies the position of the instructing party and the actions that it
 * wants to take in relation with the meeting.
 */
public class InstructionForMeeting {

	private VoteInstructionRequest VoteInstruction;
	private ISODateTime RequestedExecutionDate;
	private MeetingServicing RelatedServicing;
	private MeetingAttendance MeetingAttendance;
	private ProxyAppointment ProxyAppointment;
	private Max35Text MeetingIdentification;
	private YesNoIndicator SecuritiesRegistration;
	private YesNoIndicator BlockingSecurities;
	private YesNoIndicator ParticipationRegistration;
	private SecuritiesAccount SafekeepingAccount;

	public VoteInstructionRequest getVoteInstruction() {
		return VoteInstruction;
	}

	public void setVoteInstruction(VoteInstructionRequest VoteInstruction) {
		this.VoteInstruction = VoteInstruction;
	}

	public ISODateTime getRequestedExecutionDate() {
		return RequestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime RequestedExecutionDate) {
		this.RequestedExecutionDate = RequestedExecutionDate;
	}

	public MeetingServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(MeetingServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public MeetingAttendance getMeetingAttendance() {
		return MeetingAttendance;
	}

	public void setMeetingAttendance(MeetingAttendance MeetingAttendance) {
		this.MeetingAttendance = MeetingAttendance;
	}

	public ProxyAppointment getProxyAppointment() {
		return ProxyAppointment;
	}

	public void setProxyAppointment(ProxyAppointment ProxyAppointment) {
		this.ProxyAppointment = ProxyAppointment;
	}

	public Max35Text getMeetingIdentification() {
		return MeetingIdentification;
	}

	public void setMeetingIdentification(Max35Text MeetingIdentification) {
		this.MeetingIdentification = MeetingIdentification;
	}

	public YesNoIndicator getSecuritiesRegistration() {
		return SecuritiesRegistration;
	}

	public void setSecuritiesRegistration(YesNoIndicator SecuritiesRegistration) {
		this.SecuritiesRegistration = SecuritiesRegistration;
	}

	public YesNoIndicator getBlockingSecurities() {
		return BlockingSecurities;
	}

	public void setBlockingSecurities(YesNoIndicator BlockingSecurities) {
		this.BlockingSecurities = BlockingSecurities;
	}

	public YesNoIndicator getParticipationRegistration() {
		return ParticipationRegistration;
	}

	public void setParticipationRegistration(
			YesNoIndicator ParticipationRegistration) {
		this.ParticipationRegistration = ParticipationRegistration;
	}

	public SecuritiesAccount getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}
}