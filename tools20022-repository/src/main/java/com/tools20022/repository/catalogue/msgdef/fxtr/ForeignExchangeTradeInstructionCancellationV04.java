package com.tools20022.repository.catalogue.msgdef.fxtr;

import com.tools20022.repository.dict.msg.TradeAgreement15;
import com.tools20022.repository.dict.msg.TradePartyIdentification6;
import com.tools20022.repository.dict.msg.AgreedRate3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.NonDeliverableForwardConditions1;
import com.tools20022.repository.dict.msg.SettlementParties29;
import com.tools20022.repository.dict.msg.GeneralInformation5;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.RegulatoryReporting6;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeInstructionCancellation message is sent by a
 * participant to a central settlement system to notify the cancellation of the
 * foreign exchange trade previously confirmed by the sender. Usage The
 * ForeignExchangeTradeInstructionCancellation message is sent from a
 * participant to a central settlement system to advise of the cancellation of a
 * previously sent notification. The "Related Reference" must be used to link it
 * to the previous notification.
 */
public class ForeignExchangeTradeInstructionCancellationV04 {

	private TradeAgreement15 TradeInformation;
	private TradePartyIdentification6 TradingSideIdentification;
	private TradePartyIdentification6 CounterpartySideIdentification;
	private Optional<AgreedRate3> AgreedRate;
	private Optional<NonDeliverableForwardConditions1> NonDeliverableForwardConditions;
	private Optional<SettlementParties29> TradingSideSettlementInstructions;
	private Optional<SettlementParties29> CounterpartySideSettlementInstructions;
	private Optional<GeneralInformation5> OptionalGeneralInformation;
	private AmountsAndValueDate1 TradeAmounts;
	private Optional<RegulatoryReporting6> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeAgreement15 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement15 TradeInformation) {
		this.TradeInformation = TradeInformation;
	}

	public TradePartyIdentification6 getTradingSideIdentification() {
		return TradingSideIdentification;
	}

	public void setTradingSideIdentification(
			TradePartyIdentification6 TradingSideIdentification) {
		this.TradingSideIdentification = TradingSideIdentification;
	}

	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return CounterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(
			TradePartyIdentification6 CounterpartySideIdentification) {
		this.CounterpartySideIdentification = CounterpartySideIdentification;
	}

	public Optional<AgreedRate3> getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(Optional<AgreedRate3> AgreedRate) {
		this.AgreedRate = AgreedRate;
	}

	public Optional<NonDeliverableForwardConditions1> getNonDeliverableForwardConditions() {
		return NonDeliverableForwardConditions;
	}

	public void setNonDeliverableForwardConditions(
			Optional<NonDeliverableForwardConditions1> NonDeliverableForwardConditions) {
		this.NonDeliverableForwardConditions = NonDeliverableForwardConditions;
	}

	public Optional<SettlementParties29> getTradingSideSettlementInstructions() {
		return TradingSideSettlementInstructions;
	}

	public void setTradingSideSettlementInstructions(
			Optional<SettlementParties29> TradingSideSettlementInstructions) {
		this.TradingSideSettlementInstructions = TradingSideSettlementInstructions;
	}

	public Optional<SettlementParties29> getCounterpartySideSettlementInstructions() {
		return CounterpartySideSettlementInstructions;
	}

	public void setCounterpartySideSettlementInstructions(
			Optional<SettlementParties29> CounterpartySideSettlementInstructions) {
		this.CounterpartySideSettlementInstructions = CounterpartySideSettlementInstructions;
	}

	public Optional<GeneralInformation5> getOptionalGeneralInformation() {
		return OptionalGeneralInformation;
	}

	public void setOptionalGeneralInformation(
			Optional<GeneralInformation5> OptionalGeneralInformation) {
		this.OptionalGeneralInformation = OptionalGeneralInformation;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return TradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 TradeAmounts) {
		this.TradeAmounts = TradeAmounts;
	}

	public Optional<RegulatoryReporting6> getRegulatoryReporting() {
		return RegulatoryReporting;
	}

	public void setRegulatoryReporting(
			Optional<RegulatoryReporting6> RegulatoryReporting) {
		this.RegulatoryReporting = RegulatoryReporting;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}