package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.DefaultFundContribution;
import com.tools20022.repository.dict.entity.ExpectedCollateralType;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.CollateralMovement;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.MarginProductCode;
import com.tools20022.repository.dict.codeset.MarginTypeCode;

/**
 * Specifies the calculation and the resulting margin and independent amount
 * needed to cover the risk exposure of one party versus another.
 */
public class MarginCall {

	private ISODateTime MarginCallValuationDate;
	private ActiveCurrencyAndAmount AgreedAmount;
	private ActiveCurrencyAndAmount VariationMargin;
	private ActiveCurrencyAndAmount SegregatedIndependentAmount;
	private DefaultFundContribution DefaultFundContribution;
	private ExpectedCollateralType ExpectedVariationMarginType;
	private ExpectedCollateralType ExpectedSegregatedIndependentAmountType;
	private ActiveCurrencyAndAmount TotalMarkToMarket;
	private ActiveCurrencyAndAmount MarkToMarketNetted;
	private ActiveCurrencyAndAmount MarkToMarketGross;
	private ActiveCurrencyAndAmount MarkToMarketFails;
	private ActiveCurrencyAndAmount FailsHaircut;
	private ActiveCurrencyAndAmount InitialMargin;
	private ActiveCurrencyAndAmount IncreaseCoverage;
	private YesNoIndicator CollateralisedMarginAccountIndicator;
	private CollateralMovement CollateralMovement;
	private CollateralManagement RelatedManagementProcess;
	private Security Security;
	private MarginProductCode MarginProduct;
	private MarginTypeCode MarginType;
	private ActiveCurrencyAndAmount TotalMarginAmount;

	public ISODateTime getMarginCallValuationDate() {
		return MarginCallValuationDate;
	}

	public void setMarginCallValuationDate(ISODateTime MarginCallValuationDate) {
		this.MarginCallValuationDate = MarginCallValuationDate;
	}

	public ActiveCurrencyAndAmount getAgreedAmount() {
		return AgreedAmount;
	}

	public void setAgreedAmount(ActiveCurrencyAndAmount AgreedAmount) {
		this.AgreedAmount = AgreedAmount;
	}

	public ActiveCurrencyAndAmount getVariationMargin() {
		return VariationMargin;
	}

	public void setVariationMargin(ActiveCurrencyAndAmount VariationMargin) {
		this.VariationMargin = VariationMargin;
	}

	public ActiveCurrencyAndAmount getSegregatedIndependentAmount() {
		return SegregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(
			ActiveCurrencyAndAmount SegregatedIndependentAmount) {
		this.SegregatedIndependentAmount = SegregatedIndependentAmount;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return DefaultFundContribution;
	}

	public void setDefaultFundContribution(
			DefaultFundContribution DefaultFundContribution) {
		this.DefaultFundContribution = DefaultFundContribution;
	}

	public ExpectedCollateralType getExpectedVariationMarginType() {
		return ExpectedVariationMarginType;
	}

	public void setExpectedVariationMarginType(
			ExpectedCollateralType ExpectedVariationMarginType) {
		this.ExpectedVariationMarginType = ExpectedVariationMarginType;
	}

	public ExpectedCollateralType getExpectedSegregatedIndependentAmountType() {
		return ExpectedSegregatedIndependentAmountType;
	}

	public void setExpectedSegregatedIndependentAmountType(
			ExpectedCollateralType ExpectedSegregatedIndependentAmountType) {
		this.ExpectedSegregatedIndependentAmountType = ExpectedSegregatedIndependentAmountType;
	}

	public ActiveCurrencyAndAmount getTotalMarkToMarket() {
		return TotalMarkToMarket;
	}

	public void setTotalMarkToMarket(ActiveCurrencyAndAmount TotalMarkToMarket) {
		this.TotalMarkToMarket = TotalMarkToMarket;
	}

	public ActiveCurrencyAndAmount getMarkToMarketNetted() {
		return MarkToMarketNetted;
	}

	public void setMarkToMarketNetted(ActiveCurrencyAndAmount MarkToMarketNetted) {
		this.MarkToMarketNetted = MarkToMarketNetted;
	}

	public ActiveCurrencyAndAmount getMarkToMarketGross() {
		return MarkToMarketGross;
	}

	public void setMarkToMarketGross(ActiveCurrencyAndAmount MarkToMarketGross) {
		this.MarkToMarketGross = MarkToMarketGross;
	}

	public ActiveCurrencyAndAmount getMarkToMarketFails() {
		return MarkToMarketFails;
	}

	public void setMarkToMarketFails(ActiveCurrencyAndAmount MarkToMarketFails) {
		this.MarkToMarketFails = MarkToMarketFails;
	}

	public ActiveCurrencyAndAmount getFailsHaircut() {
		return FailsHaircut;
	}

	public void setFailsHaircut(ActiveCurrencyAndAmount FailsHaircut) {
		this.FailsHaircut = FailsHaircut;
	}

	public ActiveCurrencyAndAmount getInitialMargin() {
		return InitialMargin;
	}

	public void setInitialMargin(ActiveCurrencyAndAmount InitialMargin) {
		this.InitialMargin = InitialMargin;
	}

	public ActiveCurrencyAndAmount getIncreaseCoverage() {
		return IncreaseCoverage;
	}

	public void setIncreaseCoverage(ActiveCurrencyAndAmount IncreaseCoverage) {
		this.IncreaseCoverage = IncreaseCoverage;
	}

	public YesNoIndicator getCollateralisedMarginAccountIndicator() {
		return CollateralisedMarginAccountIndicator;
	}

	public void setCollateralisedMarginAccountIndicator(
			YesNoIndicator CollateralisedMarginAccountIndicator) {
		this.CollateralisedMarginAccountIndicator = CollateralisedMarginAccountIndicator;
	}

	public CollateralMovement getCollateralMovement() {
		return CollateralMovement;
	}

	public void setCollateralMovement(CollateralMovement CollateralMovement) {
		this.CollateralMovement = CollateralMovement;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return RelatedManagementProcess;
	}

	public void setRelatedManagementProcess(
			CollateralManagement RelatedManagementProcess) {
		this.RelatedManagementProcess = RelatedManagementProcess;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public MarginProductCode getMarginProduct() {
		return MarginProduct;
	}

	public void setMarginProduct(MarginProductCode MarginProduct) {
		this.MarginProduct = MarginProduct;
	}

	public MarginTypeCode getMarginType() {
		return MarginType;
	}

	public void setMarginType(MarginTypeCode MarginType) {
		this.MarginType = MarginType;
	}

	public ActiveCurrencyAndAmount getTotalMarginAmount() {
		return TotalMarginAmount;
	}

	public void setTotalMarginAmount(ActiveCurrencyAndAmount TotalMarginAmount) {
		this.TotalMarginAmount = TotalMarginAmount;
	}
}