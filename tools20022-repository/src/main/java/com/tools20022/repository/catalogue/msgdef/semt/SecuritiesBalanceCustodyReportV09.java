package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceCustodyReportV08;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement45;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification100;
import com.tools20022.repository.dict.msg.SecuritiesAccount26;
import com.tools20022.repository.dict.msg.Intermediary32;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation30;
import com.tools20022.repository.dict.msg.SubAccountIdentification42;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement1;

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
@PreviousVersion(SecuritiesBalanceCustodyReportV08.class)
public class SecuritiesBalanceCustodyReportV09
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement45 StatementGeneralDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private Optional<PartyIdentification100> AccountServicer;
	private SecuritiesAccount26 SafekeepingAccount;
	private List<Intermediary32> IntermediaryInformation;
	private Optional<AggregateBalanceInformation30> BalanceForAccount;
	private Optional<SubAccountIdentification42> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement1> AccountBaseCurrencyTotalAmounts;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement45 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement45 StatementGeneralDetails) {
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

	public Optional<AggregateBalanceInformation30> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation30> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification42> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification42> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement1> getAccountBaseCurrencyTotalAmounts() {
		return AccountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement1> AccountBaseCurrencyTotalAmounts) {
		this.AccountBaseCurrencyTotalAmounts = AccountBaseCurrencyTotalAmounts;
	}
}