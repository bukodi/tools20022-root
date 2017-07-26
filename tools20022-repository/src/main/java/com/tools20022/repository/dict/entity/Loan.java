package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Debt;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.PaymentTerms;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Act of provding an amount of money, a property or other material goods to a
 * another party in exchange for future repayment of the principal amount along
 * with interest or other finance charges.
 */
public class Loan extends Debt {

	private CurrencyAndAmount PrincipalAmount;
	private PaymentTerms InterestPaymentsSchedule;
	private YesNoIndicator IntraCompanyLoanIndicator;

	public CurrencyAndAmount getPrincipalAmount() {
		return PrincipalAmount;
	}

	public void setPrincipalAmount(CurrencyAndAmount PrincipalAmount) {
		this.PrincipalAmount = PrincipalAmount;
	}

	public PaymentTerms getInterestPaymentsSchedule() {
		return InterestPaymentsSchedule;
	}

	public void setInterestPaymentsSchedule(
			PaymentTerms InterestPaymentsSchedule) {
		this.InterestPaymentsSchedule = InterestPaymentsSchedule;
	}

	public YesNoIndicator getIntraCompanyLoanIndicator() {
		return IntraCompanyLoanIndicator;
	}

	public void setIntraCompanyLoanIndicator(
			YesNoIndicator IntraCompanyLoanIndicator) {
		this.IntraCompanyLoanIndicator = IntraCompanyLoanIndicator;
	}
}