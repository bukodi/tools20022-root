package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.codeset.InstalmentPlanCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Specifies the details of each successive payment in settlement of a debt or
 * in an investment plan.
 */
public class Instalment extends PaymentObligation {

	private Number InitialNumberOfInstalment;
	private Number TotalNumberOfInstalment;
	private FrequencyCode PeriodUnit;
	private Number NumberOfUnits;
	private Max70Text SequenceIdentification;
	private InvestmentPlan InvestmentPlan;
	private InstalmentPlanCode InstalmentPlanType;
	private CurrencyAndAmount FirstPaymentAmount;
	private ISODateTime FirstPaymentDate;

	public Number getInitialNumberOfInstalment() {
		return InitialNumberOfInstalment;
	}

	public void setInitialNumberOfInstalment(Number InitialNumberOfInstalment) {
		this.InitialNumberOfInstalment = InitialNumberOfInstalment;
	}

	public Number getTotalNumberOfInstalment() {
		return TotalNumberOfInstalment;
	}

	public void setTotalNumberOfInstalment(Number TotalNumberOfInstalment) {
		this.TotalNumberOfInstalment = TotalNumberOfInstalment;
	}

	public FrequencyCode getPeriodUnit() {
		return PeriodUnit;
	}

	public void setPeriodUnit(FrequencyCode PeriodUnit) {
		this.PeriodUnit = PeriodUnit;
	}

	public Number getNumberOfUnits() {
		return NumberOfUnits;
	}

	public void setNumberOfUnits(Number NumberOfUnits) {
		this.NumberOfUnits = NumberOfUnits;
	}

	public Max70Text getSequenceIdentification() {
		return SequenceIdentification;
	}

	public void setSequenceIdentification(Max70Text SequenceIdentification) {
		this.SequenceIdentification = SequenceIdentification;
	}

	public InvestmentPlan getInvestmentPlan() {
		return InvestmentPlan;
	}

	public void setInvestmentPlan(InvestmentPlan InvestmentPlan) {
		this.InvestmentPlan = InvestmentPlan;
	}

	public InstalmentPlanCode getInstalmentPlanType() {
		return InstalmentPlanType;
	}

	public void setInstalmentPlanType(InstalmentPlanCode InstalmentPlanType) {
		this.InstalmentPlanType = InstalmentPlanType;
	}

	public CurrencyAndAmount getFirstPaymentAmount() {
		return FirstPaymentAmount;
	}

	public void setFirstPaymentAmount(CurrencyAndAmount FirstPaymentAmount) {
		this.FirstPaymentAmount = FirstPaymentAmount;
	}

	public ISODateTime getFirstPaymentDate() {
		return FirstPaymentDate;
	}

	public void setFirstPaymentDate(ISODateTime FirstPaymentDate) {
		this.FirstPaymentDate = FirstPaymentDate;
	}
}