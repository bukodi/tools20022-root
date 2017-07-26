package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.PriceMethodCode;
import com.tools20022.repository.dict.codeset.TypeOfPriceCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.ValuationStatistics;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.codeset.PriceValueTypeCode;
import com.tools20022.repository.dict.entity.Derivative;
import com.tools20022.repository.dict.entity.Warrant;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.LotBreakdown;
import com.tools20022.repository.dict.codeset.AmountPriceTypeCode;
import com.tools20022.repository.dict.entity.CorporateActionPrice;
import com.tools20022.repository.dict.entity.AmountAndQuantity;
import com.tools20022.repository.dict.entity.AmountRatio;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.BiddingConditions;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.YieldCalculation;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.entity.TaxVoucher;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.entity.BuyIn;
import com.tools20022.repository.dict.entity.Index;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.AnalyticsCalculation;
import com.tools20022.repository.dict.entity.DurationCalculation;
import com.tools20022.repository.dict.entity.LifeCalculation;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.entity.SecuritiesOrderParameters;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.Entitlement;
import com.tools20022.repository.dict.entity.SecuritiesDistribution;
import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.RedemptionSchedule;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.Price;
import com.tools20022.repository.dict.entity.Position;

/**
 * Characteristics related to the price of the security.
 */
public class SecuritiesPricing {

	private PriceMethodCode PriceMethod;
	private TypeOfPriceCode PriceType;
	private YesNoIndicator CumDividendIndicator;
	private PercentageRate CalculationBasis;
	private ValuationStatistics PriceChangeRelatedStatistics;
	private PercentageRate Rate;
	private ValuationStatistics HighestPriceValueRelatedStatistics;
	private ValuationStatistics LowestPriceValueRelatedStatistics;
	private Security Security;
	private SecuritiesTradeExecution SecuritiesTradeExecution;
	private YesNoIndicator Yielded;
	private PriceValueTypeCode TypeOfRate;
	private Derivative Derivative;
	private Warrant RelatedWarrant;
	private SecuritiesConversion RelatedSecuritiesConversion;
	private LotBreakdown LotBreakdown;
	private AmountPriceTypeCode TypeOfAmount;
	private CorporateActionPrice ExercisePriceRelatedEvent;
	private CorporateActionPrice GenericCashPriceReceivedPerProductRelatedEvent;
	private AmountAndQuantity AmountPricePerFinancialInstrumentQuantity;
	private AmountRatio AmountPricePerAmount;
	private CorporateActionPrice GenericCashPricePaidPerProductRelatedEvent;
	private DateTimePeriod PriceCalculationPeriod;
	private CorporateActionPrice CashInLieuOfSharePriceRelatedEvent;
	private CorporateActionPrice OverSubscriptionDepositPriceRelatedEvent;
	private CorporateActionPrice CashValueForTaxRelatedEvent;
	private BiddingConditions MaximumPriceBiddingConditions;
	private BiddingConditions MinimumPriceBiddingConditions;
	private ISODateTime QuotationDate;
	private YieldCalculation YieldCalculation;
	private SecuritiesFinancing RelatedSecuritiesFinancing;
	private InvestmentFundOrderExecution FundOrderRelatedToExecutedPrice;
	private InvestmentFundOrderExecution FundOrderRelatedToInformativePrice;
	private TaxVoucher TaxVoucher;
	private SecuritiesTrade SecuritiesTrade;
	private NetAssetValueCalculation NetAssetValueCalculation;
	private BuyIn RelatedBuyIn;
	private Index Index;
	private InformationPartyRole InformationPartyRole;
	private DateTimePeriod PriceFactPeriod;
	private AnalyticsCalculation AnalyticsCalculation;
	private DurationCalculation DurationCalculation;
	private LifeCalculation LifeCalculation;
	private ISODateTime Date;
	private Spread Spread;
	private SecuritiesOrder Order;
	private SecuritiesOrder StopPriceOrder;
	private Allocation Allocation;
	private SecuritiesOrderParameters RelatedOrder;
	private Issuance Issuance;
	private Entitlement Entitlement;
	private SecuritiesDistribution CashFractionsPriceRelatedSecuritiesDistribution;
	private SecuritiesDistribution SuscriptionPriceRelatedSecuritiesDistribution;
	private SecuritiesDistribution ReinvestmentPriceRelatedSecuritiesDistribution;
	private Derivative RelatedFuture;
	private Distribution Distribution;
	private RedemptionSchedule PriceChangeRedemptionSchedule;
	private RedemptionSchedule RelatedRedemptionSchedule;
	private Quote PreviousClosingPriceRelatedQuote;
	private Quote RequestedPriceRelatedQuote;
	private Quote PriceRelatedQuote;
	private Quote MarketPriceRelatedQuote;
	private Price Price;
	private CorporateActionPrice RelatedCorporateActionPrice;
	private Position RelatedPosition;

