package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AmendInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.NotificationStatus1;
import com.tools20022.repository.dict.msg.MeetingNotice2;
import com.tools20022.repository.dict.msg.Meeting2;
import java.util.List;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.IssuerAgent1;
import com.tools20022.repository.dict.msg.SecurityPosition5;
import com.tools20022.repository.dict.msg.Resolution2;
import com.tools20022.repository.dict.msg.VoteParameters1;
import com.tools20022.repository.dict.msg.EntitlementAssessment1;
import com.tools20022.repository.dict.msg.PowerOfAttorneyRequirements2;

/**
 * Scope A notifying party, eg, an issuer, its agent or an intermediary, sends
 * the MeetingNotification message to a party holding the right to vote, to
 * announce a shareholders meeting. Usage The MeetingNotification message is
 * used to announce a shareholders meeting, ie, it provides information on the
 * participation details and requirements for the meeting, the vote parameters
 * and the resolutions. The MeetingNotification message may also be used to
 * announce an update. To notify an update, the Amendment building block must be
 * filled in. Any building block that is modified must be included in the
 * amendment message. The information previously notified and not repeated in
 * the amendment message remains valid. To update the resolutions of the agenda,
 * the complete list of resolutions must be repeated in the amendment message.
 * The resolutions that are deleted should be assigned the status Withdrawn.
 */
@NextVersion(MeetingNotificationV03.class)
public class MeetingNotificationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MeetingNotificationIdentification;
	private Optional<AmendInformation1> Amendment;
	private NotificationStatus1 NotificationStatus;
	private MeetingNotice2 Meeting;
	private List<Meeting2> MeetingDetails;
	private PartyIdentification9Choice NotifyingParty;
	private PartyIdentification9Choice Issuer;
	private List<IssuerAgent1> IssuerAgent;
	private List<SecurityPosition5> Security;
	private List<Resolution2> Resolution;
	private Optional<VoteParameters1> Vote;
	private EntitlementAssessment1 EntitlementSpecification;
	private Optional<PowerOfAttorneyRequirements2> PowerOfAttorneyRequirements;

	public MessageIdentification1 getMeetingNotificationIdentification() {
		return MeetingNotificationIdentification;
	}

	public void setMeetingNotificationIdentification(
			MessageIdentification1 MeetingNotificationIdentification) {
		this.MeetingNotificationIdentification = MeetingNotificationIdentification;
	}

	public Optional<AmendInformation1> getAmendment() {
		return Amendment;
	}

	public void setAmendment(Optional<AmendInformation1> Amendment) {
		this.Amendment = Amendment;
	}

	public NotificationStatus1 getNotificationStatus() {
		return NotificationStatus;
	}

	public void setNotificationStatus(NotificationStatus1 NotificationStatus) {
		this.NotificationStatus = NotificationStatus;
	}

	public MeetingNotice2 getMeeting() {
		return Meeting;
	}

	public void setMeeting(MeetingNotice2 Meeting) {
		this.Meeting = Meeting;
	}

	public List<Meeting2> getMeetingDetails() {
		return MeetingDetails;
	}

	public void setMeetingDetails(List<Meeting2> MeetingDetails) {
		this.MeetingDetails = MeetingDetails;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return NotifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice NotifyingParty) {
		this.NotifyingParty = NotifyingParty;
	}

	public PartyIdentification9Choice getIssuer() {
		return Issuer;
	}

	public void setIssuer(PartyIdentification9Choice Issuer) {
		this.Issuer = Issuer;
	}

	public List<IssuerAgent1> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(List<IssuerAgent1> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public List<SecurityPosition5> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition5> Security) {
		this.Security = Security;
	}

	public List<Resolution2> getResolution() {
		return Resolution;
	}

	public void setResolution(List<Resolution2> Resolution) {
		this.Resolution = Resolution;
	}

	public Optional<VoteParameters1> getVote() {
		return Vote;
	}

	public void setVote(Optional<VoteParameters1> Vote) {
		this.Vote = Vote;
	}

	public EntitlementAssessment1 getEntitlementSpecification() {
		return EntitlementSpecification;
	}

	public void setEntitlementSpecification(
			EntitlementAssessment1 EntitlementSpecification) {
		this.EntitlementSpecification = EntitlementSpecification;
	}

	public Optional<PowerOfAttorneyRequirements2> getPowerOfAttorneyRequirements() {
		return PowerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(
			Optional<PowerOfAttorneyRequirements2> PowerOfAttorneyRequirements) {
		this.PowerOfAttorneyRequirements = PowerOfAttorneyRequirements;
	}
}