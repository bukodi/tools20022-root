package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.CustodyStatementOfHoldingsCancellationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.CustodyStatementOfHoldings1;

/**
 * Scope The CustodyStatementOfHoldingsCancellation message is sent by an
 * account servicer to the account owner or the account owner's designated
 * agent. The account servicer may be a local agent (sub-custodian) acting on
 * behalf of its global custodian customer, a custodian acting on behalf of an
 * investment management institution or a broker/dealer, a fund administrator or
 * fund intermediary, trustee or registrar, etc. This message is used to cancel
 * a previously sent CustodyStatementOfHoldings message. Usage The
 * CustodyStatementOfHoldingsCancellation message is sent by an account servicer
 * to the account owner to cancel a previously sent CustodyStatementOfHoldings
 * message. This message must contain the reference of the message to be
 * cancelled. This message may also contain details of the message to be
 * cancelled, but this is not recommended.
 */
@NextVersion(CustodyStatementOfHoldingsCancellationV02.class)
public class CustodyStatementOfHoldingsCancellation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Optional<CustodyStatementOfHoldings1> StatementToBeCancelled;

	public AdditionalReference2 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(AdditionalReference2 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Pagination getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Pagination MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Optional<CustodyStatementOfHoldings1> getStatementToBeCancelled() {
		return StatementToBeCancelled;
	}

	public void setStatementToBeCancelled(
			Optional<CustodyStatementOfHoldings1> StatementToBeCancelled) {
		this.StatementToBeCancelled = StatementToBeCancelled;
	}
}