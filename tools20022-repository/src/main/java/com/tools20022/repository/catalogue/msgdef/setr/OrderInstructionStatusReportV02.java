package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.OrderInstructionStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.List;
import java.util.Optional;
import com.tools20022.repository.dict.msg.OrderStatusAndReason3;
import com.tools20022.repository.dict.msg.IndividualOrderStatusAndReason1;

/**
 * Scope The OrderInstructionStatusReport is sent by an executing party, eg, a
 * transfer agent, to an instructing party, eg, an investment manager or its
 * authorised representative. There may be one or more intermediary parties
 * between the executing party and the instructing party. The intermediary party
 * is, for example, an intermediary or a concentrator. This message reports the
 * status of an order from the time the executing party receives the order until
 * the order is executed. Usage The OrderInstructionStatusReport message is sent
 * by an executing party to the instructing party to report on the status of a
 * subscription, redemption or a switch order. The message can be used to report
 * one of the following: - a received status, or - an accepted status, or - a
 * sent to next party status, or - an already executed status, or - a cancelled
 * status, or - a conditionally accepted status, or - a rejected status, or - a
 * suspended status, or - an in-repair status (at the individual order level
 * only), or - repaired conditions (at the individual order level only). For
 * subscription and redemption orders, the OrderInstructionStatusReport message
 * covers both bulk and multiple categories of orders, and this message may
 * provide the status either at the bulk or at the individual level. For a
 * switch order, this message provides the status of the whole order, ie, it is
 * not possible to accept one leg and to reject the other leg, the entire switch
 * order has to be rejected. In order to identify which leg within the switch is
 * causing a problem, the redemption or subscription leg identification is used.
 */
@NextVersion(OrderInstructionStatusReportV03.class)
public class OrderInstructionStatusReportV02 {

	private List<AdditionalReference3> OtherReference;
	private List<AdditionalReference3> RelatedReference;
	private Optional<AdditionalReference3> MasterReference;
	private OrderStatusAndReason3 OrderDetailsReport;
	private IndividualOrderStatusAndReason1 IndividualOrderDetailsReport;

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

	public Optional<AdditionalReference3> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(
			Optional<AdditionalReference3> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public OrderStatusAndReason3 getOrderDetailsReport() {
		return OrderDetailsReport;
	}

	public void setOrderDetailsReport(OrderStatusAndReason3 OrderDetailsReport) {
		this.OrderDetailsReport = OrderDetailsReport;
	}

	public IndividualOrderStatusAndReason1 getIndividualOrderDetailsReport() {
		return IndividualOrderDetailsReport;
	}

	public void setIndividualOrderDetailsReport(
			IndividualOrderStatusAndReason1 IndividualOrderDetailsReport) {
		this.IndividualOrderDetailsReport = IndividualOrderDetailsReport;
	}
}