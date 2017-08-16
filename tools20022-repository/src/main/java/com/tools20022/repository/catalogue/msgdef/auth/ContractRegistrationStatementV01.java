package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader2;
import com.tools20022.repository.dict.msg.ContractRegistrationStatement1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationStatement message is sent by the registration agent
 * to the reporting party, in response to a request or at a pre-agreed date, to
 * send a statement of the operations related to the registered contract subject
 * to currency control.
 */
public class ContractRegistrationStatementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader2 GroupHeader;
	private ContractRegistrationStatement1 Statement;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader2 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader2 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public ContractRegistrationStatement1 getStatement() {
		return Statement;
	}

	public void setStatement(ContractRegistrationStatement1 Statement) {
		this.Statement = Statement;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}