package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.MeetingResultDisseminationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AmendInformation2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference3;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition5;
import java.util.List;
import com.tools20022.repository.dict.msg.Vote5;
import com.tools20022.repository.dict.msg.Participation2;
import com.tools20022.repository.dict.msg.CommunicationAddress4;

/**
 * Scope An issuer, its agent or an intermediary sends the
 * MeetingResultDissemination message to another intermediary, to a party
 * holding the right to vote, to a registered security holder or to a beneficial
 * holder to provide information on the voting results of a shareholders
 * meeting. Usage The MeetingResultDissemination message is used to provide the
 * vote results per resolution. It may also provide information on the level of
 * participation. This message is also used to notify an update or amendment to
 * a previously sent MeetingResultDissemination message.
 */
@NextVersion(MeetingResultDisseminationV03.class)
public class MeetingResultDisseminationV02 {

	private MessageIdentification1 MeetingResultDisseminationIdentification;
	private Optional<AmendInformation2> Amendment;
	private MeetingReference3 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private List<SecurityPosition5> Security;
	private List<Vote5> VoteResult;
	private Optional<Participation2> Participation;
	private Optional<CommunicationAddress4> AdditionalInformation;

	public MessageIdentification1 getMeetingResultDisseminationIdentification() {
		return MeetingResultDisseminationIdentification;
	}

	public void setMeetingResultDisseminationIdentification(
			MessageIdentification1 MeetingResultDisseminationIdentification) {
		this.MeetingResultDisseminationIdentification = MeetingResultDisseminationIdentification;
	}

	public Optional<AmendInformation2> getAmendment() {
		return Amendment;
	}

	public void setAmendment(Optional<AmendInformation2> Amendment) {
		this.Amendment = Amendment;
	}

	public MeetingReference3 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference3 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getReportingParty() {
		return ReportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice ReportingParty) {
		this.ReportingParty = ReportingParty;
	}

	public List<SecurityPosition5> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition5> Security) {
		this.Security = Security;
	}

	public List<Vote5> getVoteResult() {
		return VoteResult;
	}

	public void setVoteResult(List<Vote5> VoteResult) {
		this.VoteResult = VoteResult;
	}

	public Optional<Participation2> getParticipation() {
		return Participation;
	}

	public void setParticipation(Optional<Participation2> Participation) {
		this.Participation = Participation;
	}

	public Optional<CommunicationAddress4> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CommunicationAddress4> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}
}