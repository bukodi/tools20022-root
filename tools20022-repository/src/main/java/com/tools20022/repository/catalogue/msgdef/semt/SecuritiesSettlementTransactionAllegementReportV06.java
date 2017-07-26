package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesSettlementTransactionAllegementReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement39;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails68;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionAllegementReport to an account owner to
 * provide, at a specified time, the status and details of pending settlement
 * allegements, for all or selected securities in a specified safekeeping
 * account. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants - an agent (sub-custodian) acting on behalf of
 * their global custodian customer, or - a custodian acting on behalf of an
 * investment management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionAllegementReportV05.class)
public class SecuritiesSettlementTransactionAllegementReportV06 {

	private Pagination Pagination;
	private Statement39 StatementGeneralDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<SecuritiesTradeDetails68> AllegementDetails;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement39 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement39 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount24 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<SecuritiesTradeDetails68> getAllegementDetails() {
		return AllegementDetails;
	}

	public void setAllegementDetails(
			Optional<SecuritiesTradeDetails68> AllegementDetails) {
		this.AllegementDetails = AllegementDetails;
	}
}