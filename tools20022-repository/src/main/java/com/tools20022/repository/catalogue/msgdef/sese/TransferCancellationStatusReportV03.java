package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.CancellationStatusAndReason2;
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
@PreviousVersion(TransferCancellationStatusReportV02.class)
@NextVersion(TransferCancellationStatusReportV04.class)
public class TransferCancellationStatusReportV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> CounterpartyReference;
	private List<AdditionalReference3> RelatedReference;
	private List<AdditionalReference3> OtherReference;
	private CancellationStatusAndReason2 StatusReport;
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

	public List<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public List<AdditionalReference3> getOtherReference() {
		return OtherReference;
	}

	public void setOtherReference(List<AdditionalReference3> OtherReference) {
		this.OtherReference = OtherReference;
	}

	public CancellationStatusAndReason2 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(CancellationStatusAndReason2 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}