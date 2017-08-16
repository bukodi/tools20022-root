package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Identification16;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionIdentifications34;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import com.tools20022.repository.dict.msg.StatusTrail7;

/**
 * Scope This message is sent by the Market Infrastructure to the CSD to advise
 * of the history of all the statuses, modifications, replacement and
 * cancellation of a specific transaction during its whole life cycle when the
 * instructing party is a direct participant to the Settlement Infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message sent by the market
 * infrastructure to the direct participant, - provide a third party with a copy
 * of a message being sent by the market infrastructure for information, -
 * re-send to a third party a copy of a message being sent by the market
 * infrastructure for information using the relevant elements in the Business
 * Application Header.
 */
public class SecuritiesSettlementTransactionAuditTrailReport002V03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Optional<Identification16> QueryReference;
	private Optional<TransactionIdentifications34> TransactionIdentification;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<PartyIdentification109> AccountOwner;
	private Optional<StatusTrail7> StatusTrail;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Optional<Identification16> getQueryReference() {
		return QueryReference;
	}

	public void setQueryReference(Optional<Identification16> QueryReference) {
		this.QueryReference = QueryReference;
	}

	public Optional<TransactionIdentifications34> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications34> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<StatusTrail7> getStatusTrail() {
		return StatusTrail;
	}

	public void setStatusTrail(Optional<StatusTrail7> StatusTrail) {
		this.StatusTrail = StatusTrail;
	}
}