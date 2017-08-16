package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.AccountingStatementOfHoldings;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceAccountingReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement6;
import com.tools20022.repository.dict.msg.SafekeepingAccount2;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation3;
import com.tools20022.repository.dict.msg.SubAccountIdentification3;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account servicer, for example, a transfer agent sends the
 * AccountStatementOfHoldings message to the account owner, for example, a fund
 * manager or an account owner's designated agent to provide detailed holdings
 * of the portfolio at a specified moment in time. The message provides, at a
 * moment in time, valuations of the portfolio together with details of each
 * financial instrument holding. The message can be sent either audited or
 * un-audited and may be provided on a trade date or settlement date basis.
 * Usage The AccountingStatementOfHoldings message is used to provide valuation
 * detail for each financial instrument held in a portfolio. The message should
 * be sent at a frequency agreed bi-laterally between the account servicer and
 * the account owner. This message can only be used to list the holdings of a
 * single (master) account. However, it is possible to break down these holdings
 * into one or several sub-accounts. Therefore, the message can be used to
 * either specify holdings at - the main account level, or, - the sub-account
 * level. This message can be used to report where the financial instruments are
 * safe-kept, physically or notionally. If a security is held in more than one
 * safekeeping place, this can also be indicated. The
 * AccountingStatementOfHoldings message should not be used for trading
 * purposes.
 */
@PreviousVersion(AccountingStatementOfHoldings.class)
@NextVersion(SecuritiesBalanceAccountingReportV03.class)
public class AccountingStatementOfHoldingsV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement6 StatementGeneralDetails;
	private SafekeepingAccount2 AccountDetails;
	private Optional<AggregateBalanceInformation3> BalanceForAccount;
	private Optional<SubAccountIdentification3> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement> TotalValues;
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

	public Statement6 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement6 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public SafekeepingAccount2 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SafekeepingAccount2 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<AggregateBalanceInformation3> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation3> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification3> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification3> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement> getTotalValues() {
		return TotalValues;
	}

	public void setTotalValues(
			Optional<TotalValueInPageAndStatement> TotalValues) {
		this.TotalValues = TotalValues;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}