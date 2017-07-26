package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingModificationInstructionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters2;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails5;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.QuantityAndAccount7;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails1;
import com.tools20022.repository.dict.msg.SettlementDetails3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SettlementParties5;
import com.tools20022.repository.dict.msg.AmountAndDirection10;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends a SecuritiesFinancingModificationInstruction to
 * a securities financing transaction account servicer to notify the securities
 * financing transaction account servicer of an update in the details of a
 * repurchase agreement, reverse repurchase agreement, securities lending or
 * securities borrowing transaction that does not impact the original
 * transaction securities quantity. Such a change may be: - the providing of
 * closing details not available at the time of the sending of the Securities
 * Financing Instruction, for example, termination date for an open repo, - the
 * providing of a new rate, for example, a repo rate, - the rollover of a
 * position extending the closing or maturity date. The account owner/servicer
 * relationship may be: - a global custodian which has an account with a local
 * custodian, or - an investment management institution which manage a fund
 * account opened at a custodian, or - a broker which has an account with a
 * custodian, or - a central securities depository participant which has an
 * account with a central securities depository, or - a central securities
 * depository which has an account with a custodian, another central securities
 * depository or another settlement market infrastructure, or - a central
 * counterparty or a stock exchange or a trade matching utility which need to
 * instruct the settlement of securities financing transactions to a central
 * securities depository or another settlement market infrastructure. Usage The
 * message may also be used to: - re-send a message previously sent (the
 * sub-function of the message is Duplicate), - provide a third party with a
 * copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesFinancingModificationInstructionV02.class)
public class SecuritiesFinancingModificationInstructionV01 {

	private DocumentIdentification11 Identification;
	private TransactionTypeAndAdditionalParameters2 TransactionTypeAndModificationAdditionalParameters;
	private SecuritiesTradeDetails5 TradeDetails;
	private SecurityIdentification11 FinancialInstrumentIdentification;
	private QuantityAndAccount7 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails1 SecuritiesFinancingAdditionalDetails;
	private Optional<SettlementDetails3> SettlementParameters;
	private Optional<SettlementParties5> DeliveringSettlementParties;
	private Optional<SettlementParties5> ReceivingSettlementParties;
	private Optional<AmountAndDirection10> OpeningSettlementAmount;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public TransactionTypeAndAdditionalParameters2 getTransactionTypeAndModificationAdditionalParameters() {
		return TransactionTypeAndModificationAdditionalParameters;
	}

	public void setTransactionTypeAndModificationAdditionalParameters(
			TransactionTypeAndAdditionalParameters2 TransactionTypeAndModificationAdditionalParameters) {
		this.TransactionTypeAndModificationAdditionalParameters = TransactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails5 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification11 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public QuantityAndAccount7 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount7 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails1 getSecuritiesFinancingAdditionalDetails() {
		return SecuritiesFinancingAdditionalDetails;
	}

	public void setSecuritiesFinancingAdditionalDetails(
			SecuritiesFinancingTransactionDetails1 SecuritiesFinancingAdditionalDetails) {
		this.SecuritiesFinancingAdditionalDetails = SecuritiesFinancingAdditionalDetails;
	}

	public Optional<SettlementDetails3> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails3> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<SettlementParties5> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties5> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties5> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties5> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<AmountAndDirection10> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection10> OpeningSettlementAmount) {
		this.OpeningSettlementAmount = OpeningSettlementAmount;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}