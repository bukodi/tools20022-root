package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningAdditionalInformationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CustomerAccount4;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountOpeningAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of the account opening
 * process. This message is sent in response to an opening request message from
 * the organisation, if the business content is valid, but additional
 * information is required.
 */
@PreviousVersion(AccountOpeningAdditionalInformationRequestV01.class)
public class AccountOpeningAdditionalInformationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References3 References;
	private Optional<OrganisationIdentification8> From;
	private OrganisationIdentification8 OrganisationIdentification;
	private CustomerAccount4 Account;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private Optional<PartyAndSignature2> DigitalSignature;
	private Optional<SupplementaryData1> SupplementaryData;

	public References3 getReferences() {
		return References;
	}

	public void setReferences(References3 References) {
		this.References = References;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return From;
	}

	public void setFrom(Optional<OrganisationIdentification8> From) {
		this.From = From;
	}

	public OrganisationIdentification8 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification8 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public CustomerAccount4 getAccount() {
		return Account;
	}

	public void setAccount(CustomerAccount4 Account) {
		this.Account = Account;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return UnderlyingMasterAgreement;
	}

	public void setUnderlyingMasterAgreement(
			Optional<ContractDocument1> UnderlyingMasterAgreement) {
		this.UnderlyingMasterAgreement = UnderlyingMasterAgreement;
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