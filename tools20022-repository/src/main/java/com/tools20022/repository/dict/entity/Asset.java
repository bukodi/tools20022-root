package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Derivative;
import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.entity.AssetClassification;
import com.tools20022.repository.dict.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.dict.entity.AssetPartyRole;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.Tranche;
import com.tools20022.repository.dict.entity.Leg;
import com.tools20022.repository.dict.entity.StandingSettlementInstruction;

/**
 * Tangible items of value to a business.
 */
public class Asset {

	private ISODateTime ExpiryDate;
	private ISODateTime MaturityDate;
	private Derivative Derivative;
	private AssetHolding AssetValue;
	private AssetClassification AssetClassification;
	private FinancialAssetTypeCategoryCode FinancialAssetCategory;
	private AssetPartyRole AssetPartyRole;
	private Issuance Issuance;
	private Portfolio Portfolio;
	private CurrencyAndAmount InvestmentAmount;
	private PercentageRate InvestmentRate;
	private ISODateTime EffectiveDate;
	private InstrumentSubStructureTypeCode FinancialInstrumentSubStructure;
	private InvestmentPlan InvestmentPlan;
	private Trade Trade;
	private Tranche Tranche;
	private Leg LegAdditionalInformation;
	private StandingSettlementInstruction StandingSettlementInstruction;

	public ISODateTime getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODateTime ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public ISODateTime getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(ISODateTime MaturityDate) {
		this.MaturityDate = MaturityDate;
	}

	public Derivative getDerivative() {
		return Derivative;
	}

	public void setDerivative(Derivative Derivative) {
		this.Derivative = Derivative;
	}

	public AssetHolding getAssetValue() {
		return AssetValue;
	}

	public void setAssetValue(AssetHolding AssetValue) {
		this.AssetValue = AssetValue;
	}

	public AssetClassification getAssetClassification() {
		return AssetClassification;
	}

	public void setAssetClassification(AssetClassification AssetClassification) {
		this.AssetClassification = AssetClassification;
	}

	public FinancialAssetTypeCategoryCode getFinancialAssetCategory() {
		return FinancialAssetCategory;
	}

	public void setFinancialAssetCategory(
			FinancialAssetTypeCategoryCode FinancialAssetCategory) {
		this.FinancialAssetCategory = FinancialAssetCategory;
	}

	public AssetPartyRole getAssetPartyRole() {
		return AssetPartyRole;
	}

	public void setAssetPartyRole(AssetPartyRole AssetPartyRole) {
		this.AssetPartyRole = AssetPartyRole;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public CurrencyAndAmount getInvestmentAmount() {
		return InvestmentAmount;
	}

	public void setInvestmentAmount(CurrencyAndAmount InvestmentAmount) {
		this.InvestmentAmount = InvestmentAmount;
	}

	public PercentageRate getInvestmentRate() {
		return InvestmentRate;
	}

	public void setInvestmentRate(PercentageRate InvestmentRate) {
		this.InvestmentRate = InvestmentRate;
	}

	public ISODateTime getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODateTime EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public InstrumentSubStructureTypeCode getFinancialInstrumentSubStructure() {
		return FinancialInstrumentSubStructure;
	}

	public void setFinancialInstrumentSubStructure(
			InstrumentSubStructureTypeCode FinancialInstrumentSubStructure) {
		this.FinancialInstrumentSubStructure = FinancialInstrumentSubStructure;
	}

	public InvestmentPlan getInvestmentPlan() {
		return InvestmentPlan;
	}

	public void setInvestmentPlan(InvestmentPlan InvestmentPlan) {
		this.InvestmentPlan = InvestmentPlan;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public Tranche getTranche() {
		return Tranche;
	}

	public void setTranche(Tranche Tranche) {
		this.Tranche = Tranche;
	}

	public Leg getLegAdditionalInformation() {
		return LegAdditionalInformation;
	}

	public void setLegAdditionalInformation(Leg LegAdditionalInformation) {
		this.LegAdditionalInformation = LegAdditionalInformation;
	}

	public StandingSettlementInstruction getStandingSettlementInstruction() {
		return StandingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(
			StandingSettlementInstruction StandingSettlementInstruction) {
		this.StandingSettlementInstruction = StandingSettlementInstruction;
	}
}