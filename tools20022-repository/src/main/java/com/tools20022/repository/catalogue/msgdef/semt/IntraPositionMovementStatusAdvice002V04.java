package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementStatusAdvice002V05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications34;
import com.tools20022.repository.dict.choice.IntraPositionProcessingStatus6Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.SettlementStatus20Choice;
import com.tools20022.repository.dict.msg.IntraPositionDetails38;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a IntraPositionMovementStatusAdvice to an
 * account owner to advise the status of a intra-position movement instruction
 * previously sent by the account owner. The account servicer/owner relationship
 * may be: - a central securities depository or another settlement market
 * infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information. using the relevant
 * elements in the Business Application Header.
 */
@NextVersion(IntraPositionMovementStatusAdvice002V05.class)
public class IntraPositionMovementStatusAdvice002V04 {

	private TransactionIdentifications34 TransactionIdentification;
	private Optional<IntraPositionProcessingStatus6Choice> ProcessingStatus;
	private Optional<SettlementStatus20Choice> SettlementStatus;
	private Optional<IntraPositionDetails38> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications34 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications34 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<IntraPositionProcessingStatus6Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<IntraPositionProcessingStatus6Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SettlementStatus20Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus20Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<IntraPositionDetails38> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<IntraPositionDetails38> TransactionDetails) {
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