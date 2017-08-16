package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.TradeIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Reference number assigned by the clearing broker. A distinction can be made
 * between the reference for the Central Counterparty (CCP) leg and the
 * reference for the client leg of the transaction.
 */
public class ClearingBrokerIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradeIdentification RelatedTradeIdentification;
	private Max35Text SideIndicator;
	private Max35Text Identification;

	public TradeIdentification getRelatedTradeIdentification() {
		return RelatedTradeIdentification;
	}

	public void setRelatedTradeIdentification(
			TradeIdentification RelatedTradeIdentification) {
		this.RelatedTradeIdentification = RelatedTradeIdentification;
	}

	public Max35Text getSideIndicator() {
		return SideIndicator;
	}

	public void setSideIndicator(Max35Text SideIndicator) {
		this.SideIndicator = SideIndicator;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}
}