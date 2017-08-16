package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingResultDisseminationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingResultDisseminationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AmendInformation2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference4;
import com.tools20022.repository.dict.choice.PartyIdentification9Choice;
import com.tools20022.repository.dict.msg.SecurityPosition6;
import java.util.List;
import com.tools20022.repository.dict.msg.Vote5;
import com.tools20022.repository.dict.msg.Participation3;
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
@PreviousVersion(MeetingResultDisseminationV02.class)
@NextVersion(MeetingResultDisseminationV04.class)
public class MeetingResultDisseminationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 Identification;
	private Optional<AmendInformation2> Amendment;
	private MeetingReference4 MeetingReference;
	private PartyIdentification9Choice ReportingParty;
	private List<SecurityPosition6> Security;
	private List<Vote5> VoteResult;
	private Optional<Participation3> Participation;
	private Optional<CommunicationAddress4> AdditionalInformation;

	public MessageIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(MessageIdentification1 Identification) {
		this.Identification = Identification;
	}

	public Optional<AmendInformation2> getAmendment() {
		return Amendment;
	}

	public void setAmendment(Optional<AmendInformation2> Amendment) {
		this.Amendment = Amendment;
	}

	public MeetingReference4 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference4 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public PartyIdentification9Choice getReportingParty() {
		return ReportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice ReportingParty) {
		this.ReportingParty = ReportingParty;
	}

	public List<SecurityPosition6> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition6> Security) {
		this.Security = Security;
	}

	public List<Vote5> getVoteResult() {
		return VoteResult;
	}

	public void setVoteResult(List<Vote5> VoteResult) {
		this.VoteResult = VoteResult;
	}

	public Optional<Participation3> getParticipation() {
		return Participation;
	}

	public void setParticipation(Optional<Participation3> Participation) {
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