package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CustomerAccount4;
import com.tools20022.repository.dict.msg.AccountContract2;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.Organisation12;
import com.tools20022.repository.dict.msg.OperationMandate2;
import com.tools20022.repository.dict.msg.Group1;
import com.tools20022.repository.dict.msg.CashAccount24;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountOpeningRequest message is sent from an organisation to a financial
 * institution as part of the account opening process. It is the initial request
 * message to open an account.
 */
@PreviousVersion(AccountOpeningRequestV01.class)
public class AccountOpeningRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private Optional<OrganisationIdentification8> From;
	private CustomerAccount4 Account;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Organisation12 Organisation;
	private Optional<OperationMandate2> Mandate;
	private Optional<Group1> Group;
	private Optional<CashAccount24> ReferenceAccount;
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

	public CustomerAccount4 getAccount() {
		return Account;
	}

	public void setAccount(CustomerAccount4 Account) {
		this.Account = Account;
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

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation12 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation12 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<OperationMandate2> getMandate() {
		return Mandate;
	}

	public void setMandate(Optional<OperationMandate2> Mandate) {
		this.Mandate = Mandate;
	}

	public Optional<Group1> getGroup() {
		return Group;
	}

	public void setGroup(Optional<Group1> Group) {
		this.Group = Group;
	}

	public Optional<CashAccount24> getReferenceAccount() {
		return ReferenceAccount;
	}

	public void setReferenceAccount(Optional<CashAccount24> ReferenceAccount) {
		this.ReferenceAccount = ReferenceAccount;
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