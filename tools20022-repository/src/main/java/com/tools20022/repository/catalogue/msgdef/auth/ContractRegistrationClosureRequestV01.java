package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader1;
import com.tools20022.repository.dict.msg.RegisteredContract2;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationClosureRequest message is sent by the reporting party
 * to the registration agent to close the registered contract subject to
 * currency control.
 */
public class ContractRegistrationClosureRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader1 GroupHeader;
	private RegisteredContract2 RegisteredContractClosure;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader1 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader1 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RegisteredContract2 getRegisteredContractClosure() {
		return RegisteredContractClosure;
	}

	public void setRegisteredContractClosure(
			RegisteredContract2 RegisteredContractClosure) {
		this.RegisteredContractClosure = RegisteredContractClosure;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}