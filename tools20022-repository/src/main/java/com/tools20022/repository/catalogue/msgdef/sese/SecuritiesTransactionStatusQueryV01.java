package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionStatusQueryV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.DocumentNumber2;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends a SecuritiesTransactionStatusQuery to an account
 * servicer to request a status on a securities transaction. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with a local custodian, or - an investment management institution which
 * manage a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct to a central securities depository or another settlement
 * market infrastructure. Usage The message may also be used to: - re-send a
 * message previously sent (the sub-function of the message is Duplicate), -
 * provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy), - re-send to a third party a copy of a
 * message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesTransactionStatusQueryV02.class)
public class SecuritiesTransactionStatusQueryV01 {

	private DocumentIdentification11 Identification;
	private DocumentNumber2 StatusAdviceRequested;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public DocumentNumber2 getStatusAdviceRequested() {
		return StatusAdviceRequested;
	}

	public void setStatusAdviceRequested(DocumentNumber2 StatusAdviceRequested) {
		this.StatusAdviceRequested = StatusAdviceRequested;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification13Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
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