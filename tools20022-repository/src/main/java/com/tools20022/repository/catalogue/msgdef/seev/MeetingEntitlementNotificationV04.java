package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingEntitlementNotificationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingEntitlementNotificationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageIdentification;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference4;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition7;
import java.util.List;
import com.tools20022.repository.dict.msg.EligibilityDates1;
import com.tools20022.repository.dict.msg.Extension2;

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
@PreviousVersion(MeetingEntitlementNotificationV03.class)
@NextVersion(MeetingEntitlementNotificationV05.class)
public class MeetingEntitlementNotificationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private Optional<MessageIdentification> RelatedReference;
	private MeetingReference4 MeetingReference;
	private PartyIdentification9Choice NotifyingParty;
	private List<SecurityPosition7> Security;
	private EligibilityDates1 Eligibility;
	private Optional<Extension2> Extension;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public Optional<MessageIdentification> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<MessageIdentification> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference4 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference4 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return NotifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice NotifyingParty) {
		this.NotifyingParty = NotifyingParty;
	}

	public List<SecurityPosition7> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition7> Security) {
		this.Security = Security;
	}

	public EligibilityDates1 getEligibility() {
		return Eligibility;
	}

	public void setEligibility(EligibilityDates1 Eligibility) {
		this.Eligibility = Eligibility;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}