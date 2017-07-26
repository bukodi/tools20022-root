package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningAdditionalInformationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.CustomerAccount1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.ContractDocument1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountOpeningAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of the account opening
 * process. This message is sent in response to an opening request message from
 * the organisation, if the business content is valid, but additional
 * information is required. Usage This message should only be sent if additional
 * information is required as part of the account opening process.
 */
@NextVersion(AccountOpeningAdditionalInformationRequestV02.class)
public class AccountOpeningAdditionalInformationRequestV01 {

	private References3 References;
	private OrganisationIdentification6 OrganisationIdentification;
	private CustomerAccount1 Account;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References3 getReferences() {
		return References;
	}

	public void setReferences(References3 References) {
		this.References = References;
	}

	public OrganisationIdentification6 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification6 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
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

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return UnderlyingMasterAgreement;
	}

	public void setUnderlyingMasterAgreement(
			Optional<ContractDocument1> UnderlyingMasterAgreement) {
		this.UnderlyingMasterAgreement = UnderlyingMasterAgreement;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}