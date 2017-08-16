package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactions;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactionsV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement8;
import com.tools20022.repository.dict.msg.InvestmentAccount25;
import com.tools20022.repository.dict.msg.InvestmentFundTransactionsByFund2;
import com.tools20022.repository.dict.msg.SubAccountIdentification6;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account servicer, for example, a transfer agent sends the
 * StatementOfInvestmentFundTransactions message to the account owner, for
 * example, an investment manager or its authorised representative to provide
 * detailed transactions (increases and decreases) of holdings which occurred
 * during a specified period of time. Usage The
 * StatementOfInvestmentFundTransactions message is used to list the holdings
 * transactions of a single (master) account or several sub-accounts. This
 * message should be used at a frequency agreed bi-laterally between the account
 * servicer and the account owner. This message must not be used in place of
 * confirmation messages.
 */
@PreviousVersion(StatementOfInvestmentFundTransactions.class)
@NextVersion(StatementOfInvestmentFundTransactionsV03.class)
public class StatementOfInvestmentFundTransactionsV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement8 StatementGeneralDetails;
	private InvestmentAccount25 InvestmentAccountDetails;
	private Optional<InvestmentFundTransactionsByFund2> TransactionOnAccount;
	private Optional<SubAccountIdentification6> SubAccountDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

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

	public Statement8 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement8 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public InvestmentAccount25 getInvestmentAccountDetails() {
		return InvestmentAccountDetails;
	}

	public void setInvestmentAccountDetails(
			InvestmentAccount25 InvestmentAccountDetails) {
		this.InvestmentAccountDetails = InvestmentAccountDetails;
	}

	public Optional<InvestmentFundTransactionsByFund2> getTransactionOnAccount() {
		return TransactionOnAccount;
	}

	public void setTransactionOnAccount(
			Optional<InvestmentFundTransactionsByFund2> TransactionOnAccount) {
		this.TransactionOnAccount = TransactionOnAccount;
	}

	public Optional<SubAccountIdentification6> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification6> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}