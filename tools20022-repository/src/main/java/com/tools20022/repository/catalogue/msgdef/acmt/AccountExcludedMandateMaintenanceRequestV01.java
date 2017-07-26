package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountExcludedMandateMaintenanceRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.AccountContract2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.CustomerAccount1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.Organisation6;
import com.tools20022.repository.dict.msg.AdditionalInformation5;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope This AccountExcludedMandateMaintenanceRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is the initial request message to update an account. Usage This
 * update is about account details excluding any mandate information. The
 * organisation will specify under the Account and Organisation tags the
 * complete information as it should be in the financial institutions records
 * after processing the update request.
 */
@NextVersion(AccountExcludedMandateMaintenanceRequestV02.class)
public class AccountExcludedMandateMaintenanceRequestV01 {

	private References4 References;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private CustomerAccount1 Account;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Organisation6 Organisation;
	private Optional<AdditionalInformation5> AdditionalMessageInformation;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References4 getReferences() {
		return References;
	}

	public void setReferences(References4 References) {
		this.References = References;
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

	public CustomerAccount1 getAccount() {
		return Account;
	}

	public void setAccount(CustomerAccount1 Account) {
		this.Account = Account;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation6 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation6 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<AdditionalInformation5> getAdditionalMessageInformation() {
		return AdditionalMessageInformation;
	}

	public void setAdditionalMessageInformation(
			Optional<AdditionalInformation5> AdditionalMessageInformation) {
		this.AdditionalMessageInformation = AdditionalMessageInformation;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}