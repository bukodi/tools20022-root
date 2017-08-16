package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification48;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.choice.StatusOrStatement8Choice;
import com.tools20022.repository.dict.choice.ProcessingStatus64Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise
 * the status of a status query or statement query previously sent by the
 * account owner. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants - an agent (sub-custodian) acting on behalf of
 * their global custodian customer, or - a custodian acting on behalf of an
 * investment management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
public class SecuritiesStatusOrStatementQueryStatusAdvice002V04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification48 QueryDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private Optional<SecuritiesAccount30> SafekeepingAccount;
	private Optional<StatusOrStatement8Choice> StatusOrStatementRequested;
	private ProcessingStatus64Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentIdentification48 getQueryDetails() {
		return QueryDetails;
	}

	public void setQueryDetails(DocumentIdentification48 QueryDetails) {
		this.QueryDetails = QueryDetails;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount30> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount30> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<StatusOrStatement8Choice> getStatusOrStatementRequested() {
		return StatusOrStatementRequested;
	}

	public void setStatusOrStatementRequested(
			Optional<StatusOrStatement8Choice> StatusOrStatementRequested) {
		this.StatusOrStatementRequested = StatusOrStatementRequested;
	}

	public ProcessingStatus64Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus64Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}