package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountModificationInstructionV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentAccountModification1;
import com.tools20022.repository.dict.msg.InvestmentAccountSelection2;
import com.tools20022.repository.dict.msg.InvestmentAccount47;
import com.tools20022.repository.dict.msg.AccountParties11;
import java.util.List;
import com.tools20022.repository.dict.msg.ModificationScope20;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.ModificationScope21;
import com.tools20022.repository.dict.msg.ModificationScope25;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation8;
import com.tools20022.repository.dict.msg.ModificationScope22;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account owner, for example, an investor or its designated agent,
 * sends the AccountModificationInstruction message to the account servicer, for
 * example, a registrar, transfer agent or custodian bank to modify, that is,
 * create, update or delete specific details of an existing investment fund
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
@PreviousVersion(AccountModificationInstructionV04.class)
@NextVersion(AccountModificationInstructionV06.class)
public class AccountModificationInstructionV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<InvestmentAccountModification1> InstructionDetails;
	private InvestmentAccountSelection2 InvestmentAccountSelection;
	private Optional<InvestmentAccount47> ModifiedInvestmentAccount;
	private List<AccountParties11> ModifiedAccountParties;
	private List<ModificationScope20> ModifiedIntermediaries;
	private Optional<ReferredAgent1> ModifiedPlacement;
	private Optional<ModificationScope21> ModifiedIssueAllocation;
	private List<ModificationScope25> ModifiedSavingsInvestmentPlan;
	private List<ModificationScope25> ModifiedWithdrawalInvestmentPlan;
	private List<InvestmentFundCashSettlementInformation8> ModifiedCashSettlement;
	private List<ModificationScope22> ModifiedServiceLevelAgreement;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
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

	public Optional<InvestmentAccountModification1> getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			Optional<InvestmentAccountModification1> InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccountSelection2 getInvestmentAccountSelection() {
		return InvestmentAccountSelection;
	}

	public void setInvestmentAccountSelection(
			InvestmentAccountSelection2 InvestmentAccountSelection) {
		this.InvestmentAccountSelection = InvestmentAccountSelection;
	}

	public Optional<InvestmentAccount47> getModifiedInvestmentAccount() {
		return ModifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(
			Optional<InvestmentAccount47> ModifiedInvestmentAccount) {
		this.ModifiedInvestmentAccount = ModifiedInvestmentAccount;
	}

	public List<AccountParties11> getModifiedAccountParties() {
		return ModifiedAccountParties;
	}

	public void setModifiedAccountParties(
			List<AccountParties11> ModifiedAccountParties) {
		this.ModifiedAccountParties = ModifiedAccountParties;
	}

	public List<ModificationScope20> getModifiedIntermediaries() {
		return ModifiedIntermediaries;
	}

	public void setModifiedIntermediaries(
			List<ModificationScope20> ModifiedIntermediaries) {
		this.ModifiedIntermediaries = ModifiedIntermediaries;
	}

	public Optional<ReferredAgent1> getModifiedPlacement() {
		return ModifiedPlacement;
	}

	public void setModifiedPlacement(Optional<ReferredAgent1> ModifiedPlacement) {
		this.ModifiedPlacement = ModifiedPlacement;
	}

	public Optional<ModificationScope21> getModifiedIssueAllocation() {
		return ModifiedIssueAllocation;
	}

	public void setModifiedIssueAllocation(
			Optional<ModificationScope21> ModifiedIssueAllocation) {
		this.ModifiedIssueAllocation = ModifiedIssueAllocation;
	}

	public List<ModificationScope25> getModifiedSavingsInvestmentPlan() {
		return ModifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(
			List<ModificationScope25> ModifiedSavingsInvestmentPlan) {
		this.ModifiedSavingsInvestmentPlan = ModifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope25> getModifiedWithdrawalInvestmentPlan() {
		return ModifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(
			List<ModificationScope25> ModifiedWithdrawalInvestmentPlan) {
		this.ModifiedWithdrawalInvestmentPlan = ModifiedWithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation8> getModifiedCashSettlement() {
		return ModifiedCashSettlement;
	}

	public void setModifiedCashSettlement(
			List<InvestmentFundCashSettlementInformation8> ModifiedCashSettlement) {
		this.ModifiedCashSettlement = ModifiedCashSettlement;
	}

	public List<ModificationScope22> getModifiedServiceLevelAgreement() {
		return ModifiedServiceLevelAgreement;
	}

	public void setModifiedServiceLevelAgreement(
			List<ModificationScope22> ModifiedServiceLevelAgreement) {
		this.ModifiedServiceLevelAgreement = ModifiedServiceLevelAgreement;
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