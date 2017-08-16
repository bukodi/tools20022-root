package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferInstructionStatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import com.tools20022.repository.dict.msg.TransferStatusAndReason;

/**
 * Scope The TransferInstructionStatusReport message is sent by an instructing
 * party to the executing party. The instructing party may be an investor, a
 * transfer agent, or an intermediary, etc. The executing party may be a
 * transfer agent, or an intermediary, etc. This message gives the status of a
 * transfer instruction, and can be used from the time the executing party
 * receives the transfer instruction until its execution. Usage The
 * TransferInstructionStatusReport message is sent by an executing party to the
 * instructing party. The message can be used to report one of the following -
 * the status of the transfer instruction (using a code)or - the repair status
 * or - the unmatched status or - the rejection status or - the pending
 * settlement status. Further information about repair, unmatched, rejected or
 * pending settlement statuses must be specified using either codes or
 * unstructured information.
 */
@NextVersion(TransferInstructionStatusReportV02.class)
public class TransferInstructionStatusReport
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private AdditionalReference2 RelatedReference;
	private AdditionalReference2 OtherReference;
	private TransferStatusAndReason StatusReport;

	public AdditionalReference2 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference2 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AdditionalReference2 getOtherReference() {
		return OtherReference;
	}

	public void setOtherReference(AdditionalReference2 OtherReference) {
		this.OtherReference = OtherReference;
	}

	public TransferStatusAndReason getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(TransferStatusAndReason StatusReport) {
		this.StatusReport = StatusReport;
	}
}