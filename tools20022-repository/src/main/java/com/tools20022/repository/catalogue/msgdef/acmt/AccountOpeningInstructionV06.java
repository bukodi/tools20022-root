package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountOpeningInstructionV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import com.tools20022.repository.dict.msg.InvestmentAccountOpening2;
import com.tools20022.repository.dict.msg.InvestmentAccount49;
import com.tools20022.repository.dict.msg.AccountParties13;
import com.tools20022.repository.dict.msg.Intermediary36;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent2;
import com.tools20022.repository.dict.msg.NewIssueAllocation2;
import com.tools20022.repository.dict.msg.InvestmentPlan12;
import com.tools20022.repository.dict.msg.CashSettlement1;
import com.tools20022.repository.dict.msg.DocumentToSend3;
import com.tools20022.repository.dict.msg.AccountRestrictions1;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account owner, for example, an investor or its designated agent
 * sends the AccountOpeningInstruction message to the account servicer, for
 * example, a registrar, transfer agent, custodian or securities depository to
 * instruct the opening of an account or the opening of an account and the
 * establishment of an investment plan. Usage The AccountOpeningInstruction is
 * used to open an account directly or indirectly with the account servicer or
 * an intermediary. In some markets, for example, Australia, and for some
 * products in the United Kingdom, a first order (also known as a deposit
 * instruction) is placed at the same time as the account opening. To cater for
 * this scenario, an order message can be linked (via references in the message)
 * to the AccountOpeningInstruction message when needed. Execution of the
 * AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation
 * message.
 */
@PreviousVersion(AccountOpeningInstructionV05.class)
@NextVersion(AccountOpeningInstructionV07.class)
public class AccountOpeningInstructionV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference6> PreviousReference;
	private InvestmentAccountOpening2 InstructionDetails;
	private InvestmentAccount49 InvestmentAccount;
	private AccountParties13 AccountParties;
	private List<Intermediary36> Intermediaries;
	private Optional<ReferredAgent2> Placement;
	private Optional<NewIssueAllocation2> NewIssueAllocation;
	private List<InvestmentPlan12> SavingsInvestmentPlan;
	private List<InvestmentPlan12> WithdrawalInvestmentPlan;
	private List<CashSettlement1> CashSettlement;
	private List<DocumentToSend3> ServiceLevelAgreement;
	private Optional<AccountRestrictions1> AdditionalInformation;
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

	public Optional<AdditionalReference6> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference6> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public InvestmentAccountOpening2 getInstructionDetails() {
		return InstructionDetails;
	}

	public void setInstructionDetails(
			InvestmentAccountOpening2 InstructionDetails) {
		this.InstructionDetails = InstructionDetails;
	}

	public InvestmentAccount49 getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount49 InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public AccountParties13 getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(AccountParties13 AccountParties) {
		this.AccountParties = AccountParties;
	}

	public List<Intermediary36> getIntermediaries() {
		return Intermediaries;
	}

	public void setIntermediaries(List<Intermediary36> Intermediaries) {
		this.Intermediaries = Intermediaries;
	}

	public Optional<ReferredAgent2> getPlacement() {
		return Placement;
	}

	public void setPlacement(Optional<ReferredAgent2> Placement) {
		this.Placement = Placement;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return NewIssueAllocation;
	}

	public void setNewIssueAllocation(
			Optional<NewIssueAllocation2> NewIssueAllocation) {
		this.NewIssueAllocation = NewIssueAllocation;
	}

	public List<InvestmentPlan12> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan12> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan12> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan12> WithdrawalInvestmentPlan) {
		this.WithdrawalInvestmentPlan = WithdrawalInvestmentPlan;
	}

	public List<CashSettlement1> getCashSettlement() {
		return CashSettlement;
	}

	public void setCashSettlement(List<CashSettlement1> CashSettlement) {
		this.CashSettlement = CashSettlement;
	}

	public List<DocumentToSend3> getServiceLevelAgreement() {
		return ServiceLevelAgreement;
	}

	public void setServiceLevelAgreement(
			List<DocumentToSend3> ServiceLevelAgreement) {
		this.ServiceLevelAgreement = ServiceLevelAgreement;
	}

	public Optional<AccountRestrictions1> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AccountRestrictions1> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
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