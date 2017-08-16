package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.StatusResponse1Code;
import com.tools20022.repository.dict.choice.SearchCriteria1Choice;
import com.tools20022.repository.dict.msg.ReturnIndicator1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * This message is sent by the financial institution to the authorities (police,
 * customs, tax authorities, enforcement authorities) to provide a part or all
 * of the requested information. The financial institution previously received a
 * request for financial information in the scope of a financial investigation.
 * 
 * Depending on whether the response can be provided STP within the authorities
 * financial investigations messages, the requested information may be •
 * provided in part or in full within the response message itself, or • only
 * referred to in the response message
 */
public class InformationRequestResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text ResponseIdentification;
	private Max35Text InvestigationIdentification;
	private StatusResponse1Code ResponseStatus;
	private SearchCriteria1Choice SearchCriteria;
	private ReturnIndicator1 ReturnIndicator;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getResponseIdentification() {
		return ResponseIdentification;
	}

	public void setResponseIdentification(Max35Text ResponseIdentification) {
		this.ResponseIdentification = ResponseIdentification;
	}

	public Max35Text getInvestigationIdentification() {
		return InvestigationIdentification;
	}

	public void setInvestigationIdentification(
			Max35Text InvestigationIdentification) {
		this.InvestigationIdentification = InvestigationIdentification;
	}

	public StatusResponse1Code getResponseStatus() {
		return ResponseStatus;
	}

	public void setResponseStatus(StatusResponse1Code ResponseStatus) {
		this.ResponseStatus = ResponseStatus;
	}

	public SearchCriteria1Choice getSearchCriteria() {
		return SearchCriteria;
	}

	public void setSearchCriteria(SearchCriteria1Choice SearchCriteria) {
		this.SearchCriteria = SearchCriteria;
	}

	public ReturnIndicator1 getReturnIndicator() {
		return ReturnIndicator;
	}

	public void setReturnIndicator(ReturnIndicator1 ReturnIndicator) {
		this.ReturnIndicator = ReturnIndicator;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}