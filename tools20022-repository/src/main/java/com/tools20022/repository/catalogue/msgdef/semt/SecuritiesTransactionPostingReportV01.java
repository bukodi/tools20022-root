package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPostingReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement11;
import com.tools20022.repository.dict.choice.PartyIdentification13Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.FinancialInstrumentDetails2;
import com.tools20022.repository.dict.msg.SubAccountIdentification9;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;

/**
 * Scope An account servicer sends a SecuritiesTransactionPostingReport to an
 * account owner to provide the details of increases and decreases of holdings
 * which occurred during a specified period, for all or selected securities in
 * the specified safekeeping account or sub-safekeeping account which the
 * account servicer holds for the account owner. The account servicer/owner
 * relationship may be: - a central securities depository or another settlement
 * market infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer. Usage This message may be used as a trade date based or a
 * settlement date based statement. The message may also be used to: - re-send a
 * message previously sent (the sub-function of the message is Duplicate), -
 * provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy), - re-send to a third party a copy of a
 * message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesTransactionPostingReportV02.class)
public class SecuritiesTransactionPostingReportV01 {

	private DocumentIdentification11 Identification;
	private Pagination Pagination;
	private Statement11 StatementGeneralDetails;
	private Optional<PartyIdentification13Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<FinancialInstrumentDetails2> FinancialInstrumentDetails;
	private Optional<SubAccountIdentification9> SubAccountDetails;
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

	public Statement11 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement11 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification13Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification13Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<FinancialInstrumentDetails2> getFinancialInstrumentDetails() {
		return FinancialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(
			Optional<FinancialInstrumentDetails2> FinancialInstrumentDetails) {
		this.FinancialInstrumentDetails = FinancialInstrumentDetails;
	}

	public Optional<SubAccountIdentification9> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification9> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
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