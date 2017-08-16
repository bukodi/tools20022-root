package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.MeetingResultDisseminationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AmendInformation3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MeetingReference7;
import com.tools20022.repository.dict.msg.SecurityPosition8;
import java.util.List;
import com.tools20022.repository.dict.msg.Vote7;
import com.tools20022.repository.dict.msg.Participation4;
import com.tools20022.repository.dict.msg.CommunicationAddress4;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An issuer, its agent or an intermediary sends the
 * MeetingResultDissemination message to another intermediary, to a party
 * holding the right to vote, to a registered security holder or to a beneficial
 * holder to provide information on the voting results of a shareholders
 * meeting. Usage The MeetingResultDissemination message is used to provide the
 * vote results per resolution. It may also provide information on the level of
 * participation. This message is also used to notify an update or amendment to
 * a previously sent MeetingResultDissemination message. This message definition
 * is intended for use with the Business Application Header (head.001.001.01).
 */
@PreviousVersion(MeetingResultDisseminationV04.class)
public class MeetingResultDisseminationV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AmendInformation3> Amendment;
	private MeetingReference7 MeetingReference;
	private List<SecurityPosition8> Security;
	private List<Vote7> VoteResult;
	private Optional<Participation4> Participation;
	private Optional<CommunicationAddress4> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<AmendInformation3> getAmendment() {
		return Amendment;
	}

	public void setAmendment(Optional<AmendInformation3> Amendment) {
		this.Amendment = Amendment;
	}

	public MeetingReference7 getMeetingReference() {
		return MeetingReference;
	}

	public void setMeetingReference(MeetingReference7 MeetingReference) {
		this.MeetingReference = MeetingReference;
	}

	public List<SecurityPosition8> getSecurity() {
		return Security;
	}

	public void setSecurity(List<SecurityPosition8> Security) {
		this.Security = Security;
	}

	public List<Vote7> getVoteResult() {
		return VoteResult;
	}

	public void setVoteResult(List<Vote7> VoteResult) {
		this.VoteResult = VoteResult;
	}

	public Optional<Participation4> getParticipation() {
		return Participation;
	}

	public void setParticipation(Optional<Participation4> Participation) {
		this.Participation = Participation;
	}

	public Optional<CommunicationAddress4> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CommunicationAddress4> AdditionalInformation) {
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