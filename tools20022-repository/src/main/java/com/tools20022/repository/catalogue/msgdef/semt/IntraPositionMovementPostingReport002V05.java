package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.IntraPositionMovementPostingReport002V06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement49;
import com.tools20022.repository.dict.choice.PartyIdentification103Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.msg.FinancialInstrumentDetails22;

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
@NextVersion(IntraPositionMovementPostingReport002V06.class)
public class IntraPositionMovementPostingReport002V05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement49 StatementGeneralDetails;
	private Optional<PartyIdentification103Choice> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<FinancialInstrumentDetails22> FinancialInstrument;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement49 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement49 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification103Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification103Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<FinancialInstrumentDetails22> getFinancialInstrument() {
		return FinancialInstrument;
	}

	public void setFinancialInstrument(
			Optional<FinancialInstrumentDetails22> FinancialInstrument) {
		this.FinancialInstrument = FinancialInstrument;
	}
}