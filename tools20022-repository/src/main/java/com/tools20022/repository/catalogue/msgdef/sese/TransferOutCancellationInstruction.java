package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutCancellationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferOut2;

/**
 * Scope The TransferOutCancellationInstruction message is sent by an
 * instructing party or an instructing party's designated agent to the executing
 * party. This message is used to request the cancellation of a
 * TransferOutInstruction that was previously sent by the instructing party.
 * Usage The TransferOutCancellationInstruction message is sent by an
 * instructing party to request cancellation of a previously sent
 * TransferOutInstruction. This message must contain the reference of the
 * message to be cancelled. The message may also contain all the details of the
 * message to be cancelled, but this is not recommended.
 */
@NextVersion(TransferOutCancellationRequestV02.class)
public class TransferOutCancellationInstruction
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 PreviousReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<TransferOut2> TransferOutToBeCancelled;

	public AdditionalReference2 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(AdditionalReference2 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference2> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Optional<TransferOut2> getTransferOutToBeCancelled() {
		return TransferOutToBeCancelled;
	}

	public void setTransferOutToBeCancelled(
			Optional<TransferOut2> TransferOutToBeCancelled) {
		this.TransferOutToBeCancelled = TransferOutToBeCancelled;
	}
}