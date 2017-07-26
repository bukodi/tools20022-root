package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementConditionModificationStatusAdviceV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Identification14;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.RequestDetails15;
import com.tools20022.repository.dict.choice.ProcessingStatus50Choice;
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
@PreviousVersion(SecuritiesSettlementConditionModificationStatusAdviceV06.class)
public class SecuritiesSettlementConditionModificationStatusAdviceV07 {

	private Identification14 RequestReference;
	private Optional<PartyIdentification98> AccountOwner;
	private Optional<SecuritiesAccount19> SafekeepingAccount;
	private Optional<RequestDetails15> RequestDetails;
	private ProcessingStatus50Choice ProcessingStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification14 getRequestReference() {
		return RequestReference;
	}

	public void setRequestReference(Identification14 RequestReference) {
		this.RequestReference = RequestReference;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(
			Optional<SecuritiesAccount19> SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<RequestDetails15> getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(Optional<RequestDetails15> RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public ProcessingStatus50Choice getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatus50Choice ProcessingStatus) {
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