package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.PortfolioTransferCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PEPISATransfer7;
import com.tools20022.repository.dict.msg.TransferReference3;

/**
 * Scope An instructing party, eg, a (new) plan manager, sends the
 * PEPOrISAOrPortfolioTransferCancellationRequest message to the executing
 * party, eg, a (old) plan manager, to request the cancellation of a previously
 * sent PEPOrISAOrPortfolioTransferInstruction. Usage The
 * PEPOrISAOrPortfolioTransferCancellationRequest message is used to request the
 * cancellation of an entire PEPOrISAOrPortfolioTransferInstruction message, ie,
 * all the product transfers that it contained. The cancellation request can be
 * specified either by: - quoting the transfer references of all the product
 * transfers listed in the PEPOrISAOrPortfolioTransferInstruction message, or, -
 * quoting the details of all the product transfers (this includes
 * TransferReference) listed in PEPOrISAOrPortfolioTransferInstruction message.
 * The message identification of the PEPOrISAOrPortfolioTransferInstruction may
 * also be quoted in PreviousReference. It is also possible to request the
 * cancellation of PEPOrISAOrPortfolioTransferInstruction by just quoting its
 * message identification in PreviousReference.
 */
@NextVersion(PortfolioTransferCancellationRequestV03.class)
public class PEPOrISAOrPortfolioTransferCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<PEPISATransfer7> CancellationByTransferInstructionDetails;
	private Optional<TransferReference3> CancellationByReference;

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

	public Optional<PEPISATransfer7> getCancellationByTransferInstructionDetails() {
		return CancellationByTransferInstructionDetails;
	}

	public void setCancellationByTransferInstructionDetails(
			Optional<PEPISATransfer7> CancellationByTransferInstructionDetails) {
		this.CancellationByTransferInstructionDetails = CancellationByTransferInstructionDetails;
	}

	public Optional<TransferReference3> getCancellationByReference() {
		return CancellationByReference;
	}

	public void setCancellationByReference(
			Optional<TransferReference3> CancellationByReference) {
		this.CancellationByReference = CancellationByReference;
	}
}