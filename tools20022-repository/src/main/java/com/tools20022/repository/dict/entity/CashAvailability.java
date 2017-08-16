package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.codeset.DebitCreditCode;

/**
 * Indicates when the amount of money will become available, ie can be accessed
 * and start generating interest.
 */
public class CashAvailability extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashBalance CashBalance;
	private ISODate Date;
	private Max15NumericText NumberOfDays;
	private CurrencyAndAmount Amount;
	private CashEntry CashEntry;
	private DebitCreditCode CreditDebitIndicator;

	public CashBalance getCashBalance() {
		return CashBalance;
	}

	public void setCashBalance(CashBalance CashBalance) {
		this.CashBalance = CashBalance;
	}

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}

	public Max15NumericText getNumberOfDays() {
		return NumberOfDays;
	}

	public void setNumberOfDays(Max15NumericText NumberOfDays) {
		this.NumberOfDays = NumberOfDays;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public CashEntry getCashEntry() {
		return CashEntry;
	}

	public void setCashEntry(CashEntry CashEntry) {
		this.CashEntry = CashEntry;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}
}