package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;
import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.entity.Trade;

/**
 * Process which consists in transferring the proceeds related to a trade from
 * one party to the next one.
 */
public class Settlement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private YesNoIndicator CentralCounterpartyEligibilityIndicator;
	private StandingSettlementInstruction StandingSettlementInstruction;
	private SettlementPartyRole SettlementPartyRole;
	private Trade Trade;

	public YesNoIndicator getCentralCounterpartyEligibilityIndicator() {
		return CentralCounterpartyEligibilityIndicator;
	}

	public void setCentralCounterpartyEligibilityIndicator(
			YesNoIndicator CentralCounterpartyEligibilityIndicator) {
		this.CentralCounterpartyEligibilityIndicator = CentralCounterpartyEligibilityIndicator;
	}

	public StandingSettlementInstruction getStandingSettlementInstruction() {
		return StandingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(
			StandingSettlementInstruction StandingSettlementInstruction) {
		this.StandingSettlementInstruction = StandingSettlementInstruction;
	}

	public SettlementPartyRole getSettlementPartyRole() {
		return SettlementPartyRole;
	}

	public void setSettlementPartyRole(SettlementPartyRole SettlementPartyRole) {
		this.SettlementPartyRole = SettlementPartyRole;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}
}