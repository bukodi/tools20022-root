package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactionsCancellationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.StatementOfInvestmentFundTransactions1;

/**
 * Scope The StatementOfInvestmentFundTransactionsCancellation message is sent
 * by an account servicer to the account owner or the account owner's designated
 * agent. The account servicer may be a fund administrator or fund intermediary,
 * trustee or registrar, etc. This message is used to cancel a previously sent
 * StatementOfInvestmentFundTransactions message. Usage The
 * StatementOfInvestmentFundTransactionsCancellation message is sent by an
 * account servicer to the account owner to cancel a previously sent
 * StatementOfInvestmentFundTransactions message. This message must contain the
 * reference of the message to be cancelled. This message may also contain all
 * the details of the message to be cancelled, but this is not recommended.
 */
@NextVersion(StatementOfInvestmentFundTransactionsCancellationV02.class)
public class StatementOfInvestmentFundTransactionsCancellation {

	private AdditionalReference2 PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Optional<StatementOfInvestmentFundTransactions1> StatementToBeCancelled;

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

	public Optional<StatementOfInvestmentFundTransactions1> getStatementToBeCancelled() {
		return StatementToBeCancelled;
	}

	public void setStatementToBeCancelled(
			Optional<StatementOfInvestmentFundTransactions1> StatementToBeCancelled) {
		this.StatementToBeCancelled = StatementToBeCancelled;
	}
}