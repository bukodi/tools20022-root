package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferOutConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferOutConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References11;
import com.tools20022.repository.dict.msg.TransferReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferOut8;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * ReversalOfTransferOutConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative, to cancel a
 * previously sent TransferOutConfirmation message. Usage The
 * ReversalOfTransferOutConfirmation message is used to reverse a previously
 * sent TransferOutConfirmation. There are two ways to specify the reversal of
 * the transfer out confirmation. Either: - the business references, for
 * example, TransferReference, TransferConfirmationIdentification, of the
 * transfer confirmation are quoted, or, - all the details of the transfer
 * confirmation (this includes TransferReference and
 * TransferConfirmationIdentification) are quoted but this is not recommended.
 * The message identification of the TransferOutConfirmation message in which
 * the transfer out confirmation was conveyed may also be quoted in
 * PreviousReference. The message identification of the TransferOutInstruction
 * message in which the transfer out instruction was conveyed may also be quoted
 * in RelatedReference.
 */
@PreviousVersion(ReversalOfTransferOutConfirmationV02.class)
@NextVersion(ReversalOfTransferOutConfirmationV04.class)
public class ReversalOfTransferOutConfirmationV03 {

	private MessageIdentification1 MessageIdentification;
	private References11 References;
	private Optional<TransferReference2> ReversalByReference;
	private Optional<TransferOut8> ReversalByTransferOutConfirmationDetails;
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

	public Optional<TransferReference2> getReversalByReference() {
		return ReversalByReference;
	}

	public void setReversalByReference(
			Optional<TransferReference2> ReversalByReference) {
		this.ReversalByReference = ReversalByReference;
	}

	public Optional<TransferOut8> getReversalByTransferOutConfirmationDetails() {
		return ReversalByTransferOutConfirmationDetails;
	}

	public void setReversalByTransferOutConfirmationDetails(
			Optional<TransferOut8> ReversalByTransferOutConfirmationDetails) {
		this.ReversalByTransferOutConfirmationDetails = ReversalByTransferOutConfirmationDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}