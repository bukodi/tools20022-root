package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.MarginCall;
import com.tools20022.repository.dict.entity.DefaultFund;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.DebitCreditCode;

/**
 * Portion of the participation to the default fund that clearing member must
 * provide. It is the sum of the individual contributions.
 */
public class DefaultFundContribution extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private MarginCall RelatedMarginCall;
	private DefaultFund DefaultFund;
	private ActiveCurrencyAndAmount ExcessOrDeficitAmount;
	private Account ContributionAccount;
	private DebitCreditCode AmountDirection;

	public MarginCall getRelatedMarginCall() {
		return RelatedMarginCall;
	}

	public void setRelatedMarginCall(MarginCall RelatedMarginCall) {
		this.RelatedMarginCall = RelatedMarginCall;
	}

	public DefaultFund getDefaultFund() {
		return DefaultFund;
	}

	public void setDefaultFund(DefaultFund DefaultFund) {
		this.DefaultFund = DefaultFund;
	}

	public ActiveCurrencyAndAmount getExcessOrDeficitAmount() {
		return ExcessOrDeficitAmount;
	}

	public void setExcessOrDeficitAmount(
			ActiveCurrencyAndAmount ExcessOrDeficitAmount) {
		this.ExcessOrDeficitAmount = ExcessOrDeficitAmount;
	}

	public Account getContributionAccount() {
		return ContributionAccount;
	}

	public void setContributionAccount(Account ContributionAccount) {
		this.ContributionAccount = ContributionAccount;
	}

	public DebitCreditCode getAmountDirection() {
		return AmountDirection;
	}

	public void setAmountDirection(DebitCreditCode AmountDirection) {
		this.AmountDirection = AmountDirection;
	}
}