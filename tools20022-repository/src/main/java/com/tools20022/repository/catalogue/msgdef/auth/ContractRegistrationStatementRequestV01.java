package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.CurrencyControlHeader1;
import com.tools20022.repository.dict.msg.ContractRegistrationStatementRequest1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The ContractRegistrationStatementRequest message is sent by the reporting
 * party to the registration agent to request for a statement of the operations
 * related to the registered contract subject to currency control.
 */
public class ContractRegistrationStatementRequestV01 {

	private CurrencyControlHeader1 GroupHeader;
	private ContractRegistrationStatementRequest1 StatementRequest;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader1 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader1 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public ContractRegistrationStatementRequest1 getStatementRequest() {
		return StatementRequest;
	}

	public void setStatementRequest(
			ContractRegistrationStatementRequest1 StatementRequest) {
		this.StatementRequest = StatementRequest;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}