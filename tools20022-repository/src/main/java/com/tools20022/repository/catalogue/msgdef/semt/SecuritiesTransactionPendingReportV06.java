package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPendingReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPendingReportV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement14;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.StatusAndReason25;
import com.tools20022.repository.dict.msg.Transaction41;

/**
 * Scope An account servicer sends a SecuritiesTransactionPendingReport to an
 * account owner to provide, as at a specified time, the details of pending
 * increases and decreases of holdings, for all or selected securities in a
 * specified safekeeping account, for all or selected reasons why the
 * transaction is pending. The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * acting on behalf of their participants - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer.
 * 
 * Usage The statement may also include future settlement or forward
 * transactions which have become binding on the account owner. The message may
 * also be used to: - re-send a message previously sent, - provide a third party
 * with a copy of a message for information, - re-send to a third party a copy
 * of a message for information using the relevant elements in the Business
 * Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesTransactionPendingReportV05.class)
@NextVersion(SecuritiesTransactionPendingReportV07.class)
public class SecuritiesTransactionPendingReportV06 {

	private Pagination Pagination;
	private Statement14 StatementGeneralDetails;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<StatusAndReason25> Status;
	private Optional<Transaction41> Transactions;

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

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<StatusAndReason25> getStatus() {
		return Status;
	}

	public void setStatus(Optional<StatusAndReason25> Status) {
		this.Status = Status;
	}

	public Optional<Transaction41> getTransactions() {
		return Transactions;
	}

	public void setTransactions(Optional<Transaction41> Transactions) {
		this.Transactions = Transactions;
	}
}