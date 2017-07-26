package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageCancellationAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.TransactionDetails12;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends a SecuritiesMessageCancellationAdvice to an
 * account owner to inform of the cancellation of a securities message
 * previously sent by an account servicer. The account servicer/owner
 * relationship may be: - a central securities depository or another settlement
 * market infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer. Usage The previously sent message may be: - a securities
 * settlement transaction confirmation - a report (transactions, pending
 * transactions, allegements, accounting and custody securities balance) - an
 * allegement notification (when sent by mistake or because the counterparty
 * cancelled its instruction) - a portfolio transfer notification - an
 * intra-position movement confirmation - a transaction generation notification
 * The previously sent message cannot be a status advice message (any). If a
 * status advice should not have been sent, a new status advice with the correct
 * status should be sent, not a cancellation advice. The message may also be
 * used to: - re-send a message previously sent (the sub-function of the message
 * is Duplicate), - provide a third party with a copy of a message for
 * information (the sub-function of the message is Copy), - re-send to a third
 * party a copy of a message for information (the sub-function of the message is
 * Copy Duplicate). ISO 15022 - 20022 Coexistence This ISO 20022 message is
 * reversed engineered from ISO 15022. Both standards will coexist for a certain
 * number of years. Until this coexistence period ends, the usage of certain
 * data types is restricted to ensure interoperability between ISO 15022 and
 * 20022 users. Compliance to these rules is mandatory in a coexistence
 * environment. The coexistence restrictions are described in a Textual Rule
 * linked to the Message Items they concern. These coexistence textual rules are
 * clearly identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesMessageCancellationAdviceV02.class)
public class SecuritiesMessageCancellationAdviceV01 {

	private DocumentIdentification11 Identification;
	private TransactionDetails12 Details;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public TransactionDetails12 getDetails() {
		return Details;
	}

	public void setDetails(TransactionDetails12 Details) {
		this.Details = Details;
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