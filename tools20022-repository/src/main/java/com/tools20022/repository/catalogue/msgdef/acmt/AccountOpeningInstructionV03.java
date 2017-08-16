package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.InvestmentAccountOpeningDetails;
import com.tools20022.repository.dict.msg.InvestmentAccount34;
import com.tools20022.repository.dict.msg.AccountParties6;
import com.tools20022.repository.dict.msg.Intermediary12;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.NewIssueAllocation1;
import com.tools20022.repository.dict.msg.InvestmentPlan6;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation5;
import com.tools20022.repository.dict.msg.DocumentToSend1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account owner, for example, an investor or its designated agent
 * sends the AccountOpeningInstruction message to the account servicer, for
 * example, a registrar, transfer agent or custodian to instruct the opening of
 * an account or the opening of an account and establishing an investment plan.
 * Usage The AccountOpeningInstruction is used to open an account directly or
 * indirectly with the account servicer or an intermediary. In some markets, for
 * example, Australia, and for some products in the United Kingdom, a first
 * order (also known as a deposit instruction) is placed at the same time as the
 * account opening. To cater for this scenario, an order message can be linked
 * (via references in the message) to the AccountOpeningInstruction message when
 * needed. Execution of the AccountOpeningInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 */
@PreviousVersion(AccountOpeningInstructionV02.class)
@NextVersion(AccountOpeningInstructionV04.class)
public class AccountOpeningInstructionV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference3> PreviousReference;
	private InvestmentAccountOpeningDetails InstructionDetails;
	private InvestmentAccount34 InvestmentAccount;
	private AccountParties6 AccountParties;
	private List<Intermediary12> Intermediaries;
	private Optional<ReferredAgent1> Placement;
	private Optional<NewIssueAllocation1> NewIssueAllocation;
	private List<InvestmentPlan6> SavingsInvestmentPlan;
	private List<InvestmentPlan6> WithdrawalInvestmentPlan;
	private List<InvestmentFundCashSettlementInformation5> CashSettlement;
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

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public InvestmentAccountOpeningDetails getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			InvestmentAccountOpeningDetails InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccount34 getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount34 InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public AccountParties6 getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(AccountParties6 AccountParties) {
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

	public List<InvestmentPlan6> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan6> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan6> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan6> WithdrawalInvestmentPlan) {
		this.WithdrawalInvestmentPlan = WithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation5> getCashSettlement() {
		return CashSettlement;
	}

	public void setCashSettlement(
			List<InvestmentFundCashSettlementInformation5> CashSettlement) {
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