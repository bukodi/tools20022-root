package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.InvestmentAccountOpening1;
import com.tools20022.repository.dict.msg.InvestmentAccount37;
import com.tools20022.repository.dict.msg.AccountParties10;
import com.tools20022.repository.dict.msg.Intermediary24;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.NewIssueAllocation2;
import com.tools20022.repository.dict.msg.InvestmentPlan10;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation7;
import com.tools20022.repository.dict.msg.DocumentToSend2;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
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
@PreviousVersion(AccountOpeningInstructionV04.class)
@NextVersion(AccountOpeningInstructionV06.class)
public class AccountOpeningInstructionV05 {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference3> PreviousReference;
	private InvestmentAccountOpening1 InstructionDetails;
	private InvestmentAccount37 InvestmentAccount;
	private AccountParties10 AccountParties;
	private List<Intermediary24> Intermediaries;
	private Optional<ReferredAgent1> Placement;
	private Optional<NewIssueAllocation2> NewIssueAllocation;
	private List<InvestmentPlan10> SavingsInvestmentPlan;
	private List<InvestmentPlan10> WithdrawalInvestmentPlan;
	private List<InvestmentFundCashSettlementInformation7> CashSettlement;
	private List<DocumentToSend2> ServiceLevelAgreement;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
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

	public InvestmentAccountOpening1 getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			InvestmentAccountOpening1 InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccount37 getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount37 InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public AccountParties10 getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(AccountParties10 AccountParties) {
		this.AccountParties = AccountParties;
	}

	public List<Intermediary24> getIntermediaries() {
		return Intermediaries;
	}

	public void setIntermediaries(List<Intermediary24> Intermediaries) {
		this.Intermediaries = Intermediaries;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return Placement;
	}

	public void setPlacement(Optional<ReferredAgent1> Placement) {
		this.Placement = Placement;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return NewIssueAllocation;
	}

	public void setNewIssueAllocation(
			Optional<NewIssueAllocation2> NewIssueAllocation) {
		this.NewIssueAllocation = NewIssueAllocation;
	}

	public List<InvestmentPlan10> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan10> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan10> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan10> WithdrawalInvestmentPlan) {
		this.WithdrawalInvestmentPlan = WithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation7> getCashSettlement() {
		return CashSettlement;
	}

	public void setCashSettlement(
			List<InvestmentFundCashSettlementInformation7> CashSettlement) {
		this.CashSettlement = CashSettlement;
	}

	public List<DocumentToSend2> getServiceLevelAgreement() {
		return ServiceLevelAgreement;
	}

	public void setServiceLevelAgreement(
			List<DocumentToSend2> ServiceLevelAgreement) {
		this.ServiceLevelAgreement = ServiceLevelAgreement;
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