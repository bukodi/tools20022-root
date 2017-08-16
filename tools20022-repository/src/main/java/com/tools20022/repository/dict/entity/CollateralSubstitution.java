package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CollateralSubstitutionTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.Collateral;

/**
 * Substitution of collateral by specifying the collateral to be returned and
 * proposing the new type(s) of collateral to be delivered.
 */
public class CollateralSubstitution extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CollateralSubstitutionTypeCode Type;
	private CurrencyAndAmount AcceptedAmount;
	private CurrencyAndAmount RejectedAmount;
	private CollateralManagement RelatedManagementProcess;
	private Collateral NewCollateral;

	public CollateralSubstitutionTypeCode getType() {
		return Type;
	}

	public void setType(CollateralSubstitutionTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getAcceptedAmount() {
		return AcceptedAmount;
	}

	public void setAcceptedAmount(CurrencyAndAmount AcceptedAmount) {
		this.AcceptedAmount = AcceptedAmount;
	}

	public CurrencyAndAmount getRejectedAmount() {
		return RejectedAmount;
	}

	public void setRejectedAmount(CurrencyAndAmount RejectedAmount) {
		this.RejectedAmount = RejectedAmount;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return RelatedManagementProcess;
	}

	public void setRelatedManagementProcess(
			CollateralManagement RelatedManagementProcess) {
		this.RelatedManagementProcess = RelatedManagementProcess;
	}

	public Collateral getNewCollateral() {
		return NewCollateral;
	}

	public void setNewCollateral(Collateral NewCollateral) {
		this.NewCollateral = NewCollateral;
	}
}