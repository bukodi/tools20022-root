package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionStatusAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.TransactionIdentifications2;
import com.tools20022.repository.dict.choice.ProcessingStatus1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.MatchingStatus2Choice;
import com.tools20022.repository.dict.choice.SettlementStatus2Choice;
import com.tools20022.repository.dict.msg.TransactionDetails5;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends a SecuritiesSettlementTransactionStatusAdvice
 * to an account owner to advise the status of a securities settlement
 * transaction instruction previously sent by the account owner or the status of
 * a settlement transaction existing in the books of the servicer for the
 * account of the owner. The status may be a processing, pending processing,
 * internal matching, matching and/or settlement status. The status advice may
 * be sent as a response to the request of the account owner or not. The account
 * servicer/owner relationship may be: - a central securities depository or
 * another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate). ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesSettlementTransactionStatusAdviceV02.class)
public class SecuritiesSettlementTransactionStatusAdviceV01 {

	private DocumentIdentification11 Identification;
	private TransactionIdentifications2 TransactionIdentification;
	private Optional<ProcessingStatus1Choice> ProcessingStatus;
	private Optional<MatchingStatus2Choice> InferredMatchingStatus;
	private Optional<MatchingStatus2Choice> MatchingStatus;
	private Optional<SettlementStatus2Choice> SettlementStatus;
	private Optional<TransactionDetails5> TransactionDetails;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public TransactionIdentifications2 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications2 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<ProcessingStatus1Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus1Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus2Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus2Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<MatchingStatus2Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(Optional<MatchingStatus2Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<SettlementStatus2Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus2Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<TransactionDetails5> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails5> TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
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