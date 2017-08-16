package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Identification16;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.RequestDetails16;
import com.tools20022.repository.dict.choice.ProcessingStatus58Choice;
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
 */
public class SecuritiesSettlementConditionModificationStatusAdvice002V07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Identification16 RequestReference;
	private Optional<PartyIdentification109> AccountOwner;
	private Optional<SecuritiesAccount30> SafekeepingAccount;
	private Optional<RequestDetails16> RequestDetails;
	private ProcessingStatus58Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification16 getRequestReference() {
		return RequestReference;
	}

	public void setRequestReference(Identification16 RequestReference) {
		this.RequestReference = RequestReference;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount30> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount30> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<RequestDetails16> getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(Optional<RequestDetails16> RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public ProcessingStatus58Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus58Choice ProcessingStatus) {
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