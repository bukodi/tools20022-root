package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement51;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification111;
import com.tools20022.repository.dict.msg.SecuritiesAccount33;
import com.tools20022.repository.dict.msg.Intermediary37;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation32;
import com.tools20022.repository.dict.msg.SubAccountIdentification45;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement4;

/**
 * Scope An account servicer sends a SecuritiesBalanceAccountingReport to an
 * account owner to provide, at a moment in time, valuations of the portfolio
 * together with details of each financial instrument holding. The account
 * servicer/owner relationship may be: - an accounting agent acting on behalf of
 * an account owner, or - a transfer agent acting on behalf of a fund manager or
 * an account owner's designated agent.
 * 
 * Usage The message should be sent at a frequency agreed bi-laterally between
 * the account servicer and the account owner. The message can be sent either
 * audited or un-audited and may be provided on a trade date, contractual or
 * settlement date basis. This message can only be used to list the holdings of
 * a single (master) account. However, it is possible to break down these
 * holdings into one or several sub-accounts. Therefore, the message can be used
 * to either specify holdings at - the main account level, or, - the sub-account
 * level. This message can be used to report where the financial instruments are
 * safe-kept, physically or notionally. If a security is held in more than one
 * safekeeping place, this can also be indicated. The
 * SecuritiesBalanceAccountingReport message should not be used for trading
 * purposes. There may be one or more intermediary parties, for example, an
 * intermediary or a concentrator between the account owner and account
 * servicer. The message may also be used to: - re-send a message previously
 * sent, - provide a third party with a copy of a message for information, -
 * re-send to a third party a copy of a message for information using the
 * relevant elements in the Business Application Header.
 */
public class SecuritiesBalanceAccountingReport002V09
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement51 StatementGeneralDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private Optional<PartyIdentification111> AccountServicer;
	private SecuritiesAccount33 SafekeepingAccount;
	private List<Intermediary37> IntermediaryInformation;
	private Optional<AggregateBalanceInformation32> BalanceForAccount;
	private Optional<SubAccountIdentification45> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement4> AccountBaseCurrencyTotalAmounts;
	private Optional<TotalValueInPageAndStatement4> AlternateReportingCurrencyTotalAmounts;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement51 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement51 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<PartyIdentification111> getAccountServicer() {
		return AccountServicer;
	}

	public void setAccountServicer(
			Optional<PartyIdentification111> AccountServicer) {
		this.AccountServicer = AccountServicer;
	}

	public SecuritiesAccount33 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount33 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public List<Intermediary37> getIntermediaryInformation() {
		return IntermediaryInformation;
	}

	public void setIntermediaryInformation(
			List<Intermediary37> IntermediaryInformation) {
		this.IntermediaryInformation = IntermediaryInformation;
	}

	public Optional<AggregateBalanceInformation32> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation32> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification45> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification45> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement4> getAccountBaseCurrencyTotalAmounts() {
		return AccountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement4> AccountBaseCurrencyTotalAmounts) {
		this.AccountBaseCurrencyTotalAmounts = AccountBaseCurrencyTotalAmounts;
	}

	public Optional<TotalValueInPageAndStatement4> getAlternateReportingCurrencyTotalAmounts() {
		return AlternateReportingCurrencyTotalAmounts;
	}

	public void setAlternateReportingCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement4> AlternateReportingCurrencyTotalAmounts) {
		this.AlternateReportingCurrencyTotalAmounts = AlternateReportingCurrencyTotalAmounts;
	}
}