package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.choice.References40Choice;
import com.tools20022.repository.dict.msg.CancellationStatusAndReason2;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * TransferCancellationStatusReport message to the instructing party, for
 * example, an investment manager or one of its authorised representatives to
 * provide the status of a previously received transfer cancellation
 * instruction. Usage The TransferCancellationStatusReport message is used to
 * report on the status of a transfer in or transfer out cancellation request.
 * The reference of the transfer instruction for which the cancellation status
 * is reported is identified in TransferReference. The message identification of
 * the transfer cancellation request message in which the transfer instruction
 * was conveyed may also be quoted in RelatedReference. The message
 * identification of the transfer instruction request message in which the
 * transfer instruction was conveyed may also be quoted in RelatedReference. One
 * of the following statuses can be reported: - the transfer cancellation is
 * accepted, or, - the transfer cancellation has been sent to the next party,
 * or, - the transfer cancellation is complete and the reason for the status, -
 * the transfer cancellation pending and the reason for the status, - the
 * transfer cancellation is rejected and the reason for the status.
 */
@PreviousVersion(TransferCancellationStatusReportV03.class)
@NextVersion(TransferCancellationStatusReportV05.class)
public class TransferCancellationStatusReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> CounterpartyReference;
	private Optional<References40Choice> Reference;
	private CancellationStatusAndReason2 StatusReport;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference2> getCounterpartyReference() {
		return CounterpartyReference;
	}

	public void setCounterpartyReference(
			Optional<AdditionalReference2> CounterpartyReference) {
		this.CounterpartyReference = CounterpartyReference;
	}

	public Optional<References40Choice> getReference() {
		return Reference;
	}

	public void setReference(Optional<References40Choice> Reference) {
		this.Reference = Reference;
	}

	public CancellationStatusAndReason2 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(CancellationStatusAndReason2 StatusReport) {
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