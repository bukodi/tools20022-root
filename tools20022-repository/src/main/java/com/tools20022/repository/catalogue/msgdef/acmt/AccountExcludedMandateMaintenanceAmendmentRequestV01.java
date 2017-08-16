package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.AccountContract2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.CustomerAccount1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.Organisation6;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountExcludedMandateMaintenanceAmendmentRequest message is sent
 * from an organisation to a financial institution as part of the account
 * maintenance process. It is sent in response to a request from the financial
 * institution to send additional information. Usage This update is about
 * account details excluding any mandate information. The organisation will
 * specify under the Account and Organisation tags the complete information as
 * it should be in the financial institutions records after processing the
 * update request.
 */
@NextVersion(AccountExcludedMandateMaintenanceAmendmentRequestV02.class)
public class AccountExcludedMandateMaintenanceAmendmentRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private CustomerAccount1 Account;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Organisation6 Organisation;
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

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}