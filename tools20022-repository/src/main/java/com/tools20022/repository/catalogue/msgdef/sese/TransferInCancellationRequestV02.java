package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationInstruction;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferReference1;
import com.tools20022.repository.dict.msg.TransferIn3;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An instructing party, eg, a transfer agent, sends the
 * TransferInCancellationRequest message to the executing party, eg, a transfer
 * agent, to request the cancellation of a previously sent
 * TransferInInstruction. Usage The TransferInCancellationRequest message is
 * used to request cancellation of a previously sent TransferInInstruction.
 * There are two ways to specify the transfer cancellation request. Either: -
 * the transfer reference of the original transfer is quoted, or, - all the
 * details of the original transfer (this includes TransferReference) are quoted
 * but this is not recommended. The message identification of the
 * TransferInInstruction message in which the transfer was conveyed may also be
 * quoted in PreviousReference. It is also possible to request the cancellation
 * of a TransferInInstruction message by quoting its message identification in
 * PreviousReference.
 */
@PreviousVersion(TransferInCancellationInstruction.class)
@NextVersion(TransferInCancellationRequestV03.class)
public class TransferInCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<TransferReference1> CancellationByReference;
	private Optional<TransferIn3> CancellationByTransferInDetails;
	private Optional<CopyInformation2> CopyDetails;

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

	public Optional<TransferReference1> getCancellationByReference() {
		return CancellationByReference;
	}

	public void setCancellationByReference(
			Optional<TransferReference1> CancellationByReference) {
		this.CancellationByReference = CancellationByReference;
	}

	public Optional<TransferIn3> getCancellationByTransferInDetails() {
		return CancellationByTransferInDetails;
	}

	public void setCancellationByTransferInDetails(
			Optional<TransferIn3> CancellationByTransferInDetails) {
		this.CancellationByTransferInDetails = CancellationByTransferInDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}