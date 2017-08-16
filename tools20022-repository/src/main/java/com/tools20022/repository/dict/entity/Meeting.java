package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.MeetingDateStatusCode;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Deadline;
import com.tools20022.repository.dict.entity.MeetingServicing;
import com.tools20022.repository.dict.entity.ContactPersonRole;
import com.tools20022.repository.dict.entity.MeetingPartyRole;
import com.tools20022.repository.dict.entity.MeetingStatus;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.Quorum;
import com.tools20022.repository.dict.entity.VotingCondition;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.IncentivePremium;
import com.tools20022.repository.dict.entity.MeetingParticipation;
import com.tools20022.repository.dict.entity.ResolutionProposal;
import com.tools20022.repository.dict.entity.Resolution;
import com.tools20022.repository.dict.entity.ProxyAppointmentCondition;
import com.tools20022.repository.dict.entity.AdditionalRight;
import com.tools20022.repository.dict.codeset.MeetingTypeCode;
import com.tools20022.repository.dict.entity.PowerOfAttorneyRequirements;
import com.tools20022.repository.dict.codeset.MeetingTypeClassificationCode;

/**
 * Specifies the physical parameters of a general meeting. Several dates and
 * places can be defined for a meeting.
 */
public class Meeting extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime DateAndTime;
	private MeetingDateStatusCode DateStatus;
	private ContactPoint MeetingLocation;
	private Max35Text Identification;
	private Deadline Deadline;
	private MeetingServicing MeetingServicing;
	private ContactPersonRole Person;
	private MeetingPartyRole PartyRole;
	private MeetingStatus Status;
	private CorporateActionEvent CorporateEvent;
	private Quorum Quorum;
	private VotingCondition VotingCondition;
	private YesNoIndicator AttendanceRequired;
	private Max350Text AttendanceConfirmation;
	private IncentivePremium IncentivePremium;
	private MeetingParticipation Participation;
	private ResolutionProposal ResolutionProposalConditions;
	private Resolution AgendaItem;
	private ProxyAppointmentCondition ProxyAppointmentConditions;
	private AdditionalRight AdditionalRight;
	private MeetingTypeCode Type;
	private PowerOfAttorneyRequirements PowerOfAttorneyRequirements;
	private MeetingTypeClassificationCode MeetingEventClassification;

	public ISODateTime getDateAndTime() {
		return DateAndTime;
	}

	public void setDateAndTime(ISODateTime DateAndTime) {
		this.DateAndTime = DateAndTime;
	}

	public MeetingDateStatusCode getDateStatus() {
		return DateStatus;
	}

	public void setDateStatus(MeetingDateStatusCode DateStatus) {
		this.DateStatus = DateStatus;
	}

	public ContactPoint getMeetingLocation() {
		return MeetingLocation;
	}

	public void setMeetingLocation(ContactPoint MeetingLocation) {
		this.MeetingLocation = MeetingLocation;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Deadline getDeadline() {
		return Deadline;
	}

	public void setDeadline(Deadline Deadline) {
		this.Deadline = Deadline;
	}

	public MeetingServicing getMeetingServicing() {
		return MeetingServicing;
	}

	public void setMeetingServicing(MeetingServicing MeetingServicing) {
		this.MeetingServicing = MeetingServicing;
	}

	public ContactPersonRole getPerson() {
		return Person;
	}

	public void setPerson(ContactPersonRole Person) {
		this.Person = Person;
	}

	public MeetingPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(MeetingPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public MeetingStatus getStatus() {
		return Status;
	}

	public void setStatus(MeetingStatus Status) {
		this.Status = Status;
	}

	public CorporateActionEvent getCorporateEvent() {
		return CorporateEvent;
	}

	public void setCorporateEvent(CorporateActionEvent CorporateEvent) {
		this.CorporateEvent = CorporateEvent;
	}

	public Quorum getQuorum() {
		return Quorum;
	}

	public void setQuorum(Quorum Quorum) {
		this.Quorum = Quorum;
	}

	public VotingCondition getVotingCondition() {
		return VotingCondition;
	}

	public void setVotingCondition(VotingCondition VotingCondition) {
		this.VotingCondition = VotingCondition;
	}

	public YesNoIndicator getAttendanceRequired() {
		return AttendanceRequired;
	}

	public void setAttendanceRequired(YesNoIndicator AttendanceRequired) {
		this.AttendanceRequired = AttendanceRequired;
	}

	public Max350Text getAttendanceConfirmation() {
		return AttendanceConfirmation;
	}

	public void setAttendanceConfirmation(Max350Text AttendanceConfirmation) {
		this.AttendanceConfirmation = AttendanceConfirmation;
	}

	public IncentivePremium getIncentivePremium() {
		return IncentivePremium;
	}

	public void setIncentivePremium(IncentivePremium IncentivePremium) {
		this.IncentivePremium = IncentivePremium;
	}

	public MeetingParticipation getParticipation() {
		return Participation;
	}

	public void setParticipation(MeetingParticipation Participation) {
		this.Participation = Participation;
	}

	public ResolutionProposal getResolutionProposalConditions() {
		return ResolutionProposalConditions;
	}

	public void setResolutionProposalConditions(
			ResolutionProposal ResolutionProposalConditions) {
		this.ResolutionProposalConditions = ResolutionProposalConditions;
	}

	public Resolution getAgendaItem() {
		return AgendaItem;
	}

	public void setAgendaItem(Resolution AgendaItem) {
		this.AgendaItem = AgendaItem;
	}

	public ProxyAppointmentCondition getProxyAppointmentConditions() {
		return ProxyAppointmentConditions;
	}

	public void setProxyAppointmentConditions(
			ProxyAppointmentCondition ProxyAppointmentConditions) {
		this.ProxyAppointmentConditions = ProxyAppointmentConditions;
	}

	public AdditionalRight getAdditionalRight() {
		return AdditionalRight;
	}

	public void setAdditionalRight(AdditionalRight AdditionalRight) {
		this.AdditionalRight = AdditionalRight;
	}

	public MeetingTypeCode getType() {
		return Type;
	}

	public void setType(MeetingTypeCode Type) {
		this.Type = Type;
	}

	public PowerOfAttorneyRequirements getPowerOfAttorneyRequirements() {
		return PowerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(
			PowerOfAttorneyRequirements PowerOfAttorneyRequirements) {
		this.PowerOfAttorneyRequirements = PowerOfAttorneyRequirements;
	}

	public MeetingTypeClassificationCode getMeetingEventClassification() {
		return MeetingEventClassification;
	}

	public void setMeetingEventClassification(
			MeetingTypeClassificationCode MeetingEventClassification) {
		this.MeetingEventClassification = MeetingEventClassification;
	}
}