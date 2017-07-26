package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.CustodyStatementOfHoldingsCancellation;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.CustodyStatementOfHoldings2;

/**
 * Scope An account servicer, for example, a transfer agent, sends the
 * CustodyStatementOfHoldingsCancellation message to the account owner, for
 * example, an investment manager or its authorised representative to cancel a
 * previously sent CustodyStatementOfHoldings message. Usage The
 * CustodyStatementOfHoldingsCancellation message is used to cancel a previously
 * sent CustodyStatementOfHoldings message. This message must contain the
 * reference of the message to be cancelled. This message may also contain
 * details of the message to be cancelled, but this is not recommended.
 */
@PreviousVersion(CustodyStatementOfHoldingsCancellation.class)
public class CustodyStatementOfHoldingsCancellationV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Optional<CustodyStatementOfHoldings2> StatementToBeCancelled;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference2> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference2> PreviousReference) {
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

	public Optional<CustodyStatementOfHoldings2> getStatementToBeCancelled() {
		return StatementToBeCancelled;
	}

	public void setStatementToBeCancelled(
			Optional<CustodyStatementOfHoldings2> StatementToBeCancelled) {
		this.StatementToBeCancelled = StatementToBeCancelled;
	}
}