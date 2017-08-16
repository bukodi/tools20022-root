package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.CustomerAccount1;
import com.tools20022.repository.dict.msg.AccountContract2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ContractDocument1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.Organisation7;
import com.tools20022.repository.dict.msg.OperationMandate1;
import com.tools20022.repository.dict.msg.CashAccount16;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountOpeningRequest message is sent from an organisation to a
 * financial institution as part of the account opening process. It is the
 * initial request to open an account. Usage This message should only be used
 * for initiating the account opening process. It could be sent together with
 * other related documents.
 */
@NextVersion(AccountOpeningRequestV02.class)
public class AccountOpeningRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private CustomerAccount1 Account;
	private Optional<AccountContract2> ContractDates;
	private Optional<ContractDocument1> UnderlyingMasterAgreement;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Organisation7 Organisation;
	private Optional<OperationMandate1> Mandate;
	private Optional<CashAccount16> ReferenceAccount;
	private Optional<PartyAndSignature1> DigitalSignature;

	public References4 getReferences() {
		return References;
	}

	public void setReferences(References4 References) {
		this.References = References;
	}

	public CustomerAccount1 getAccount() {
		return Account;
	}

	public void setAccount(CustomerAccount1 Account) {
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

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation7 getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation7 Organisation) {
		this.Organisation = Organisation;
	}

	public Optional<OperationMandate1> getMandate() {
		return Mandate;
	}

	public void setMandate(Optional<OperationMandate1> Mandate) {
		this.Mandate = Mandate;
	}

	public Optional<CashAccount16> getReferenceAccount() {
		return ReferenceAccount;
	}

	public void setReferenceAccount(Optional<CashAccount16> ReferenceAccount) {
		this.ReferenceAccount = ReferenceAccount;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}