package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.NonDeliverableTrade;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.FinancialCenterCode;
import com.tools20022.repository.dict.codeset.DisruptionFallbackCode;
import com.tools20022.repository.dict.codeset.BusinessDayConventionCode;

/**
 * Set of parameters used to calculate a rate for instance the fixing rate to be
 * applied to a non-deliverable agreement.
 */
public class FixingCondition extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime FixingDateTime;
	private NonDeliverableTrade NonDeliverableTrade;
	private CurrencyExchange FixingRate;
	private Max35Text SettlementRateOption;
	private FinancialCenterCode FinancialCenter;
	private DisruptionFallbackCode DisruptionFallback;
	private BusinessDayConventionCode BusinessDayConvention;

	public ISODateTime getFixingDateTime() {
		return FixingDateTime;
	}

	public void setFixingDateTime(ISODateTime FixingDateTime) {
		this.FixingDateTime = FixingDateTime;
	}

	public NonDeliverableTrade getNonDeliverableTrade() {
		return NonDeliverableTrade;
	}

	public void setNonDeliverableTrade(NonDeliverableTrade NonDeliverableTrade) {
		this.NonDeliverableTrade = NonDeliverableTrade;
	}

	public CurrencyExchange getFixingRate() {
		return FixingRate;
	}

	public void setFixingRate(CurrencyExchange FixingRate) {
		this.FixingRate = FixingRate;
	}

	public Max35Text getSettlementRateOption() {
		return SettlementRateOption;
	}

	public void setSettlementRateOption(Max35Text SettlementRateOption) {
		this.SettlementRateOption = SettlementRateOption;
	}

	public FinancialCenterCode getFinancialCenter() {
		return FinancialCenter;
	}

	public void setFinancialCenter(FinancialCenterCode FinancialCenter) {
		this.FinancialCenter = FinancialCenter;
	}

	public DisruptionFallbackCode getDisruptionFallback() {
		return DisruptionFallback;
	}

	public void setDisruptionFallback(DisruptionFallbackCode DisruptionFallback) {
		this.DisruptionFallback = DisruptionFallback;
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return BusinessDayConvention;
	}

	public void setBusinessDayConvention(
			BusinessDayConventionCode BusinessDayConvention) {
		this.BusinessDayConvention = BusinessDayConvention;
	}
}