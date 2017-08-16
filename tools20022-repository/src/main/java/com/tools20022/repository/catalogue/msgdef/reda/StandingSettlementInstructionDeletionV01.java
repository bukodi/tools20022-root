package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.EffectiveDate1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountIdentification26;
import com.tools20022.repository.dict.choice.MarketIdentificationOrCashPurpose1Choice;
import com.tools20022.repository.dict.choice.PartyOrCurrency1Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An instructing party sends the StandingSettlementInstructionDeletion
 * message to the receiver to delete a previously sent
 * StandingSettlementInstruction message. The message can also be used to notify
 * a counterparty of the deletion of a standing settlement information.
 * 
 * Usage The instructing party (initiator) is: • An account servicer, for
 * example, a global custodian or prime broker • A counterparty in a
 * transaction, for example: - an investment manager (executing broker), - a
 * global custodian (executing broker, prime broker) • A vendor's application
 * communicating on behalf of an account servicer or counterparty The receiver
 * is: • An account owner, for example, an investment manager, hedge fund
 * administrator or a party to which SSI operations have been outsourced • A
 * counterparty, for example: - an investment manager (executing broker) - a
 * global custodian (executing broker, prime broker) • A vendor's application
 * communicating on behalf of the account owner or counterparty.
 */
public class StandingSettlementInstructionDeletionV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text MessageReferenceIdentification;
	private Optional<EffectiveDate1> EffectiveDateDetails;
	private AccountIdentification26 AccountIdentification;
	private MarketIdentificationOrCashPurpose1Choice MarketIdentification;
	private PartyOrCurrency1Choice SettlementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getMessageReferenceIdentification() {
		return MessageReferenceIdentification;
	}

	public void setMessageReferenceIdentification(
			Max35Text MessageReferenceIdentification) {
		this.MessageReferenceIdentification = MessageReferenceIdentification;
	}

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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}