package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader2;
import com.tools20022.repository.dict.msg.RegisteredContract4;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationConfirmation message is sent by the registration
 * agent to the reporting party to register the contract subject to currency
 * control.
 */
public class ContractRegistrationConfirmationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader2 GroupHeader;
	private RegisteredContract4 RegisteredContract;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader2 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader2 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RegisteredContract4 getRegisteredContract() {
		return RegisteredContract;
	}

	public void setRegisteredContract(RegisteredContract4 RegisteredContract) {
		this.RegisteredContract = RegisteredContract;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}