	public PriceMethodCode getPriceMethod() {
		return PriceMethod;
	}

	public void setPriceMethod(PriceMethodCode PriceMethod) {
		this.PriceMethod = PriceMethod;
	}

	public TypeOfPriceCode getPriceType() {
		return PriceType;
	}

	public void setPriceType(TypeOfPriceCode PriceType) {
		this.PriceType = PriceType;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return CumDividendIndicator;
	}

	public void setCumDividendIndicator(YesNoIndicator CumDividendIndicator) {
		this.CumDividendIndicator = CumDividendIndicator;
	}

	public PercentageRate getCalculationBasis() {
		return CalculationBasis;
	}

	public void setCalculationBasis(PercentageRate CalculationBasis) {
		this.CalculationBasis = CalculationBasis;
	}

	public ValuationStatistics getPriceChangeRelatedStatistics() {
		return PriceChangeRelatedStatistics;
	}

	public void setPriceChangeRelatedStatistics(
			ValuationStatistics PriceChangeRelatedStatistics) {
		this.PriceChangeRelatedStatistics = PriceChangeRelatedStatistics;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public ValuationStatistics getHighestPriceValueRelatedStatistics() {
		return HighestPriceValueRelatedStatistics;
	}

	public void setHighestPriceValueRelatedStatistics(
			ValuationStatistics HighestPriceValueRelatedStatistics) {
		this.HighestPriceValueRelatedStatistics = HighestPriceValueRelatedStatistics;
	}

	public ValuationStatistics getLowestPriceValueRelatedStatistics() {
		return LowestPriceValueRelatedStatistics;
	}

	public void setLowestPriceValueRelatedStatistics(
			ValuationStatistics LowestPriceValueRelatedStatistics) {
		this.LowestPriceValueRelatedStatistics = LowestPriceValueRelatedStatistics;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return SecuritiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(
			SecuritiesTradeExecution SecuritiesTradeExecution) {
		this.SecuritiesTradeExecution = SecuritiesTradeExecution;
	}

	public YesNoIndicator getYielded() {
		return Yielded;
	}

	public void setYielded(YesNoIndicator Yielded) {
		this.Yielded = Yielded;
	}

	public PriceValueTypeCode getTypeOfRate() {
		return TypeOfRate;
	}

	public void setTypeOfRate(PriceValueTypeCode TypeOfRate) {
		this.TypeOfRate = TypeOfRate;
	}

	public Derivative getDerivative() {
		return Derivative;
	}

	public void setDerivative(Derivative Derivative) {
		this.Derivative = Derivative;
	}

	public Warrant getRelatedWarrant() {
		return RelatedWarrant;
	}

	public void setRelatedWarrant(Warrant RelatedWarrant) {
		this.RelatedWarrant = RelatedWarrant;
	}

	public SecuritiesConversion getRelatedSecuritiesConversion() {
		return RelatedSecuritiesConversion;
	}

	public void setRelatedSecuritiesConversion(
			SecuritiesConversion RelatedSecuritiesConversion) {
		this.RelatedSecuritiesConversion = RelatedSecuritiesConversion;
	}

	public LotBreakdown getLotBreakdown() {
		return LotBreakdown;
	}

	public void setLotBreakdown(LotBreakdown LotBreakdown) {
		this.LotBreakdown = LotBreakdown;
	}

	public AmountPriceTypeCode getTypeOfAmount() {
		return TypeOfAmount;
	}

	public void setTypeOfAmount(AmountPriceTypeCode TypeOfAmount) {
		this.TypeOfAmount = TypeOfAmount;
	}

	public CorporateActionPrice getExercisePriceRelatedEvent() {
		return ExercisePriceRelatedEvent;
	}

	public void setExercisePriceRelatedEvent(
			CorporateActionPrice ExercisePriceRelatedEvent) {
		this.ExercisePriceRelatedEvent = ExercisePriceRelatedEvent;
	}

	public CorporateActionPrice getGenericCashPriceReceivedPerProductRelatedEvent() {
		return GenericCashPriceReceivedPerProductRelatedEvent;
	}

	public void setGenericCashPriceReceivedPerProductRelatedEvent(
			CorporateActionPrice GenericCashPriceReceivedPerProductRelatedEvent) {
		this.GenericCashPriceReceivedPerProductRelatedEvent = GenericCashPriceReceivedPerProductRelatedEvent;
	}

	public AmountAndQuantity getAmountPricePerFinancialInstrumentQuantity() {
		return AmountPricePerFinancialInstrumentQuantity;
	}

	public void setAmountPricePerFinancialInstrumentQuantity(
			AmountAndQuantity AmountPricePerFinancialInstrumentQuantity) {
		this.AmountPricePerFinancialInstrumentQuantity = AmountPricePerFinancialInstrumentQuantity;
	}

	public AmountRatio getAmountPricePerAmount() {
		return AmountPricePerAmount;
	}

	public void setAmountPricePerAmount(AmountRatio AmountPricePerAmount) {
		this.AmountPricePerAmount = AmountPricePerAmount;
	}

	public CorporateActionPrice getGenericCashPricePaidPerProductRelatedEvent() {
		return GenericCashPricePaidPerProductRelatedEvent;
	}

	public void setGenericCashPricePaidPerProductRelatedEvent(
			CorporateActionPrice GenericCashPricePaidPerProductRelatedEvent) {
		this.GenericCashPricePaidPerProductRelatedEvent = GenericCashPricePaidPerProductRelatedEvent;
	}

	public DateTimePeriod getPriceCalculationPeriod() {
		return PriceCalculationPeriod;
	}

	public void setPriceCalculationPeriod(DateTimePeriod PriceCalculationPeriod) {
		this.PriceCalculationPeriod = PriceCalculationPeriod;
	}

	public CorporateActionPrice getCashInLieuOfSharePriceRelatedEvent() {
		return CashInLieuOfSharePriceRelatedEvent;
	}

	public void setCashInLieuOfSharePriceRelatedEvent(
			CorporateActionPrice CashInLieuOfSharePriceRelatedEvent) {
		this.CashInLieuOfSharePriceRelatedEvent = CashInLieuOfSharePriceRelatedEvent;
	}

	public CorporateActionPrice getOverSubscriptionDepositPriceRelatedEvent() {
		return OverSubscriptionDepositPriceRelatedEvent;
	}

	public void setOverSubscriptionDepositPriceRelatedEvent(
			CorporateActionPrice OverSubscriptionDepositPriceRelatedEvent) {
		this.OverSubscriptionDepositPriceRelatedEvent = OverSubscriptionDepositPriceRelatedEvent;
	}

	public CorporateActionPrice getCashValueForTaxRelatedEvent() {
		return CashValueForTaxRelatedEvent;
	}

	public void setCashValueForTaxRelatedEvent(
			CorporateActionPrice CashValueForTaxRelatedEvent) {
		this.CashValueForTaxRelatedEvent = CashValueForTaxRelatedEvent;
	}

	public BiddingConditions getMaximumPriceBiddingConditions() {
		return MaximumPriceBiddingConditions;
	}

	public void setMaximumPriceBiddingConditions(
			BiddingConditions MaximumPriceBiddingConditions) {
		this.MaximumPriceBiddingConditions = MaximumPriceBiddingConditions;
	}

	public BiddingConditions getMinimumPriceBiddingConditions() {
		return MinimumPriceBiddingConditions;
	}

	public void setMinimumPriceBiddingConditions(
			BiddingConditions MinimumPriceBiddingConditions) {
		this.MinimumPriceBiddingConditions = MinimumPriceBiddingConditions;
	}

	public ISODateTime getQuotationDate() {
		return QuotationDate;
	}

	public void setQuotationDate(ISODateTime QuotationDate) {
		this.QuotationDate = QuotationDate;
	}

	public YieldCalculation getYieldCalculation() {
		return YieldCalculation;
	}

	public void setYieldCalculation(YieldCalculation YieldCalculation) {
		this.YieldCalculation = YieldCalculation;
	}

	public SecuritiesFinancing getRelatedSecuritiesFinancing() {
		return RelatedSecuritiesFinancing;
	}

	public void setRelatedSecuritiesFinancing(
			SecuritiesFinancing RelatedSecuritiesFinancing) {
		this.RelatedSecuritiesFinancing = RelatedSecuritiesFinancing;
	}

	public InvestmentFundOrderExecution getFundOrderRelatedToExecutedPrice() {
		return FundOrderRelatedToExecutedPrice;
	}

	public void setFundOrderRelatedToExecutedPrice(
			InvestmentFundOrderExecution FundOrderRelatedToExecutedPrice) {
		this.FundOrderRelatedToExecutedPrice = FundOrderRelatedToExecutedPrice;
	}

	public InvestmentFundOrderExecution getFundOrderRelatedToInformativePrice() {
		return FundOrderRelatedToInformativePrice;
	}

	public void setFundOrderRelatedToInformativePrice(
			InvestmentFundOrderExecution FundOrderRelatedToInformativePrice) {
		this.FundOrderRelatedToInformativePrice = FundOrderRelatedToInformativePrice;
	}

	public TaxVoucher getTaxVoucher() {
		return TaxVoucher;
	}

	public void setTaxVoucher(TaxVoucher TaxVoucher) {
		this.TaxVoucher = TaxVoucher;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return SecuritiesTrade;
	}

	public void setSecuritiesTrade(SecuritiesTrade SecuritiesTrade) {
		this.SecuritiesTrade = SecuritiesTrade;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public BuyIn getRelatedBuyIn() {
		return RelatedBuyIn;
	}

	public void setRelatedBuyIn(BuyIn RelatedBuyIn) {
		this.RelatedBuyIn = RelatedBuyIn;
	}

	public Index getIndex() {
		return Index;
	}

	public void setIndex(Index Index) {
		this.Index = Index;
	}

	public InformationPartyRole getInformationPartyRole() {
		return InformationPartyRole;
	}

	public void setInformationPartyRole(
			InformationPartyRole InformationPartyRole) {
		this.InformationPartyRole = InformationPartyRole;
	}

	public DateTimePeriod getPriceFactPeriod() {
		return PriceFactPeriod;
	}

	public void setPriceFactPeriod(DateTimePeriod PriceFactPeriod) {
		this.PriceFactPeriod = PriceFactPeriod;
	}

	public AnalyticsCalculation getAnalyticsCalculation() {
		return AnalyticsCalculation;
	}

	public void setAnalyticsCalculation(
			AnalyticsCalculation AnalyticsCalculation) {
		this.AnalyticsCalculation = AnalyticsCalculation;
	}

	public DurationCalculation getDurationCalculation() {
		return DurationCalculation;
	}

	public void setDurationCalculation(DurationCalculation DurationCalculation) {
		this.DurationCalculation = DurationCalculation;
	}

	public LifeCalculation getLifeCalculation() {
		return LifeCalculation;
	}

	public void setLifeCalculation(LifeCalculation LifeCalculation) {
		this.LifeCalculation = LifeCalculation;
	}

	public ISODateTime getDate() {
		return Date;
	}

	public void setDate(ISODateTime Date) {
		this.Date = Date;
	}

	public Spread getSpread() {
		return Spread;
	}

	public void setSpread(Spread Spread) {
		this.Spread = Spread;
	}

	public SecuritiesOrder getOrder() {
		return Order;
	}

	public void setOrder(SecuritiesOrder Order) {
		this.Order = Order;
	}

	public SecuritiesOrder getStopPriceOrder() {
		return StopPriceOrder;
	}

	public void setStopPriceOrder(SecuritiesOrder StopPriceOrder) {
		this.StopPriceOrder = StopPriceOrder;
	}

	public Allocation getAllocation() {
		return Allocation;
	}

	public void setAllocation(Allocation Allocation) {
		this.Allocation = Allocation;
	}

	public SecuritiesOrderParameters getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrderParameters RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public Entitlement getEntitlement() {
		return Entitlement;
	}

	public void setEntitlement(Entitlement Entitlement) {
		this.Entitlement = Entitlement;
	}

	public SecuritiesDistribution getCashFractionsPriceRelatedSecuritiesDistribution() {
		return CashFractionsPriceRelatedSecuritiesDistribution;
	}

	public void setCashFractionsPriceRelatedSecuritiesDistribution(
			SecuritiesDistribution CashFractionsPriceRelatedSecuritiesDistribution) {
		this.CashFractionsPriceRelatedSecuritiesDistribution = CashFractionsPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getSuscriptionPriceRelatedSecuritiesDistribution() {
		return SuscriptionPriceRelatedSecuritiesDistribution;
	}

	public void setSuscriptionPriceRelatedSecuritiesDistribution(
			SecuritiesDistribution SuscriptionPriceRelatedSecuritiesDistribution) {
		this.SuscriptionPriceRelatedSecuritiesDistribution = SuscriptionPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getReinvestmentPriceRelatedSecuritiesDistribution() {
		return ReinvestmentPriceRelatedSecuritiesDistribution;
	}

	public void setReinvestmentPriceRelatedSecuritiesDistribution(
			SecuritiesDistribution ReinvestmentPriceRelatedSecuritiesDistribution) {
		this.ReinvestmentPriceRelatedSecuritiesDistribution = ReinvestmentPriceRelatedSecuritiesDistribution;
	}

	public Derivative getRelatedFuture() {
		return RelatedFuture;
	}

	public void setRelatedFuture(Derivative RelatedFuture) {
		this.RelatedFuture = RelatedFuture;
	}

	public Distribution getDistribution() {
		return Distribution;
	}

	public void setDistribution(Distribution Distribution) {
		this.Distribution = Distribution;
	}

	public RedemptionSchedule getPriceChangeRedemptionSchedule() {
		return PriceChangeRedemptionSchedule;
	}

	public void setPriceChangeRedemptionSchedule(
			RedemptionSchedule PriceChangeRedemptionSchedule) {
		this.PriceChangeRedemptionSchedule = PriceChangeRedemptionSchedule;
	}

	public RedemptionSchedule getRelatedRedemptionSchedule() {
		return RelatedRedemptionSchedule;
	}

	public void setRelatedRedemptionSchedule(
			RedemptionSchedule RelatedRedemptionSchedule) {
		this.RelatedRedemptionSchedule = RelatedRedemptionSchedule;
	}

	public Quote getPreviousClosingPriceRelatedQuote() {
		return PreviousClosingPriceRelatedQuote;
	}

	public void setPreviousClosingPriceRelatedQuote(
			Quote PreviousClosingPriceRelatedQuote) {
		this.PreviousClosingPriceRelatedQuote = PreviousClosingPriceRelatedQuote;
	}

	public Quote getRequestedPriceRelatedQuote() {
		return RequestedPriceRelatedQuote;
	}

	public void setRequestedPriceRelatedQuote(Quote RequestedPriceRelatedQuote) {
		this.RequestedPriceRelatedQuote = RequestedPriceRelatedQuote;
	}

	public Quote getPriceRelatedQuote() {
		return PriceRelatedQuote;
	}

	public void setPriceRelatedQuote(Quote PriceRelatedQuote) {
		this.PriceRelatedQuote = PriceRelatedQuote;
	}

	public Quote getMarketPriceRelatedQuote() {
		return MarketPriceRelatedQuote;
	}

	public void setMarketPriceRelatedQuote(Quote MarketPriceRelatedQuote) {
		this.MarketPriceRelatedQuote = MarketPriceRelatedQuote;
	}

	public Price getPrice() {
		return Price;
	}

	public void setPrice(Price Price) {
		this.Price = Price;
	}

	public CorporateActionPrice getRelatedCorporateActionPrice() {
		return RelatedCorporateActionPrice;
	}

	public void setRelatedCorporateActionPrice(
			CorporateActionPrice RelatedCorporateActionPrice) {
		this.RelatedCorporateActionPrice = RelatedCorporateActionPrice;
	}

	public Position getRelatedPosition() {
		return RelatedPosition;
	}

	public void setRelatedPosition(Position RelatedPosition) {
		this.RelatedPosition = RelatedPosition;
	}
}