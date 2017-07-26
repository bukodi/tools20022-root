package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.codeset.CurrencyCode;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 */
public class CollateralValuation {

	private Collateral Collateral;
	private ISODateTime CollateralValuationDate;
	private CollateralManagement RelatedManagementProcess;
	private ActiveCurrencyAndAmount ReportedCurrencyAndAmount;
	private ActiveCurrencyAndAmount MarketValueAmount;
	private BaseOneRate AdjustedRate;
	private CurrencyCode CollateralValuationCurrency;

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}

	public ISODateTime getCollateralValuationDate() {
		return CollateralValuationDate;
	}

	public void setCollateralValuationDate(ISODateTime CollateralValuationDate) {
		this.CollateralValuationDate = CollateralValuationDate;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return RelatedManagementProcess;
	}

	public void setRelatedManagementProcess(
			CollateralManagement RelatedManagementProcess) {
		this.RelatedManagementProcess = RelatedManagementProcess;
	}

	public ActiveCurrencyAndAmount getReportedCurrencyAndAmount() {
		return ReportedCurrencyAndAmount;
	}

	public void setReportedCurrencyAndAmount(
			ActiveCurrencyAndAmount ReportedCurrencyAndAmount) {
		this.ReportedCurrencyAndAmount = ReportedCurrencyAndAmount;
	}

	public ActiveCurrencyAndAmount getMarketValueAmount() {
		return MarketValueAmount;
	}

	public void setMarketValueAmount(ActiveCurrencyAndAmount MarketValueAmount) {
		this.MarketValueAmount = MarketValueAmount;
	}

	public BaseOneRate getAdjustedRate() {
		return AdjustedRate;
	}

	public void setAdjustedRate(BaseOneRate AdjustedRate) {
		this.AdjustedRate = AdjustedRate;
	}

	public CurrencyCode getCollateralValuationCurrency() {
		return CollateralValuationCurrency;
	}

	public void setCollateralValuationCurrency(
			CurrencyCode CollateralValuationCurrency) {
		this.CollateralValuationCurrency = CollateralValuationCurrency;
	}
}