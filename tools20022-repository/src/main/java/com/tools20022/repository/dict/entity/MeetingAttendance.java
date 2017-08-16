package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.AttendanceCard;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.InstructionForMeeting;

/**
 * Information on the participation of the security holder or of its assigned
 * representative.
 */
public class MeetingAttendance extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AttendanceCard AttendanceCard;
	private PercentageRate PercentageOfVotingRights;
	private InstructionForMeeting RelatedMeeting;

	public AttendanceCard getAttendanceCard() {
		return AttendanceCard;
	}

	public void setAttendanceCard(AttendanceCard AttendanceCard) {
		this.AttendanceCard = AttendanceCard;
	}

	public PercentageRate getPercentageOfVotingRights() {
		return PercentageOfVotingRights;
	}

	public void setPercentageOfVotingRights(
			PercentageRate PercentageOfVotingRights) {
		this.PercentageOfVotingRights = PercentageOfVotingRights;
	}

	public InstructionForMeeting getRelatedMeeting() {
		return RelatedMeeting;
	}

	public void setRelatedMeeting(InstructionForMeeting RelatedMeeting) {
		this.RelatedMeeting = RelatedMeeting;
	}
}