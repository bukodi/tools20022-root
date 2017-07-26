package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.VoteInstructionRequest;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.Resolution;
import com.tools20022.repository.dict.entity.VoteResult;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Number of votes assigned to each voting option.
 */
public class Vote {

	private VoteInstructionRequest VoteRequest;
	private Number For;
	private Number Against;
	private Number Abstain;
	private Number Withhold;
	private Number WithManagement;
	private Number AgainstManagement;
	private Resolution Resolution;
	private Number NoAction;
	private VoteResult Result;
	private Number TwoYears;
	private Number OneYear;
	private YesNoIndicator Withdrawn;
	private Number ThreeYears;

	public VoteInstructionRequest getVoteRequest() {
		return VoteRequest;
	}

	public void setVoteRequest(VoteInstructionRequest VoteRequest) {
		this.VoteRequest = VoteRequest;
	}

	public Number getFor() {
		return For;
	}

	public void setFor(Number For) {
		this.For = For;
	}

	public Number getAgainst() {
		return Against;
	}

	public void setAgainst(Number Against) {
		this.Against = Against;
	}

	public Number getAbstain() {
		return Abstain;
	}

	public void setAbstain(Number Abstain) {
		this.Abstain = Abstain;
	}

	public Number getWithhold() {
		return Withhold;
	}

	public void setWithhold(Number Withhold) {
		this.Withhold = Withhold;
	}

	public Number getWithManagement() {
		return WithManagement;
	}

	public void setWithManagement(Number WithManagement) {
		this.WithManagement = WithManagement;
	}

	public Number getAgainstManagement() {
		return AgainstManagement;
	}

	public void setAgainstManagement(Number AgainstManagement) {
		this.AgainstManagement = AgainstManagement;
	}

	public Resolution getResolution() {
		return Resolution;
	}

	public void setResolution(Resolution Resolution) {
		this.Resolution = Resolution;
	}

	public Number getNoAction() {
		return NoAction;
	}

	public void setNoAction(Number NoAction) {
		this.NoAction = NoAction;
	}

	public VoteResult getResult() {
		return Result;
	}

	public void setResult(VoteResult Result) {
		this.Result = Result;
	}

	public Number getTwoYears() {
		return TwoYears;
	}

	public void setTwoYears(Number TwoYears) {
		this.TwoYears = TwoYears;
	}

	public Number getOneYear() {
		return OneYear;
	}

	public void setOneYear(Number OneYear) {
		this.OneYear = OneYear;
	}

	public YesNoIndicator getWithdrawn() {
		return Withdrawn;
	}

	public void setWithdrawn(YesNoIndicator Withdrawn) {
		this.Withdrawn = Withdrawn;
	}

	public Number getThreeYears() {
		return ThreeYears;
	}

	public void setThreeYears(Number ThreeYears) {
		this.ThreeYears = ThreeYears;
	}
}