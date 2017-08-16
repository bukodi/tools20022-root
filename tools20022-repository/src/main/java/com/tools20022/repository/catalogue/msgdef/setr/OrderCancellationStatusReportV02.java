package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.OrderCancellationStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.OrderStatusAndReason4;

/**
 * Scope The OrderCancellationStatusReport is sent by an executing party, eg, a
 * transfer agent, to the instructing party, eg, an investment manager or its
 * authorised representative. There may be one or more intermediary parties
 * between the executing party and the instructing party. The intermediary party
 * is, for example, an intermediary or a concentrator. The message gives the
 * status of an order cancellation instruction message that was previously sent
 * by the instructing party. Usage The OrderCancellationStatusReport message is
 * used to report the status of an order cancellation instruction message that
 * was previously sent by the instructing party. The message can be used to
 * report one of the following: - the cancellation is accepted for further
 * processing, or - the cancellation is rejected, or - the order has been
 * cancelled. When the cancellation is rejected, the reason for the rejection
 * must be specified.
 */
@NextVersion(OrderCancellationStatusReportV03.class)
public class OrderCancellationStatusReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private List<AdditionalReference3> RelatedReference;
	private List<AdditionalReference3> OtherReference;
	private OrderStatusAndReason4 CancellationStatusReport;

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

	public OrderStatusAndReason4 getCancellationStatusReport() {
		return CancellationStatusReport;
	}

	public void setCancellationStatusReport(
			OrderStatusAndReason4 CancellationStatusReport) {
		this.CancellationStatusReport = CancellationStatusReport;
	}
}