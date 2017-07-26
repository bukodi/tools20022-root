package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.OrderInstructionStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.choice.References61Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.Status24Choice;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The OrderInstructionStatusReport message is sent by an executing party,
 * for example, a transfer agent, to the instructing party, for example, an
 * investment manager or its authorised representative, to report the status of
 * an order from the time the executing party receives the order until the time
 * the order is executed. Usage The OrderInstructionStatusReport message is used
 * to report on the status of a subscription, redemption or a switch order. The
 * OrderInstructionStatusReport message may be used to give the status of: - one
 * order message by using OrderDetailsReport or, - one or more individual order
 * instructions by using IndividualOrderDetailsReport, or - one or more switch
 * orders by using SwitchOrderDetailsReport. If the OrderInstructionStatusReport
 * message is used to report the status of an individual order, then
 * IndividualOrderDetailsReport is used and the order reference of the
 * individual order is quoted in OrderReference. The message identification of
 * the message in which the individual order was conveyed may also be quoted in
 * RelatedReference but this is not recommended. If the
 * OrderInstructionStatusReport message is used to report the status of a switch
 * order, then SwitchOrderDetailsReport is used and the order reference of the
 * switch order is quoted in OrderReference. The message identification of the
 * message in which the switch order was conveyed may also be quoted in
 * RelatedReference but this is not recommended. If the
 * OrderInstructionStatusReport message is used to report the status of an
 * entire order message, for example, the SubscriptionBulkOrder, or a
 * SubscriptionOrder containing several orders, then OrderDetailsReport is used
 * and the message identification of the order message is quoted in
 * RelatedReference. All the orders within the message must have the same
 * status. One of the following statuses can be reported: - an accepted status ,
 * or, - an already executed status, or, - a sent to next party status, or, - a
 * received status, or, - a settled status, or, - a communication problem with
 * next party status, or, - a confirmation amendment status, or, - a done for
 * the day status, or, - a partially done status, or, - an open status, or, - a
 * cancelled status, or - a conditionally accepted status, or, - a rejected
 * status, or, - a suspended status, or, - a partially settled status, or, - an
 * in-repair status (only for an individual or switch order). For a switch
 * order, the OrderInstructionStatusReport message provides the status of the
 * whole switch order, that is, it is not possible to accept one leg and to
 * reject the other leg: the entire switch order has to be rejected. In order to
 * identify the legs within the switch that are causing the problem, the leg is
 * identified in either the RedemptionLegIdentification or
 * SubscriptionLegIdentification elements. When the OrderInstructionStatusReport
 * is used to give the status of an individual or a switch order, the following
 * can be specified: - repaired conditions (for a switch, this is at the level
 * of a leg), - information related to the order, for example, settlement
 * amount, number of units, expected trade date.
 */
@PreviousVersion(OrderInstructionStatusReportV03.class)
public class OrderInstructionStatusReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<References61Choice> Reference;
	private Status24Choice StatusReport;
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

	public Status24Choice getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(Status24Choice StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}