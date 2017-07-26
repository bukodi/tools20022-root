package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.CurrencyControlHeader1;
import com.tools20022.repository.dict.msg.RegisteredContract1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationAmendmentRequest message is sent by the reporting
 * party to the registration agent to amend the registered contract subject to
 * currency control.
 */
public class ContractRegistrationAmendmentRequestV01 {

	private CurrencyControlHeader1 GroupHeader;
	private RegisteredContract1 ContractRegistrationAmendment;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader1 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader1 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RegisteredContract1 getContractRegistrationAmendment() {
		return ContractRegistrationAmendment;
	}

	public void setContractRegistrationAmendment(
			RegisteredContract1 ContractRegistrationAmendment) {
		this.ContractRegistrationAmendment = ContractRegistrationAmendment;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}