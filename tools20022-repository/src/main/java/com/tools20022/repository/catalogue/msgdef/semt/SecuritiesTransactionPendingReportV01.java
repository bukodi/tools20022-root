package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPendingReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement14;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.StatusAndReason1;
import com.tools20022.repository.dict.msg.Transaction8;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;

/**
 * Scope An account servicer sends a SecuritiesTransactionPendingReport to an
 * account owner to provide, as at a specified time, the details of pending
 * increases and decreases of holdings, for all or selected securities in a
 * specified safekeeping account, for all or selected reasons why the
 * transaction is pending. The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * acting on behalf of their participants - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer. Usage The
 * statement may also include future settlement or forward transactions which
 * have become binding on the account owner. The message may also be used to: -
 * re-send a message previously sent (the sub-function of the message is
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
@NextVersion(SecuritiesTransactionPendingReportV02.class)
public class SecuritiesTransactionPendingReportV01 {

	private DocumentIdentification11 Identification;
	private Pagination Pagination;
	private Statement14 StatementGeneralDetails;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<StatusAndReason1> Status;
	private Optional<Transaction8> Transactions;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement14 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement14 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
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

	public Optional<StatusAndReason1> getStatus() {
		return Status;
	}

	public void setStatus(Optional<StatusAndReason1> Status) {
		this.Status = Status;
	}

	public Optional<Transaction8> getTransactions() {
		return Transactions;
	}

	public void setTransactions(Optional<Transaction8> Transactions) {
		this.Transactions = Transactions;
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
}