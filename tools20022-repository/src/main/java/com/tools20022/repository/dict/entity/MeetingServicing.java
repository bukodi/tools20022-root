package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionServicing;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.entity.MeetingNotice;
import com.tools20022.repository.dict.entity.MeetingEntitlement;
import com.tools20022.repository.dict.entity.InstructionForMeeting;
import com.tools20022.repository.dict.entity.MeetingResultDissemination;

/**
 * Services which consists in notifying the investor or its agent of a meeting,
 * in validating and relaying its instructions and in calculating its
 * entitlement based on its holdings.
 */
public class MeetingServicing extends CorporateActionServicing {

	private Meeting MeetingSpecification;
	private MeetingNotice MeetingNotice;
	private MeetingEntitlement MeetingEntitlement;
	private InstructionForMeeting MeetingInstruction;
	private MeetingResultDissemination MeetingResultDissemination;

	public Meeting getMeetingSpecification() {
		return MeetingSpecification;
	}

	public void setMeetingSpecification(Meeting MeetingSpecification) {
		this.MeetingSpecification = MeetingSpecification;
	}

	public MeetingNotice getMeetingNotice() {
		return MeetingNotice;
	}

	public void setMeetingNotice(MeetingNotice MeetingNotice) {
		this.MeetingNotice = MeetingNotice;
	}

	public MeetingEntitlement getMeetingEntitlement() {
		return MeetingEntitlement;
	}

	public void setMeetingEntitlement(MeetingEntitlement MeetingEntitlement) {
		this.MeetingEntitlement = MeetingEntitlement;
	}

	public InstructionForMeeting getMeetingInstruction() {
		return MeetingInstruction;
	}

	public void setMeetingInstruction(InstructionForMeeting MeetingInstruction) {
		this.MeetingInstruction = MeetingInstruction;
	}

	public MeetingResultDissemination getMeetingResultDissemination() {
		return MeetingResultDissemination;
	}

	public void setMeetingResultDissemination(
			MeetingResultDissemination MeetingResultDissemination) {
		this.MeetingResultDissemination = MeetingResultDissemination;
	}
}