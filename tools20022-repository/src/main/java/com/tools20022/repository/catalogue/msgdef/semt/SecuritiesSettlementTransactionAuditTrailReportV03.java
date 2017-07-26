package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesSettlementTransactionAuditTrailReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Identification14;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionIdentifications29;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import com.tools20022.repository.dict.msg.StatusTrail6;

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
@PreviousVersion(SecuritiesSettlementTransactionAuditTrailReportV02.class)
public class SecuritiesSettlementTransactionAuditTrailReportV03 {

	private Pagination Pagination;
	private Optional<Identification14> QueryReference;
	private Optional<TransactionIdentifications29> TransactionIdentification;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<PartyIdentification98> AccountOwner;
	private Optional<StatusTrail6> StatusTrail;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Optional<Identification14> getQueryReference() {
		return QueryReference;
	}

	public void setQueryReference(Optional<Identification14> QueryReference) {
		this.QueryReference = QueryReference;
	}

	public Optional<TransactionIdentifications29> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications29> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount24 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<StatusTrail6> getStatusTrail() {
		return StatusTrail;
	}

	public void setStatusTrail(Optional<StatusTrail6> StatusTrail) {
		this.StatusTrail = StatusTrail;
	}
}