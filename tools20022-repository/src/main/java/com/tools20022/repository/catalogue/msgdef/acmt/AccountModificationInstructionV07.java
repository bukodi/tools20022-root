package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentAccountModification3;
import com.tools20022.repository.dict.choice.AccountSelection2Choice;
import com.tools20022.repository.dict.msg.InvestmentAccount63;
import com.tools20022.repository.dict.msg.AccountParties16;
import java.util.List;
import com.tools20022.repository.dict.msg.ModificationScope38;
import com.tools20022.repository.dict.msg.ModificationScope33;
import com.tools20022.repository.dict.msg.ModificationScope21;
import com.tools20022.repository.dict.msg.ModificationScope37;
import com.tools20022.repository.dict.msg.CashSettlement2;
import com.tools20022.repository.dict.msg.ModificationScope31;
import com.tools20022.repository.dict.msg.ModificationScope35;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The AccountModificationInstruction message is sent by an account owner,
 * for example, an investor or its designated agent to the account servicer, for
 * example, a registrar, transfer agent, custodian bank or securities depository
 * to modify, that is, create, update or delete specific details of an existing
 * account. Usage The AccountModificationInstruction message is used to modify
 * the details of an existing account. The AccountModificationInstruction
 * message can be used to: - maintain/update any of the existing account
 * details, for example, to update the address of the beneficiary or modify the
 * preference to income from distribution to capitalisation, or, - add/create
 * specific details to the existing account when these details were not yet
 * recorded at the time of account creation, for example, to add a second
 * address or to establish new cash settlement standing instructions, or, -
 * delete specific account details, for example, delete cash standing
 * instructions, or, - instruct a change to the status of the account, for
 * example, instruct the closure of the account. The usage of this message may
 * be subject to service level agreement (SLA) between the counterparties.
 * Execution of the AccountModificationInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 */
@PreviousVersion(AccountModificationInstructionV06.class)
public class AccountModificationInstructionV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<InvestmentAccountModification3> InstructionDetails;
	private AccountSelection2Choice InvestmentAccountSelection;
	private Optional<InvestmentAccount63> ModifiedInvestmentAccount;
	private List<AccountParties16> ModifiedAccountParties;
	private List<ModificationScope38> ModifiedIntermediaries;
	private Optional<ModificationScope33> ModifiedPlacement;
	private Optional<ModificationScope21> ModifiedIssueAllocation;
	private List<ModificationScope37> ModifiedSavingsInvestmentPlan;
	private List<ModificationScope37> ModifiedWithdrawalInvestmentPlan;
	private List<CashSettlement2> ModifiedCashSettlement;
	private List<ModificationScope31> ModifiedServiceLevelAgreement;
	private Optional<ModificationScope35> ModifiedAdditionalInformation;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference6> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<InvestmentAccountModification3> getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			Optional<InvestmentAccountModification3> InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public AccountSelection2Choice getInvestmentAccountSelection() {
		return InvestmentAccountSelection;
	}

	public void setInvestmentAccountSelection(
			AccountSelection2Choice InvestmentAccountSelection) {
		this.InvestmentAccountSelection = InvestmentAccountSelection;
	}

	public Optional<InvestmentAccount63> getModifiedInvestmentAccount() {
		return ModifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(
			Optional<InvestmentAccount63> ModifiedInvestmentAccount) {
		this.ModifiedInvestmentAccount = ModifiedInvestmentAccount;
	}

	public List<AccountParties16> getModifiedAccountParties() {
		return ModifiedAccountParties;
	}

	public void setModifiedAccountParties(
			List<AccountParties16> ModifiedAccountParties) {
		this.ModifiedAccountParties = ModifiedAccountParties;
	}

	public List<ModificationScope38> getModifiedIntermediaries() {
		return ModifiedIntermediaries;
	}

	public void setModifiedIntermediaries(
			List<ModificationScope38> ModifiedIntermediaries) {
		this.ModifiedIntermediaries = ModifiedIntermediaries;
	}

	public Optional<ModificationScope33> getModifiedPlacement() {
		return ModifiedPlacement;
	}

	public void setModifiedPlacement(
			Optional<ModificationScope33> ModifiedPlacement) {
		this.ModifiedPlacement = ModifiedPlacement;
	}

	public Optional<ModificationScope21> getModifiedIssueAllocation() {
		return ModifiedIssueAllocation;
	}

	public void setModifiedIssueAllocation(
			Optional<ModificationScope21> ModifiedIssueAllocation) {
		this.ModifiedIssueAllocation = ModifiedIssueAllocation;
	}

	public List<ModificationScope37> getModifiedSavingsInvestmentPlan() {
		return ModifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(
			List<ModificationScope37> ModifiedSavingsInvestmentPlan) {
		this.ModifiedSavingsInvestmentPlan = ModifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope37> getModifiedWithdrawalInvestmentPlan() {
		return ModifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(
			List<ModificationScope37> ModifiedWithdrawalInvestmentPlan) {
		this.ModifiedWithdrawalInvestmentPlan = ModifiedWithdrawalInvestmentPlan;
	}

	public List<CashSettlement2> getModifiedCashSettlement() {
		return ModifiedCashSettlement;
	}

	public void setModifiedCashSettlement(
			List<CashSettlement2> ModifiedCashSettlement) {
		this.ModifiedCashSettlement = ModifiedCashSettlement;
	}

	public List<ModificationScope31> getModifiedServiceLevelAgreement() {
		return ModifiedServiceLevelAgreement;
	}

	public void setModifiedServiceLevelAgreement(
			List<ModificationScope31> ModifiedServiceLevelAgreement) {
		this.ModifiedServiceLevelAgreement = ModifiedServiceLevelAgreement;
	}

	public Optional<ModificationScope35> getModifiedAdditionalInformation() {
		return ModifiedAdditionalInformation;
	}

	public void setModifiedAdditionalInformation(
			Optional<ModificationScope35> ModifiedAdditionalInformation) {
		this.ModifiedAdditionalInformation = ModifiedAdditionalInformation;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}