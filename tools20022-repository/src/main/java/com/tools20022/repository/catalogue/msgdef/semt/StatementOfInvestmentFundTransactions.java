package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactionsV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement5;
import com.tools20022.repository.dict.msg.InvestmentAccount12;
import com.tools20022.repository.dict.msg.InvestmentFundTransactionsByFund1;
import com.tools20022.repository.dict.msg.SubAccountIdentification4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The StatementOfInvestmentFundTransactions is sent by an account
 * servicer to the account owner or the account owner's designated agent. The
 * account servicer may be a fund administrator or fund intermediary, trustee or
 * registrar. This message provides the details of increases and decreases of
 * holdings which occurred during a specified period. This message can also be
 * used for information purposes, eg, tax information. Usage The
 * StatementOfInvestmentFundTransactions message can be sent: - At a frequency
 * agreed bi-laterally between the Sender and the Receiver and/or - As a
 * response to a request for statement sent by the account owner. The
 * StatementOfInvestmentFundTransactions message can only be used to list the
 * transactions of a single (master) account. However, it is possible to break
 * down these transactions into one or several sub-accounts. Therefore, the
 * message can be used to either specify transactions at - the main account
 * level, or - the sub-account level. This message must not be used in place of
 * confirmation messages. Since a SWIFT message as sent is restricted to the
 * maximum input message length, several messages may be needed to accommodate
 * all the information.
 */
@NextVersion(StatementOfInvestmentFundTransactionsV02.class)
public class StatementOfInvestmentFundTransactions {

	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement5 StatementGeneralDetails;
	private InvestmentAccount12 InvestmentAccountDetails;
	private Optional<InvestmentFundTransactionsByFund1> TransactionOnAccount;
	private Optional<SubAccountIdentification4> SubAccountDetails;
	private Optional<Extension1> Extension;

	public Optional<AdditionalReference2> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference2> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Pagination getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Pagination MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Statement5 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement5 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public InvestmentAccount12 getInvestmentAccountDetails() {
		return InvestmentAccountDetails;
	}

	public void setInvestmentAccountDetails(
			InvestmentAccount12 InvestmentAccountDetails) {
		this.InvestmentAccountDetails = InvestmentAccountDetails;
	}

	public Optional<InvestmentFundTransactionsByFund1> getTransactionOnAccount() {
		return TransactionOnAccount;
	}

	public void setTransactionOnAccount(
			Optional<InvestmentFundTransactionsByFund1> TransactionOnAccount) {
		this.TransactionOnAccount = TransactionOnAccount;
	}

	public Optional<SubAccountIdentification4> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification4> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}