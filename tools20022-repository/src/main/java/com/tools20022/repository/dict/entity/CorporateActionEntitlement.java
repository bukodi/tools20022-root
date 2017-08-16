package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.CorporateActionServicing;

/**
 * Rights entitled to the account owner based on the terms of the corporate
 * action event and the balance of underlying securities.
 */
public class CorporateActionEntitlement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesBalance EligibleBalance;
	private SecuritiesBalance SecuritiesBalance;
	private SecuritiesBalance InstructedBalance;
	private SecuritiesBalance UninstructedBalance;
	private YesNoIndicator EligibleBalanceIndicator;
	private CorporateActionServicing RelatedServicing;
	private SecuritiesBalance NotEligibleBalance;

	public SecuritiesBalance getEligibleBalance() {
		return EligibleBalance;
	}

	public void setEligibleBalance(SecuritiesBalance EligibleBalance) {
		this.EligibleBalance = EligibleBalance;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}

	public SecuritiesBalance getInstructedBalance() {
		return InstructedBalance;
	}

	public void setInstructedBalance(SecuritiesBalance InstructedBalance) {
		this.InstructedBalance = InstructedBalance;
	}

	public SecuritiesBalance getUninstructedBalance() {
		return UninstructedBalance;
	}

	public void setUninstructedBalance(SecuritiesBalance UninstructedBalance) {
		this.UninstructedBalance = UninstructedBalance;
	}

	public YesNoIndicator getEligibleBalanceIndicator() {
		return EligibleBalanceIndicator;
	}

	public void setEligibleBalanceIndicator(
			YesNoIndicator EligibleBalanceIndicator) {
		this.EligibleBalanceIndicator = EligibleBalanceIndicator;
	}

	public CorporateActionServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(CorporateActionServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public SecuritiesBalance getNotEligibleBalance() {
		return NotEligibleBalance;
	}

	public void setNotEligibleBalance(SecuritiesBalance NotEligibleBalance) {
		this.NotEligibleBalance = NotEligibleBalance;
	}
}