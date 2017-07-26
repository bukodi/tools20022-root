package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountReportRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.AccountContract2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountReportRequest message is sent from an organisation to a
 * financial institution for reporting purposes. It is a request for an account
 * report. Usage This message can be sent at any time outside of account
 * opening, maintenance or closing processes.
 */
@NextVersion(AccountReportRequestV02.class)
public class AccountReportRequestV01 {

	private References4 References;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private OrganisationIdentification6 OrganisationIdentification;
	private Optional<AccountContract2> ContractDates;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References4 getReferences() {
		return References;
	}

	public void setReferences(References4 References) {
		this.References = References;
	}

	public AccountForAction1 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(AccountForAction1 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public OrganisationIdentification6 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification6 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public Optional<AccountContract2> getContractDates() {
		return ContractDates;
	}

	public void setContractDates(Optional<AccountContract2> ContractDates) {
		this.ContractDates = ContractDates;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}