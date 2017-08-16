package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountContract2;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.CustomerAccountModification1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.OrganisationModification1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountExcludedMandateMaintenanceAmendmentRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is sent in response to a request from the financial institution
 * to send additional information. Usage: this update is about account details
 * excluding any mandate information. If modification codes are not used: the
 * organisation will specify under the “Account” and “Organisation” tags the
 * complete information as it should be in the financial institution’s records
 * after processing the update request. If modification codes are used (in that
 * case, they must be used everywhere): the organisation will specify under the
 * “Account” and “Organisation” tags which elements must be added, deleted,
 * modified, or if they are unchanged.
 */
@PreviousVersion(AccountExcludedMandateMaintenanceAmendmentRequestV01.class)
public class AccountExcludedMandateMaintenanceAmendmentRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private Optional<OrganisationIdentification8> From;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private CustomerAccountModification1 Account;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private OrganisationModification1 Organisation;
	private Optional<PartyAndSignature2> DigitalSignature;
	private Optional<SupplementaryData1> SupplementaryData;

	public References4 getReferences() {
		return References;
	}

	public void setReferences(References4 References) {
		this.References = References;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return From;
	}

	public void setFrom(Optional<OrganisationIdentification8> From) {
		this.From = From;
	}

	public Optional<AccountContract2> getContractDates() {
		return ContractDates;
	}

	public void setContractDates(Optional<AccountContract2> ContractDates) {
		this.ContractDates = ContractDates;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return UnderlyingMasterAgreement;
	}

	public void setUnderlyingMasterAgreement(
			Optional<ContractDocument1> UnderlyingMasterAgreement) {
		this.UnderlyingMasterAgreement = UnderlyingMasterAgreement;
	}

	public CustomerAccountModification1 getAccount() {
		return Account;
	}

	public void setAccount(CustomerAccountModification1 Account) {
		this.Account = Account;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public OrganisationModification1 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(OrganisationModification1 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}