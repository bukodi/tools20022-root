package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.codeset.MeetingCancellationReasonCode;
import com.tools20022.repository.dict.entity.MeetingStatus;
import com.tools20022.repository.dict.codeset.RejectionReasonCode;

/**
 * Specifies the underlying reason for a status of a meeting or related
 * instructions.
 */
public class MeetingStatusReason extends StatusReason {

	private MeetingCancellationReasonCode MeetingCancellationReason;
	private MeetingStatus MeetingStatus;
	private RejectionReasonCode InstructionRejectionReason;

	public MeetingCancellationReasonCode getMeetingCancellationReason() {
		return MeetingCancellationReason;
	}

	public void setMeetingCancellationReason(
			MeetingCancellationReasonCode MeetingCancellationReason) {
		this.MeetingCancellationReason = MeetingCancellationReason;
	}

	public MeetingStatus getMeetingStatus() {
		return MeetingStatus;
	}

	public void setMeetingStatus(MeetingStatus MeetingStatus) {
		this.MeetingStatus = MeetingStatus;
	}

	public RejectionReasonCode getInstructionRejectionReason() {
		return InstructionRejectionReason;
	}

	public void setInstructionRejectionReason(
			RejectionReasonCode InstructionRejectionReason) {
		this.InstructionRejectionReason = InstructionRejectionReason;
	}
}