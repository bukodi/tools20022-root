package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionCounterpartyResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionIdentification2;
import com.tools20022.repository.dict.choice.ResponseStatus3Choice;
import com.tools20022.repository.dict.msg.TransactionDetails40;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a
 * SecuritiesSettlementTransactionCounterpartyResponse to advise the account
 * servicer that: - the allegement received is either rejected (that is
 * counterparty's transaction is unknown) or accepted (i.e. either the
 * allegement was passed to the client or the transaction is know with or
 * without mismatches) - the modification or cancellation request sent by the
 * counterparty for a matched transaction is affirmed or not. The account
 * servicer will therefore proceed or not with the counterparty's request to
 * modify or cancel the transaction. The account servicer may be a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants The account owner may be: - a central securities
 * depository participant which has an account with a central securities
 * depository or a market infrastructure - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message sent by the
 * account owner to the account servicer, - provide a third party with a copy of
 * a message being sent by the account owner for information, - re-send to a
 * third party a copy of a message being sent by the account owner for
 * information using the relevant elements in the Business Application Header.
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
@NextVersion(SecuritiesSettlementTransactionCounterpartyResponseV02.class)
public class SecuritiesSettlementTransactionCounterpartyResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionIdentification2 TransactionIdentification;
	private ResponseStatus3Choice ResponseStatus;
	private Optional<TransactionDetails40> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentification2 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentification2 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ResponseStatus3Choice getResponseStatus() {
		return ResponseStatus;
	}

	public void setResponseStatus(ResponseStatus3Choice ResponseStatus) {
		this.ResponseStatus = ResponseStatus;
	}

	public Optional<TransactionDetails40> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails40> TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}