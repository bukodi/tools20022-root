package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementPostingReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementPostingReportV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement43;
import com.tools20022.repository.dict.choice.PartyIdentification92Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.msg.FinancialInstrumentDetails21;

/**
 * Scope An account servicer sends an IntraPositionMovementPostingReport to an
 * account owner to provide the details of increases and decreases in securities
 * with a given status within a holding, that is, intra-position transfers,
 * which occurred during a specified period, for all or selected securities in a
 * specified safekeeping account which the account servicer holds for the
 * account owner.
 * 
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage : The message may also be used to: - re-send a message previously sent,
 * - provide a third party with a copy of a message for information, - re-send
 * to a third party a copy of a message for information using the relevant
 * elements in the Business Application Header.
 */
@PreviousVersion(IntraPositionMovementPostingReportV04.class)
@NextVersion(IntraPositionMovementPostingReportV06.class)
public class IntraPositionMovementPostingReportV05 {

	private Pagination Pagination;
	private Statement43 StatementGeneralDetails;
	private Optional<PartyIdentification92Choice> AccountOwner;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<FinancialInstrumentDetails21> FinancialInstrument;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement43 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement43 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification92Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification92Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount24 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount24 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<FinancialInstrumentDetails21> getFinancialInstrument() {
		return FinancialInstrument;
	}

	public void setFinancialInstrument(
			Optional<FinancialInstrumentDetails21> FinancialInstrument) {
		this.FinancialInstrument = FinancialInstrument;
	}
}