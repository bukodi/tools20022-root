package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference7;
import java.util.Optional;
import com.tools20022.repository.dict.choice.References49Choice;
import com.tools20022.repository.dict.msg.CancellationStatusAndReason3;
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
@PreviousVersion(TransferCancellationStatusReportV04.class)
public class TransferCancellationStatusReportV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference7> CounterpartyReference;
	private Optional<References49Choice> Reference;
	private CancellationStatusAndReason3 StatusReport;
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

	public CancellationStatusAndReason3 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(CancellationStatusAndReason3 StatusReport) {
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