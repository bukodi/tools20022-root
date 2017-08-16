package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesStatementQueryV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesStatementQueryV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentNumber1;
import com.tools20022.repository.dict.msg.Statement16;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.AdditionalQueryParameters9;
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
@PreviousVersion(SecuritiesStatementQueryV04.class)
@NextVersion(SecuritiesStatementQueryV06.class)
public class SecuritiesStatementQueryV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentNumber1 StatementRequested;
	private Optional<Statement16> StatementGeneralDetails;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<AdditionalQueryParameters9> AdditionalQueryParameters;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentNumber1 getStatementRequested() {
		return StatementRequested;
	}

	public void setStatementRequested(DocumentNumber1 StatementRequested) {
		this.StatementRequested = StatementRequested;
	}

	public Optional<Statement16> getStatementGeneralDetails() {
		return StatementGeneralDetails;
	}

	public void setStatementGeneralDetails(
			Optional<Statement16> StatementGeneralDetails) {
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

	public Optional<AdditionalQueryParameters9> getAdditionalQueryParameters() {
		return AdditionalQueryParameters;
	}

	public void setAdditionalQueryParameters(
			Optional<AdditionalQueryParameters9> AdditionalQueryParameters) {
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