package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPendingReport002V08;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement55;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.msg.StatusAndReason30;
import com.tools20022.repository.dict.msg.Transaction49;

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
 */
@NextVersion(SecuritiesTransactionPendingReport002V08.class)
public class SecuritiesTransactionPendingReport002V07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement55 StatementGeneralDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<StatusAndReason30> Status;
	private Optional<Transaction49> Transactions;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement55 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement55 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<StatusAndReason30> getStatus() {
		return Status;
	}

	public void setStatus(Optional<StatusAndReason30> Status) {
		this.Status = Status;
	}

	public Optional<Transaction49> getTransactions() {
		return Transactions;
	}

	public void setTransactions(Optional<Transaction49> Transactions) {
		this.Transactions = Transactions;
	}
}