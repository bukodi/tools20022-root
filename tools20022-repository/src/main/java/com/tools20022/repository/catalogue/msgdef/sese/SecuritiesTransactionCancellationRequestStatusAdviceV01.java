package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.msg.TransactionIdentifications4;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus2Choice;
import com.tools20022.repository.dict.msg.TransactionDetails4;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends an
 * SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to
 * advise the status of a securities transaction cancellation request previously
 * sent by the account owner. The account servicer/owner relationship may be: -
 * a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer. Usage The message
 * may also be used to: - re-send a message previously sent (the sub-function of
 * the message is Duplicate), - provide a third party with a copy of a message
 * for information (the sub-function of the message is Copy), - re-send to a
 * third party a copy of a message for information (the sub-function of the
 * message is Copy Duplicate). ISO 15022 - 20022 Coexistence This ISO 20022
 * message is reversed engineered from ISO 15022. Both standards will coexist
 * for a certain number of years. Until this coexistence period ends, the usage
 * of certain data types is restricted to ensure interoperability between ISO
 * 15022 and 20022 users. Compliance to these rules is mandatory in a
 * coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesTransactionCancellationRequestStatusAdviceV02.class)
public class SecuritiesTransactionCancellationRequestStatusAdviceV01 {

	private DocumentIdentification11 Identification;
	private Identification1 CancellationRequestReference;
	private Optional<TransactionIdentifications4> TransactionIdentification;
	private ProcessingStatus2Choice ProcessingStatus;
	private Optional<TransactionDetails4> TransactionDetails;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Identification1 getCancellationRequestReference() {
		return CancellationRequestReference;
	}

	public void setCancellationRequestReference(
			Identification1 CancellationRequestReference) {
		this.CancellationRequestReference = CancellationRequestReference;
	}

	public Optional<TransactionIdentifications4> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications4> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ProcessingStatus2Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus2Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<TransactionDetails4> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails4> TransactionDetails) {
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