package com.tools20022.repository.catalogue.msgdef.supl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.AccountAndParties2;

/**
 * This extends the message InformationRequestResponse.
 */
public class InformationResponseSD1V01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text InvestigationIdentification;
	private ISODateTime CreationDateTime;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private AccountAndParties2 AccountAndParties;

	public Max35Text getInvestigationIdentification() {
		return InvestigationIdentification;
	}

	public void setInvestigationIdentification(
			Max35Text InvestigationIdentification) {
		this.InvestigationIdentification = InvestigationIdentification;
	}

	public ISODateTime getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(ISODateTime CreationDateTime) {
		this.CreationDateTime = CreationDateTime;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public AccountAndParties2 getAccountAndParties() {
		return AccountAndParties;
	}

	public void setAccountAndParties(AccountAndParties2 AccountAndParties) {
		this.AccountAndParties = AccountAndParties;
	}
}