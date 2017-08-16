package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.TransactionDetails11;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends a SecuritiesTransactionCancellationRequest to an
 * account servicer to request the cancellation of a securities transaction. The
 * account owner/servicer relationship may be: - a global custodian which has an
 * account with a local custodian, or - an investment management institution
 * which manage a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct to a central securities depository ot another settlement
 * market infrastructure. Usage The transaction may be: - a securities
 * settlement transaction - an intra-position movement - a securities financing
 * transaction The instruction cannot be: - a securities settlement conditions
 * modification (another transaction processing command should be sent to
 * reverse a processing change previously requested). - a securities financing
 * modification The message may also be used to: - re-send a message previously
 * sent (the sub-function of the message is Duplicate), - provide a third party
 * with a copy of a message for information (the sub-function of the message is
 * Copy), - re-send to a third party a copy of a message for information (the
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
@NextVersion(SecuritiesTransactionCancellationRequestV02.class)
public class SecuritiesTransactionCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification11 Identification;
	private TransactionDetails11 Details;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public TransactionDetails11 getDetails() {
		return Details;
	}

	public void setDetails(TransactionDetails11 Details) {
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