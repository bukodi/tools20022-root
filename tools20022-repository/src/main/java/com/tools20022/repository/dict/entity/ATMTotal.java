package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.CardPayment;

/**
 * Current totals of the ATM.
 */
public class ATMTotal extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ImpliedCurrencyAndAmount ATMBalance;
	private CurrencyCode Currency;
	private Number ATMCurrentNumber;
	private Number ATMBalanceNumber;
	private ImpliedCurrencyAndAmount ATMCurrent;
	private CardPayment RelatedCardPayment;

	public ImpliedCurrencyAndAmount getATMBalance() {
		return ATMBalance;
	}

	public void setATMBalance(ImpliedCurrencyAndAmount ATMBalance) {
		this.ATMBalance = ATMBalance;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public Number getATMCurrentNumber() {
		return ATMCurrentNumber;
	}

	public void setATMCurrentNumber(Number ATMCurrentNumber) {
		this.ATMCurrentNumber = ATMCurrentNumber;
	}

	public Number getATMBalanceNumber() {
		return ATMBalanceNumber;
	}

	public void setATMBalanceNumber(Number ATMBalanceNumber) {
		this.ATMBalanceNumber = ATMBalanceNumber;
	}

	public ImpliedCurrencyAndAmount getATMCurrent() {
		return ATMCurrent;
	}

	public void setATMCurrent(ImpliedCurrencyAndAmount ATMCurrent) {
		this.ATMCurrent = ATMCurrent;
	}

	public CardPayment getRelatedCardPayment() {
		return RelatedCardPayment;
	}

	public void setRelatedCardPayment(CardPayment RelatedCardPayment) {
		this.RelatedCardPayment = RelatedCardPayment;
	}
}