package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentAccountModification2;
import com.tools20022.repository.dict.choice.AccountSelection1Choice;
import com.tools20022.repository.dict.msg.InvestmentAccount51;
import com.tools20022.repository.dict.msg.AccountParties14;
import java.util.List;
import com.tools20022.repository.dict.msg.ModificationScope26;
import com.tools20022.repository.dict.msg.ModificationScope33;
import com.tools20022.repository.dict.msg.ModificationScope21;
import com.tools20022.repository.dict.msg.ModificationScope28;
import com.tools20022.repository.dict.msg.CashSettlement2;
import com.tools20022.repository.dict.msg.ModificationScope31;
import com.tools20022.repository.dict.msg.ModificationScope30;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account owner, for example, an investor or its designated agent,
 * sends the AccountModificationInstruction message to the account servicer, for
 * example, a registrar, transfer agent, custodian bank or securities depository
 * to modify, that is, create, update or delete specific details of an existing
 * account. Usage The AccountModificationInstruction message is used to modify
 * the details of an existing account. The AccountModificationInstruction
 * message has three specific uses: - to maintain/update any of the existing
 * account details, for example, to update the address of the beneficiary or
 * modify the preference to income from distribution to capitalisation, or, - to
 * add/create specific details to the existing account when these details were
 * not yet recorded at the time of account creation, for example, to add a
 * second address or to establish new cash settlement standing instructions, or,
 * - to delete specific account details, for example, delete cash standing
 * instructions. This message cannot be used to delete an entire account, as
 * institution specific and regulatory rules pertaining to account deletion are
 * diverse. The usage of this message may be subject to service level agreement
 * (SLA) between the counterparties. Execution of the
 * AccountModificationInstruction is confirmed via an AccountDetailsConfirmation
 * message.
 */
@PreviousVersion(AccountModificationInstructionV05.class)
@NextVersion(AccountModificationInstructionV07.class)
public class AccountModificationInstructionV06 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<InvestmentAccountModification2> InstructionDetails;
	private AccountSelection1Choice InvestmentAccountSelection;
	private Optional<InvestmentAccount51> ModifiedInvestmentAccount;
	private List<AccountParties14> ModifiedAccountParties;
	private List<ModificationScope26> ModifiedIntermediaries;
	private Optional<ModificationScope33> ModifiedPlacement;
	private Optional<ModificationScope21> ModifiedIssueAllocation;
	private List<ModificationScope28> ModifiedSavingsInvestmentPlan;
	private List<ModificationScope28> ModifiedWithdrawalInvestmentPlan;
	private List<CashSettlement2> ModifiedCashSettlement;
	private List<ModificationScope31> ModifiedServiceLevelAgreement;
	private Optional<ModificationScope30> ModifiedAdditionalInformation;
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

	public Optional<InvestmentAccountModification2> getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			Optional<InvestmentAccountModification2> InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public AccountSelection1Choice getInvestmentAccountSelection() {
		return InvestmentAccountSelection;
	}

	public void setInvestmentAccountSelection(
			AccountSelection1Choice InvestmentAccountSelection) {
		this.InvestmentAccountSelection = InvestmentAccountSelection;
	}

	public Optional<InvestmentAccount51> getModifiedInvestmentAccount() {
		return ModifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(
			Optional<InvestmentAccount51> ModifiedInvestmentAccount) {
		this.ModifiedInvestmentAccount = ModifiedInvestmentAccount;
	}

	public List<AccountParties14> getModifiedAccountParties() {
		return ModifiedAccountParties;
	}

	public void setModifiedAccountParties(
			List<AccountParties14> ModifiedAccountParties) {
		this.ModifiedAccountParties = ModifiedAccountParties;
	}

	public List<ModificationScope26> getModifiedIntermediaries() {
		return ModifiedIntermediaries;
	}

	public void setModifiedIntermediaries(
			List<ModificationScope26> ModifiedIntermediaries) {
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

	public List<ModificationScope28> getModifiedSavingsInvestmentPlan() {
		return ModifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(
			List<ModificationScope28> ModifiedSavingsInvestmentPlan) {
		this.ModifiedSavingsInvestmentPlan = ModifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope28> getModifiedWithdrawalInvestmentPlan() {
		return ModifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(
			List<ModificationScope28> ModifiedWithdrawalInvestmentPlan) {
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

	public Optional<ModificationScope30> getModifiedAdditionalInformation() {
		return ModifiedAdditionalInformation;
	}

	public void setModifiedAdditionalInformation(
			Optional<ModificationScope30> ModifiedAdditionalInformation) {
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