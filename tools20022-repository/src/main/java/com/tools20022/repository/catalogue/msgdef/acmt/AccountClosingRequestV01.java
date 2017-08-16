package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountClosingRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.AccountContract4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountClosingRequest message is sent from an organisation to a
 * financial institution as part of the account closing process. It is the
 * initial request message to close an account. Usage This message is the
 * initial request message to close an account. It could be sent together with
 * other related documents.
 */
@NextVersion(AccountClosingRequestV02.class)
public class AccountClosingRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References4 References;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private OrganisationIdentification6 OrganisationIdentification;
	private Optional<AccountContract4> ContractDates;
	private Optional<AccountForAction1> BalanceTransferAccount;
	private Optional<BranchAndFinancialInstitutionIdentification4> TransferAccountServicerIdentification;
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

	public Optional<AccountContract4> getContractDates() {
		return ContractDates;
	}

	public void setContractDates(Optional<AccountContract4> ContractDates) {
		this.ContractDates = ContractDates;
	}

	public Optional<AccountForAction1> getBalanceTransferAccount() {
		return BalanceTransferAccount;
	}

	public void setBalanceTransferAccount(
			Optional<AccountForAction1> BalanceTransferAccount) {
		this.BalanceTransferAccount = BalanceTransferAccount;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getTransferAccountServicerIdentification() {
		return TransferAccountServicerIdentification;
	}

	public void setTransferAccountServicerIdentification(
			Optional<BranchAndFinancialInstitutionIdentification4> TransferAccountServicerIdentification) {
		this.TransferAccountServicerIdentification = TransferAccountServicerIdentification;
	}

	public Optional<PartyAndSignature1> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature1> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}