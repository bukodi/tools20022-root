package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References11;
import com.tools20022.repository.dict.msg.TransferReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferIn6;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * ReversalOfTransferInConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative, to cancel a
 * previously sent TransferInConfirmation message. Usage The
 * ReversalOfTransferInConfirmation message is used to reverse a previously sent
 * TransferInConfirmation. There are two ways to specify the reversal of the
 * transfer in confirmation. Either: - the business references, for example,
 * TransferReference, TransferConfirmationIdentification, of the transfer
 * confirmation are quoted, or, - all the details of the transfer confirmation
 * (this includes TransferReference and TransferConfirmationIdentification) are
 * quoted but this is not recommended. The message identification of the
 * TransferInConfirmation message in which the transfer confirmation was
 * conveyed may also be quoted in PreviousReference. The message reference
 * (MessageIdentification) of the TransferInInstruction message in which the
 * transfer instruction was conveyed may also be quoted in RelatedReference. It
 * is also possible to request a reversal of a TransferInConfirmation by quoting
 * its message reference (MessageIdentification) in PreviousReference.
 */
@PreviousVersion(ReversalOfTransferInConfirmationV02.class)
@NextVersion(ReversalOfTransferInConfirmationV04.class)
public class ReversalOfTransferInConfirmationV03 {

	private MessageIdentification1 MessageIdentification;
	private References11 References;
	private Optional<TransferReference2> ReversalByReference;
	private Optional<TransferIn6> ReversalByTransferInConfirmationDetails;
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

	public Optional<TransferIn6> getReversalByTransferInConfirmationDetails() {
		return ReversalByTransferInConfirmationDetails;
	}

	public void setReversalByTransferInConfirmationDetails(
			Optional<TransferIn6> ReversalByTransferInConfirmationDetails) {
		this.ReversalByTransferInConfirmationDetails = ReversalByTransferInConfirmationDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}