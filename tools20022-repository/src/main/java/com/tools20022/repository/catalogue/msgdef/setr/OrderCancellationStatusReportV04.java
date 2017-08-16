package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.OrderCancellationStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.choice.References61Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Status26Choice;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The OrderCancellationStatusReport message is sent by an executing
 * party, for example, a transfer agent, to the instructing party, for example,
 * an investment manager or its authorised representative, to report the status
 * of an order cancellation request that was previously received. Usage The
 * OrderCancellationStatusReport message is used to provide the status of: - one
 * or more individual order cancellation requests by using
 * IndividualCancellationStatusReport, or, - an order cancellation request
 * message by using CancellationStatusReport. If the
 * OrderCancellationStatusReport message is used to report the status of an
 * individual order cancellation request, then the repetitive
 * IndividualCancellationStatusReport sequence is used and the order reference
 * of the individual order is quoted in OrderReference. The message
 * identification of the message in which the individual order was conveyed may
 * also be quoted in RelatedReference but this is not recommended. If the
 * OrderCancellationStatusReport message is used to report the status of an
 * entire order cancellation request message, for example, the
 * SubscriptionBulkOrderCancellationRequest, or a
 * SubscriptionOrderCancellationRequest containing several orders, then the
 * CancellationStatusReport sequence is used. The message identification of the
 * order cancellation request message may also be quoted in RelatedReference but
 * this is not recommended. All the order cancellation requests within the
 * message must have the same status. One of the following statuses can be
 * reported: - the order cancellation is pending, or, - the order cancellation
 * request is rejected, or, - the order is cancelled. When the cancellation is
 * rejected, the reason for the rejection must be specified.
 */
@PreviousVersion(OrderCancellationStatusReportV03.class)
public class OrderCancellationStatusReportV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<References61Choice> Reference;
	private Status26Choice StatusReport;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<References61Choice> getReference() {
		return Reference;
	}

	public void setReference(Optional<References61Choice> Reference) {
		this.Reference = Reference;
	}

	public Status26Choice getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(Status26Choice StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}