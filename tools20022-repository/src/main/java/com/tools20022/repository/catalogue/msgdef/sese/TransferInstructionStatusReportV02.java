package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInstructionStatusReport;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInstructionStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.TransferStatusAndReason2;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An executing party, eg, a transfer agent, sends the
 * TransferInstructionStatusReport message to the instructing party, eg, an
 * investment manager or one of its authorised representatives to provide the
 * status of a previously received transfer instruction. Usage The
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
@PreviousVersion(TransferInstructionStatusReport.class)
@NextVersion(TransferInstructionStatusReportV03.class)
public class TransferInstructionStatusReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference3> RelatedReference;
	private List<AdditionalReference3> OtherReference;
	private TransferStatusAndReason2 StatusReport;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
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

	public TransferStatusAndReason2 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(TransferStatusAndReason2 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}