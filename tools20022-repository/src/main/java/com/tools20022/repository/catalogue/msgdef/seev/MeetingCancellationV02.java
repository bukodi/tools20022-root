package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingCancellationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AmendInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference2;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition5;
import java.util.List;
import com.tools20022.repository.dict.msg.MeetingCancellationReason1;

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
@NextVersion(MeetingCancellationV03.class)
public class MeetingCancellationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 CancellationIdentification;
	private Optional<AmendInformation1> MessageCancellation;
	private MeetingReference2 MeetingReference;
	private Optional<PartyIdentification9Choice> NotifyingParty;
	private List<SecurityPosition5> Security;
	private MeetingCancellationReason1 Reason;

	public MessageIdentification1 getCancellationIdentification() {
		return CancellationIdentification;
	}

	public void setCancellationIdentification(
			MessageIdentification1 CancellationIdentification) {
		this.CancellationIdentification = CancellationIdentification;
	}

	public Optional<AmendInformation1> getMessageCancellation() {
		return MessageCancellation;
	}

	public void setMessageCancellation(
			Optional<AmendInformation1> MessageCancellation) {
		this.MessageCancellation = MessageCancellation;
	}

	public MeetingReference2 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference2 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public Optional<PartyIdentification9Choice> getNotifyingParty() {
		return NotifyingParty;
	}

	public void setNotifyingParty(
			Optional<PartyIdentification9Choice> NotifyingParty) {
		this.NotifyingParty = NotifyingParty;
	}

	public List<SecurityPosition5> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition5> Security) {
		this.Security = Security;
	}

	public MeetingCancellationReason1 getReason() {
		return Reason;
	}

	public void setReason(MeetingCancellationReason1 Reason) {
		this.Reason = Reason;
	}
}