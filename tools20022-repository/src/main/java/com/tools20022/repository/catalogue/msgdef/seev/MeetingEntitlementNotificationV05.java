package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingEntitlementNotificationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference7;
import com.tools20022.repository.dict.msg.SecurityPosition9;
import java.util.List;
import com.tools20022.repository.dict.msg.EligibilityDates1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
 * must be included in the message. This message definition is intended for use
 * with the Business Application Header (head.001.001.01).
 */
@PreviousVersion(MeetingEntitlementNotificationV04.class)
public class MeetingEntitlementNotificationV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<MessageIdentification> RelatedReference;
	private MeetingReference7 MeetingReference;
	private List<SecurityPosition9> Security;
	private EligibilityDates1 Eligibility;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<MessageIdentification> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<MessageIdentification> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public MeetingReference7 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference7 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public List<SecurityPosition9> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition9> Security) {
		this.Security = Security;
	}

	public EligibilityDates1 getEligibility() {
		return Eligibility;
	}

	public void setEligibility(EligibilityDates1 Eligibility) {
		this.Eligibility = Eligibility;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}