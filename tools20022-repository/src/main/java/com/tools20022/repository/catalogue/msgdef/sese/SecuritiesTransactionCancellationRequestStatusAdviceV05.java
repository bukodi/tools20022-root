package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Identification14;
import com.tools20022.repository.dict.msg.TransactionIdentifications30;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus54Choice;
import com.tools20022.repository.dict.msg.TransactionDetails80;
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
@PreviousVersion(SecuritiesTransactionCancellationRequestStatusAdviceV04.class)
public class SecuritiesTransactionCancellationRequestStatusAdviceV05 {

	private Identification14 CancellationRequestReference;
	private Optional<TransactionIdentifications30> TransactionIdentification;
	private ProcessingStatus54Choice ProcessingStatus;
	private Optional<TransactionDetails80> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification14 getCancellationRequestReference() {
		return CancellationRequestReference;
	}

	public void setCancellationRequestReference(
			Identification14 CancellationRequestReference) {
		this.CancellationRequestReference = CancellationRequestReference;
	}

	public Optional<TransactionIdentifications30> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications30> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ProcessingStatus54Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus54Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<TransactionDetails80> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails80> TransactionDetails) {
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