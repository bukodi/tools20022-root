package com.tools20022.repository.catalogue.msgdef.other;

import com.tools20022.repository.dict.msg.TradeAgreement8;
import com.tools20022.repository.dict.msg.TradePartyIdentification6;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate1;
import com.tools20022.repository.dict.msg.SettlementParties29;
import java.util.Optional;
import com.tools20022.repository.dict.msg.GeneralInformation4;
import com.tools20022.repository.dict.msg.RegulatoryReporting1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeInstructionAmendement message is sent by a
 * participant to a central settlement system to notify the amendment of the
 * foreign exchange trade previously confirmed by the sender. Usage The
 * ForeignExchangeTradeInstructionAmendement message is sent from a participant
 * to a central settlement system to advise of the update of a previously sent
 * notification. The "Related Reference" must be used to link it to the previous
 * notification.
 */
public class ForeignExchangeTradeInstructionAmendmentV02 {

	private TradeAgreement8 TradeInformation;
	private TradePartyIdentification6 TradingSideIdentification;
	private TradePartyIdentification6 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private AgreedRate1 AgreedRate;
	private Optional<SettlementParties29> TradingSideSettlementInstructions;
	private Optional<SettlementParties29> CounterpartySideSettlementInstructions;
	private Optional<GeneralInformation4> OptionalGeneralInformation;
	private Optional<RegulatoryReporting1> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeAgreement8 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement8 TradeInformation) {
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

	public AmountsAndValueDate1 getTradeAmounts() {
		return TradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 TradeAmounts) {
		this.TradeAmounts = TradeAmounts;
	}

	public AgreedRate1 getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(AgreedRate1 AgreedRate) {
		this.AgreedRate = AgreedRate;
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

	public Optional<GeneralInformation4> getOptionalGeneralInformation() {
		return OptionalGeneralInformation;
	}

	public void setOptionalGeneralInformation(
			Optional<GeneralInformation4> OptionalGeneralInformation) {
		this.OptionalGeneralInformation = OptionalGeneralInformation;
	}

	public Optional<RegulatoryReporting1> getRegulatoryReporting() {
		return RegulatoryReporting;
	}

	public void setRegulatoryReporting(
			Optional<RegulatoryReporting1> RegulatoryReporting) {
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