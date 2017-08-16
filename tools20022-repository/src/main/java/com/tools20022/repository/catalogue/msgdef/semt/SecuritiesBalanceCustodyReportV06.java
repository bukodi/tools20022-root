package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceCustodyReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceCustodyReportV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement33;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification49Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount11;
import com.tools20022.repository.dict.msg.Intermediary23;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation21;
import com.tools20022.repository.dict.msg.SubAccountIdentification28;
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
 * concentrator between the account owner and account servicer. The message may
 * also be used to: - re-send a message previously sent, - provide a third party
 * with a copy of a message for information, - re-send to a third party a copy
 * of a message for information using the relevant elements in the Business
 * Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesBalanceCustodyReportV05.class)
@NextVersion(SecuritiesBalanceCustodyReportV07.class)
public class SecuritiesBalanceCustodyReportV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement33 StatementGeneralDetails;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private Optional<PartyIdentification49Choice> AccountServicer;
	private SecuritiesAccount11 SafekeepingAccount;
	private List<Intermediary23> IntermediaryInformation;
	private Optional<AggregateBalanceInformation21> BalanceForAccount;
	private Optional<SubAccountIdentification28> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement1> AccountBaseCurrencyTotalAmounts;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement33 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement33 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<PartyIdentification49Choice> getAccountServicer() {
		return AccountServicer;
	}

	public void setAccountServicer(
			Optional<PartyIdentification49Choice> AccountServicer) {
		this.AccountServicer = AccountServicer;
	}

	public SecuritiesAccount11 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount11 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public List<Intermediary23> getIntermediaryInformation() {
		return IntermediaryInformation;
	}

	public void setIntermediaryInformation(
			List<Intermediary23> IntermediaryInformation) {
		this.IntermediaryInformation = IntermediaryInformation;
	}

	public Optional<AggregateBalanceInformation21> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation21> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification28> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification28> SubAccountDetails) {
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