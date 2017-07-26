package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountClosingRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References4;
import com.tools20022.repository.dict.msg.OrganisationIdentification8;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AccountForAction2;
import com.tools20022.repository.dict.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.dict.msg.Organisation14;
import com.tools20022.repository.dict.msg.AccountContract4;
import com.tools20022.repository.dict.msg.AccountForAction1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The AccountClosingRequest message is sent from an organisation to a financial
 * institution as part of the account closing process. It is the initial request
 * message to close an account.
 */
@PreviousVersion(AccountClosingRequestV01.class)
public class AccountClosingRequestV02 {

	private References4 References;
	private Optional<OrganisationIdentification8> From;
	private AccountForAction2 AccountIdentification;
	private BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification;
	private Organisation14 OrganisationIdentification;
	private Optional<AccountContract4> ContractDates;
	private Optional<AccountForAction1> BalanceTransferAccount;
	private Optional<BranchAndFinancialInstitutionIdentification5> TransferAccountServicerIdentification;
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

	public AccountForAction2 getAccountIdentification() {
		return AccountIdentification;
	}

	public void setAccountIdentification(AccountForAction2 AccountIdentification) {
		this.AccountIdentification = AccountIdentification;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return AccountServicerIdentification;
	}

	public void setAccountServicerIdentification(
			BranchAndFinancialInstitutionIdentification5 AccountServicerIdentification) {
		this.AccountServicerIdentification = AccountServicerIdentification;
	}

	public Organisation14 getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			Organisation14 OrganisationIdentification) {
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