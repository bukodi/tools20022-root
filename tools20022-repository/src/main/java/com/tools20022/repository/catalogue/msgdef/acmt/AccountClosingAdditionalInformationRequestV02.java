package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountClosingAdditionalInformationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References3;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountClosingAdditionalInformationRequest message is sent from a
 * financial institution to an organisation as part of the account closing
 * process. This message is sent in response to a closing request message from
 * the organisation, if the business content is valid, but additional
 * information is required.
 */
@PreviousVersion(AccountClosingAdditionalInformationRequestV01.class)
public class AccountClosingAdditionalInformationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References3 References;
	private Optional<OrganisationIdentification8> From;
	private OrganisationIdentification8 OrganisationIdentification;
	private AccountForAction1 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Optional<AccountForAction1> BalanceTransferAccount;
	private Optional<BranchAndFinancialInstitutionIdentification5> TransferAccountServicerIdentification;
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

	public Optional<AccountForAction1> getBalanceTransferAccount() {
		return BalanceTransferAccount;
	}

	public void setBalanceTransferAccount(
			Optional<AccountForAction1> BalanceTransferAccount) {
		this.BalanceTransferAccount = BalanceTransferAccount;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getTransferAccountServicerIdentification() {
		return TransferAccountServicerIdentification;
	}

	public void setTransferAccountServicerIdentification(
			Optional<BranchAndFinancialInstitutionIdentification5> TransferAccountServicerIdentification) {
		this.TransferAccountServicerIdentification = TransferAccountServicerIdentification;
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