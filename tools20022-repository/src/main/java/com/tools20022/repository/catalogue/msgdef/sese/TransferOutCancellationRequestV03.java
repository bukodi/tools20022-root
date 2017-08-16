package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutCancellationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References11;
import com.tools20022.repository.dict.msg.TransferReference1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferOut7;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the TransferOutCancellationRequest message
 * to the executing party, for example, a transfer agent, to request the
 * cancellation of a previously sent TransferOutInstruction. Usage The
 * TransferOutCancellationRequest message is used to request cancellation of a
 * previously sent TransferOutInstruction. There are two ways to specify the
 * transfer cancellation request. Either: - the transfer reference of the
 * original transfer is quoted, or, - all the details of the original transfer
 * (this includes TransferReference) are quoted but this is not recommended. The
 * message identification of the TransferOutInstruction message in which the
 * original transfer was conveyed may also be quoted in PreviousReference. It is
 * also possible to request the cancellation of a TransferOutInstruction message
 * by quoting its message identification in PreviousReference.
 */
@PreviousVersion(TransferOutCancellationRequestV02.class)
@NextVersion(TransferOutCancellationRequestV04.class)
public class TransferOutCancellationRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private References11 References;
	private Optional<TransferReference1> CancellationByReference;
	private Optional<TransferOut7> CancellationByTransferOutDetails;
	private Optional<CopyInformation2> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public References11 getReferences() {
		return References;
	}

	public void setReferences(References11 References) {
		this.References = References;
	}

	public Optional<TransferReference1> getCancellationByReference() {
		return CancellationByReference;
	}

	public void setCancellationByReference(
			Optional<TransferReference1> CancellationByReference) {
		this.CancellationByReference = CancellationByReference;
	}

	public Optional<TransferOut7> getCancellationByTransferOutDetails() {
		return CancellationByTransferOutDetails;
	}

	public void setCancellationByTransferOutDetails(
			Optional<TransferOut7> CancellationByTransferOutDetails) {
		this.CancellationByTransferOutDetails = CancellationByTransferOutDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}