package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesTransactionPostingReport002V07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Statement56;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount27;
import com.tools20022.repository.dict.msg.FinancialInstrumentDetails23;
import com.tools20022.repository.dict.msg.SubAccountIdentification47;

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
 * broker/dealer.
 * 
 * Usage This message may be used as a trade date based or a settlement date
 * based statement. The message may also be used to: - re-send a message
 * previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 */
@NextVersion(SecuritiesTransactionPostingReport002V07.class)
public class SecuritiesTransactionPostingReport002V06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Statement56 StatementGeneralDetails;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount27 SafekeepingAccount;
	private Optional<FinancialInstrumentDetails23> FinancialInstrumentDetails;
	private Optional<SubAccountIdentification47> SubAccountDetails;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Statement56 getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(Statement56 StatementGeneralDetails) {
		this.StatementGeneralDetails = StatementGeneralDetails;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount27 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<FinancialInstrumentDetails23> getFinancialInstrumentDetails() {
		return FinancialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(
			Optional<FinancialInstrumentDetails23> FinancialInstrumentDetails) {
		this.FinancialInstrumentDetails = FinancialInstrumentDetails;
	}

	public Optional<SubAccountIdentification47> getSubAccountDetails() {
		return SubAccountDetails;
	}

	public void setSubAccountDetails(
			Optional<SubAccountIdentification47> SubAccountDetails) {
		this.SubAccountDetails = SubAccountDetails;
	}
}