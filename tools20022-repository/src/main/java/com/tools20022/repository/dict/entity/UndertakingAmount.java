package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Tolerance;
import com.tools20022.repository.dict.codeset.AmountTypeCode;
import com.tools20022.repository.dict.entity.Interest;

/**
 * Amount of an undertaking such as a guarantee or standby letter of credit.
 */
public class UndertakingAmount extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Undertaking Undertaking;
	private CurrencyAndAmount Amount;
	private Tolerance Tolerance;
	private CurrencyAndAmount BalanceAmount;
	private AmountTypeCode Type;
	private Interest Interest;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Tolerance getTolerance() {
		return Tolerance;
	}

	public void setTolerance(Tolerance Tolerance) {
		this.Tolerance = Tolerance;
	}

	public CurrencyAndAmount getBalanceAmount() {
		return BalanceAmount;
	}

	public void setBalanceAmount(CurrencyAndAmount BalanceAmount) {
		this.BalanceAmount = BalanceAmount;
	}

	public AmountTypeCode getType() {
		return Type;
	}

	public void setType(AmountTypeCode Type) {
		this.Type = Type;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}
}