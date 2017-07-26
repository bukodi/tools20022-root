package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferInConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References20;
import java.util.Optional;
import com.tools20022.repository.dict.codeset.TransferInFunction2Code;
import com.tools20022.repository.dict.choice.Reversal7Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;

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
@PreviousVersion(ReversalOfTransferInConfirmationV06.class)
public class ReversalOfTransferInConfirmationV07 {

	private MessageIdentification1 MessageIdentification;
	private Optional<References20> References;
	private Optional<TransferInFunction2Code> Function;
	private Reversal7Choice Reversal;
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

	public Optional<TransferInFunction2Code> getFunction() {
		return Function;
	}

	public void setFunction(Optional<TransferInFunction2Code> Function) {
		this.Function = Function;
	}

	public Reversal7Choice getReversal() {
		return Reversal;
	}

	public void setReversal(Reversal7Choice Reversal) {
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