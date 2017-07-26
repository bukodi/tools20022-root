package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.codeset.CorporateActionCancellationReasonCode;
import com.tools20022.repository.dict.entity.CorporateActionStatus;
import com.tools20022.repository.dict.codeset.AcknowledgementReasonCode;
import com.tools20022.repository.dict.codeset.CorporateActionReversalReasonCode;
import com.tools20022.repository.dict.codeset.FailedSettlementReasonCode;
import com.tools20022.repository.dict.codeset.RejectionReasonCode;

/**
 * Specifies the underlying reason for a status of a corporate action.
 */
public class CorporateActionStatusReason extends StatusReason {

	private CorporateActionCancellationReasonCode CorporateActionCancellationReason;
	private CorporateActionStatus CorporateActionStatus;
	private AcknowledgementReasonCode AcceptedReason;
	private CorporateActionReversalReasonCode ReversalReason;
	private FailedSettlementReasonCode MovementFailureReason;
	private RejectionReasonCode MovementRejectionReason;

	public CorporateActionCancellationReasonCode getCorporateActionCancellationReason() {
		return CorporateActionCancellationReason;
	}

	public void setCorporateActionCancellationReason(
			CorporateActionCancellationReasonCode CorporateActionCancellationReason) {
		this.CorporateActionCancellationReason = CorporateActionCancellationReason;
	}

	public CorporateActionStatus getCorporateActionStatus() {
		return CorporateActionStatus;
	}

	public void setCorporateActionStatus(
			CorporateActionStatus CorporateActionStatus) {
		this.CorporateActionStatus = CorporateActionStatus;
	}

	public AcknowledgementReasonCode getAcceptedReason() {
		return AcceptedReason;
	}

	public void setAcceptedReason(AcknowledgementReasonCode AcceptedReason) {
		this.AcceptedReason = AcceptedReason;
	}

	public CorporateActionReversalReasonCode getReversalReason() {
		return ReversalReason;
	}

	public void setReversalReason(
			CorporateActionReversalReasonCode ReversalReason) {
		this.ReversalReason = ReversalReason;
	}

	public FailedSettlementReasonCode getMovementFailureReason() {
		return MovementFailureReason;
	}

	public void setMovementFailureReason(
			FailedSettlementReasonCode MovementFailureReason) {
		this.MovementFailureReason = MovementFailureReason;
	}

	public RejectionReasonCode getMovementRejectionReason() {
		return MovementRejectionReason;
	}

	public void setMovementRejectionReason(
			RejectionReasonCode MovementRejectionReason) {
		this.MovementRejectionReason = MovementRejectionReason;
	}
}