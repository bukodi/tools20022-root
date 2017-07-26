package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionModificationStatusAdviceV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionModificationStatusAdviceV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.RequestDetails13;
import com.tools20022.repository.dict.choice.ProcessingStatus18Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementConditionsModificationStatusAdvice to an account owner to
 * advise the status of a modification request previously instructed by the
 * account owner. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants - an agent (sub-custodian) acting on behalf of
 * their global custodian customer, or - a custodian acting on behalf of an
 * investment management institution or a broker/dealer.
 * 
 * Usage A SecuritiesSettlementConditionsModificationRequest may contain
 * requests on multiple transactions. However, one
 * SecuritiesSettlementConditionsModificationStatusAdvice must be sent per
 * transaction modified unless the
 * SecuritiesSettlementConditionsModificationRequest is rejected as a whole. The
 * message may also be used to: - re-send a message previously sent, - provide a
 * third party with a copy of a message for information, - re-send to a third
 * party a copy of a message for information using the relevant elements in the
 * Business Application Header.
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
@PreviousVersion(SecuritiesSettlementConditionModificationStatusAdviceV04.class)
@NextVersion(SecuritiesSettlementConditionModificationStatusAdviceV06.class)
public class SecuritiesSettlementConditionModificationStatusAdviceV05 {

	private Identification1 RequestReference;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private Optional<SecuritiesAccount13> SafekeepingAccount;
	private Optional<RequestDetails13> RequestDetails;
	private ProcessingStatus18Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification1 getRequestReference() {
		return RequestReference;
	}

	public void setRequestReference(Identification1 RequestReference) {
		this.RequestReference = RequestReference;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount13> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount13> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<RequestDetails13> getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(Optional<RequestDetails13> RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public ProcessingStatus18Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus18Choice ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}