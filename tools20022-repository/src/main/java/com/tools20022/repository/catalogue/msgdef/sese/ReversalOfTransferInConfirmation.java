package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferIn1;

/**
 * Scope The ReversalOfTransferInConfirmation message is sent by an executing
 * party to the instructing party or the instructing party's designated agent.
 * This message is used to reverse a TransferInConfirmation that was previously
 * sent by the instructing party. Usage The ReversalOfTransferInConfirmation
 * message is sent by an executing party to reverse a previously sent
 * TransferInConfirmation. This message must contain the reference of the
 * message to be reversed. The message may also contain all the details of the
 * reversed message, but this is not recommended.
 */
@NextVersion(ReversalOfTransferInConfirmationV02.class)
public class ReversalOfTransferInConfirmation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 PreviousReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<TransferIn1> TransferInConfirmationToBeReversed;

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

	public Optional<TransferIn1> getTransferInConfirmationToBeReversed() {
		return TransferInConfirmationToBeReversed;
	}

	public void setTransferInConfirmationToBeReversed(
			Optional<TransferIn1> TransferInConfirmationToBeReversed) {
		this.TransferInConfirmationToBeReversed = TransferInConfirmationToBeReversed;
	}
}