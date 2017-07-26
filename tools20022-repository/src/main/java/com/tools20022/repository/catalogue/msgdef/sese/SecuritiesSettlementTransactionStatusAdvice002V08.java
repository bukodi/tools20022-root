package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionStatusAdvice002V07;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications38;
import com.tools20022.repository.dict.msg.Linkages50;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus63Choice;
import com.tools20022.repository.dict.choice.MatchingStatus32Choice;
import com.tools20022.repository.dict.choice.SettlementStatus22Choice;
import com.tools20022.repository.dict.msg.TransactionDetails100;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a SecuritiesSettlementTransactionStatusAdvice
 * to an account owner to advise the status of a securities settlement
 * transaction instruction previously sent by the account owner or the status of
 * a settlement transaction existing in the books of the servicer for the
 * account of the owner. The status may be a processing, pending processing,
 * internal matching, matching and/or settlement status. The status advice may
 * be sent as a response to the request of the account owner or not. The account
 * servicer/owner relationship may be: - a central securities depository or
 * another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionStatusAdvice002V07.class)
public class SecuritiesSettlementTransactionStatusAdvice002V08 {

	private TransactionIdentifications38 TransactionIdentification;
	private Optional<Linkages50> Linkages;
	private Optional<ProcessingStatus63Choice> ProcessingStatus;
	private Optional<MatchingStatus32Choice> InferredMatchingStatus;
	private Optional<MatchingStatus32Choice> MatchingStatus;
	private Optional<SettlementStatus22Choice> SettlementStatus;
	private Optional<TransactionDetails100> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications38 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications38 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Linkages50> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages50> Linkages) {
		this.Linkages = Linkages;
	}

	public Optional<ProcessingStatus63Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus63Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus32Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus32Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<MatchingStatus32Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(
			Optional<MatchingStatus32Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<SettlementStatus22Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus22Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<TransactionDetails100> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails100> TransactionDetails) {
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