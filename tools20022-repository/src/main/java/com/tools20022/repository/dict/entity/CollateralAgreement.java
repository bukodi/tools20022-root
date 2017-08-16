package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.MasterAgreement;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;
import com.tools20022.repository.dict.codeset.ExposureConventionTypeCode;
import com.tools20022.repository.dict.entity.ExposureTerm;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.entity.CollateralManagement;

/**
 * Agreement between two trading parties that contains information about their
 * relative duties and rights regarding collateral processes.
 */
public class CollateralAgreement extends Agreement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyCode BaseCurrency;
	private MasterAgreement AssociatedMasterAgreement;
	private StandingSettlementInstruction StandingSettlementInstructions;
	private ExposureConventionTypeCode MarginConvention;
	private ExposureTerm ExposureTerm;
	private FrequencyCode CallFrequency;
	private Collateral Collateral;
	private CollateralManagement RiskCoverage;

	public CurrencyCode getBaseCurrency() {
		return BaseCurrency;
	}

	public void setBaseCurrency(CurrencyCode BaseCurrency) {
		this.BaseCurrency = BaseCurrency;
	}

	public MasterAgreement getAssociatedMasterAgreement() {
		return AssociatedMasterAgreement;
	}

	public void setAssociatedMasterAgreement(
			MasterAgreement AssociatedMasterAgreement) {
		this.AssociatedMasterAgreement = AssociatedMasterAgreement;
	}

	public StandingSettlementInstruction getStandingSettlementInstructions() {
		return StandingSettlementInstructions;
	}

	public void setStandingSettlementInstructions(
			StandingSettlementInstruction StandingSettlementInstructions) {
		this.StandingSettlementInstructions = StandingSettlementInstructions;
	}

	public ExposureConventionTypeCode getMarginConvention() {
		return MarginConvention;
	}

	public void setMarginConvention(ExposureConventionTypeCode MarginConvention) {
		this.MarginConvention = MarginConvention;
	}

	public ExposureTerm getExposureTerm() {
		return ExposureTerm;
	}

	public void setExposureTerm(ExposureTerm ExposureTerm) {
		this.ExposureTerm = ExposureTerm;
	}

	public FrequencyCode getCallFrequency() {
		return CallFrequency;
	}

	public void setCallFrequency(FrequencyCode CallFrequency) {
		this.CallFrequency = CallFrequency;
	}

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}

	public CollateralManagement getRiskCoverage() {
		return RiskCoverage;
	}

	public void setRiskCoverage(CollateralManagement RiskCoverage) {
		this.RiskCoverage = RiskCoverage;
	}
}