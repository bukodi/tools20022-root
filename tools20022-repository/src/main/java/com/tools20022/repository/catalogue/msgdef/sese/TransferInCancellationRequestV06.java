package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References15;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Cancellation9Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation2;

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
@PreviousVersion(TransferInCancellationRequestV05.class)
@NextVersion(TransferInCancellationRequestV07.class)
public class TransferInCancellationRequestV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<References15> References;
	private Cancellation9Choice Cancellation;
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

	public Cancellation9Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation9Choice Cancellation) {
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