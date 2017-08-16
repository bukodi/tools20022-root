package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountMandateMaintenanceAmendmentRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountContract2;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.OperationMandate3;
import com.tools20022.repository.dict.msg.Group2;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountMandateMaintenanceAmendmentRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is sent in response to a request from the financial institution
 * to send additional information. Usage: this update is only about mandate
 * information. If modification codes are not used: the organisation will
 * specify under the “Mandate” and “Group” tags the complete information as it
 * should be in the financial institution’s records after processing the update
 * request. If modification codes are used (in that case, they must be used
 * everywhere): the organisation will specify under the “Mandate” and “Group”
 * tags which elements must be added, deleted, modified, or if they are
 * unchanged. It is not possible to update the account characteristics or
 * organisation information with this message.
 */
@PreviousVersion(AccountMandateMaintenanceAmendmentRequestV01.class)
public class AccountMandateMaintenanceAmendmentRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private Optional<OrganisationIdentification8> From;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private OrganisationIdentification8 OrganisationIdentification;
	private Optional<OperationMandate3> Mandate;
	private Optional<Group2> Group;
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

	public AccountForAction1 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(AccountForAction1 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public OrganisationIdentification8 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification8 OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public Optional<OperationMandate3> getMandate() {
		return Mandate;
	}

	public void setMandate(Optional<OperationMandate3> Mandate) {
		this.Mandate = Mandate;
	}

	public Optional<Group2> getGroup() {
		return Group;
	}

	public void setGroup(Optional<Group2> Group) {
		this.Group = Group;
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