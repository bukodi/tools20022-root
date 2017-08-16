package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.CustodyStatementOfHoldingsV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement3;
import com.tools20022.repository.dict.msg.SafekeepingAccount1;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation1;
import com.tools20022.repository.dict.msg.SubAccountIdentification1;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The CustodyStatementOfHoldings message is sent by an account servicer
 * to the account owner or the account owner's designated agent. The account
 * servicer may be a local agent acting on behalf of its global custodian
 * customer, a custodian acting on behalf of an investment management
 * institution or a broker/dealer, a fund administrator or fund intermediary,
 * trustee or registrar, etc. This message reports, at a specified moment in
 * time, the quantity and identification of financial instruments that an
 * account servicer holds for the account owner. This message is used to
 * reconcile the books of the account owner and the account servicer for the
 * specified account or sub-account. This message can also report availability
 * and/or the location of security holdings to facilitate trading and minimise
 * settlement issues. The reporting is per financial instrument, ie, when a
 * financial instrument is held at multiple places of safekeeping, the total
 * holding for all locations can be provided. Usage The
 * CustodyStatementOfHoldings message can be sent: - At a frequency agreed
 * bi-laterally between the Sender and the Receiver - As a response to a request
 * for statement sent by the account owner. This message can reflect all
 * outstanding holding information or may only contain changes since the
 * previously sent statement. The CustodyStatementOfHoldings message can only be
 * used to list the holdings of a single (master) account. However, it is
 * possible to break down these holdings into one or several sub-accounts.
 * Therefore, this message can be used to either specify holdings at - the main
 * account level, or - the sub-account level. This message can be also be used
 * to report where the securities are safe-kept, physically or notionally. If a
 * security is held in more than one safekeeping place, this can also be
 * indicated. This message must not be used to report audited positions. Audited
 * positions are reported using the AccountingStatementOfHoldings message. Since
 * a SWIFT message as sent is restricted to the maximum input message length,
 * several messages may be needed to accommodate all the information.
 */
@NextVersion(CustodyStatementOfHoldingsV02.class)
public class CustodyStatementOfHoldings
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Statement3 StatementGeneralDetails;
	private SafekeepingAccount1 AccountDetails;
	private Optional<AggregateBalanceInformation1> BalanceForAccount;
	private Optional<SubAccountIdentification1> SubAccountDetails;
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

	public Statement3 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement3 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public SafekeepingAccount1 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SafekeepingAccount1 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<AggregateBalanceInformation1> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation1> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification1> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification1> SubAccountDetails) {
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