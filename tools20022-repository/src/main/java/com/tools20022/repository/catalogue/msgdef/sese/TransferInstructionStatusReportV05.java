package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInstructionStatusReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference7;
import java.util.Optional;
import com.tools20022.repository.dict.choice.References49Choice;
import com.tools20022.repository.dict.msg.TransferStatusAndReason4;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * TransferInstructionStatusReport message to the instructing party, for
 * example, an investment manager or one of its authorised representatives to
 * provide the status of a previously received transfer instruction. Usage The
 * TransferInstructionStatusReport message is used to report on the status of a
 * transfer in or transfer out instruction. The reference of the transfer
 * instruction for which the status is reported is identified in
 * TransferReference. The message identification of the transfer instruction
 * message in which the transfer instruction was conveyed may also be quoted in
 * RelatedReference. One of the following statuses can be reported: - an
 * accepted status, or, - an already executed status, or, - a sent to next party
 * status, or, - a matched status, or, - a settled status, or, - a pending
 * settlement status and the reason for the status, or, - an unmatched status
 * and the reason for the status, or, - an in-repair status and the reason for
 * the status, or, - a rejected status and the reason for the status, or, - a
 * failed settlement status and the reason for the status, or, - a cancelled
 * status and the reason for the status, or, - a cancelled status and the reason
 * for the status, or, - a cancellation pending status and the reason for the
 * status.
 */
@PreviousVersion(TransferInstructionStatusReportV04.class)
public class TransferInstructionStatusReportV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference7> CounterpartyReference;
	private Optional<References49Choice> Reference;
	private TransferStatusAndReason4 StatusReport;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference7> getCounterpartyReference() {
		return CounterpartyReference;
	}

	public void setCounterpartyReference(
			Optional<AdditionalReference7> CounterpartyReference) {
		this.CounterpartyReference = CounterpartyReference;
	}

	public Optional<References49Choice> getReference() {
		return Reference;
	}

	public void setReference(Optional<References49Choice> Reference) {
		this.Reference = Reference;
	}

	public TransferStatusAndReason4 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(TransferStatusAndReason4 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}