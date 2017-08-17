package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentAccountModificationDetails;
import com.tools20022.repository.dict.msg.InvestmentAccountSelection2;
import com.tools20022.repository.dict.msg.InvestmentAccount28;
import com.tools20022.repository.dict.msg.AccountParties4;
import java.util.List;
import com.tools20022.repository.dict.msg.ModificationScope7;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.ModificationScope9;
import com.tools20022.repository.dict.msg.ModificationScope8;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation4;
import com.tools20022.repository.dict.msg.ModificationScope10;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account owner, eg, and investor or its designated agent, sends the
 * AccountModificationInstruction message to an account servicer, eg, a
 * registrar, transfer agent or custodian bank to modify, ie, create, update or
 * delete specific details of an existing investment fund account. Usage The
 * AccountModificationInstruction message is used to modify the details of an
 * existing account. The AccountModificationInstruction message has three
 * specific uses: - to maintain/update any of the existing account details, eg,
 * to update the address of the beneficiary or modify the preference to income
 * from distribution to capitalisation, or, - to add/create specific details to
 * the existing account when these details were not yet recorded at the time of
 * account creation, eg, to add a second address or to establish new cash
 * settlement standing instructions, or, - to delete specific account details,
 * eg, delete cash standing instructions. This message cannot be used to delete
 * an entire account, as institution specific and regulatory rules pertaining to
 * account deletion are diverse. The usage of this message may be subject to
 * service level agreement (SLA) between the counterparties. Execution of the
 * AccountModificationInstruction is confirmed via an AccountDetailsConfirmation
 * message.
 */
@NextVersion(AccountModificationInstructionV03.class)
public class AccountModificationInstructionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<InvestmentAccountModificationDetails> InstructionDetails;
	private InvestmentAccountSelection2 InvestmentAccountSelection;
	private Optional<InvestmentAccount28> ModifiedInvestmentAccount;
	private List<AccountParties4> ModifiedAccountParties;
	private List<ModificationScope7> ModifiedIntermediaries;
	private Optional<ReferredAgent1> ModifiedPlacement;
	private Optional<ModificationScope9> ModifiedIssueAllocation;
	private List<ModificationScope8> ModifiedSavingsInvestmentPlan;
	private List<ModificationScope8> ModifiedWithdrawalInvestmentPlan;
	private List<InvestmentFundCashSettlementInformation4> ModifiedCashSettlement;
	private List<ModificationScope10> ModifiedServiceLevelAgreement;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<InvestmentAccountModificationDetails> getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			Optional<InvestmentAccountModificationDetails> InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccountSelection2 getInvestmentAccountSelection() {
		return InvestmentAccountSelection;
	}

	public void setInvestmentAccountSelection(
			InvestmentAccountSelection2 InvestmentAccountSelection) {
		this.InvestmentAccountSelection = InvestmentAccountSelection;
	}

	public Optional<InvestmentAccount28> getModifiedInvestmentAccount() {
		return ModifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(
			Optional<InvestmentAccount28> ModifiedInvestmentAccount) {
		this.ModifiedInvestmentAccount = ModifiedInvestmentAccount;
	}

	public List<AccountParties4> getModifiedAccountParties() {
		return ModifiedAccountParties;
	}

	public void setModifiedAccountParties(
			List<AccountParties4> ModifiedAccountParties) {
		this.ModifiedAccountParties = ModifiedAccountParties;
	}

	public List<ModificationScope7> getModifiedIntermediaries() {
		return ModifiedIntermediaries;
	}

	public void setModifiedIntermediaries(
			List<ModificationScope7> ModifiedIntermediaries) {
		this.ModifiedIntermediaries = ModifiedIntermediaries;
	}

	public Optional<ReferredAgent1> getModifiedPlacement() {
		return ModifiedPlacement;
	}

	public void setModifiedPlacement(Optional<ReferredAgent1> ModifiedPlacement) {
		this.ModifiedPlacement = ModifiedPlacement;
	}

	public Optional<ModificationScope9> getModifiedIssueAllocation() {
		return ModifiedIssueAllocation;
	}

	public void setModifiedIssueAllocation(
			Optional<ModificationScope9> ModifiedIssueAllocation) {
		this.ModifiedIssueAllocation = ModifiedIssueAllocation;
	}

	public List<ModificationScope8> getModifiedSavingsInvestmentPlan() {
		return ModifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(
			List<ModificationScope8> ModifiedSavingsInvestmentPlan) {
		this.ModifiedSavingsInvestmentPlan = ModifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope8> getModifiedWithdrawalInvestmentPlan() {
		return ModifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(
			List<ModificationScope8> ModifiedWithdrawalInvestmentPlan) {
		this.ModifiedWithdrawalInvestmentPlan = ModifiedWithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation4> getModifiedCashSettlement() {
		return ModifiedCashSettlement;
	}

	public void setModifiedCashSettlement(
			List<InvestmentFundCashSettlementInformation4> ModifiedCashSettlement) {
		this.ModifiedCashSettlement = ModifiedCashSettlement;
	}

	public List<ModificationScope10> getModifiedServiceLevelAgreement() {
		return ModifiedServiceLevelAgreement;
	}

	public void setModifiedServiceLevelAgreement(
			List<ModificationScope10> ModifiedServiceLevelAgreement) {
		this.ModifiedServiceLevelAgreement = ModifiedServiceLevelAgreement;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}