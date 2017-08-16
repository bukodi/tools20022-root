package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.EffectiveDate1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountIdentification26;
import com.tools20022.repository.dict.choice.MarketIdentificationOrCashPurpose1Choice;
import com.tools20022.repository.dict.choice.PartyOrCurrency1Choice;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.choice.ProcessingStatus43Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The receiver of a StandingSettlementInstruction message sends the
 * StandingSettlementInstructionStatusAdvice message to the instructing party
 * (sender of the StandingSettlementInstruction message) to provide the status
 * of a previously received StandingSettlementInstruction,
 * StandingSettlementInstructionCancellation or
 * StandingSettlementInstructionDeletion message.
 * 
 * Usage The StandingSettlementInstructionStatusAdvice message is used to report
 * one of the following statuses: - a received status, or, - an accepted status,
 * or, - a rejected status, or, - a pending processing status, or, - a
 * proprietary status.
 */
public class StandingSettlementInstructionStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<EffectiveDate1> EffectiveDateDetails;
	private AccountIdentification26 AccountIdentification;
	private MarketIdentificationOrCashPurpose1Choice MarketIdentification;
	private PartyOrCurrency1Choice SettlementDetails;
	private Max35Text RelatedMessageReference;
	private ProcessingStatus43Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<EffectiveDate1> getEffectiveDateDetails() {
		return EffectiveDateDetails;
	}

	public void setEffectiveDateDetails(
			Optional<EffectiveDate1> EffectiveDateDetails) {
		this.EffectiveDateDetails = EffectiveDateDetails;
	}

	public AccountIdentification26 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(
			AccountIdentification26 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public MarketIdentificationOrCashPurpose1Choice getMarketIdentification() {
		return MarketIdentification;
	}

	public void setMarketIdentification(
			MarketIdentificationOrCashPurpose1Choice MarketIdentification) {
		this.MarketIdentification = MarketIdentification;
	}

	public PartyOrCurrency1Choice getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(PartyOrCurrency1Choice SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Max35Text getRelatedMessageReference() {
		return RelatedMessageReference;
	}

	public void setRelatedMessageReference(Max35Text RelatedMessageReference) {
		this.RelatedMessageReference = RelatedMessageReference;
	}

	public ProcessingStatus43Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus43Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}