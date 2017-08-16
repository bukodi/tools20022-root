package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Cancellation3Choice;

/**
 * Scope An instructing party, for example, a (new) plan manager (Transferee),
 * sends the PortfolioTransferCancellationRequest message to the executing
 * party, for example, a (old) plan manager (Transferor), to request the
 * cancellation of a previously sent PortfolioTransferInstruction. Usage The
 * PortfolioTransferCancellationRequest message is used to request the
 * cancellation of an entire PortfolioTransferInstruction message, ie, all the
 * product transfers that it contained. The cancellation request can be
 * specified either by: - quoting the transfer references of all the product
 * transfers listed in the PortfolioTransferInstruction message, or, - quoting
 * the details of all the product transfers (this includes TransferReference)
 * listed in PortfolioTransferInstruction message. The message identification of
 * the PortfolioTransferInstruction may also be quoted in PreviousReference. It
 * is also possible to request the cancellation of PortfolioTransferInstruction
 * by just quoting its message identification in PreviousReference.
 */
@PreviousVersion(PortfolioTransferCancellationRequestV03.class)
@NextVersion(PortfolioTransferCancellationRequestV05.class)
public class PortfolioTransferCancellationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Cancellation3Choice Cancellation;

	public MessageIdentification1 getMessageReference() {
		return MessageReference;
	}

	public void setMessageReference(MessageIdentification1 MessageReference) {
		this.MessageReference = MessageReference;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference3> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Cancellation3Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation3Choice Cancellation) {
		this.Cancellation = Cancellation;
	}
}