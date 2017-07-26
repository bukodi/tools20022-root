package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.AccountDetailsConfirmationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.AccountDetailsConfirmationV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.InvestmentFundOrder4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.AccountManagementConfirmation2;
import com.tools20022.repository.dict.msg.InvestmentAccount46;
import com.tools20022.repository.dict.msg.AccountParties12;
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
 * Scope An account servicer, for example, a registrar, transfer agent or
 * custodian bank sends the AccountDetailsConfirmation message to the account
 * owner, for example, an investor to confirm the opening of an investment fund
 * account, execution of an AccountModificationInstruction or to return
 * information requested in a GetAccountDetails message. Usage The
 * AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account. When the
 * AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it contains the modified subsets of
 * account details that were specified in the AccountModificationInstruction.
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 */
@PreviousVersion(AccountDetailsConfirmationV04.class)
@NextVersion(AccountDetailsConfirmationV06.class)
public class AccountDetailsConfirmationV05 {

	private MessageIdentification1 MessageIdentification;
	private Optional<InvestmentFundOrder4> OrderReference;
	private Optional<AdditionalReference3> RelatedReference;
	private AccountManagementConfirmation2 ConfirmationDetails;
	private Optional<InvestmentAccount46> InvestmentAccount;
	private Optional<AccountParties12> AccountParties;
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

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AccountManagementConfirmation2 getConfirmationDetails() {
		return ConfirmationDetails;
	}

	public void setConfirmationDetails(
			AccountManagementConfirmation2 ConfirmationDetails) {
		this.ConfirmationDetails = ConfirmationDetails;
	}

	public Optional<InvestmentAccount46> getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(
			Optional<InvestmentAccount46> InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public Optional<AccountParties12> getAccountParties() {
		return AccountParties;
	}

	public void setAccountParties(Optional<AccountParties12> AccountParties) {
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