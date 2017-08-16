package com.tools20022.repository.catalogue.msgdef.fxtr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeData14;
import com.tools20022.repository.dict.msg.TradeAgreement12;
import com.tools20022.repository.dict.msg.TradePartyIdentification6;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate3;
import com.tools20022.repository.dict.msg.NonDeliverableForwardConditions2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SettlementParties29;
import com.tools20022.repository.dict.msg.GeneralInformation5;
import com.tools20022.repository.dict.msg.SplitTradeDetails3;
import com.tools20022.repository.dict.msg.RegulatoryReporting6;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeStatusAndDetails message is sent by a central
 * system to the participant to provide notification of the status and details
 * of a foreign exchange trade. Usage The notification is sent by a central
 * settlement system to the two trading parties after it has received foreign
 * exchange trade instructions from both.
 */
public class ForeignExchangeTradeStatusAndDetailsNotificationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeData14 StatusDetails;
	private TradeAgreement12 TradeInformation;
	private TradePartyIdentification6 TradingSideIdentification;
	private TradePartyIdentification6 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private AgreedRate3 AgreedRate;
	private Optional<NonDeliverableForwardConditions2> NonDeliverableForwardConditions;
	private Optional<SettlementParties29> TradingSideSettlementInstructions;
	private Optional<SettlementParties29> CounterpartySideSettlementInstructions;
	private Optional<GeneralInformation5> GeneralInformation;
	private Optional<SplitTradeDetails3> SplitTradeInformation;
	private Optional<RegulatoryReporting6> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData14 getStatusDetails() {
		return StatusDetails;
	}

	public void setStatusDetails(TradeData14 StatusDetails) {
		this.StatusDetails = StatusDetails;
	}

	public TradeAgreement12 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement12 TradeInformation) {
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

	public AgreedRate3 getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(AgreedRate3 AgreedRate) {
		this.AgreedRate = AgreedRate;
	}

	public Optional<NonDeliverableForwardConditions2> getNonDeliverableForwardConditions() {
		return NonDeliverableForwardConditions;
	}

	public void setNonDeliverableForwardConditions(
			Optional<NonDeliverableForwardConditions2> NonDeliverableForwardConditions) {
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

	public Optional<GeneralInformation5> getGeneralInformation() {
		return GeneralInformation;
	}

	public void setGeneralInformation(
			Optional<GeneralInformation5> GeneralInformation) {
		this.GeneralInformation = GeneralInformation;
	}

	public Optional<SplitTradeDetails3> getSplitTradeInformation() {
		return SplitTradeInformation;
	}

	public void setSplitTradeInformation(
			Optional<SplitTradeDetails3> SplitTradeInformation) {
		this.SplitTradeInformation = SplitTradeInformation;
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