package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Cancellation6Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;

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
@PreviousVersion(PortfolioTransferCancellationRequestV04.class)
@NextVersion(PortfolioTransferCancellationRequestV06.class)
public class PortfolioTransferCancellationRequestV05 {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Cancellation6Choice Cancellation;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;

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

	public Cancellation6Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation6Choice Cancellation) {
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