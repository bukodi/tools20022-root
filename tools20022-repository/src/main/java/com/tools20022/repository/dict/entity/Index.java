package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.entity.PortfolioBenchmark;
import com.tools20022.repository.dict.entity.VariableInterest;
import com.tools20022.repository.dict.entity.SecuritiesPricing;

/**
 * Identifies the index.
 */
public class Index extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PercentageRate IndexRateBasis;
	private RateAndAmount IndexFactor;
	private DecimalNumber IndexPoints;
	private ISODateTime IndexFixingDate;
	private Max35Text Identification;
	private Max35Text ReferenceSource;
	private CurrencyCode IndexRateCurrency;
	private FrequencyCode IndexRateFrequency;
	private DecimalNumber IndexRateMultiplier;
	private Spread Spread;
	private PortfolioBenchmark PortfolioBenchmark;
	private VariableInterest VariableInterest;
	private SecuritiesPricing SecuritiesPricing;

	public PercentageRate getIndexRateBasis() {
		return IndexRateBasis;
	}

	public void setIndexRateBasis(PercentageRate IndexRateBasis) {
		this.IndexRateBasis = IndexRateBasis;
	}

	public RateAndAmount getIndexFactor() {
		return IndexFactor;
	}

	public void setIndexFactor(RateAndAmount IndexFactor) {
		this.IndexFactor = IndexFactor;
	}

	public DecimalNumber getIndexPoints() {
		return IndexPoints;
	}

	public void setIndexPoints(DecimalNumber IndexPoints) {
		this.IndexPoints = IndexPoints;
	}

	public ISODateTime getIndexFixingDate() {
		return IndexFixingDate;
	}

	public void setIndexFixingDate(ISODateTime IndexFixingDate) {
		this.IndexFixingDate = IndexFixingDate;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Max35Text getReferenceSource() {
		return ReferenceSource;
	}

	public void setReferenceSource(Max35Text ReferenceSource) {
		this.ReferenceSource = ReferenceSource;
	}

	public CurrencyCode getIndexRateCurrency() {
		return IndexRateCurrency;
	}

	public void setIndexRateCurrency(CurrencyCode IndexRateCurrency) {
		this.IndexRateCurrency = IndexRateCurrency;
	}

	public FrequencyCode getIndexRateFrequency() {
		return IndexRateFrequency;
	}

	public void setIndexRateFrequency(FrequencyCode IndexRateFrequency) {
		this.IndexRateFrequency = IndexRateFrequency;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return IndexRateMultiplier;
	}

	public void setIndexRateMultiplier(DecimalNumber IndexRateMultiplier) {
		this.IndexRateMultiplier = IndexRateMultiplier;
	}

	public Spread getSpread() {
		return Spread;
	}

	public void setSpread(Spread Spread) {
		this.Spread = Spread;
	}

	public PortfolioBenchmark getPortfolioBenchmark() {
		return PortfolioBenchmark;
	}

	public void setPortfolioBenchmark(PortfolioBenchmark PortfolioBenchmark) {
		this.PortfolioBenchmark = PortfolioBenchmark;
	}

	public VariableInterest getVariableInterest() {
		return VariableInterest;
	}

	public void setVariableInterest(VariableInterest VariableInterest) {
		this.VariableInterest = VariableInterest;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}
}