package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement50;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails57;

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
 * receiving settlement chain using the same message.
 * 
 * The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
public class PortfolioTransferNotification002V04 {

	private Pagination Pagination;
	private Statement50 StatementGeneralDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount30 SafekeepingAccount;
	private Optional<SecuritiesTradeDetails57> TransferNotificationDetails;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement50 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement50 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount30 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount30 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SecuritiesTradeDetails57> getTransferNotificationDetails() {
		return TransferNotificationDetails;
	}

	public void setTransferNotificationDetails(
			Optional<SecuritiesTradeDetails57> TransferNotificationDetails) {
		this.TransferNotificationDetails = TransferNotificationDetails;
	}
}