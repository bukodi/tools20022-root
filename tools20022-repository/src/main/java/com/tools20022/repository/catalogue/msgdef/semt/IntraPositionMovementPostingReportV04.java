package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementPostingReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementPostingReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement15;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.FinancialInstrumentDetails14;

/**
 * Scope An account servicer sends an IntraPositionMovementPostingReport to an
 * account owner to provide the details of increases and decreases in securities
 * with a given status within a holding, that is, intra-position transfers,
 * which occurred during a specified period, for all or selected securities in a
 * specified safekeeping account which the account servicer holds for the
 * account owner.
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or Usage The message may also be used to: -
 * re-send a message previously sent, - provide a third party with a copy of a
 * message for information, - re-send to a third party a copy of a message for
 * information. using the relevant elements in the Business Application Header.
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
@PreviousVersion(IntraPositionMovementPostingReportV03.class)
@NextVersion(IntraPositionMovementPostingReportV05.class)
public class IntraPositionMovementPostingReportV04 {

	private Pagination Pagination;
	private Statement15 StatementGeneralDetails;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<FinancialInstrumentDetails14> FinancialInstrument;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement15 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement15 StatementGeneralDetails) {
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

	public Optional<FinancialInstrumentDetails14> getFinancialInstrument() {
		return FinancialInstrument;
	}

	public void setFinancialInstrument(
			Optional<FinancialInstrumentDetails14> FinancialInstrument) {
		this.FinancialInstrument = FinancialInstrument;
	}
}