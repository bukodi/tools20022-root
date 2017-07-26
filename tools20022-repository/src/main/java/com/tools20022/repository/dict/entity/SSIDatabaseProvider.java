package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;

/**
 * Provider of a standing settlement instruction (SSI) database.
 */
public class SSIDatabaseProvider extends SettlementPartyRole {

	private StandingSettlementInstruction StandingSettlementDatabase;

	public StandingSettlementInstruction getStandingSettlementDatabase() {
		return StandingSettlementDatabase;
	}

	public void setStandingSettlementDatabase(
			StandingSettlementInstruction StandingSettlementDatabase) {
		this.StandingSettlementDatabase = StandingSettlementDatabase;
	}
}