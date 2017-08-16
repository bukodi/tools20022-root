package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.DisputeResolutionTypeCode;
import com.tools20022.repository.dict.entity.CollateralManagement;

/**
 * Provides the dispute details on the variation margin and/or the segregated
 * independent amount.
 */
public class DisputeManagement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount DisputedAmount;
	private ISODate DisputeDate;
	private DisputeResolutionTypeCode DisputeResolutionType;
	private CollateralManagement RelatedManagementProcess;

	public ActiveCurrencyAndAmount getDisputedAmount() {
		return DisputedAmount;
	}

	public void setDisputedAmount(ActiveCurrencyAndAmount DisputedAmount) {
		this.DisputedAmount = DisputedAmount;
	}

	public ISODate getDisputeDate() {
		return DisputeDate;
	}

	public void setDisputeDate(ISODate DisputeDate) {
		this.DisputeDate = DisputeDate;
	}

	public DisputeResolutionTypeCode getDisputeResolutionType() {
		return DisputeResolutionType;
	}

	public void setDisputeResolutionType(
			DisputeResolutionTypeCode DisputeResolutionType) {
		this.DisputeResolutionType = DisputeResolutionType;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return RelatedManagementProcess;
	}

	public void setRelatedManagementProcess(
			CollateralManagement RelatedManagementProcess) {
		this.RelatedManagementProcess = RelatedManagementProcess;
	}
}