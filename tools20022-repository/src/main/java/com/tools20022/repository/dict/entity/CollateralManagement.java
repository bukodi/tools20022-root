package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CollateralProposal;
import com.tools20022.repository.dict.entity.CollateralValuation;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.CollateralInterestAdministration;
import com.tools20022.repository.dict.entity.DisputeManagement;
import com.tools20022.repository.dict.entity.MarginCall;
import com.tools20022.repository.dict.entity.CollateralSubstitution;
import com.tools20022.repository.dict.entity.ExposureCalculation;
import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.entity.CollateralAgreement;
import com.tools20022.repository.dict.entity.ClearingSystem;

/**
 * Set of operations relative to the management of collateral, variation
 * margins, default fund participation and independent amount.
 */
public class CollateralManagement {

	private CollateralProposal CollateralProposal;
	private CollateralValuation CollateralValuation;
	private Adjustment FeesAndCommissions;
	private CollateralInterestAdministration InterestManagement;
	private DisputeManagement DisputeManagement;
	private MarginCall MarginCall;
	private CollateralSubstitution CollateralSubstitution;
	private ExposureCalculation RiskToCover;
	private Collateral Collateral;
	private CollateralAgreement AgreedTerms;
	private ClearingSystem ClearingSystem;

	public CollateralProposal getCollateralProposal() {
		return CollateralProposal;
	}

	public void setCollateralProposal(CollateralProposal CollateralProposal) {
		this.CollateralProposal = CollateralProposal;
	}

	public CollateralValuation getCollateralValuation() {
		return CollateralValuation;
	}

	public void setCollateralValuation(CollateralValuation CollateralValuation) {
		this.CollateralValuation = CollateralValuation;
	}

	public Adjustment getFeesAndCommissions() {
		return FeesAndCommissions;
	}

	public void setFeesAndCommissions(Adjustment FeesAndCommissions) {
		this.FeesAndCommissions = FeesAndCommissions;
	}

	public CollateralInterestAdministration getInterestManagement() {
		return InterestManagement;
	}

	public void setInterestManagement(
			CollateralInterestAdministration InterestManagement) {
		this.InterestManagement = InterestManagement;
	}

	public DisputeManagement getDisputeManagement() {
		return DisputeManagement;
	}

	public void setDisputeManagement(DisputeManagement DisputeManagement) {
		this.DisputeManagement = DisputeManagement;
	}

	public MarginCall getMarginCall() {
		return MarginCall;
	}

	public void setMarginCall(MarginCall MarginCall) {
		this.MarginCall = MarginCall;
	}

	public CollateralSubstitution getCollateralSubstitution() {
		return CollateralSubstitution;
	}

	public void setCollateralSubstitution(
			CollateralSubstitution CollateralSubstitution) {
		this.CollateralSubstitution = CollateralSubstitution;
	}

	public ExposureCalculation getRiskToCover() {
		return RiskToCover;
	}

	public void setRiskToCover(ExposureCalculation RiskToCover) {
		this.RiskToCover = RiskToCover;
	}

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}

	public CollateralAgreement getAgreedTerms() {
		return AgreedTerms;
	}

	public void setAgreedTerms(CollateralAgreement AgreedTerms) {
		this.AgreedTerms = AgreedTerms;
	}

	public ClearingSystem getClearingSystem() {
		return ClearingSystem;
	}

	public void setClearingSystem(ClearingSystem ClearingSystem) {
		this.ClearingSystem = ClearingSystem;
	}
}