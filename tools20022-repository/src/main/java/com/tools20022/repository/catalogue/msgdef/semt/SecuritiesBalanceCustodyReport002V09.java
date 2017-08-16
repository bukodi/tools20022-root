package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement52;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification111;
import com.tools20022.repository.dict.msg.SecuritiesAccount33;
import com.tools20022.repository.dict.msg.Intermediary37;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation33;
import com.tools20022.repository.dict.msg.SubAccountIdentification46;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement3;

/**
 * Scope An account servicer sends a SecuritiesBalanceCustodyReport to an
 * account owner to provide, at a moment in time, the quantity and
 * identification of the financial instruments that the account servicer holds
 * for the account owner.
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants, or - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer, or - a transfer agent acting on
 * behalf of a fund manager or an account owner's designated agent.
 * 
 * Usage The message can also include availability and the location of holdings
 * to facilitate trading and minimise settlement issues. The message reports all
 * information per financial instrument, that is, when a financial instrument is
 * held at multiple places of safekeeping, the total holdings for all locations
 * can be provided. The message should be sent at a frequency agreed
 * bi-laterally between the account servicer and the account owner. The message
 * may be provided on a trade date, contractual or settlement date basis. There
 * may be one or more intermediary parties, for example, an intermediary or a
 * concentrator between the account owner and account servicer.
 * 
 * The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
public class SecuritiesBalanceCustodyReport002V09
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement52 StatementGeneralDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private Optional<PartyIdentification111> AccountServicer;
	private SecuritiesAccount33 SafekeepingAccount;
	private List<Intermediary37> IntermediaryInformation;
	private Optional<AggregateBalanceInformation33> BalanceForAccount;
	private Optional<SubAccountIdentification46> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement3> AccountBaseCurrencyTotalAmounts;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement52 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement52 StatementGeneralDetails) {
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

	public Optional<AggregateBalanceInformation33> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation33> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification46> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification46> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement3> getAccountBaseCurrencyTotalAmounts() {
		return AccountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement3> AccountBaseCurrencyTotalAmounts) {
		this.AccountBaseCurrencyTotalAmounts = AccountBaseCurrencyTotalAmounts;
	}
}