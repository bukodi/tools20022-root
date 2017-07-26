package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementStatusAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementStatusAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications10;
import com.tools20022.repository.dict.choice.IntraPositionProcessingStatus1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.SettlementStatus2Choice;
import com.tools20022.repository.dict.msg.IntraPositionDetails9;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a IntraPositionMovementStatusAdvice to an
 * account owner to advise the status of a intra-position movement instruction
 * previously sent by the account owner. The account servicer/owner relationship
 * may be: - a central securities depository or another settlement market
 * infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer. Usage The message may also be used to: - re-send a message
 * previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(IntraPositionMovementStatusAdviceV01.class)
@NextVersion(IntraPositionMovementStatusAdviceV03.class)
public class IntraPositionMovementStatusAdviceV02 {

	private TransactionIdentifications10 TransactionIdentification;
	private Optional<IntraPositionProcessingStatus1Choice> ProcessingStatus;
	private Optional<SettlementStatus2Choice> SettlementStatus;
	private Optional<IntraPositionDetails9> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications10 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications10 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<IntraPositionProcessingStatus1Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<IntraPositionProcessingStatus1Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SettlementStatus2Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus2Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<IntraPositionDetails9> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<IntraPositionDetails9> TransactionDetails) {
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