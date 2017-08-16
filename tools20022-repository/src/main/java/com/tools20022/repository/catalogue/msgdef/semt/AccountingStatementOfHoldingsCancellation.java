package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.semt.AccountingStatementOfHoldingsCancellationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.AccountingStatementOfHoldings1;

/**
 * Scope The AccountingStatementOfHoldingsCancellation message is sent by an
 * account servicer to the account owner or the account owner's designated
 * agent. The account servicer may be a local agent (sub-custodian) acting on
 * behalf of its global custodian customer, a custodian acting on behalf of an
 * investment management institution or a broker/dealer, a fund administrator or
 * fund intermediary, trustee or registrar. This message is used to cancel a
 * previously sent AccountingStatementOfHoldings message. Usage The
 * AccountingStatementOfHoldingsCancellation message is sent by an account
 * servicer to the account owner to cancel a previously sent
 * AccountingStatementOfHoldings message. This message must contain the
 * reference of the message to be cancelled. This message may also contain all
 * the details of the message to be cancelled, but this is not recommended.
 */
@NextVersion(AccountingStatementOfHoldingsCancellationV02.class)
public class AccountingStatementOfHoldingsCancellation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 PreviousReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Pagination MessagePagination;
	private Optional<AccountingStatementOfHoldings1> StatementToBeCancelled;

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

	public Optional<AccountingStatementOfHoldings1> getStatementToBeCancelled() {
		return StatementToBeCancelled;
	}

	public void setStatementToBeCancelled(
			Optional<AccountingStatementOfHoldings1> StatementToBeCancelled) {
		this.StatementToBeCancelled = StatementToBeCancelled;
	}
}