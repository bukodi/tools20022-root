package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.AccountingStatementOfHoldingsV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesBalanceAccountingReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement20;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount11;
import com.tools20022.repository.dict.msg.Intermediary2;
import java.util.List;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation8;
import com.tools20022.repository.dict.msg.SubAccountIdentification10;
import com.tools20022.repository.dict.msg.TotalValueInPageAndStatement2;

/**
 * Scope An account servicer sends a SecuritiesBalanceAccountingReport to an
 * account owner to provide, at a moment in time, valuations of the portfolio
 * together with details of each financial instrument holding. The account
 * servicer/owner relationship may be: - an accounting agent acting on behalf of
 * an account owner, or - a transfer agent acting on behalf of a fund manager or
 * an account owner's designated agent. Usage The message should be sent at a
 * frequency agreed bi-laterally between the account servicer and the account
 * owner. The message can be sent either audited or un-audited and may be
 * provided on a trade date, contractual or settlement date basis. This message
 * can only be used to list the holdings of a single (master) account. However,
 * it is possible to break down these holdings into one or several sub-accounts.
 * Therefore, the message can be used to either specify holdings at - the main
 * account level, or, - the sub-account level. This message can be used to
 * report where the financial instruments are safe-kept, physically or
 * notionally. If a security is held in more than one safekeeping place, this
 * can also be indicated. The SecuritiesBalanceAccountingReport message should
 * not be used for trading purposes. There may be one or more intermediary
 * parties, for example, an intermediary or a concentrator between the account
 * owner and account servicer. The message may also be used to: - re-send a
 * message previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(AccountingStatementOfHoldingsV02.class)
@NextVersion(SecuritiesBalanceAccountingReportV04.class)
public class SecuritiesBalanceAccountingReportV03 {

	private DocumentIdentification11 Identification;
	private Pagination Pagination;
	private Statement20 StatementGeneralDetails;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private Optional<PartyIdentification10Choice> AccountServicer;
	private SecuritiesAccount11 SafekeepingAccount;
	private List<Intermediary2> IntermediaryInformation;
	private Optional<AggregateBalanceInformation8> BalanceForAccount;
	private Optional<SubAccountIdentification10> SubAccountDetails;
	private Optional<TotalValueInPageAndStatement2> AccountBaseCurrencyTotalAmounts;
	private Optional<TotalValueInPageAndStatement2> AlternateReportingCurrencyTotalAmounts;
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

	public Statement20 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement20 StatementGeneralDetails) {
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

	public Optional<AggregateBalanceInformation8> getBalanceForAccount() {
		return BalanceForAccount;
	}

	public void setBalanceForAccount(
			Optional<AggregateBalanceInformation8> BalanceForAccount) {
		this.BalanceForAccount = BalanceForAccount;
	}

	public Optional<SubAccountIdentification10> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification10> SubAccountDetails) {
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