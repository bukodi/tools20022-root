package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferOutConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References20;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Reversal8Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;

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
@PreviousVersion(ReversalOfTransferOutConfirmationV06.class)
public class ReversalOfTransferOutConfirmationV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<References20> References;
	private Reversal8Choice Reversal;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<CopyInformation4> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<References20> getReferences() {
		return References;
	}

	public void setReferences(Optional<References20> References) {
		this.References = References;
	}

	public Reversal8Choice getReversal() {
		return Reversal;
	}

	public void setReversal(Reversal8Choice Reversal) {
		this.Reversal = Reversal;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}