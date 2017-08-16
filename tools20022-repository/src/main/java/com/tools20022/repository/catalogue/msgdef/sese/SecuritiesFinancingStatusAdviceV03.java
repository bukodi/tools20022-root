package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingStatusAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingStatusAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications1;
import com.tools20022.repository.dict.choice.ProcessingStatus21Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.MatchingStatus12Choice;
import com.tools20022.repository.dict.choice.SettlementStatus10Choice;
import com.tools20022.repository.dict.choice.RepoCallRequestStatus5Choice;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails17;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An securities financing transaction account servicer sends a
 * SecuritiesFinancingStatusAdvice to an account owner to advise the status of a
 * securities financing transaction previously instructed by the account owner.
 * The status advice may be sent as a response to the request of the account
 * owner or not. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure managing
 * securities financing transactions on behalf of their participants - an agent
 * (sub-custodian) managing securities financing transactions on behalf of their
 * global custodian customer, or - a custodian managing securities financing
 * transactions on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
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
@PreviousVersion(SecuritiesFinancingStatusAdviceV02.class)
@NextVersion(SecuritiesFinancingStatusAdviceV04.class)
public class SecuritiesFinancingStatusAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionIdentifications1 TransactionIdentification;
	private Optional<ProcessingStatus21Choice> ProcessingStatus;
	private Optional<MatchingStatus12Choice> MatchingStatus;
	private Optional<MatchingStatus12Choice> InferredMatchingStatus;
	private Optional<SettlementStatus10Choice> SettlementStatus;
	private Optional<RepoCallRequestStatus5Choice> RepoCallRequestStatus;
	private Optional<SecuritiesFinancingTransactionDetails17> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications1 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications1 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<ProcessingStatus21Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus21Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus12Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(
			Optional<MatchingStatus12Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<MatchingStatus12Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus12Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<SettlementStatus10Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus10Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<RepoCallRequestStatus5Choice> getRepoCallRequestStatus() {
		return RepoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(
			Optional<RepoCallRequestStatus5Choice> RepoCallRequestStatus) {
		this.RepoCallRequestStatus = RepoCallRequestStatus;
	}

	public Optional<SecuritiesFinancingTransactionDetails17> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<SecuritiesFinancingTransactionDetails17> TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}