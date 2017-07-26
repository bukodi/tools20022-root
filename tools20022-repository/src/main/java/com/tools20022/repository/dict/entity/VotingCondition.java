package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.IncentivePremium;
import com.tools20022.repository.dict.codeset.VoteInstructionCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Meeting;

/**
 * Specifies the different voting types, channels and premium.
 */
public class VotingCondition {

	private DecimalNumber SecuritiesQuantityRequiredToVote;
	private YesNoIndicator PartialVoteAllowed;
	private YesNoIndicator SplitVoteAllowed;
	private ContactPoint VoteLocation;
	private YesNoIndicator BeneficialOwnerDisclosure;
	private IncentivePremium IncentivePremium;
	private VoteInstructionCode VoteInstructionType;
	private YesNoIndicator StandingVotingInstruction;
	private CurrencyAndAmount VotingPremiumAmount;
	private PercentageRate VotingPremiumRate;
	private Meeting Meeting;
	private YesNoIndicator PreviousInstructionInvalidity;

	public DecimalNumber getSecuritiesQuantityRequiredToVote() {
		return SecuritiesQuantityRequiredToVote;
	}

	public void setSecuritiesQuantityRequiredToVote(
			DecimalNumber SecuritiesQuantityRequiredToVote) {
		this.SecuritiesQuantityRequiredToVote = SecuritiesQuantityRequiredToVote;
	}

	public YesNoIndicator getPartialVoteAllowed() {
		return PartialVoteAllowed;
	}

	public void setPartialVoteAllowed(YesNoIndicator PartialVoteAllowed) {
		this.PartialVoteAllowed = PartialVoteAllowed;
	}

	public YesNoIndicator getSplitVoteAllowed() {
		return SplitVoteAllowed;
	}

	public void setSplitVoteAllowed(YesNoIndicator SplitVoteAllowed) {
		this.SplitVoteAllowed = SplitVoteAllowed;
	}

	public ContactPoint getVoteLocation() {
		return VoteLocation;
	}

	public void setVoteLocation(ContactPoint VoteLocation) {
		this.VoteLocation = VoteLocation;
	}

	public YesNoIndicator getBeneficialOwnerDisclosure() {
		return BeneficialOwnerDisclosure;
	}

	public void setBeneficialOwnerDisclosure(
			YesNoIndicator BeneficialOwnerDisclosure) {
		this.BeneficialOwnerDisclosure = BeneficialOwnerDisclosure;
	}

	public IncentivePremium getIncentivePremium() {
		return IncentivePremium;
	}

	public void setIncentivePremium(IncentivePremium IncentivePremium) {
		this.IncentivePremium = IncentivePremium;
	}

	public VoteInstructionCode getVoteInstructionType() {
		return VoteInstructionType;
	}

	public void setVoteInstructionType(VoteInstructionCode VoteInstructionType) {
		this.VoteInstructionType = VoteInstructionType;
	}

	public YesNoIndicator getStandingVotingInstruction() {
		return StandingVotingInstruction;
	}

	public void setStandingVotingInstruction(
			YesNoIndicator StandingVotingInstruction) {
		this.StandingVotingInstruction = StandingVotingInstruction;
	}

	public CurrencyAndAmount getVotingPremiumAmount() {
		return VotingPremiumAmount;
	}

	public void setVotingPremiumAmount(CurrencyAndAmount VotingPremiumAmount) {
		this.VotingPremiumAmount = VotingPremiumAmount;
	}

	public PercentageRate getVotingPremiumRate() {
		return VotingPremiumRate;
	}

	public void setVotingPremiumRate(PercentageRate VotingPremiumRate) {
		this.VotingPremiumRate = VotingPremiumRate;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public YesNoIndicator getPreviousInstructionInvalidity() {
		return PreviousInstructionInvalidity;
	}

	public void setPreviousInstructionInvalidity(
			YesNoIndicator PreviousInstructionInvalidity) {
		this.PreviousInstructionInvalidity = PreviousInstructionInvalidity;
	}
}