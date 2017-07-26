package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesStatementQueryV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentNumber13;
import com.tools20022.repository.dict.msg.Statement42;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import com.tools20022.repository.dict.msg.SecuritiesAccount24;
import com.tools20022.repository.dict.msg.AdditionalQueryParameters11;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a SecuritiesStatementQuery to an account
 * servicer to request any existing securities statement. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with a local custodian, or - an investment management institution which
 * manage a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct to a central securities depository or another settlement
 * market infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesStatementQueryV05.class)
public class SecuritiesStatementQueryV06 {

	private DocumentNumber13 StatementRequested;
	private Optional<Statement42> StatementGeneralDetails;
	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount24 SafekeepingAccount;
	private Optional<AdditionalQueryParameters11> AdditionalQueryParameters;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentNumber13 getStatementRequested() {
		return StatementRequested;
	}

	public void setStatementRequested(DocumentNumber13 StatementRequested) {
		this.StatementRequested = StatementRequested;
	}

	public Optional<Statement42> getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(
			Optional<Statement42> StatementGeneralDetails) {
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

	public Optional<AdditionalQueryParameters11> getAdditionalQueryParameters() {
		return AdditionalQueryParameters;
	}

	public void setAdditionalQueryParameters(
			Optional<AdditionalQueryParameters11> AdditionalQueryParameters) {
		this.AdditionalQueryParameters = AdditionalQueryParameters;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}