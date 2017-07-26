package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;

/**
 * Separate account containing illiquid assets of a hedge fund portfolio. Only
 * the present participants in the hedge fund will be entitled to a share of it.
 */
public class SidePocket {

	private YesNoIndicator SidePocketInclusionIndicator;
	private Max35Text SidePocketIdentification;
	private InvestmentAccount InvestmentAccount;
	private SecuritiesQuantity SidePocketQuantity;

	public YesNoIndicator getSidePocketInclusionIndicator() {
		return SidePocketInclusionIndicator;
	}

	public void setSidePocketInclusionIndicator(
			YesNoIndicator SidePocketInclusionIndicator) {
		this.SidePocketInclusionIndicator = SidePocketInclusionIndicator;
	}

	public Max35Text getSidePocketIdentification() {
		return SidePocketIdentification;
	}

	public void setSidePocketIdentification(Max35Text SidePocketIdentification) {
		this.SidePocketIdentification = SidePocketIdentification;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public SecuritiesQuantity getSidePocketQuantity() {
		return SidePocketQuantity;
	}

	public void setSidePocketQuantity(SecuritiesQuantity SidePocketQuantity) {
		this.SidePocketQuantity = SidePocketQuantity;
	}
}