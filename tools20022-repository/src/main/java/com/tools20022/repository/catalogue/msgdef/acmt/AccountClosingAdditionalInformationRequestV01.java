package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountClosingAdditionalInformationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification6;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature1;

/**
 * Scope The AccountClosingAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of the account closing
 * process. Usage This message is sent in response to an closing request message
 * from the organisation, if the business content is valid, but additional
 * information is required.
 */
@NextVersion(AccountClosingAdditionalInformationRequestV02.class)
public class AccountClosingAdditionalInformationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References3 References;
	private OrganisationIdentification6 OrganisationIdentification;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification4 AccountServicerIdentification;
	private Optional<AccountForAction1> BalanceTransferAccount;
	private Optional<BranchAndFinancialInstitutionIdentification4> TransferAccountServicerIdentification;
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