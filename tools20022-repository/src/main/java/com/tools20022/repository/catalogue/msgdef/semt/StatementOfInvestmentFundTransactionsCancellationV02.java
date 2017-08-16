package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactionsCancellation;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.StatementOfInvestmentFundTransactionsCancellationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.StatementOfInvestmentFundTransactions2;

/**
 * Scope An account servicer, for example, a transfer agent sends the
 * StatementOfInvestmentFundTransactionsCancellation message to the account
 * owner, for example, an investment manager or its authorised representative to
 * cancel a previously sent StatementOfInvestmentFundTransactions message. Usage
 * The StatementOfInvestmentFundTransactionsCancellation message is used to
 * cancel a previously sent StatementOfInvestmentFundTransactions message. This
 * message must contain the reference of the message to be cancelled. This
 * message may also contain all the details of the message to be cancelled, but
 * this is not recommended.
 */
@PreviousVersion(StatementOfInvestmentFundTransactionsCancellation.class)
@NextVersion(StatementOfInvestmentFundTransactionsCancellationV03.class)
public class StatementOfInvestmentFundTransactionsCancellationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Optional<StatementOfInvestmentFundTransactions2> StatementToBeCancelled;

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

	public Optional<StatementOfInvestmentFundTransactions2> getStatementToBeCancelled() {
		return StatementToBeCancelled;
	}

	public void setStatementToBeCancelled(
			Optional<StatementOfInvestmentFundTransactions2> StatementToBeCancelled) {
		this.StatementToBeCancelled = StatementToBeCancelled;
	}
}