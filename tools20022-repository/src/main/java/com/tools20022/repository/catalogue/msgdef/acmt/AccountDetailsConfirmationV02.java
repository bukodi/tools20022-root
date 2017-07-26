package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountDetailsConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.AccountManagementConfirmation1;
import com.tools20022.repository.dict.msg.InvestmentAccount27;
import com.tools20022.repository.dict.msg.AccountParties5;
import com.tools20022.repository.dict.msg.Intermediary12;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.NewIssueAllocation1;
import com.tools20022.repository.dict.msg.InvestmentPlan4;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation3;
import com.tools20022.repository.dict.msg.DocumentToSend1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account servicer, eg, a registrar, transfer agent or custodian bank
 * sends the AccountDetailsConfirmation message to an account owner, eg, an
 * investor to confirm the opening of an investment fund account, execution of
 * an AccountModificationInstruction or to return information requested in a
 * GetAccountDetails message. Usage The AccountDetailsConfirmation message is
 * used to confirm the opening of an account, modification of an account or the
 * provision of information requested in a previously sent GetAccountDetails
 * message. The message contains detailed information relevant to the opened
 * account. When the AccountDetailsConfirmation is used to confirm execution of
 * an AccountModificationInstruction message, it contains the modified subsets
 * of account details that were specified in the AccountModificationInstruction.
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 */
@NextVersion(AccountDetailsConfirmationV03.class)
public class AccountDetailsConfirmationV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference3> RelatedReference;
	private AccountManagementConfirmation1 ConfirmationDetails;
	private Optional<InvestmentAccount27> InvestmentAccount;
	private Optional<AccountParties5> AccountParties;
	private List<Intermediary12> Intermediaries;
	private Optional<ReferredAgent1> Placement;
	private Optional<NewIssueAllocation1> NewIssueAllocation;
	private List<InvestmentPlan4> SavingsInvestmentPlan;
	private List<InvestmentPlan4> WithdrawalInvestmentPlan;
	private Optional<InvestmentFundCashSettlementInformation3> CashSettlement;
	private List<DocumentToSend1> ServiceLevelAgreement;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return OrderReference;
	}

	public void setOrderReference(Optional<InvestmentFundOrder4> OrderReference) {
		this.OrderReference = OrderReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AccountManagementConfirmation1 getConfirmationDetails() {
		return ConfirmationDetails;
	}

	public void setConfirmationDetails(
			AccountManagementConfirmation1 ConfirmationDetails) {
		this.ConfirmationDetails = ConfirmationDetails;
	}

	public Optional<InvestmentAccount27> getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(
			Optional<InvestmentAccount27> InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public Optional<AccountParties5> getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(Optional<AccountParties5> AccountParties) {
		this.AccountParties = AccountParties;
	}

	public List<Intermediary12> getIntermediaries() {
		return Intermediaries;
	}

	public void setIntermediaries(List<Intermediary12> Intermediaries) {
		this.Intermediaries = Intermediaries;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return Placement;
	}

	public void setPlacement(Optional<ReferredAgent1> Placement) {
		this.Placement = Placement;
	}

	public Optional<NewIssueAllocation1> getNewIssueAllocation() {
		return NewIssueAllocation;
	}

	public void setNewIssueAllocation(
			Optional<NewIssueAllocation1> NewIssueAllocation) {
		this.NewIssueAllocation = NewIssueAllocation;
	}

	public List<InvestmentPlan4> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan4> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan4> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan4> WithdrawalInvestmentPlan) {
		this.WithdrawalInvestmentPlan = WithdrawalInvestmentPlan;
	}

	public Optional<InvestmentFundCashSettlementInformation3> getCashSettlement() {
		return CashSettlement;
	}

	public void setCashSettlement(
			Optional<InvestmentFundCashSettlementInformation3> CashSettlement) {
		this.CashSettlement = CashSettlement;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return ServiceLevelAgreement;
	}

	public void setServiceLevelAgreement(
			List<DocumentToSend1> ServiceLevelAgreement) {
		this.ServiceLevelAgreement = ServiceLevelAgreement;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}