package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.OrderCancellationStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.OrderCancellationStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.OrderStatusAndReason8;
import com.tools20022.repository.dict.msg.IndividualOrderStatusAndReason4;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * OrderCancellationStatusReport to the instructing party, for example, an
 * investment manager or its authorised representative, to report the status of
 * an order cancellation request that was previously received. Usage The
 * OrderCancellationStatusReport message is used to provide the status of: - one
 * or more individual order cancellation requests by using
 * IndividualCancellationStatusReport, or, - an order cancellation request
 * message by using CancellationStatusReport. If the
 * OrderCancellationStatusReport message is used to report the status of an
 * individual order cancellation request, then the repetitive
 * IndividualCancellationStatusReport sequence is used and the order reference
 * of the individual order is quoted in OrderReference. The message
 * identification of the message in which the individual order was conveyed may
 * also be quoted in RelatedReference. If the OrderCancellationStatusReport
 * message is used to report the status of an entire order cancellation request
 * message, for example, the SubscriptionBulkOrderCancellationRequest, or a
 * SubscriptionOrderCancellationRequest containing several orders, then the
 * CancellationStatusReport sequence. is used and the message identification of
 * the order cancellation request message is quoted in RelatedReference. All the
 * order cancellation requests within the message must have the same status. One
 * of the following statuses can be reported: - the order cancellation is
 * pending, or, - the order cancellation request is rejected, or, - the order is
 * cancelled. When the cancellation is rejected, the reason for the rejection
 * must be specified.
 */
@PreviousVersion(OrderCancellationStatusReportV02.class)
@NextVersion(OrderCancellationStatusReportV04.class)
public class OrderCancellationStatusReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference3> RelatedReference;
	private List<AdditionalReference3> OtherReference;
	private OrderStatusAndReason8 CancellationStatusReport;
	private IndividualOrderStatusAndReason4 IndividualCancellationStatusReport;
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

	public OrderStatusAndReason8 getCancellationStatusReport() {
		return CancellationStatusReport;
	}

	public void setCancellationStatusReport(
			OrderStatusAndReason8 CancellationStatusReport) {
		this.CancellationStatusReport = CancellationStatusReport;
	}

	public IndividualOrderStatusAndReason4 getIndividualCancellationStatusReport() {
		return IndividualCancellationStatusReport;
	}

	public void setIndividualCancellationStatusReport(
			IndividualOrderStatusAndReason4 IndividualCancellationStatusReport) {
		this.IndividualCancellationStatusReport = IndividualCancellationStatusReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}