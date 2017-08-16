package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Performance factors of the investment fund / fund class.
 */
public class PerformanceFactors extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private NetAssetValueCalculation NetAssetValueCalculation;
	private DecimalNumber CorporateActionFactor;
	private DecimalNumber CumulativeCorporateActionFactor;
	private DateTimePeriod AccumulationPeriod;
	private DecimalNumber NormalPerformance;

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public DecimalNumber getCorporateActionFactor() {
		return CorporateActionFactor;
	}

	public void setCorporateActionFactor(DecimalNumber CorporateActionFactor) {
		this.CorporateActionFactor = CorporateActionFactor;
	}

	public DecimalNumber getCumulativeCorporateActionFactor() {
		return CumulativeCorporateActionFactor;
	}

	public void setCumulativeCorporateActionFactor(
			DecimalNumber CumulativeCorporateActionFactor) {
		this.CumulativeCorporateActionFactor = CumulativeCorporateActionFactor;
	}

	public DateTimePeriod getAccumulationPeriod() {
		return AccumulationPeriod;
	}

	public void setAccumulationPeriod(DateTimePeriod AccumulationPeriod) {
		this.AccumulationPeriod = AccumulationPeriod;
	}

	public DecimalNumber getNormalPerformance() {
		return NormalPerformance;
	}

	public void setNormalPerformance(DecimalNumber NormalPerformance) {
		this.NormalPerformance = NormalPerformance;
	}
}