package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.BusinessDayConventionCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.PartyTypeCode;
import com.tools20022.repository.dict.codeset.AmountFullfilTypeCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.FinancialCenterCode;
import com.tools20022.repository.dict.codeset.NoticePeriodTypeCode;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.Security;

/**
 * Describes the reason and terms for early partial or total redemption,
 * amortisation or extension of an issue.
 */
public class RedemptionSchedule extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private BusinessDayConventionCode BusinessDayConvention;
	private DateTimePeriod EffectivePeriod;
	private SecuritiesPricing PriceChange;
	private SecuritiesPricing Price;
	private PartyTypeCode PartyType;
	private AmountFullfilTypeCode AmountFulfilType;
	private Number MinimumNoticeDays;
	private Number MaximumNoticeDays;
	private FinancialCenterCode FinancialCenter;
	private NoticePeriodTypeCode NoticePeriodType;
	private FrequencyCode PriceChangeFrequency;
	private FrequencyCode PriceFrequency;
	private Security Security;

	public BusinessDayConventionCode getBusinessDayConvention() {
		return BusinessDayConvention;
	}

	public void setBusinessDayConvention(
			BusinessDayConventionCode BusinessDayConvention) {
		this.BusinessDayConvention = BusinessDayConvention;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public SecuritiesPricing getPriceChange() {
		return PriceChange;
	}

	public void setPriceChange(SecuritiesPricing PriceChange) {
		this.PriceChange = PriceChange;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public PartyTypeCode getPartyType() {
		return PartyType;
	}

	public void setPartyType(PartyTypeCode PartyType) {
		this.PartyType = PartyType;
	}

	public AmountFullfilTypeCode getAmountFulfilType() {
		return AmountFulfilType;
	}

	public void setAmountFulfilType(AmountFullfilTypeCode AmountFulfilType) {
		this.AmountFulfilType = AmountFulfilType;
	}

	public Number getMinimumNoticeDays() {
		return MinimumNoticeDays;
	}

	public void setMinimumNoticeDays(Number MinimumNoticeDays) {
		this.MinimumNoticeDays = MinimumNoticeDays;
	}

	public Number getMaximumNoticeDays() {
		return MaximumNoticeDays;
	}

	public void setMaximumNoticeDays(Number MaximumNoticeDays) {
		this.MaximumNoticeDays = MaximumNoticeDays;
	}

	public FinancialCenterCode getFinancialCenter() {
		return FinancialCenter;
	}

	public void setFinancialCenter(FinancialCenterCode FinancialCenter) {
		this.FinancialCenter = FinancialCenter;
	}

	public NoticePeriodTypeCode getNoticePeriodType() {
		return NoticePeriodType;
	}

	public void setNoticePeriodType(NoticePeriodTypeCode NoticePeriodType) {
		this.NoticePeriodType = NoticePeriodType;
	}

	public FrequencyCode getPriceChangeFrequency() {
		return PriceChangeFrequency;
	}

	public void setPriceChangeFrequency(FrequencyCode PriceChangeFrequency) {
		this.PriceChangeFrequency = PriceChangeFrequency;
	}

	public FrequencyCode getPriceFrequency() {
		return PriceFrequency;
	}

	public void setPriceFrequency(FrequencyCode PriceFrequency) {
		this.PriceFrequency = PriceFrequency;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}
}