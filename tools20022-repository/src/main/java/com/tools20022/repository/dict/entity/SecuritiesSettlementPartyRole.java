package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.dict.codeset.SettlingCapacityCode;
import com.tools20022.repository.dict.codeset.TaxLiabilityCode;

/**
 * Role played by a party in the context of the settlement of securities.
 */
public class SecuritiesSettlementPartyRole extends SettlementPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesSettlement SecuritiesSettlement;
	private SecuritiesSettlementSystem SecuritiesSettlementSystem;
	private SettlingCapacityCode SettlingCapacity;
	private TaxLiabilityCode TaxCapacity;

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public SecuritiesSettlementSystem getSecuritiesSettlementSystem() {
		return SecuritiesSettlementSystem;
	}

	public void setSecuritiesSettlementSystem(
			SecuritiesSettlementSystem SecuritiesSettlementSystem) {
		this.SecuritiesSettlementSystem = SecuritiesSettlementSystem;
	}

	public SettlingCapacityCode getSettlingCapacity() {
		return SettlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacityCode SettlingCapacity) {
		this.SettlingCapacity = SettlingCapacity;
	}

	public TaxLiabilityCode getTaxCapacity() {
		return TaxCapacity;
	}

	public void setTaxCapacity(TaxLiabilityCode TaxCapacity) {
		this.TaxCapacity = TaxCapacity;
	}
}