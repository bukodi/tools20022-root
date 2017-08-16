package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Specifies the parameters of a derivative instrument based on a specific
 * asset.
 */
public class Derivative extends Asset
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Asset UnderlyingAsset;
	private CurrencyAndAmount NotionalCurrencyAndAmount;
	private YesNoIndicator DerivativeCovered;
	private ISODateTime ExerciseDate;
	private YesNoIndicator InterestIncludedInPrice;
	private SecuritiesPricing Tick;
	private SecuritiesPricing ExercisePrice;
	private CurrencyCode NotionalCurrency;
	private Number VersionNumber;

	public Asset getUnderlyingAsset() {
		return UnderlyingAsset;
	}

	public void setUnderlyingAsset(Asset UnderlyingAsset) {
		this.UnderlyingAsset = UnderlyingAsset;
	}

	public CurrencyAndAmount getNotionalCurrencyAndAmount() {
		return NotionalCurrencyAndAmount;
	}

	public void setNotionalCurrencyAndAmount(
			CurrencyAndAmount NotionalCurrencyAndAmount) {
		this.NotionalCurrencyAndAmount = NotionalCurrencyAndAmount;
	}

	public YesNoIndicator getDerivativeCovered() {
		return DerivativeCovered;
	}

	public void setDerivativeCovered(YesNoIndicator DerivativeCovered) {
		this.DerivativeCovered = DerivativeCovered;
	}

	public ISODateTime getExerciseDate() {
		return ExerciseDate;
	}

	public void setExerciseDate(ISODateTime ExerciseDate) {
		this.ExerciseDate = ExerciseDate;
	}

	public YesNoIndicator getInterestIncludedInPrice() {
		return InterestIncludedInPrice;
	}

	public void setInterestIncludedInPrice(
			YesNoIndicator InterestIncludedInPrice) {
		this.InterestIncludedInPrice = InterestIncludedInPrice;
	}

	public SecuritiesPricing getTick() {
		return Tick;
	}

	public void setTick(SecuritiesPricing Tick) {
		this.Tick = Tick;
	}

	public SecuritiesPricing getExercisePrice() {
		return ExercisePrice;
	}

	public void setExercisePrice(SecuritiesPricing ExercisePrice) {
		this.ExercisePrice = ExercisePrice;
	}

	public CurrencyCode getNotionalCurrency() {
		return NotionalCurrency;
	}

	public void setNotionalCurrency(CurrencyCode NotionalCurrency) {
		this.NotionalCurrency = NotionalCurrency;
	}

	public Number getVersionNumber() {
		return VersionNumber;
	}

	public void setVersionNumber(Number VersionNumber) {
		this.VersionNumber = VersionNumber;
	}
}