package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingStatusAdviceV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications32;
import com.tools20022.repository.dict.choice.ProcessingStatus51Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.MatchingStatus26Choice;
import com.tools20022.repository.dict.choice.SettlementStatus18Choice;
import com.tools20022.repository.dict.choice.RepoCallRequestStatus7Choice;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails35;
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
 */
@PreviousVersion(SecuritiesFinancingStatusAdviceV06.class)
public class SecuritiesFinancingStatusAdviceV07 {

	private TransactionIdentifications32 TransactionIdentification;
	private Optional<ProcessingStatus51Choice> ProcessingStatus;
	private Optional<MatchingStatus26Choice> MatchingStatus;
	private Optional<MatchingStatus26Choice> InferredMatchingStatus;
	private Optional<SettlementStatus18Choice> SettlementStatus;
	private Optional<RepoCallRequestStatus7Choice> RepoCallRequestStatus;
	private Optional<SecuritiesFinancingTransactionDetails35> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications32 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications32 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<ProcessingStatus51Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus51Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus26Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(
			Optional<MatchingStatus26Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<MatchingStatus26Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus26Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<SettlementStatus18Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus18Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<RepoCallRequestStatus7Choice> getRepoCallRequestStatus() {
		return RepoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(
			Optional<RepoCallRequestStatus7Choice> RepoCallRequestStatus) {
		this.RepoCallRequestStatus = RepoCallRequestStatus;
	}

	public Optional<SecuritiesFinancingTransactionDetails35> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<SecuritiesFinancingTransactionDetails35> TransactionDetails) {
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