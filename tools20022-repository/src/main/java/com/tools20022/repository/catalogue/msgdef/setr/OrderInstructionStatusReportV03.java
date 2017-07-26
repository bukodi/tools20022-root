package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.OrderInstructionStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.OrderInstructionStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import com.tools20022.repository.dict.msg.OrderStatusAndReason7;
import com.tools20022.repository.dict.msg.IndividualOrderStatusAndReason2;
import com.tools20022.repository.dict.msg.SwitchOrderStatusAndReason1;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * OrderInstructionStatusReport to the instructing party, for example, an
 * investment manager or its authorised representative to report the status of
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
 * RelatedReference. If the OrderInstructionStatusReport message is used to
 * report the status of a switch order, then SwitchOrderDetailsReport is used
 * and the order reference of the switch order is quoted in OrderReference. The
 * message identification of the message in which the switch order was conveyed
 * may also be quoted in RelatedReference. If the OrderInstructionStatusReport
 * message is used to report the status of an entire order message, for example,
 * the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders,
 * then OrderDetailsReport is used and the message identification of the order
 * message is quoted in RelatedReference. All the orders within the message must
 * have the same status. One of the following statuses can be reported: - an
 * accepted status , or, - an already executed status, or, - a sent to next
 * party status, or, - a received status, or, - a settled status, or, - a
 * communication problem with next party status, or, - a confirmation amendment
 * status, or, - a done for the day status, or, - a partially done status, or, -
 * an open status, or, - a cancelled status, or - a conditionally accepted
 * status, or, - a rejected status, or, - a suspended status, or, - a partially
 * settled status, or, - an in-repair status (only for an individual or switch
 * order). For a switch order, the OrderInstructionStatusReport message provides
 * the status of the whole switch order, that is, it is not possible to accept
 * one leg and to reject the other leg: the entire switch order has to be
 * rejected. In order to identify the legs within the switch that are causing
 * the problem, the leg is identified in either the RedemptionLegIdentification
 * or SubscriptionLegIdentification elements. When the
 * OrderInstructionStatusReport is used to give the status of an individual or a
 * switch order, the following can be specified: - repaired conditions (for a
 * switch, this is at the level of a leg), - information related to the order,
 * for example, settlement amount, number of units, expected trade date, etc.
 */
@PreviousVersion(OrderInstructionStatusReportV02.class)
@NextVersion(OrderInstructionStatusReportV04.class)
public class OrderInstructionStatusReportV03 {

	private MessageIdentification1 MessageIdentification;
	private List<AdditionalReference3> OtherReference;
	private List<AdditionalReference3> RelatedReference;
	private OrderStatusAndReason7 OrderDetailsReport;
	private IndividualOrderStatusAndReason2 IndividualOrderDetailsReport;
	private SwitchOrderStatusAndReason1 SwitchOrderDetailsReport;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public List<AdditionalReference3> getOtherReference() {
		return OtherReference;
	}

	public void setOtherReference(List<AdditionalReference3> OtherReference) {
		this.OtherReference = OtherReference;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public OrderStatusAndReason7 getOrderDetailsReport() {
		return OrderDetailsReport;
	}

	public void setOrderDetailsReport(OrderStatusAndReason7 OrderDetailsReport) {
		this.OrderDetailsReport = OrderDetailsReport;
	}

	public IndividualOrderStatusAndReason2 getIndividualOrderDetailsReport() {
		return IndividualOrderDetailsReport;
	}

	public void setIndividualOrderDetailsReport(
			IndividualOrderStatusAndReason2 IndividualOrderDetailsReport) {
		this.IndividualOrderDetailsReport = IndividualOrderDetailsReport;
	}

	public SwitchOrderStatusAndReason1 getSwitchOrderDetailsReport() {
		return SwitchOrderDetailsReport;
	}

	public void setSwitchOrderDetailsReport(
			SwitchOrderStatusAndReason1 SwitchOrderDetailsReport) {
		this.SwitchOrderDetailsReport = SwitchOrderDetailsReport;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}