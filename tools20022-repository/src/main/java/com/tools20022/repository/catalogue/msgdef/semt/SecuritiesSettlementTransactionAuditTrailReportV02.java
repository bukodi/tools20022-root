package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesSettlementTransactionAuditTrailReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesSettlementTransactionAuditTrailReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Identification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionIdentifications15;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.StatusTrail4;

/**
 * Scope
 * 
 * This message is sent by the Market Infrastructure to the CSD to advise of the
 * history of all the statuses, modifications, replacement and cancellation of a
 * specific transaction during its whole life cycle when the instructing party
 * is a direct participant to the Settlement Infrastructure.
 * 
 * 
 * Usage
 * 
 * The message may also be used to:
 * 
 * - re-send a message sent by the market infrastructure to the direct
 * participant,
 * 
 * - provide a third party with a copy of a message being sent by the market
 * infrastructure for information,
 * 
 * - re-send to a third party a copy of a message being sent by the market
 * infrastructure for information using the relevant elements in the Business
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
@PreviousVersion(SecuritiesSettlementTransactionAuditTrailReportV01.class)
@NextVersion(SecuritiesSettlementTransactionAuditTrailReportV03.class)
public class SecuritiesSettlementTransactionAuditTrailReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Optional<Identification1> QueryReference;
	private Optional<TransactionIdentifications15> TransactionIdentification;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private Optional<StatusTrail4> StatusTrail;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Optional<Identification1> getQueryReference() {
		return QueryReference;
	}

	public void setQueryReference(Optional<Identification1> QueryReference) {
		this.QueryReference = QueryReference;
	}

	public Optional<TransactionIdentifications15> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications15> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<StatusTrail4> getStatusTrail() {
		return StatusTrail;
	}

	public void setStatusTrail(Optional<StatusTrail4> StatusTrail) {
		this.StatusTrail = StatusTrail;
	}
}