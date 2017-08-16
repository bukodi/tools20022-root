package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References11;
import com.tools20022.repository.dict.choice.Reversal2Choice;
import com.tools20022.repository.dict.msg.CopyInformation2;
import java.util.Optional;

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
 * transfer instruction was conveyed may also be quoted in RelatedReference.
 */
@PreviousVersion(ReversalOfTransferInConfirmationV03.class)
@NextVersion(ReversalOfTransferInConfirmationV05.class)
public class ReversalOfTransferInConfirmationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private References11 References;
	private Reversal2Choice Reversal;
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

	public Reversal2Choice getReversal() {
		return Reversal;
	}

	public void setReversal(Reversal2Choice Reversal) {
		this.Reversal = Reversal;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}