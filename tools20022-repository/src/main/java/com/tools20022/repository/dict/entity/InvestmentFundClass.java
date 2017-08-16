package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.DistributionPolicyCode;
import com.tools20022.repository.dict.codeset.DividendPolicyCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.InvestmentFund;
import com.tools20022.repository.dict.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Equalisation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.codeset.FinancialInstrumentProductTypeCode;
import com.tools20022.repository.dict.codeset.InvestorTypeCode;
import com.tools20022.repository.dict.entity.Reinvestment;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, a dividend option or valuation currency.
 */
public class InvestmentFundClass extends Security
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text ClassType;
	private DistributionPolicyCode DistributionPolicy;
	private DividendPolicyCode DividendPolicy;
	private YesNoIndicator DualFundIndicator;
	private CurrencyCode RequestedNAVCurrency;
	private CurrencyCode TradingCurrency;
	private InvestmentFund InvestmentFund;
	private YesNoIndicator PhysicalBearerSecurities;
	private YesNoIndicator DematerialisedBearerSecurities;
	private YesNoIndicator PhysicalRegisteredSecurities;
	private YesNoIndicator DematerialisedRegisteredSecurities;
	private InvestmentFundClassProcessingCharacteristics ProcessingCharacteristics;
	private Max140Text ProductGroup;
	private InvestmentAccount InvestmentAccount;
	private NetAssetValueCalculation NetAssetValueCalculation;
	private InvestmentFundTransaction InvestmentFundTransaction;
	private ISODate SeriesIssueIdentificationDate;
	private Max35Text SeriesName;
	private YesNoIndicator NewIssueIndicator;
	private Equalisation Equalisation;
	private CurrencyAndAmount TopUpAmount;
	private CurrencyAndAmount HoldBackAmount;
	private ISODate HoldBackReleaseDate;
	private Max350Text LotDescription;
	private GenericIdentification FundClassification;
	private FinancialInstrumentProductTypeCode UnderlyingAssetType;
	private InvestorTypeCode InvestorType;
	private Reinvestment Reinvestment;
	private DecimalNumber OutstandingUnits;

	public Max35Text getClassType() {
		return ClassType;
	}

	public void setClassType(Max35Text ClassType) {
		this.ClassType = ClassType;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return DistributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicyCode DistributionPolicy) {
		this.DistributionPolicy = DistributionPolicy;
	}

	public DividendPolicyCode getDividendPolicy() {
		return DividendPolicy;
	}

	public void setDividendPolicy(DividendPolicyCode DividendPolicy) {
		this.DividendPolicy = DividendPolicy;
	}

	public YesNoIndicator getDualFundIndicator() {
		return DualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator DualFundIndicator) {
		this.DualFundIndicator = DualFundIndicator;
	}

	public CurrencyCode getRequestedNAVCurrency() {
		return RequestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(CurrencyCode RequestedNAVCurrency) {
		this.RequestedNAVCurrency = RequestedNAVCurrency;
	}

	public CurrencyCode getTradingCurrency() {
		return TradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode TradingCurrency) {
		this.TradingCurrency = TradingCurrency;
	}

	public InvestmentFund getInvestmentFund() {
		return InvestmentFund;
	}

	public void setInvestmentFund(InvestmentFund InvestmentFund) {
		this.InvestmentFund = InvestmentFund;
	}

	public YesNoIndicator getPhysicalBearerSecurities() {
		return PhysicalBearerSecurities;
	}

	public void setPhysicalBearerSecurities(
			YesNoIndicator PhysicalBearerSecurities) {
		this.PhysicalBearerSecurities = PhysicalBearerSecurities;
	}

	public YesNoIndicator getDematerialisedBearerSecurities() {
		return DematerialisedBearerSecurities;
	}

	public void setDematerialisedBearerSecurities(
			YesNoIndicator DematerialisedBearerSecurities) {
		this.DematerialisedBearerSecurities = DematerialisedBearerSecurities;
	}

	public YesNoIndicator getPhysicalRegisteredSecurities() {
		return PhysicalRegisteredSecurities;
	}

	public void setPhysicalRegisteredSecurities(
			YesNoIndicator PhysicalRegisteredSecurities) {
		this.PhysicalRegisteredSecurities = PhysicalRegisteredSecurities;
	}

	public YesNoIndicator getDematerialisedRegisteredSecurities() {
		return DematerialisedRegisteredSecurities;
	}

	public void setDematerialisedRegisteredSecurities(
			YesNoIndicator DematerialisedRegisteredSecurities) {
		this.DematerialisedRegisteredSecurities = DematerialisedRegisteredSecurities;
	}

	public InvestmentFundClassProcessingCharacteristics getProcessingCharacteristics() {
		return ProcessingCharacteristics;
	}

	public void setProcessingCharacteristics(
			InvestmentFundClassProcessingCharacteristics ProcessingCharacteristics) {
		this.ProcessingCharacteristics = ProcessingCharacteristics;
	}

	public Max140Text getProductGroup() {
		return ProductGroup;
	}

	public void setProductGroup(Max140Text ProductGroup) {
		this.ProductGroup = ProductGroup;
	}

	public InvestmentAccount getInvestmentAccount() {
		return InvestmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount InvestmentAccount) {
		this.InvestmentAccount = InvestmentAccount;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return InvestmentFundTransaction;
	}

	public void setInvestmentFundTransaction(
			InvestmentFundTransaction InvestmentFundTransaction) {
		this.InvestmentFundTransaction = InvestmentFundTransaction;
	}

	public ISODate getSeriesIssueIdentificationDate() {
		return SeriesIssueIdentificationDate;
	}

	public void setSeriesIssueIdentificationDate(
			ISODate SeriesIssueIdentificationDate) {
		this.SeriesIssueIdentificationDate = SeriesIssueIdentificationDate;
	}

	public Max35Text getSeriesName() {
		return SeriesName;
	}

	public void setSeriesName(Max35Text SeriesName) {
		this.SeriesName = SeriesName;
	}

	public YesNoIndicator getNewIssueIndicator() {
		return NewIssueIndicator;
	}

	public void setNewIssueIndicator(YesNoIndicator NewIssueIndicator) {
		this.NewIssueIndicator = NewIssueIndicator;
	}

	public Equalisation getEqualisation() {
		return Equalisation;
	}

	public void setEqualisation(Equalisation Equalisation) {
		this.Equalisation = Equalisation;
	}

	public CurrencyAndAmount getTopUpAmount() {
		return TopUpAmount;
	}

	public void setTopUpAmount(CurrencyAndAmount TopUpAmount) {
		this.TopUpAmount = TopUpAmount;
	}

	public CurrencyAndAmount getHoldBackAmount() {
		return HoldBackAmount;
	}

	public void setHoldBackAmount(CurrencyAndAmount HoldBackAmount) {
		this.HoldBackAmount = HoldBackAmount;
	}

	public ISODate getHoldBackReleaseDate() {
		return HoldBackReleaseDate;
	}

	public void setHoldBackReleaseDate(ISODate HoldBackReleaseDate) {
		this.HoldBackReleaseDate = HoldBackReleaseDate;
	}

	public Max350Text getLotDescription() {
		return LotDescription;
	}

	public void setLotDescription(Max350Text LotDescription) {
		this.LotDescription = LotDescription;
	}

	public GenericIdentification getFundClassification() {
		return FundClassification;
	}

	public void setFundClassification(GenericIdentification FundClassification) {
		this.FundClassification = FundClassification;
	}

	public FinancialInstrumentProductTypeCode getUnderlyingAssetType() {
		return UnderlyingAssetType;
	}

	public void setUnderlyingAssetType(
			FinancialInstrumentProductTypeCode UnderlyingAssetType) {
		this.UnderlyingAssetType = UnderlyingAssetType;
	}

	public InvestorTypeCode getInvestorType() {
		return InvestorType;
	}

	public void setInvestorType(InvestorTypeCode InvestorType) {
		this.InvestorType = InvestorType;
	}

	public Reinvestment getReinvestment() {
		return Reinvestment;
	}

	public void setReinvestment(Reinvestment Reinvestment) {
		this.Reinvestment = Reinvestment;
	}

	public DecimalNumber getOutstandingUnits() {
		return OutstandingUnits;
	}

	public void setOutstandingUnits(DecimalNumber OutstandingUnits) {
		this.OutstandingUnits = OutstandingUnits;
	}
}