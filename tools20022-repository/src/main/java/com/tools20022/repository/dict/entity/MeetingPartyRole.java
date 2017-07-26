package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionPartyRole;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Role played by a party in the context of a meeting.
 */
public class MeetingPartyRole extends CorporateActionPartyRole {

	private Meeting Meeting;

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}