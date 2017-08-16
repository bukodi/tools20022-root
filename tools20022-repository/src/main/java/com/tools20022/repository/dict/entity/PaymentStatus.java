package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.PaymentStatusCode;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.UnmatchedStatusReasonCode;
import com.tools20022.repository.dict.codeset.SuspendedStatusReasonCode;
import com.tools20022.repository.dict.codeset.PendingSettlementStatusReasonCode;
import com.tools20022.repository.dict.codeset.PaymentInstructionStatusCode;
import com.tools20022.repository.dict.codeset.TransactionReasonCode;
import com.tools20022.repository.dict.entity.PaymentInvestigationCase;
import com.tools20022.repository.dict.codeset.NotificationToReceiveStatusCode;
import com.tools20022.repository.dict.codeset.TransactionStatusCode;
import com.tools20022.repository.dict.codeset.CashPaymentStatusCode;
import com.tools20022.repository.dict.codeset.ExternalStatusReason1Code;
import com.tools20022.repository.dict.codeset.CancellationReasonCode;
import com.tools20022.repository.dict.codeset.MandateReasonCode;
import com.tools20022.repository.dict.codeset.PendingFailingSettlementCode;

/**
 * Specifies the status of a payment at a specified time.
 */
public class PaymentStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PaymentStatusCode Status;
	private Payment Payment;
	private UnmatchedStatusReasonCode UnmatchedStatusReason;
	private SuspendedStatusReasonCode SuspendedStatusReason;
	private PendingSettlementStatusReasonCode PendingSettlement;
	private PaymentInstructionStatusCode InstructionStatus;
	private TransactionReasonCode TransactionRejectionReason;
	private PaymentInvestigationCase RelatedInvestigationCase;
	private NotificationToReceiveStatusCode NotificationStatus;
	private TransactionStatusCode TransactionStatus;
	private CashPaymentStatusCode CashPaymentStatus;
	private ExternalStatusReason1Code UnsuccessfulStatusReason;
	private CancellationReasonCode CancellationReason;
	private MandateReasonCode MandateRejectionReason;
	private PendingFailingSettlementCode PendingFailingSettlement;

	public PaymentStatusCode getStatus() {
		return Status;
	}

	public void setStatus(PaymentStatusCode Status) {
		this.Status = Status;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public UnmatchedStatusReasonCode getUnmatchedStatusReason() {
		return UnmatchedStatusReason;
	}

	public void setUnmatchedStatusReason(
			UnmatchedStatusReasonCode UnmatchedStatusReason) {
		this.UnmatchedStatusReason = UnmatchedStatusReason;
	}

	public SuspendedStatusReasonCode getSuspendedStatusReason() {
		return SuspendedStatusReason;
	}

	public void setSuspendedStatusReason(
			SuspendedStatusReasonCode SuspendedStatusReason) {
		this.SuspendedStatusReason = SuspendedStatusReason;
	}

	public PendingSettlementStatusReasonCode getPendingSettlement() {
		return PendingSettlement;
	}

	public void setPendingSettlement(
			PendingSettlementStatusReasonCode PendingSettlement) {
		this.PendingSettlement = PendingSettlement;
	}

	public PaymentInstructionStatusCode getInstructionStatus() {
		return InstructionStatus;
	}

	public void setInstructionStatus(
			PaymentInstructionStatusCode InstructionStatus) {
		this.InstructionStatus = InstructionStatus;
	}

	public TransactionReasonCode getTransactionRejectionReason() {
		return TransactionRejectionReason;
	}

	public void setTransactionRejectionReason(
			TransactionReasonCode TransactionRejectionReason) {
		this.TransactionRejectionReason = TransactionRejectionReason;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return RelatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(
			PaymentInvestigationCase RelatedInvestigationCase) {
		this.RelatedInvestigationCase = RelatedInvestigationCase;
	}

	public NotificationToReceiveStatusCode getNotificationStatus() {
		return NotificationStatus;
	}

	public void setNotificationStatus(
			NotificationToReceiveStatusCode NotificationStatus) {
		this.NotificationStatus = NotificationStatus;
	}

	public TransactionStatusCode getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(TransactionStatusCode TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public CashPaymentStatusCode getCashPaymentStatus() {
		return CashPaymentStatus;
	}

	public void setCashPaymentStatus(CashPaymentStatusCode CashPaymentStatus) {
		this.CashPaymentStatus = CashPaymentStatus;
	}

	public ExternalStatusReason1Code getUnsuccessfulStatusReason() {
		return UnsuccessfulStatusReason;
	}

	public void setUnsuccessfulStatusReason(
			ExternalStatusReason1Code UnsuccessfulStatusReason) {
		this.UnsuccessfulStatusReason = UnsuccessfulStatusReason;
	}

	public CancellationReasonCode getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(CancellationReasonCode CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public MandateReasonCode getMandateRejectionReason() {
		return MandateRejectionReason;
	}

	public void setMandateRejectionReason(
			MandateReasonCode MandateRejectionReason) {
		this.MandateRejectionReason = MandateRejectionReason;
	}

	public PendingFailingSettlementCode getPendingFailingSettlement() {
		return PendingFailingSettlement;
	}

	public void setPendingFailingSettlement(
			PendingFailingSettlementCode PendingFailingSettlement) {
		this.PendingFailingSettlement = PendingFailingSettlement;
	}
}