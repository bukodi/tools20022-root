package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingNotificationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AmendInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.NotificationStatus2;
import com.tools20022.repository.dict.msg.MeetingNotice4;
import com.tools20022.repository.dict.msg.Meeting4;
import java.util.List;
import com.tools20022.repository.dict.msg.IssuerInformation2;
import com.tools20022.repository.dict.msg.IssuerAgent2;
import com.tools20022.repository.dict.msg.SecurityPosition8;
import com.tools20022.repository.dict.msg.Resolution3;
import com.tools20022.repository.dict.msg.VoteParameters4;
import com.tools20022.repository.dict.msg.EntitlementAssessment3;
import com.tools20022.repository.dict.msg.PowerOfAttorneyRequirements3;
import com.tools20022.repository.dict.msg.CorporateEventNarrative2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope A notifying party, for example, an issuer, its agent or an
 * intermediary, sends the MeetingNotification message to a party holding the
 * right to vote, to announce a shareholders meeting. Usage The
 * MeetingNotification message is used to announce a shareholders meeting, for
 * example, it provides information on the participation details and
 * requirements for the meeting, the vote parameters and the resolutions. The
 * MeetingNotification message may also be used to announce an update. To notify
 * an update, the Amendment building block must be filled in. Any building block
 * that is modified must be included in the amendment message. The information
 * previously notified and not repeated in the amendment message remains valid.
 * To update the resolutions of the agenda, the complete list of resolutions
 * must be repeated in the amendment message. The resolutions that are deleted
 * should be assigned the status Withdrawn. This message definition is intended
 * for use with the Business Application Header (head.001.001.01).
 */
@PreviousVersion(MeetingNotificationV04.class)
public class MeetingNotificationV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AmendInformation1> Amendment;
	private NotificationStatus2 NotificationStatus;
	private MeetingNotice4 Meeting;
	private List<Meeting4> MeetingDetails;
	private IssuerInformation2 Issuer;
	private List<IssuerAgent2> IssuerAgent;
	private List<SecurityPosition8> Security;
	private List<Resolution3> Resolution;
	private Optional<VoteParameters4> Vote;
	private Optional<EntitlementAssessment3> EntitlementSpecification;
	private Optional<PowerOfAttorneyRequirements3> PowerOfAttorneyRequirements;
	private Optional<CorporateEventNarrative2> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AmendInformation1> getAmendment() {
		return Amendment;
	}

	public void setAmendment(Optional<AmendInformation1> Amendment) {
		this.Amendment = Amendment;
	}

	public NotificationStatus2 getNotificationStatus() {
		return NotificationStatus;
	}

	public void setNotificationStatus(NotificationStatus2 NotificationStatus) {
		this.NotificationStatus = NotificationStatus;
	}

	public MeetingNotice4 getMeeting() {
		return Meeting;
	}

	public void setMeeting(MeetingNotice4 Meeting) {
		this.Meeting = Meeting;
	}

	public List<Meeting4> getMeetingDetails() {
		return MeetingDetails;
	}

	public void setMeetingDetails(List<Meeting4> MeetingDetails) {
		this.MeetingDetails = MeetingDetails;
	}

	public IssuerInformation2 getIssuer() {
		return Issuer;
	}

	public void setIssuer(IssuerInformation2 Issuer) {
		this.Issuer = Issuer;
	}

	public List<IssuerAgent2> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(List<IssuerAgent2> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public List<SecurityPosition8> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition8> Security) {
		this.Security = Security;
	}

	public List<Resolution3> getResolution() {
		return Resolution;
	}

	public void setResolution(List<Resolution3> Resolution) {
		this.Resolution = Resolution;
	}

	public Optional<VoteParameters4> getVote() {
		return Vote;
	}

	public void setVote(Optional<VoteParameters4> Vote) {
		this.Vote = Vote;
	}

	public Optional<EntitlementAssessment3> getEntitlementSpecification() {
		return EntitlementSpecification;
	}

	public void setEntitlementSpecification(
			Optional<EntitlementAssessment3> EntitlementSpecification) {
		this.EntitlementSpecification = EntitlementSpecification;
	}

	public Optional<PowerOfAttorneyRequirements3> getPowerOfAttorneyRequirements() {
		return PowerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(
			Optional<PowerOfAttorneyRequirements3> PowerOfAttorneyRequirements) {
		this.PowerOfAttorneyRequirements = PowerOfAttorneyRequirements;
	}

	public Optional<CorporateEventNarrative2> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateEventNarrative2> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}