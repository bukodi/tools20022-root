package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingCancellationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MeetingReference6;
import com.tools20022.repository.dict.msg.SecurityPosition8;
import java.util.List;
import com.tools20022.repository.dict.msg.MeetingCancellationReason2;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MeetingCancellation message is sent by the party that sent the
 * MeetingNotification message to the original receiver. It is sent to cancel
 * the previous MeetingNotification message or to advise the cancellation of a
 * meeting. Usage The MeetingCancellation message is used in two different
 * situations. First, it is used to cancel a previously sent MeetingNotification
 * message. In this case, the MessageCancellation, the MeetingReference and the
 * Reason building blocks need to be present. Second, it is used to advise that
 * the meeting is cancelled. In this case, only the MeetingReference and Reason
 * building blocks need to be present. This message definition is intended for
 * use with the Business Application Header (head.001.001.01).
 */
@PreviousVersion(MeetingCancellationV04.class)
public class MeetingCancellationV05 {

	private MeetingReference6 MeetingReference;
	private List<SecurityPosition8> Security;
	private MeetingCancellationReason2 Reason;
	private Optional<SupplementaryData1> SupplementaryData;

	public MeetingReference6 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference6 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public List<SecurityPosition8> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition8> Security) {
		this.Security = Security;
	}

	public MeetingCancellationReason2 getReason() {
		return Reason;
	}

	public void setReason(MeetingCancellationReason2 Reason) {
		this.Reason = Reason;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}