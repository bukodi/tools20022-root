package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.EffectiveDate1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountIdentification26;
import com.tools20022.repository.dict.choice.MarketIdentificationOrCashPurpose1Choice;
import com.tools20022.repository.dict.codeset.ActiveCurrencyCode;
import com.tools20022.repository.dict.choice.SecuritiesOrCash1Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An instructing party sends the StandingSettlementInstruction (SSI)
 * message to the receiver to create or update a standing cash or securities
 * settlement instruction. The message can also be used to notify a counterparty
 * of an SSI.
 * 
 * Usage The instructing party (initiator) is: • An account servicer, for
 * example, a global custodian or prime broker • A counterparty in a
 * transaction, for example: - an investment manager (executing broker), - a
 * global custodian (executing broker, prime broker) • A vendor’s application
 * communicating on behalf of an account servicer or counterparty The receiver
 * is: • An account owner, for example, an investment manager, hedge fund
 * administrator or a party to which SSI operations have been outsourced • A
 * counterparty, for example: - an investment manager (executing broker) - a
 * global custodian (executing broker, prime broker) • A vendor’s application
 * communicating on behalf of the account owner or counterparty
 */
public class StandingSettlementInstructionV01 {

	private Max35Text MessageReferenceIdentification;
	private Optional<EffectiveDate1> EffectiveDateDetails;
	private AccountIdentification26 AccountIdentification;
	private MarketIdentificationOrCashPurpose1Choice MarketIdentification;
	private Optional<ActiveCurrencyCode> SettlementCurrency;
	private SecuritiesOrCash1Choice SettlementDetails;
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

	public Optional<ActiveCurrencyCode> getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(
			Optional<ActiveCurrencyCode> SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}

	public SecuritiesOrCash1Choice getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(SecuritiesOrCash1Choice SettlementDetails) {
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