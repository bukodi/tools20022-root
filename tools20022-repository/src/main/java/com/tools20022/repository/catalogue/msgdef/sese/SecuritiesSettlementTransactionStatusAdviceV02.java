package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionStatusAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionStatusAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications9;
import com.tools20022.repository.dict.choice.ProcessingStatus1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.MatchingStatus2Choice;
import com.tools20022.repository.dict.choice.SettlementStatus2Choice;
import com.tools20022.repository.dict.msg.TransactionDetails22;
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
 * management institution or a broker/dealer. using the relevant elements in the
 * Business Application Header. Usage The message may also be used to: - re-send
 * a message previously sent, - provide a third party with a copy of a message
 * for information, - re-send to a third party a copy of a message for
 * information. using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesSettlementTransactionStatusAdviceV01.class)
@NextVersion(SecuritiesSettlementTransactionStatusAdviceV03.class)
public class SecuritiesSettlementTransactionStatusAdviceV02 {

	private TransactionIdentifications9 TransactionIdentification;
	private Optional<ProcessingStatus1Choice> ProcessingStatus;
	private Optional<MatchingStatus2Choice> InferredMatchingStatus;
	private Optional<MatchingStatus2Choice> MatchingStatus;
	private Optional<SettlementStatus2Choice> SettlementStatus;
	private Optional<TransactionDetails22> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications9 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications9 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<ProcessingStatus1Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus1Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus2Choice> getInferredMatchingStatus() {
		return InferredMatchingStatus;
	}

	public void setInferredMatchingStatus(
			Optional<MatchingStatus2Choice> InferredMatchingStatus) {
		this.InferredMatchingStatus = InferredMatchingStatus;
	}

	public Optional<MatchingStatus2Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(Optional<MatchingStatus2Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<SettlementStatus2Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus2Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<TransactionDetails22> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails22> TransactionDetails) {
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