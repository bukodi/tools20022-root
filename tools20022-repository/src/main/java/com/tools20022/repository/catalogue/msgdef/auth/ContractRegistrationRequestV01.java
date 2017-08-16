package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader1;
import com.tools20022.repository.dict.msg.ContractRegistration1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationRequest message is sent by the reporting party to the
 * registration agent to initiate the registration of a new contract subject to
 * currency control.
 */
public class ContractRegistrationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader1 GroupHeader;
	private ContractRegistration1 ContractRegistration;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader1 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader1 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public ContractRegistration1 getContractRegistration() {
		return ContractRegistration;
	}

	public void setContractRegistration(
			ContractRegistration1 ContractRegistration) {
		this.ContractRegistration = ContractRegistration;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}