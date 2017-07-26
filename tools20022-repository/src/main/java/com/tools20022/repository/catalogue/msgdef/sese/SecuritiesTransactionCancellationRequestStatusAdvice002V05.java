package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.dict.msg.Identification16;
import com.tools20022.repository.dict.msg.TransactionIdentifications39;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus65Choice;
import com.tools20022.repository.dict.msg.TransactionDetails88;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends an
 * SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to
 * advise the status of a securities transaction cancellation request previously
 * sent by the account owner. The account servicer/owner relationship may be: -
 * a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
public class SecuritiesTransactionCancellationRequestStatusAdvice002V05 {

	private Identification16 CancellationRequestReference;
	private Optional<TransactionIdentifications39> TransactionIdentification;
	private ProcessingStatus65Choice ProcessingStatus;
	private Optional<TransactionDetails88> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification16 getCancellationRequestReference() {
		return CancellationRequestReference;
	}

	public void setCancellationRequestReference(
			Identification16 CancellationRequestReference) {
		this.CancellationRequestReference = CancellationRequestReference;
	}

	public Optional<TransactionIdentifications39> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications39> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ProcessingStatus65Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus65Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<TransactionDetails88> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails88> TransactionDetails) {
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