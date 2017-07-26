package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.ResolutionStatusCode;
import com.tools20022.repository.dict.codeset.CancellationStatusCode;
import com.tools20022.repository.dict.entity.MeetingStatusReason;
import com.tools20022.repository.dict.codeset.NotificationStatusCode;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Status of the instructions related to a meeting.
 */
public class MeetingStatus extends Status {

	private ResolutionStatusCode MeetingResolutionStatus;
	private CancellationStatusCode InstructionCancellationStatus;
	private MeetingStatusReason Reason;
	private NotificationStatusCode NotificationStatus;
	private Meeting Meeting;

	public ResolutionStatusCode getMeetingResolutionStatus() {
		return MeetingResolutionStatus;
	}

	public void setMeetingResolutionStatus(
			ResolutionStatusCode MeetingResolutionStatus) {
		this.MeetingResolutionStatus = MeetingResolutionStatus;
	}

	public CancellationStatusCode getInstructionCancellationStatus() {
		return InstructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(
			CancellationStatusCode InstructionCancellationStatus) {
		this.InstructionCancellationStatus = InstructionCancellationStatus;
	}

	public MeetingStatusReason getReason() {
		return Reason;
	}

	public void setReason(MeetingStatusReason Reason) {
		this.Reason = Reason;
	}

	public NotificationStatusCode getNotificationStatus() {
		return NotificationStatus;
	}

	public void setNotificationStatus(NotificationStatusCode NotificationStatus) {
		this.NotificationStatus = NotificationStatus;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}
}