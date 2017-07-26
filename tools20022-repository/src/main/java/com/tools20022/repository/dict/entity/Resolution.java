package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.ResolutionTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.VoteInstructionCode;
import com.tools20022.repository.dict.entity.Vote;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 */
public class Resolution {

	private Max35Text IssuerLabel;
	private Max350Text Description;
	private Max350Text Title;
	private ResolutionTypeCode Type;
	private YesNoIndicator ForInformationOnly;
	private YesNoIndicator SubmittedBySecurityHolder;
	private VoteInstructionCode ManagementRecommendation;
	private VoteInstructionCode NotifyingPartyRecommendation;
	private Vote CastVotes;
	private Meeting Meeting;
	private VoteInstructionCode VoteOptions;

	public Max35Text getIssuerLabel() {
		return IssuerLabel;
	}

	public void setIssuerLabel(Max35Text IssuerLabel) {
		this.IssuerLabel = IssuerLabel;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public Max350Text getTitle() {
		return Title;
	}

	public void setTitle(Max350Text Title) {
		this.Title = Title;
	}

	public ResolutionTypeCode getType() {
		return Type;
	}

	public void setType(ResolutionTypeCode Type) {
		this.Type = Type;
	}

	public YesNoIndicator getForInformationOnly() {
		return ForInformationOnly;
	}

	public void setForInformationOnly(YesNoIndicator ForInformationOnly) {
		this.ForInformationOnly = ForInformationOnly;
	}

	public YesNoIndicator getSubmittedBySecurityHolder() {
		return SubmittedBySecurityHolder;
	}

	public void setSubmittedBySecurityHolder(
			YesNoIndicator SubmittedBySecurityHolder) {
		this.SubmittedBySecurityHolder = SubmittedBySecurityHolder;
	}

	public VoteInstructionCode getManagementRecommendation() {
		return ManagementRecommendation;
	}

	public void setManagementRecommendation(
			VoteInstructionCode ManagementRecommendation) {
		this.ManagementRecommendation = ManagementRecommendation;
	}

	public VoteInstructionCode getNotifyingPartyRecommendation() {
		return NotifyingPartyRecommendation;
	}

	public void setNotifyingPartyRecommendation(
			VoteInstructionCode NotifyingPartyRecommendation) {
		this.NotifyingPartyRecommendation = NotifyingPartyRecommendation;
	}

	public Vote getCastVotes() {
		return CastVotes;
	}

	public void setCastVotes(Vote CastVotes) {
		this.CastVotes = CastVotes;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public VoteInstructionCode getVoteOptions() {
		return VoteOptions;
	}

	public void setVoteOptions(VoteInstructionCode VoteOptions) {
		this.VoteOptions = VoteOptions;
	}
}