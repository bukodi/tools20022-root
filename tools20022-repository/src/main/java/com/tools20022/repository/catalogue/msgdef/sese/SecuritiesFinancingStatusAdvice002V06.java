package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingStatusAdvice002V07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications35;
import com.tools20022.repository.dict.choice.ProcessingStatus57Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.MatchingStatus29Choice;
import com.tools20022.repository.dict.choice.SettlementStatus21Choice;
import com.tools20022.repository.dict.choice.RepoCallRequestStatus9Choice;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails33;
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
@NextVersion(SecuritiesFinancingStatusAdvice002V07.class)
public class SecuritiesFinancingStatusAdvice002V06 {

	private TransactionIdentifications35 TransactionIdentification;
	private Optional<ProcessingStatus57Choice> ProcessingStatus;
	private Optional<MatchingStatus29Choice> MatchingStatus;
	private Optional<MatchingStatus29Choice> InferredMatchingStatus;
	private Optional<SettlementStatus21Choice> SettlementStatus;
	private Optional<RepoCallRequestStatus9Choice> RepoCallRequestStatus;
	private Optional<SecuritiesFinancingTransactionDetails33> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications35 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications35 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<ProcessingStatus57Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus57Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus29Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(
			Optional<MatchingStatus29Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<MatchingStatus29Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus29Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<SettlementStatus21Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus21Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<RepoCallRequestStatus9Choice> getRepoCallRequestStatus() {
		return RepoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(
			Optional<RepoCallRequestStatus9Choice> RepoCallRequestStatus) {
		this.RepoCallRequestStatus = RepoCallRequestStatus;
	}

	public Optional<SecuritiesFinancingTransactionDetails33> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<SecuritiesFinancingTransactionDetails33> TransactionDetails) {
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