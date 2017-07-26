package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferOutCancellationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferOutCancellationRequestV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References15;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Cancellation8Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
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
@PreviousVersion(TransferOutCancellationRequestV05.class)
@NextVersion(TransferOutCancellationRequestV07.class)
public class TransferOutCancellationRequestV06 {

	private MessageIdentification1 MessageIdentification;
	private Optional<References15> References;
	private Cancellation8Choice Cancellation;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<CopyInformation2> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<References15> getReferences() {
		return References;
	}

	public void setReferences(Optional<References15> References) {
		this.References = References;
	}

	public Cancellation8Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation8Choice Cancellation) {
		this.Cancellation = Cancellation;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}