package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.codeset.IncomePreferenceCode;
import com.tools20022.repository.dict.codeset.TaxWithholdingMethodCode;
import com.tools20022.repository.dict.entity.RoundingParameters;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.BeneficiaryCertificationCompletionCode;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.entity.InvestmentAccountContract;
import com.tools20022.repository.dict.entity.ReportingService;
import com.tools20022.repository.dict.entity.Reinvestment;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 */
public class InvestmentAccountService extends AccountService {

	private IncomePreferenceCode IncomePreference;
	private TaxWithholdingMethodCode TaxWithholdingMethod;
	private RoundingParameters RoundingMethod;
	private YesNoIndicator BeneficiaryCertificationIndicator;
	private BeneficiaryCertificationCompletionCode BeneficiaryCertificationCompletion;
	private InvestmentPlan SystematicInvestmentPlan;
	private InvestmentAccountContract InvestmentAccountContract;
	private ReportingService ReportingService;
	private Reinvestment Reinvestment;

	public IncomePreferenceCode getIncomePreference() {
		return IncomePreference;
	}

	public void setIncomePreference(IncomePreferenceCode IncomePreference) {
		this.IncomePreference = IncomePreference;
	}

	public TaxWithholdingMethodCode getTaxWithholdingMethod() {
		return TaxWithholdingMethod;
	}

	public void setTaxWithholdingMethod(
			TaxWithholdingMethodCode TaxWithholdingMethod) {
		this.TaxWithholdingMethod = TaxWithholdingMethod;
	}

	public RoundingParameters getRoundingMethod() {
		return RoundingMethod;
	}

	public void setRoundingMethod(RoundingParameters RoundingMethod) {
		this.RoundingMethod = RoundingMethod;
	}

	public YesNoIndicator getBeneficiaryCertificationIndicator() {
		return BeneficiaryCertificationIndicator;
	}

	public void setBeneficiaryCertificationIndicator(
			YesNoIndicator BeneficiaryCertificationIndicator) {
		this.BeneficiaryCertificationIndicator = BeneficiaryCertificationIndicator;
	}

	public BeneficiaryCertificationCompletionCode getBeneficiaryCertificationCompletion() {
		return BeneficiaryCertificationCompletion;
	}

	public void setBeneficiaryCertificationCompletion(
			BeneficiaryCertificationCompletionCode BeneficiaryCertificationCompletion) {
		this.BeneficiaryCertificationCompletion = BeneficiaryCertificationCompletion;
	}

	public InvestmentPlan getSystematicInvestmentPlan() {
		return SystematicInvestmentPlan;
	}

	public void setSystematicInvestmentPlan(
			InvestmentPlan SystematicInvestmentPlan) {
		this.SystematicInvestmentPlan = SystematicInvestmentPlan;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return InvestmentAccountContract;
	}

	public void setInvestmentAccountContract(
			InvestmentAccountContract InvestmentAccountContract) {
		this.InvestmentAccountContract = InvestmentAccountContract;
	}

	public ReportingService getReportingService() {
		return ReportingService;
	}

	public void setReportingService(ReportingService ReportingService) {
		this.ReportingService = ReportingService;
	}

	public Reinvestment getReinvestment() {
		return Reinvestment;
	}

	public void setReinvestment(Reinvestment Reinvestment) {
		this.Reinvestment = Reinvestment;
	}
}