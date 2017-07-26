package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountDetailsConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import com.tools20022.repository.dict.msg.AccountManagementConfirmation4;
import com.tools20022.repository.dict.msg.InvestmentAccount62;
import com.tools20022.repository.dict.msg.AccountParties15;
import com.tools20022.repository.dict.msg.Intermediary36;
import java.util.List;
import com.tools20022.repository.dict.msg.ReferredAgent2;
import com.tools20022.repository.dict.msg.NewIssueAllocation2;
import com.tools20022.repository.dict.msg.InvestmentPlan14;
import com.tools20022.repository.dict.msg.CashSettlement1;
import com.tools20022.repository.dict.msg.DocumentToSend3;
import com.tools20022.repository.dict.msg.AdditiononalInformation12;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The AccountDetailsConfirmation message is sent by an account servicer,
 * for example, a registrar, transfer agent, custodian bank or securities
 * depository to the account owner, for example, an investor to confirm the
 * opening of an account, execution of an AccountModificationInstruction or to
 * return information requested in a GetAccountDetails message. Usage The
 * AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account. When the
 * AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it may: - contain the modified
 * subsets of account details that were specified in the
 * AccountModificationInstruction, and/or - provide the status of the account.
 * When the AccountModificationInstruction message is used to instruct the
 * closure of an account, the AccountDetailsConfirmation message is used to
 * confirm the account has been closed. When the AccountDetailsConfirmation is
 * used to reply to a GetAccountDetails message, it returns the selected subsets
 * of account details that were specified in the GetAccountDetails message.
 */
@PreviousVersion(AccountDetailsConfirmationV06.class)
public class AccountDetailsConfirmationV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference6> RelatedReference;
	private AccountManagementConfirmation4 ConfirmationDetails;
	private Optional<InvestmentAccount62> InvestmentAccount;
	private Optional<AccountParties15> AccountParties;
	private List<Intermediary36> Intermediaries;
	private Optional<ReferredAgent2> Placement;
	private Optional<NewIssueAllocation2> NewIssueAllocation;
	private List<InvestmentPlan14> SavingsInvestmentPlan;
	private List<InvestmentPlan14> WithdrawalInvestmentPlan;
	private List<CashSettlement1> CashSettlement;
	private List<DocumentToSend3> ServiceLevelAgreement;
	private Optional<AdditiononalInformation12> AdditionalInformation;
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

	public Optional<AdditionalReference6> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference6> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AccountManagementConfirmation4 getConfirmationDetails() {
		return ConfirmationDetails;
	}

	public void setConfirmationDetails(
			AccountManagementConfirmation4 ConfirmationDetails) {
		this.ConfirmationDetails = ConfirmationDetails;
	}

	public Optional<InvestmentAccount62> getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(
			Optional<InvestmentAccount62> InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public Optional<AccountParties15> getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(Optional<AccountParties15> AccountParties) {
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

	public List<InvestmentPlan14> getSavingsInvestmentPlan() {
		return SavingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(
			List<InvestmentPlan14> SavingsInvestmentPlan) {
		this.SavingsInvestmentPlan = SavingsInvestmentPlan;
	}

	public List<InvestmentPlan14> getWithdrawalInvestmentPlan() {
		return WithdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(
			List<InvestmentPlan14> WithdrawalInvestmentPlan) {
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

	public Optional<AdditiononalInformation12> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<AdditiononalInformation12> AdditionalInformation) {
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