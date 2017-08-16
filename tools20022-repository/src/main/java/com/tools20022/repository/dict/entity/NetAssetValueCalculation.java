package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.EventFrequencyCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.codeset.ValuationTimingCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.ValuationStatistics;
import com.tools20022.repository.dict.entity.PerformanceFactors;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.FundsCashFlow;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Calculation of the net asset value for an investment fund/fund class.
 */
public class NetAssetValueCalculation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private EventFrequencyCode ValuationFrequency;
	private ISODateTime ValuationDateTime;
	private CurrencyAndAmount NetAssetValue;
	private InvestmentFundClass RelatedFund;
	private ValuationTimingCode ValuationType;
	private YesNoIndicator SuspendedIndicator;
	private YesNoIndicator ForExecutionIndicator;
	private Tax TaxLiability;
	private Tax TaxRefund;
	private YesNoIndicator OfficialValuationIndicator;
	private YesNoIndicator EstimatedPriceIndicator;
	private ValuationStatistics ValuationStatistics;
	private PerformanceFactors InvestmentFundPerformanceFactors;
	private SecuritiesPricing Price;
	private SecuritiesQuantity SecuritiesQuantity;
	private Interest Interest;
	private FundsCashFlow FundsCashFlow;
	private Max35Text DeclarationChannel;
	private ISODateTime DeclarationDate;
	private ISODate FirstValuationDate;
	private YesNoIndicator HistoricPricingIndicator;

	public EventFrequencyCode getValuationFrequency() {
		return ValuationFrequency;
	}

	public void setValuationFrequency(EventFrequencyCode ValuationFrequency) {
		this.ValuationFrequency = ValuationFrequency;
	}

	public ISODateTime getValuationDateTime() {
		return ValuationDateTime;
	}

	public void setValuationDateTime(ISODateTime ValuationDateTime) {
		this.ValuationDateTime = ValuationDateTime;
	}

	public CurrencyAndAmount getNetAssetValue() {
		return NetAssetValue;
	}

	public void setNetAssetValue(CurrencyAndAmount NetAssetValue) {
		this.NetAssetValue = NetAssetValue;
	}

	public InvestmentFundClass getRelatedFund() {
		return RelatedFund;
	}

	public void setRelatedFund(InvestmentFundClass RelatedFund) {
		this.RelatedFund = RelatedFund;
	}

	public ValuationTimingCode getValuationType() {
		return ValuationType;
	}

	public void setValuationType(ValuationTimingCode ValuationType) {
		this.ValuationType = ValuationType;
	}

	public YesNoIndicator getSuspendedIndicator() {
		return SuspendedIndicator;
	}

	public void setSuspendedIndicator(YesNoIndicator SuspendedIndicator) {
		this.SuspendedIndicator = SuspendedIndicator;
	}

	public YesNoIndicator getForExecutionIndicator() {
		return ForExecutionIndicator;
	}

	public void setForExecutionIndicator(YesNoIndicator ForExecutionIndicator) {
		this.ForExecutionIndicator = ForExecutionIndicator;
	}

	public Tax getTaxLiability() {
		return TaxLiability;
	}

	public void setTaxLiability(Tax TaxLiability) {
		this.TaxLiability = TaxLiability;
	}

	public Tax getTaxRefund() {
		return TaxRefund;
	}

	public void setTaxRefund(Tax TaxRefund) {
		this.TaxRefund = TaxRefund;
	}

	public YesNoIndicator getOfficialValuationIndicator() {
		return OfficialValuationIndicator;
	}

	public void setOfficialValuationIndicator(
			YesNoIndicator OfficialValuationIndicator) {
		this.OfficialValuationIndicator = OfficialValuationIndicator;
	}

	public YesNoIndicator getEstimatedPriceIndicator() {
		return EstimatedPriceIndicator;
	}

	public void setEstimatedPriceIndicator(
			YesNoIndicator EstimatedPriceIndicator) {
		this.EstimatedPriceIndicator = EstimatedPriceIndicator;
	}

	public ValuationStatistics getValuationStatistics() {
		return ValuationStatistics;
	}

	public void setValuationStatistics(ValuationStatistics ValuationStatistics) {
		this.ValuationStatistics = ValuationStatistics;
	}

	public PerformanceFactors getInvestmentFundPerformanceFactors() {
		return InvestmentFundPerformanceFactors;
	}

	public void setInvestmentFundPerformanceFactors(
			PerformanceFactors InvestmentFundPerformanceFactors) {
		this.InvestmentFundPerformanceFactors = InvestmentFundPerformanceFactors;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return SecuritiesQuantity;
	}

	public void setSecuritiesQuantity(SecuritiesQuantity SecuritiesQuantity) {
		this.SecuritiesQuantity = SecuritiesQuantity;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public FundsCashFlow getFundsCashFlow() {
		return FundsCashFlow;
	}

	public void setFundsCashFlow(FundsCashFlow FundsCashFlow) {
		this.FundsCashFlow = FundsCashFlow;
	}

	public Max35Text getDeclarationChannel() {
		return DeclarationChannel;
	}

	public void setDeclarationChannel(Max35Text DeclarationChannel) {
		this.DeclarationChannel = DeclarationChannel;
	}

	public ISODateTime getDeclarationDate() {
		return DeclarationDate;
	}

	public void setDeclarationDate(ISODateTime DeclarationDate) {
		this.DeclarationDate = DeclarationDate;
	}

	public ISODate getFirstValuationDate() {
		return FirstValuationDate;
	}

	public void setFirstValuationDate(ISODate FirstValuationDate) {
		this.FirstValuationDate = FirstValuationDate;
	}

	public YesNoIndicator getHistoricPricingIndicator() {
		return HistoricPricingIndicator;
	}

	public void setHistoricPricingIndicator(
			YesNoIndicator HistoricPricingIndicator) {
		this.HistoricPricingIndicator = HistoricPricingIndicator;
	}
}