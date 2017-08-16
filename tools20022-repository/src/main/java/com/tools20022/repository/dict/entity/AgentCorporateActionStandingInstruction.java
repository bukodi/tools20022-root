package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;
import com.tools20022.repository.dict.codeset.StandingInstructionTypeCode;
import com.tools20022.repository.dict.codeset.StandingInstructionGrossNetCode;
import com.tools20022.repository.dict.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.dict.entity.Security;

/**
 * Set-up at the issuer (agent) of a standing instruction originating from the
 * CSD Participants. These standing instructions allow the participant to
 * indicate details for the distribution of the outturn resources of a CA event
 * outside of the CSD. A standing instruction can be accepted or rejected by the
 * issuer (agent) and a CSD participant can amend or cancel a standing
 * instruction.
 */
public class AgentCorporateActionStandingInstruction
		extends
			StandingSettlementInstruction
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private StandingInstructionTypeCode StandingInstructionType;
	private StandingInstructionGrossNetCode GrossOrNetIndicator;
	private CorporateActionProceedsDeliveryInstruction RelatedDeliveryInstructions;
	private Security Security;

	public StandingInstructionTypeCode getStandingInstructionType() {
		return StandingInstructionType;
	}

	public void setStandingInstructionType(
			StandingInstructionTypeCode StandingInstructionType) {
		this.StandingInstructionType = StandingInstructionType;
	}

	public StandingInstructionGrossNetCode getGrossOrNetIndicator() {
		return GrossOrNetIndicator;
	}

	public void setGrossOrNetIndicator(
			StandingInstructionGrossNetCode GrossOrNetIndicator) {
		this.GrossOrNetIndicator = GrossOrNetIndicator;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedDeliveryInstructions() {
		return RelatedDeliveryInstructions;
	}

	public void setRelatedDeliveryInstructions(
			CorporateActionProceedsDeliveryInstruction RelatedDeliveryInstructions) {
		this.RelatedDeliveryInstructions = RelatedDeliveryInstructions;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}
}