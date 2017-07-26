package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.AccountingStatementOfHoldingsV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement4;
import com.tools20022.repository.dict.msg.SafekeepingAccount1;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation2;
import com.tools20022.repository.dict.msg.SubAccountIdentification2;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The AccountingStatementOfHoldings message is sent by an account
 * servicer to the account owner or the account owner's designated agent. The
 * account servicer may be a local agent acting on behalf of its global
 * custodian customer, a custodian acting on behalf of an investment management
 * institution or a broker/dealer, a fund administrator or fund intermediary,
 * trustee or registrar, etc. This message provides, at a specified moment in
 * time, valuations of the portfolio together with details of each financial
 * instrument holding. The information in the message can be audited or
 * un-audited. Usage The AccountingStatementOfHoldings message can be sent: - At
 * a frequency agreed bi-laterally between the Sender and the Receiver - As a
 * response to a request for statement sent by the account owner. The request
 * for statement message will be developed at a later stage. This message can
 * only be used to list the holdings of a single (master) account. However, it
 * is possible to break down these holdings into one or several sub-accounts.
 * Therefore, the message can be used to either specify holdings at - the main
 * account level, or - the sub-account level. This message can be used to report
 * where the securities are safe-kept, physically or notionally. If a security
 * is held in more than one safekeeping place, this can also be indicated. The
 * AccountingStatementOfHoldings message must not be used to reconcile the books
 * of the account owner and the account servicer. The CustodyStatementOfHoldings
 * message is used for reconciliation purposes. The
 * AccountingStatementOfHoldings message must not be used for trading purposes.
 * Since a SWIFT message as sent is restricted to the maximum input message
 * length, several messages may be needed to accommodate all the information.
 */
@NextVersion(AccountingStatementOfHoldingsV02.class)
public class AccountingStatementOfHoldings {

	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement4 StatementGeneralDetails;
	private SafekeepingAccount1 AccountDetails;
	private Optional<AggregateBalanceInformation2> BalanceForAccount;
	private Optional<SubAccountIdentification2> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement> TotalValues;
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

	public Statement4 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement4 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public SafekeepingAccount1 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SafekeepingAccount1 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<AggregateBalanceInformation2> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation2> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification2> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification2> SubAccountDetails) {
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