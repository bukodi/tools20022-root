package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference6;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Cancellation11Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;

/**
 * Scope An instructing party, for example, a (new) plan manager (Transferee),
 * sends the PortfolioTransferCancellationRequest message to the executing
 * party, for example, a (old) plan manager (Transferor), to request the
 * cancellation of a previously sent PortfolioTransferInstruction. Usage The
 * PortfolioTransferCancellationRequest message is used to request the
 * cancellation of an entire PortfolioTransferInstruction message, that is, all
 * the product transfers that it contained. The cancellation request can be
 * specified either by: - quoting the transfer references of all the product
 * transfers listed in the PortfolioTransferInstruction message, or, - quoting
 * the details of all the product transfers (this includes TransferReference)
 * listed in PortfolioTransferInstruction message. The message identification of
 * the PortfolioTransferInstruction may also be quoted in PreviousReference. It
 * is also possible to request the cancellation of PortfolioTransferInstruction
 * by just quoting its message identification in PreviousReference.
 */
@PreviousVersion(PortfolioTransferCancellationRequestV06.class)
public class PortfolioTransferCancellationRequestV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference6> PoolReference;
	private Optional<AdditionalReference6> PreviousReference;
	private Optional<AdditionalReference6> RelatedReference;
	private Cancellation11Choice Cancellation;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;

	public MessageIdentification1 getMessageReference() {
		return MessageReference;
	}

	public void setMessageReference(MessageIdentification1 MessageReference) {
		this.MessageReference = MessageReference;
	}

	public Optional<AdditionalReference6> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference6> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference6> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference6> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Cancellation11Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation11Choice Cancellation) {
		this.Cancellation = Cancellation;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}
}