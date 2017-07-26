package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.CustodyStatementOfHoldings;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceCustodyReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement7;
import com.tools20022.repository.dict.msg.SafekeepingAccount2;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation4;
import com.tools20022.repository.dict.msg.SubAccountIdentification5;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An account servicer, for example, a transfer agent sends the
 * CustodyStatementOfHoldings message to the account owner, for example, a fund
 * manager or an account owner's designated agent to provide detailed holdings
 * of the portfolio at a specified moment in time. The message provides, at a
 * moment in time, the quantity and identification of the financial instruments
 * that the account servicer holds for the account owner. The message can also
 * include availability and the location of holdings to facilitate trading and
 * minimise settlement issues. The message reports all information per financial
 * instrument, ie, when a financial instrument is held at multiple places of
 * safekeeping, the total holdings for all locations can be provided. Usage The
 * CustodyStatementOfHoldings message is used to provide detailed quantity and
 * availability information for financial instrument holdings of a portfolio.
 * The message should be sent at a frequency agreed bi-laterally between the
 * account servicer and the account owner. This message can be also be used to
 * report where the financial instruments are safe-kept, physically or
 * notionally. If a security is held in more than one safekeeping place, this
 * can also be indicated. This message can reflect all outstanding holding
 * information or may only contain changes since the previously sent statement.
 * The CustodyStatementOfHoldings message can only be used to list the holdings
 * of a single (master) account. However, it is possible to break down these
 * holdings into one or several sub-accounts. Therefore, this message can be
 * used to either specify holdings at - the main account level, or, - the
 * sub-account level.
 */
@PreviousVersion(CustodyStatementOfHoldings.class)
@NextVersion(SecuritiesBalanceCustodyReportV03.class)
public class CustodyStatementOfHoldingsV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement7 StatementGeneralDetails;
	private SafekeepingAccount2 AccountDetails;
	private Optional<AggregateBalanceInformation4> BalanceForAccount;
	private Optional<SubAccountIdentification5> SubAccountDetails;
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

	public Statement7 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement7 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public SafekeepingAccount2 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SafekeepingAccount2 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<AggregateBalanceInformation4> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation4> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification5> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification5> SubAccountDetails) {
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