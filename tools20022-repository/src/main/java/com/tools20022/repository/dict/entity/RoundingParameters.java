package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestmentAccountService;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.codeset.RoundingDirectionCode;
import com.tools20022.repository.dict.entity.SecuritiesPegOrderInstruction;

/**
 * Parameters applied to a fractional number.
 */
public class RoundingParameters {

	private InvestmentAccountService InvestmentAccountService;
	private DecimalNumber RoundingModulus;
	private RoundingDirectionCode RoundingDirection;
	private SecuritiesPegOrderInstruction RelatedPegOrderInstruction;

	public InvestmentAccountService getInvestmentAccountService() {
		return InvestmentAccountService;
	}

	public void setInvestmentAccountService(
			InvestmentAccountService InvestmentAccountService) {
		this.InvestmentAccountService = InvestmentAccountService;
	}

	public DecimalNumber getRoundingModulus() {
		return RoundingModulus;
	}

	public void setRoundingModulus(DecimalNumber RoundingModulus) {
		this.RoundingModulus = RoundingModulus;
	}

	public RoundingDirectionCode getRoundingDirection() {
		return RoundingDirection;
	}

	public void setRoundingDirection(RoundingDirectionCode RoundingDirection) {
		this.RoundingDirection = RoundingDirection;
	}

	public SecuritiesPegOrderInstruction getRelatedPegOrderInstruction() {
		return RelatedPegOrderInstruction;
	}

	public void setRelatedPegOrderInstruction(
			SecuritiesPegOrderInstruction RelatedPegOrderInstruction) {
		this.RelatedPegOrderInstruction = RelatedPegOrderInstruction;
	}
}