package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.InstructionForMeeting;
import com.tools20022.repository.dict.entity.Vote;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.VoteInstructionCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.ProxyAppointment;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 */
public class VoteInstructionRequest extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InstructionForMeeting MeetingInstruction;
	private Vote VotePerResolution;
	private Number Discretionary;
	private VoteInstructionCode GlobalVoteInstruction;
	private VoteInstructionCode VoteForMeetingResolution;
	private YesNoIndicator VoteExecutionConfirmation;
	private ProxyAppointment RelatedProxyAppointment;

	public InstructionForMeeting getMeetingInstruction() {
		return MeetingInstruction;
	}

	public void setMeetingInstruction(InstructionForMeeting MeetingInstruction) {
		this.MeetingInstruction = MeetingInstruction;
	}

	public Vote getVotePerResolution() {
		return VotePerResolution;
	}

	public void setVotePerResolution(Vote VotePerResolution) {
		this.VotePerResolution = VotePerResolution;
	}

	public Number getDiscretionary() {
		return Discretionary;
	}

	public void setDiscretionary(Number Discretionary) {
		this.Discretionary = Discretionary;
	}

	public VoteInstructionCode getGlobalVoteInstruction() {
		return GlobalVoteInstruction;
	}

	public void setGlobalVoteInstruction(
			VoteInstructionCode GlobalVoteInstruction) {
		this.GlobalVoteInstruction = GlobalVoteInstruction;
	}

	public VoteInstructionCode getVoteForMeetingResolution() {
		return VoteForMeetingResolution;
	}

	public void setVoteForMeetingResolution(
			VoteInstructionCode VoteForMeetingResolution) {
		this.VoteForMeetingResolution = VoteForMeetingResolution;
	}

	public YesNoIndicator getVoteExecutionConfirmation() {
		return VoteExecutionConfirmation;
	}

	public void setVoteExecutionConfirmation(
			YesNoIndicator VoteExecutionConfirmation) {
		this.VoteExecutionConfirmation = VoteExecutionConfirmation;
	}

	public ProxyAppointment getRelatedProxyAppointment() {
		return RelatedProxyAppointment;
	}

	public void setRelatedProxyAppointment(
			ProxyAppointment RelatedProxyAppointment) {
		this.RelatedProxyAppointment = RelatedProxyAppointment;
	}
}