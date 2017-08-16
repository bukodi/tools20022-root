package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.CustodyStatementOfHoldingsV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceCustodyReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement21;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount11;
import com.tools20022.repository.dict.msg.Intermediary2;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation9;
import com.tools20022.repository.dict.msg.SubAccountIdentification11;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement1;

/**
 * Scope An account servicer sends a SecuritiesBalanceCustodyReport to an
 * account owner to provide, at a moment in time, the quantity and
 * identification of the financial instruments that the account servicer holds
 * for the account owner The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * acting on behalf of their participants, or - an agent (sub-custodian) acting
 * on behalf of their global custodian customer, or - a custodian acting on
 * behalf of an investment management institution or a broker/dealer, or - a
 * transfer agent acting on behalf of a fund manager or an account owner's
 * designated agent. Usage The message can also include availability and the
 * location of holdings to facilitate trading and minimise settlement issues.
 * The message reports all information per financial instrument, that is, when a
 * financial instrument is held at multiple places of safekeeping, the total
 * holdings for all locations can be provided. The message should be sent at a
 * frequency agreed bi-laterally between the account servicer and the account
 * owner. The message may be provided on a trade date, contractual or settlement
 * date basis. There may be one or more intermediary parties, for example, an
 * intermediary or a concentrator between the account owner and account
 * servicer. The message may also be used to: - re-send a message previously
 * sent, - provide a third party with a copy of a message for information, -
 * re-send to a third party a copy of a message for information. using the
 * relevant elements in the Business Application Header. ISO 15022 - 20022
 * Coexistence This ISO 20022 message is reversed engineered from ISO 15022.
 * Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(CustodyStatementOfHoldingsV02.class)
@NextVersion(SecuritiesBalanceCustodyReportV04.class)
public class SecuritiesBalanceCustodyReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification11 Identification;
	private Pagination Pagination;
	private Statement21 StatementGeneralDetails;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private Optional<PartyIdentification10Choice> AccountServicer;
	private SecuritiesAccount11 SafekeepingAccount;
	private List<Intermediary2> IntermediaryInformation;
	private Optional<AggregateBalanceInformation9> BalanceForAccount;
	private Optional<SubAccountIdentification11> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement1> AccountBaseCurrencyTotalAmounts;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement21 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement21 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification13Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public Optional<PartyIdentification10Choice> getAccountServicer() {
		return AccountServicer;
	}

	public void setAccountServicer(
			Optional<PartyIdentification10Choice> AccountServicer) {
		this.AccountServicer = AccountServicer;
	}

	public SecuritiesAccount11 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount11 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public List<Intermediary2> getIntermediaryInformation() {
		return IntermediaryInformation;
	}

	public void setIntermediaryInformation(
			List<Intermediary2> IntermediaryInformation) {
		this.IntermediaryInformation = IntermediaryInformation;
	}

	public Optional<AggregateBalanceInformation9> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation9> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification11> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification11> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}

	public Optional<TotalValueInPageAndStatement1> getAccountBaseCurrencyTotalAmounts() {
		return AccountBaseCurrencyTotalAmounts;
	}

	public void setAccountBaseCurrencyTotalAmounts(
			Optional<TotalValueInPageAndStatement1> AccountBaseCurrencyTotalAmounts) {
		this.AccountBaseCurrencyTotalAmounts = AccountBaseCurrencyTotalAmounts;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}
}