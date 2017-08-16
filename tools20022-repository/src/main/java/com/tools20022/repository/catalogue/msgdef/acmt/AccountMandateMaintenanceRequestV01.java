package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountMandateMaintenanceRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.AccountContract2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.OperationMandate1;
import com.tools20022.repository.dict.msg.AdditionalInformation5;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountMandateMaintenanceRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is the initial request message to update an account. This update
 * is only about mandate information. Usage This message should only be used for
 * initiating the maintenance process of mandate information. This update is
 * only about mandate information. The organisation will specify under the
 * Mandate tag the complete information as it should be in the financial
 * institutions records after processing the update request. It is not possible
 * to update the account characteristics or organisation information with this
 * message. It is possible to request to update the mandate information of
 * several accounts, if these accounts must have exactly the same mandates. This
 * message could be sent together with other related documents.
 */
@NextVersion(AccountMandateMaintenanceRequestV02.class)
public class AccountMandateMaintenanceRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private OrganisationIdentification6 OrganisationIdentification;
	private OperationMandate1 Mandate;
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

	public OperationMandate1 getMandate() {
		return Mandate;
	}

	public void setMandate(OperationMandate1 Mandate) {
		this.Mandate = Mandate;
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