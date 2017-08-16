package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferNotificationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement46;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails48;

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
@PreviousVersion(PortfolioTransferNotificationV03.class)
public class PortfolioTransferNotificationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement46 StatementGeneralDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount19 SafekeepingAccount;
	private Optional<SecuritiesTradeDetails48> TransferNotificationDetails;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement46 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement46 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount19 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount19 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SecuritiesTradeDetails48> getTransferNotificationDetails() {
		return TransferNotificationDetails;
	}

	public void setTransferNotificationDetails(
			Optional<SecuritiesTradeDetails48> TransferNotificationDetails) {
		this.TransferNotificationDetails = TransferNotificationDetails;
	}
}