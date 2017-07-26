package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingCancellationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingCancellationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AmendInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference5;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition6;
import java.util.List;
import com.tools20022.repository.dict.msg.MeetingCancellationReason2;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope The MeetingCancellation message is sent by the party that sent the
 * MeetingNotification message to the original receiver. It is sent to cancel
 * the previous MeetingNotification message or to advise the cancellation of a
 * meeting. Usage The MeetingCancellation message is used in two different
 * situations. First, it is used to cancel a previously sent MeetingNotification
 * message. In this case, the MessageCancellation, the MeetingReference and the
 * Reason building blocks need to be present. Second, it is used to advise that
 * the meeting is cancelled. In this case, only the MeetingReference and Reason
 * building blocks need to be present.
 */
@PreviousVersion(MeetingCancellationV03.class)
@NextVersion(MeetingCancellationV05.class)
public class MeetingCancellationV04 {

	private MessageIdentification1 Identification;
	private Optional<AmendInformation1> MessageCancellation;
	private MeetingReference5 MeetingReference;
	private Optional<PartyIdentification9Choice> NotifyingParty;
	private List<SecurityPosition6> Security;
	private MeetingCancellationReason2 Reason;
	private Optional<Extension2> Extension;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public Optional<AmendInformation1> getMessageCancellation() {
		return MessageCancellation;
	}

	public void setMessageCancellation(
			Optional<AmendInformation1> MessageCancellation) {
		this.MessageCancellation = MessageCancellation;
	}

	public MeetingReference5 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference5 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public Optional<PartyIdentification9Choice> getNotifyingParty() {
		return NotifyingParty;
	}

	public void setNotifyingParty(
			Optional<PartyIdentification9Choice> NotifyingParty) {
		this.NotifyingParty = NotifyingParty;
	}

	public List<SecurityPosition6> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition6> Security) {
		this.Security = Security;
	}

	public MeetingCancellationReason2 getReason() {
		return Reason;
	}

	public void setReason(MeetingCancellationReason2 Reason) {
		this.Reason = Reason;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}