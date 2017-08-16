package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification30;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.choice.StatusOrStatement7Choice;
import com.tools20022.repository.dict.choice.ProcessingStatus55Choice;
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
@PreviousVersion(SecuritiesStatusOrStatementQueryStatusAdviceV03.class)
public class SecuritiesStatusOrStatementQueryStatusAdviceV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification30 QueryDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private Optional<SecuritiesAccount19> SafekeepingAccount;
	private Optional<StatusOrStatement7Choice> StatusOrStatementRequested;
	private ProcessingStatus55Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentIdentification30 getQueryDetails() {
		return QueryDetails;
	}

	public void setQueryDetails(DocumentIdentification30 QueryDetails) {
		this.QueryDetails = QueryDetails;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount19> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<StatusOrStatement7Choice> getStatusOrStatementRequested() {
		return StatusOrStatementRequested;
	}

	public void setStatusOrStatementRequested(
			Optional<StatusOrStatement7Choice> StatusOrStatementRequested) {
		this.StatusOrStatementRequested = StatusOrStatementRequested;
	}

	public ProcessingStatus55Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus55Choice ProcessingStatus) {
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