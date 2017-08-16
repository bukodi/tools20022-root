package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.codeset.DemandStatusCode;
import com.tools20022.repository.dict.codeset.UndertakingStatusCode;
import com.tools20022.repository.dict.entity.UndertakingStatusReason;
import com.tools20022.repository.dict.codeset.ExternalUndertakingStatusCategoryCode;

/**
 * Status of the undertaking.
 */
public class UndertakingStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Undertaking Undertaking;
	private DemandStatusCode DemandStatus;
	private UndertakingStatusCode Status;
	private UndertakingStatusReason UndertakingStatusReason;
	private ExternalUndertakingStatusCategoryCode StatusCategory;
	private UndertakingStatusCode PresentationStatus;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public DemandStatusCode getDemandStatus() {
		return DemandStatus;
	}

	public void setDemandStatus(DemandStatusCode DemandStatus) {
		this.DemandStatus = DemandStatus;
	}

	public UndertakingStatusCode getStatus() {
		return Status;
	}

	public void setStatus(UndertakingStatusCode Status) {
		this.Status = Status;
	}

	public UndertakingStatusReason getUndertakingStatusReason() {
		return UndertakingStatusReason;
	}

	public void setUndertakingStatusReason(
			UndertakingStatusReason UndertakingStatusReason) {
		this.UndertakingStatusReason = UndertakingStatusReason;
	}

	public ExternalUndertakingStatusCategoryCode getStatusCategory() {
		return StatusCategory;
	}

	public void setStatusCategory(
			ExternalUndertakingStatusCategoryCode StatusCategory) {
		this.StatusCategory = StatusCategory;
	}

	public UndertakingStatusCode getPresentationStatus() {
		return PresentationStatus;
	}

	public void setPresentationStatus(UndertakingStatusCode PresentationStatus) {
		this.PresentationStatus = PresentationStatus;
	}
}