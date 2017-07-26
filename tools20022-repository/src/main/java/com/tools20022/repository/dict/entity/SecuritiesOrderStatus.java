package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.RejectedConfirmationStatusReasonCode;
import com.tools20022.repository.dict.codeset.OrderConfirmationStatusCode;
import com.tools20022.repository.dict.codeset.OrderCancellationStatusCode;
import com.tools20022.repository.dict.codeset.PartiallySettledStatusReasonCode;
import com.tools20022.repository.dict.codeset.SuspendedStatusReasonCode;
import com.tools20022.repository.dict.codeset.ListStatusTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.ConditionallyAcceptedStatusReasonCode;
import com.tools20022.repository.dict.codeset.OrderStatusCode;

/**
 * Status of a securities order or of the processing of a securities order.
 */
public class SecuritiesOrderStatus extends Status {

	private RejectedConfirmationStatusReasonCode ConfirmationRejectedStatusReason;
	private OrderConfirmationStatusCode ConfirmationStatus;
	private OrderCancellationStatusCode CancellationStatus;
	private PartiallySettledStatusReasonCode PartiallySettledStatusReason;
	private SuspendedStatusReasonCode SuspendedStatusReason;
	private ListStatusTypeCode ListOrderStatus;
	private SecuritiesOrder SecuritiesOrder;
	private InvestmentFundOrder InvestmentFundOrder;
	private SecuritiesQuantity CumulativeQuantity;
	private SecuritiesQuantity RemainingQuantity;
	private ConditionallyAcceptedStatusReasonCode ConditionallyAcceptedStatus;
	private OrderStatusCode OrderStatus;

	public RejectedConfirmationStatusReasonCode getConfirmationRejectedStatusReason() {
		return ConfirmationRejectedStatusReason;
	}

	public void setConfirmationRejectedStatusReason(
			RejectedConfirmationStatusReasonCode ConfirmationRejectedStatusReason) {
		this.ConfirmationRejectedStatusReason = ConfirmationRejectedStatusReason;
	}

	public OrderConfirmationStatusCode getConfirmationStatus() {
		return ConfirmationStatus;
	}

	public void setConfirmationStatus(
			OrderConfirmationStatusCode ConfirmationStatus) {
		this.ConfirmationStatus = ConfirmationStatus;
	}

	public OrderCancellationStatusCode getCancellationStatus() {
		return CancellationStatus;
	}

	public void setCancellationStatus(
			OrderCancellationStatusCode CancellationStatus) {
		this.CancellationStatus = CancellationStatus;
	}

	public PartiallySettledStatusReasonCode getPartiallySettledStatusReason() {
		return PartiallySettledStatusReason;
	}

	public void setPartiallySettledStatusReason(
			PartiallySettledStatusReasonCode PartiallySettledStatusReason) {
		this.PartiallySettledStatusReason = PartiallySettledStatusReason;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return SuspendedStatusReason;
	}

	public void setSuspendedStatusReason(
			SuspendedStatusReasonCode SuspendedStatusReason) {
		this.SuspendedStatusReason = SuspendedStatusReason;
	}

	public ListStatusTypeCode getListOrderStatus() {
		return ListOrderStatus;
	}

	public void setListOrderStatus(ListStatusTypeCode ListOrderStatus) {
		this.ListOrderStatus = ListOrderStatus;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public InvestmentFundOrder getInvestmentFundOrder() {
		return InvestmentFundOrder;
	}

	public void setInvestmentFundOrder(InvestmentFundOrder InvestmentFundOrder) {
		this.InvestmentFundOrder = InvestmentFundOrder;
	}

	public SecuritiesQuantity getCumulativeQuantity() {
		return CumulativeQuantity;
	}

	public void setCumulativeQuantity(SecuritiesQuantity CumulativeQuantity) {
		this.CumulativeQuantity = CumulativeQuantity;
	}

	public SecuritiesQuantity getRemainingQuantity() {
		return RemainingQuantity;
	}

	public void setRemainingQuantity(SecuritiesQuantity RemainingQuantity) {
		this.RemainingQuantity = RemainingQuantity;
	}

	public ConditionallyAcceptedStatusReasonCode getConditionallyAcceptedStatus() {
		return ConditionallyAcceptedStatus;
	}

	public void setConditionallyAcceptedStatus(
			ConditionallyAcceptedStatusReasonCode ConditionallyAcceptedStatus) {
		this.ConditionallyAcceptedStatus = ConditionallyAcceptedStatus;
	}

	public OrderStatusCode getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(OrderStatusCode OrderStatus) {
		this.OrderStatus = OrderStatus;
	}
}