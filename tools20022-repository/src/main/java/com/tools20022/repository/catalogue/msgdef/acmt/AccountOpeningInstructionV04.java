package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.InvestmentAccountOpeningDetails;
import com.tools20022.repository.dict.msg.InvestmentAccount37;
import com.tools20022.repository.dict.msg.AccountParties9;
import com.tools20022.repository.dict.msg.Intermediary24;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent1;
import com.tools20022.repository.dict.msg.NewIssueAllocation1;
import com.tools20022.repository.dict.msg.InvestmentPlan9;
import com.tools20022.repository.dict.msg.InvestmentFundCashSettlementInformation7;
import com.tools20022.repository.dict.msg.DocumentToSend1;
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
@PreviousVersion(AccountOpeningInstructionV03.class)
@NextVersion(AccountOpeningInstructionV05.class)
public class AccountOpeningInstructionV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference3> PreviousReference;
	private InvestmentAccountOpeningDetails InstructionDetails;
	private InvestmentAccount37 InvestmentAccount;
	private AccountParties9 AccountParties;
	private List<Intermediary24> Intermediaries;
	private Optional<ReferredAgent1> Placement;
	private Optional<NewIssueAllocation1> NewIssueAllocation;
	private List<InvestmentPlan9> SavingsInvestmentPlan;
	private List<InvestmentPlan9> WithdrawalInvestmentPlan;
	private List<InvestmentFundCashSettlementInformation7> CashSettlement;
	private List<DocumentToSend1> ServiceLevelAgreement;
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

	public InvestmentAccountOpeningDetails getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			InvestmentAccountOpeningDetails InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccount37 getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount37 InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public AccountParties9 getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(AccountParties9 AccountParties) {
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

	public Optional<NewIssueAllocation1> getNewIssueAllocation() {
		return NewIssueAllocation;
	}

	public void setNewIssueAllocation(
			Optional<NewIssueAllocation1> NewIssueAllocation) {
		this.NewIssueAllocation = NewIssueAllocation;
	}

	public List<InvestmentPlan9> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan9> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan9> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan9> WithdrawalInvestmentPlan) {
		this.WithdrawalInvestmentPlan = WithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation7> getCashSettlement() {
		return CashSettlement;
	}

	public void setCashSettlement(
			List<InvestmentFundCashSettlementInformation7> CashSettlement) {
		this.CashSettlement = CashSettlement;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return ServiceLevelAgreement;
	}

	public void setServiceLevelAgreement(
			List<DocumentToSend1> ServiceLevelAgreement) {
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