package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References11;
import com.tools20022.repository.dict.choice.Cancellation2Choice;
import com.tools20022.repository.dict.msg.CopyInformation2;
import java.util.Optional;

/**
 * Scope An instructing party, for example, a transfer agent, sends the
 * TransferInCancellationRequest message to the executing party, for example, a
 * transfer agent, to request the cancellation of a previously sent
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
@PreviousVersion(TransferInCancellationRequestV03.class)
@NextVersion(TransferInCancellationRequestV05.class)
public class TransferInCancellationRequestV04 {

	private MessageIdentification1 MessageIdentification;
	private References11 References;
	private Cancellation2Choice Cancellation;
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

	public Cancellation2Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation2Choice Cancellation) {
		this.Cancellation = Cancellation;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}