package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.PreferenceToIncomeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Financial instrument that represents a title of ownership in a company. That
 * is, the shareholder is entitled to a part of the company's profit - usually
 * by payment of a dividend - and to voting rights, if any. Each company issues
 * generally different classes of shares, for example, ordinary or common
 * shares, which have no guaranteed amount of dividend but carry voting rights,
 * or preferred shares, which receive dividends before ordinary shares but have
 * no voting right.
 */
public class Equity extends Security {

	private PreferenceToIncomeCode PreferenceToIncome;
	private YesNoIndicator ConvertibleIndicator;
	private CurrencyAndAmount NonPaidAmount;
	private CurrencyAndAmount ParValue;
	private Number VotingRightsPerShare;

	public PreferenceToIncomeCode getPreferenceToIncome() {
		return PreferenceToIncome;
	}

	public void setPreferenceToIncome(PreferenceToIncomeCode PreferenceToIncome) {
		this.PreferenceToIncome = PreferenceToIncome;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return ConvertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator ConvertibleIndicator) {
		this.ConvertibleIndicator = ConvertibleIndicator;
	}

	public CurrencyAndAmount getNonPaidAmount() {
		return NonPaidAmount;
	}

	public void setNonPaidAmount(CurrencyAndAmount NonPaidAmount) {
		this.NonPaidAmount = NonPaidAmount;
	}

	public CurrencyAndAmount getParValue() {
		return ParValue;
	}

	public void setParValue(CurrencyAndAmount ParValue) {
		this.ParValue = ParValue;
	}

	public Number getVotingRightsPerShare() {
		return VotingRightsPerShare;
	}

	public void setVotingRightsPerShare(Number VotingRightsPerShare) {
		this.VotingRightsPerShare = VotingRightsPerShare;
	}
}