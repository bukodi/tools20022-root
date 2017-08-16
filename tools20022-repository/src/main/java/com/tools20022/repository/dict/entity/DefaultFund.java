package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.DefaultFundContribution;
import com.tools20022.repository.dict.entity.ClearingSystem;

/**
 * Assets posted by participants in a clearing fund that can be used in the
 * event of a default by a participant to compensate non-defaulting participants
 * for losses they suffer due to this default.
 */
public class DefaultFund extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount TotalAmount;
	private DefaultFundContribution Contribution;
	private ClearingSystem ClearingSystem;

	public ActiveCurrencyAndAmount getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(ActiveCurrencyAndAmount TotalAmount) {
		this.TotalAmount = TotalAmount;
	}

	public DefaultFundContribution getContribution() {
		return Contribution;
	}

	public void setContribution(DefaultFundContribution Contribution) {
		this.Contribution = Contribution;
	}

	public ClearingSystem getClearingSystem() {
		return ClearingSystem;
	}

	public void setClearingSystem(ClearingSystem ClearingSystem) {
		this.ClearingSystem = ClearingSystem;
	}
}