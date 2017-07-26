package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingEntitlementNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference3;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition5;
import java.util.List;
import com.tools20022.repository.dict.msg.EligibilityDates1;

/**
 * Scope An account servicer sends the MeetingEntitlementNotification to an
 * issuer, its agent, an intermediary or an account owner to advise the
 * entitlement in relation to a shareholders meeting. Usage This message is sent
 * to advise the quantity of securities held by an account owner. The balance is
 * specified for the securities for which the meeting is taking place. This
 * entitlement message is sent by the account servicer or the registrar to an
 * intermediary, the issuer's agent or the issuer. It is also sent between the
 * account servicer and the account owner or the party holding the right to
 * vote. The message is also used to amend a previously sent
 * MeetingEntitlementNotification. To notify an update, the RelatedReference
 * must be included in the message.
 */
@NextVersion(MeetingEntitlementNotificationV03.class)
public class MeetingEntitlementNotificationV02 {

	private MessageIdentification1 EntitlementNotificationIdentification;
	private Optional<MessageIdentification> RelatedReference;
	private MeetingReference3 MeetingReference;
	private PartyIdentification9Choice NotifyingParty;
	private List<SecurityPosition5> Security;
	private EligibilityDates1 Eligibility;

	public MessageIdentification1 getEntitlementNotificationIdentification() {
		return EntitlementNotificationIdentification;
	}

	public void setEntitlementNotificationIdentification(
			MessageIdentification1 EntitlementNotificationIdentification) {
		this.EntitlementNotificationIdentification = EntitlementNotificationIdentification;
	}

	public Optional<MessageIdentification> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<MessageIdentification> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference3 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference3 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return NotifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice NotifyingParty) {
		this.NotifyingParty = NotifyingParty;
	}

	public List<SecurityPosition5> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition5> Security) {
		this.Security = Security;
	}

	public EligibilityDates1 getEligibility() {
		return Eligibility;
	}

	public void setEligibility(EligibilityDates1 Eligibility) {
		this.Eligibility = Eligibility;
	}
}