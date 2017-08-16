package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.NoReasonCode;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.codeset.RejectedStatusReasonCode;
import com.tools20022.repository.dict.codeset.PendingFailingReasonCode;
import com.tools20022.repository.dict.codeset.CancelledStatusReasonV2Code;
import com.tools20022.repository.dict.codeset.RejectionReasonV2Code;
import com.tools20022.repository.dict.codeset.AcknowledgementReasonCode;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * Specifies the underlying reason for the status of an object.
 */
public class StatusReason extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Status Status;
	private Max35Text Reason;
	private NoReasonCode NoSpecifiedReason;
	private GenericIdentification DataSourceScheme;
	private RejectedStatusReasonCode RejectedStatusReason;
	private PendingFailingReasonCode FailingReason;
	private CancelledStatusReasonV2Code CancellationReason;
	private PendingFailingReasonCode PendingReason;
	private RejectionReasonV2Code RejectionReason;
	private AcknowledgementReasonCode AcknowledgedAcceptedReason;
	private RegisteredContract RelatedClosureReason;

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status Status) {
		this.Status = Status;
	}

	public Max35Text getReason() {
		return Reason;
	}

	public void setReason(Max35Text Reason) {
		this.Reason = Reason;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return NoSpecifiedReason;
	}

	public void setNoSpecifiedReason(NoReasonCode NoSpecifiedReason) {
		this.NoSpecifiedReason = NoSpecifiedReason;
	}

	public GenericIdentification getDataSourceScheme() {
		return DataSourceScheme;
	}

	public void setDataSourceScheme(GenericIdentification DataSourceScheme) {
		this.DataSourceScheme = DataSourceScheme;
	}

	public RejectedStatusReasonCode getRejectedStatusReason() {
		return RejectedStatusReason;
	}

	public void setRejectedStatusReason(
			RejectedStatusReasonCode RejectedStatusReason) {
		this.RejectedStatusReason = RejectedStatusReason;
	}

	public PendingFailingReasonCode getFailingReason() {
		return FailingReason;
	}

	public void setFailingReason(PendingFailingReasonCode FailingReason) {
		this.FailingReason = FailingReason;
	}

	public CancelledStatusReasonV2Code getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(
			CancelledStatusReasonV2Code CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public PendingFailingReasonCode getPendingReason() {
		return PendingReason;
	}

	public void setPendingReason(PendingFailingReasonCode PendingReason) {
		this.PendingReason = PendingReason;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectionReasonV2Code RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public AcknowledgementReasonCode getAcknowledgedAcceptedReason() {
		return AcknowledgedAcceptedReason;
	}

	public void setAcknowledgedAcceptedReason(
			AcknowledgementReasonCode AcknowledgedAcceptedReason) {
		this.AcknowledgedAcceptedReason = AcknowledgedAcceptedReason;
	}

	public RegisteredContract getRelatedClosureReason() {
		return RelatedClosureReason;
	}

	public void setRelatedClosureReason(RegisteredContract RelatedClosureReason) {
		this.RelatedClosureReason = RelatedClosureReason;
	}
}