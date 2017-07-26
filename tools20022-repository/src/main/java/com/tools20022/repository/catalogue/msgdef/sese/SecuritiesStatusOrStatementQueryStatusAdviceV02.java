package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.choice.StatusOrStatement3Choice;
import com.tools20022.repository.dict.choice.ProcessingStatus4Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesStatusOrStatementQueryStatusAdvice to an account owner to advise
 * the status of a status query or statement query previously sent by the
 * account owner. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants - an agent (sub-custodian) acting on behalf of
 * their global custodian customer, or - a custodian acting on behalf of an
 * investment management institution or a broker/dealer. using the relevant
 * elements in the Business Application Header. Usage The message may also be
 * used to: - re-send a message previously sent, - provide a third party with a
 * copy of a message for information, - re-send to a third party a copy of a
 * message for information. using the relevant elements in the Business
 * Application Header. ISO 15022 - 20022 Coexistence This ISO 20022 message is
 * reversed engineered from ISO 15022. Both standards will coexist for a certain
 * number of years. Until this coexistence period ends, the usage of certain
 * data types is restricted to ensure interoperability between ISO 15022 and
 * 20022 users. Compliance to these rules is mandatory in a coexistence
 * environment. The coexistence restrictions are described in a Textual Rule
 * linked to the Message Items they concern. These coexistence textual rules are
 * clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesStatusOrStatementQueryStatusAdviceV01.class)
@NextVersion(SecuritiesStatusOrStatementQueryStatusAdviceV03.class)
public class SecuritiesStatusOrStatementQueryStatusAdviceV02 {

	private Identification1 QueryReference;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private Optional<SecuritiesAccount13> SafekeepingAccount;
	private Optional<StatusOrStatement3Choice> StatusOrStatementRequested;
	private ProcessingStatus4Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification1 getQueryReference() {
		return QueryReference;
	}

	public void setQueryReference(Identification1 QueryReference) {
		this.QueryReference = QueryReference;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount13> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount13> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<StatusOrStatement3Choice> getStatusOrStatementRequested() {
		return StatusOrStatementRequested;
	}

	public void setStatusOrStatementRequested(
			Optional<StatusOrStatement3Choice> StatusOrStatementRequested) {
		this.StatusOrStatementRequested = StatusOrStatementRequested;
	}

	public ProcessingStatus4Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus4Choice ProcessingStatus) {
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