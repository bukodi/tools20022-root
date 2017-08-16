package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.TransferCancellationStatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.List;
import com.tools20022.repository.dict.msg.CancellationStatusAndReason;

/**
 * Scope The TransferCancellationStatusReport message is sent by an executing
 * party to the instructing party. The message gives the status of a transfer
 * cancellation instruction that was previously sent by the instructing party.
 * Usage The TransferCancellationStatusReport message is sent by an executing
 * party to the instructing party. The message can be used to report that either
 * - the cancellation has been acted upon or - the cancellation is rejected. In
 * both cases, the reason must be specified using either a code or unstructured
 * information.
 */
@NextVersion(TransferCancellationStatusReportV02.class)
public class TransferCancellationStatusReport
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private List<AdditionalReference2> RelatedReference;
	private AdditionalReference2 OtherReference;
	private CancellationStatusAndReason StatusReport;

	public List<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(List<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public AdditionalReference2 getOtherReference() {
		return OtherReference;
	}

	public void setOtherReference(AdditionalReference2 OtherReference) {
		this.OtherReference = OtherReference;
	}

	public CancellationStatusAndReason getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(CancellationStatusAndReason StatusReport) {
		this.StatusReport = StatusReport;
	}
}