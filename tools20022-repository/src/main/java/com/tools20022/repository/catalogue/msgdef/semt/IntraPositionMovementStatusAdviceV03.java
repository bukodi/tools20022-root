package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementStatusAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementStatusAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentifications15;
import com.tools20022.repository.dict.choice.IntraPositionProcessingStatus3Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.SettlementStatus9Choice;
import com.tools20022.repository.dict.msg.IntraPositionDetails19;
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
@PreviousVersion(IntraPositionMovementStatusAdviceV02.class)
@NextVersion(IntraPositionMovementStatusAdviceV04.class)
public class IntraPositionMovementStatusAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionIdentifications15 TransactionIdentification;
	private Optional<IntraPositionProcessingStatus3Choice> ProcessingStatus;
	private Optional<SettlementStatus9Choice> SettlementStatus;
	private Optional<IntraPositionDetails19> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentifications15 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentifications15 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<IntraPositionProcessingStatus3Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<IntraPositionProcessingStatus3Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SettlementStatus9Choice> getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			Optional<SettlementStatus9Choice> SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public Optional<IntraPositionDetails19> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<IntraPositionDetails19> TransactionDetails) {
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