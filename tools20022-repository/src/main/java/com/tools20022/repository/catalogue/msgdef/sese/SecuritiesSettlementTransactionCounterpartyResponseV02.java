package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionCounterpartyResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionIdentification6;
import com.tools20022.repository.dict.choice.ResponseStatus6Choice;
import com.tools20022.repository.dict.msg.TransactionDetails82;
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
 */
@PreviousVersion(SecuritiesSettlementTransactionCounterpartyResponseV01.class)
public class SecuritiesSettlementTransactionCounterpartyResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionIdentification6 TransactionIdentification;
	private ResponseStatus6Choice ResponseStatus;
	private Optional<TransactionDetails82> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionIdentification6 getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			TransactionIdentification6 TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ResponseStatus6Choice getResponseStatus() {
		return ResponseStatus;
	}

	public void setResponseStatus(ResponseStatus6Choice ResponseStatus) {
		this.ResponseStatus = ResponseStatus;
	}

	public Optional<TransactionDetails82> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails82> TransactionDetails) {
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