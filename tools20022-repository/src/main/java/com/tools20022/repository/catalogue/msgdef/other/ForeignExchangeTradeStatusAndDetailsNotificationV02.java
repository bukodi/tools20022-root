package com.tools20022.repository.catalogue.msgdef.other;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeData9;
import com.tools20022.repository.dict.msg.TradeAgreement9;
import com.tools20022.repository.dict.msg.TradePartyIdentification6;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate1;
import com.tools20022.repository.dict.msg.SettlementParties29;
import java.util.Optional;
import com.tools20022.repository.dict.msg.GeneralInformation4;
import com.tools20022.repository.dict.msg.SplitTradeDetails1;
import com.tools20022.repository.dict.msg.RegulatoryReporting1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeStatusAndDetails message is sent by a central
 * system to the participant to provide notification of the status and details
 * of a foreign exchange trade. Usage The notification is sent by a central
 * settlement system to the two trading parties after it has received foreign
 * exchange trade instructions from both.
 */
public class ForeignExchangeTradeStatusAndDetailsNotificationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeData9 StatusDetails;
	private TradeAgreement9 TradeInformation;
	private TradePartyIdentification6 TradingSideIdentification;
	private TradePartyIdentification6 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private AgreedRate1 AgreedRate;
	private Optional<SettlementParties29> TradingSideSettlementInstructions;
	private Optional<SettlementParties29> CounterpartySideSettlementInstructions;
	private Optional<GeneralInformation4> GeneralInformation;
	private Optional<SplitTradeDetails1> SplitTradeInformation;
	private Optional<RegulatoryReporting1> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData9 getStatusDetails() {
		return StatusDetails;
	}

	public void setStatusDetails(TradeData9 StatusDetails) {
		this.StatusDetails = StatusDetails;
	}

	public TradeAgreement9 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement9 TradeInformation) {
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

	public Optional<GeneralInformation4> getGeneralInformation() {
		return GeneralInformation;
	}

	public void setGeneralInformation(
			Optional<GeneralInformation4> GeneralInformation) {
		this.GeneralInformation = GeneralInformation;
	}

	public Optional<SplitTradeDetails1> getSplitTradeInformation() {
		return SplitTradeInformation;
	}

	public void setSplitTradeInformation(
			Optional<SplitTradeDetails1> SplitTradeInformation) {
		this.SplitTradeInformation = SplitTradeInformation;
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