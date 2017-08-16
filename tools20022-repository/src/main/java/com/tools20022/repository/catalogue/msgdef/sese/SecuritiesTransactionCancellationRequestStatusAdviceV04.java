package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.msg.TransactionIdentifications17;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus45Choice;
import com.tools20022.repository.dict.msg.TransactionDetails30;
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
@PreviousVersion(SecuritiesTransactionCancellationRequestStatusAdviceV03.class)
@NextVersion(SecuritiesTransactionCancellationRequestStatusAdviceV05.class)
public class SecuritiesTransactionCancellationRequestStatusAdviceV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Identification1 CancellationRequestReference;
	private Optional<TransactionIdentifications17> TransactionIdentification;
	private ProcessingStatus45Choice ProcessingStatus;
	private Optional<TransactionDetails30> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification1 getCancellationRequestReference() {
		return CancellationRequestReference;
	}

	public void setCancellationRequestReference(
			Identification1 CancellationRequestReference) {
		this.CancellationRequestReference = CancellationRequestReference;
	}

	public Optional<TransactionIdentifications17> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications17> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ProcessingStatus45Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus45Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<TransactionDetails30> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails30> TransactionDetails) {
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