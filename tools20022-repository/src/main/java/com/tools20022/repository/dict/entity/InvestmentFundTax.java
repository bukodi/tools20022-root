package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesTax;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;

/**
 * Tax related to an investment fund order.
 */
public class InvestmentFundTax extends SecuritiesTax {

	private YesNoIndicator FiscalExemption;
	private InvestmentAccount InvestmentAccount;
	private PercentageRate PercentageOfDebtClaim;
	private PercentageRate PercentageGrandfatheredDebt;
	private YesNoIndicator ExemptionIndicator;
	private InvestmentFundTransaction Transaction;

	public YesNoIndicator getFiscalExemption() {
		return FiscalExemption;
	}

	public void setFiscalExemption(YesNoIndicator FiscalExemption) {
		this.FiscalExemption = FiscalExemption;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return PercentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate PercentageOfDebtClaim) {
		this.PercentageOfDebtClaim = PercentageOfDebtClaim;
	}

	public PercentageRate getPercentageGrandfatheredDebt() {
		return PercentageGrandfatheredDebt;
	}

	public void setPercentageGrandfatheredDebt(
			PercentageRate PercentageGrandfatheredDebt) {
		this.PercentageGrandfatheredDebt = PercentageGrandfatheredDebt;
	}

	public YesNoIndicator getExemptionIndicator() {
		return ExemptionIndicator;
	}

	public void setExemptionIndicator(YesNoIndicator ExemptionIndicator) {
		this.ExemptionIndicator = ExemptionIndicator;
	}

	public InvestmentFundTransaction getTransaction() {
		return Transaction;
	}

	public void setTransaction(InvestmentFundTransaction Transaction) {
		this.Transaction = Transaction;
	}
}