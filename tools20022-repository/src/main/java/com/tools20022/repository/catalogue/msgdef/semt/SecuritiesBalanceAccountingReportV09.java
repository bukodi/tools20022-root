package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceAccountingReportV08;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement40;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification100;
import com.tools20022.repository.dict.msg.SecuritiesAccount26;
import com.tools20022.repository.dict.msg.Intermediary32;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation31;
import com.tools20022.repository.dict.msg.SubAccountIdentification43;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement2;

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
@PreviousVersion(SecuritiesBalanceAccountingReportV08.class)
public class SecuritiesBalanceAccountingReportV09 {

	private Pagination Pagination;
	private Statement40 StatementGeneralDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private Optional<PartyIdentification100> AccountServicer;
	private SecuritiesAccount26 SafekeepingAccount;
	private List<Intermediary32> IntermediaryInformation;
	private Optional<AggregateBalanceInformation31> BalanceForAccount;
	private Optional<SubAccountIdentification43> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement2> AccountBaseCurrencyTotalAmounts;
	private Optional<TotalValueInPageAndStatement2> AlternateReportingCurrencyTotalAmounts;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement40 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement40 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<PartyIdentification100> getAccountServicer() {
		return AccountServicer;
	}

	public void setAccountServicer(
			Optional<PartyIdentification100> AccountServicer) {
		this.AccountServicer = AccountServicer;
	}

	public SecuritiesAccount26 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount26 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public List<Intermediary32> getIntermediaryInformation() {
		return IntermediaryInformation;
	}

	public void setIntermediaryInformation(
			List<Intermediary32> IntermediaryInformation) {
		this.IntermediaryInformation = IntermediaryInformation;
	}

	public Optional<AggregateBalanceInformation31> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation31> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification43> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification43> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement2> getAccountBaseCurrencyTotalAmounts() {
		return AccountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement2> AccountBaseCurrencyTotalAmounts) {
		this.AccountBaseCurrencyTotalAmounts = AccountBaseCurrencyTotalAmounts;
	}

	public Optional<TotalValueInPageAndStatement2> getAlternateReportingCurrencyTotalAmounts() {
		return AlternateReportingCurrencyTotalAmounts;
	}

	public void setAlternateReportingCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement2> AlternateReportingCurrencyTotalAmounts) {
		this.AlternateReportingCurrencyTotalAmounts = AlternateReportingCurrencyTotalAmounts;
	}
}