package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeAgreement2;
import com.tools20022.repository.dict.msg.TradePartyIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate1;
import com.tools20022.repository.dict.msg.NonDeliverableForwardValuationConditions2;

/**
 * Scope The CancelNonDeliverableForwardOpening message is sent by a participant
 * to a central system or to a counterparty to notify the cancellation of the
 * opening of a non deliverable trade previously confirmed by the sender. Usage
 * The message will contain a Related Reference to link it to the previously
 * sent notification. It may contain a reason for cancellation.
 */
public class CancelNonDeliverableForwardOpeningV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeAgreement2 TradeInformation;
	private Optional<TradePartyIdentification3> TradingSideIdentification;
	private Optional<TradePartyIdentification3> CounterpartySideIdentification;
	private Optional<AmountsAndValueDate1> TradeAmounts;
	private Optional<AgreedRate1> AgreedRate;
	private Optional<NonDeliverableForwardValuationConditions2> ValuationConditions;

	public TradeAgreement2 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement2 TradeInformation) {
		this.TradeInformation = TradeInformation;
	}

	public Optional<TradePartyIdentification3> getTradingSideIdentification() {
		return TradingSideIdentification;
	}

	public void setTradingSideIdentification(
			Optional<TradePartyIdentification3> TradingSideIdentification) {
		this.TradingSideIdentification = TradingSideIdentification;
	}

	public Optional<TradePartyIdentification3> getCounterpartySideIdentification() {
		return CounterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(
			Optional<TradePartyIdentification3> CounterpartySideIdentification) {
		this.CounterpartySideIdentification = CounterpartySideIdentification;
	}

	public Optional<AmountsAndValueDate1> getTradeAmounts() {
		return TradeAmounts;
	}

	public void setTradeAmounts(Optional<AmountsAndValueDate1> TradeAmounts) {
		this.TradeAmounts = TradeAmounts;
	}

	public Optional<AgreedRate1> getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(Optional<AgreedRate1> AgreedRate) {
		this.AgreedRate = AgreedRate;
	}

	public Optional<NonDeliverableForwardValuationConditions2> getValuationConditions() {
		return ValuationConditions;
	}

	public void setValuationConditions(
			Optional<NonDeliverableForwardValuationConditions2> ValuationConditions) {
		this.ValuationConditions = ValuationConditions;
	}
}