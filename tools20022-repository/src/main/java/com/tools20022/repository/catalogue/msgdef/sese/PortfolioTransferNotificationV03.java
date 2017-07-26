package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferNotificationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferNotificationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement19;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails24;

/**
 * Scope An account servicer sends a PortfolioTransferNotification to another
 * account servicer to exchange transfer settlement details information during a
 * retail or institutional client portfolio transfer. The account servicers will
 * typically be local agents or global custodians acting on behalf of an
 * investment management institution, a broker/dealer or a retail client.
 * 
 * Usage By exchange of transfer settlement details, it is understood the
 * providing, by the delivering account servicer to the receiving account
 * servicer, of the settlement details (trade date, settlement date, delivering
 * settlement chain, quantities, etc.) of the individual transfers that will
 * take place during a full or partial portfolio transfer. This delivering
 * account servicer message may also include, for validation, the receiving
 * settlement chain as provided by the client. In case the receiving settlement
 * chain is not available to the delivering account servicer, the receiving
 * account servicer may in return provide to the delivering account servicer the
 * receiving settlement chain using the same message. The message may also be
 * used to: - re-send a message previously sent, - provide a third party with a
 * copy of a message for information, - re-send to a third party a copy of a
 * message for information using the relevant elements in the Business
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
@PreviousVersion(PortfolioTransferNotificationV02.class)
@NextVersion(PortfolioTransferNotificationV04.class)
public class PortfolioTransferNotificationV03 {

	private Pagination Pagination;
	private Statement19 StatementGeneralDetails;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<SecuritiesTradeDetails24> TransferNotificationDetails;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement19 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement19 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SecuritiesTradeDetails24> getTransferNotificationDetails() {
		return TransferNotificationDetails;
	}

	public void setTransferNotificationDetails(
			Optional<SecuritiesTradeDetails24> TransferNotificationDetails) {
		this.TransferNotificationDetails = TransferNotificationDetails;
	}
}