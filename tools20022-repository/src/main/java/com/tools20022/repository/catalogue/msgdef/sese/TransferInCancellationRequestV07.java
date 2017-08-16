package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInCancellationRequestV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.References20;
import java.util.Optional;
import com.tools20022.repository.dict.codeset.TransferInFunction1Code;
import com.tools20022.repository.dict.choice.Cancellation10Choice;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.CopyInformation4;

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
@PreviousVersion(TransferInCancellationRequestV06.class)
public class TransferInCancellationRequestV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<References20> References;
	private Optional<TransferInFunction1Code> Function;
	private Cancellation10Choice Cancellation;
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

	public Optional<TransferInFunction1Code> getFunction() {
		return Function;
	}

	public void setFunction(Optional<TransferInFunction1Code> Function) {
		this.Function = Function;
	}

	public Cancellation10Choice getCancellation() {
		return Cancellation;
	}

	public void setCancellation(Cancellation10Choice Cancellation) {
		this.Cancellation = Cancellation;
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