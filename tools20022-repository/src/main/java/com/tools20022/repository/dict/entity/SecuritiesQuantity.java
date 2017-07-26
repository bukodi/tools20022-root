package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.LotBreakdown;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.dict.entity.SecuritiesEntry;
import com.tools20022.repository.dict.codeset.QuantityCode;
import com.tools20022.repository.dict.entity.CorporateActionDistribution;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.BiddingConditions;
import com.tools20022.repository.dict.entity.CorporateActionSecuritiesEntitlement;
import com.tools20022.repository.dict.entity.Lottery;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.entity.Debt;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.UnderlyingRatio;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.entity.CorporateActionElection;
import com.tools20022.repository.dict.entity.TaxVoucher;
import com.tools20022.repository.dict.entity.BuyIn;
import com.tools20022.repository.dict.entity.Liquidity;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesOrderParameters;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.PairOff;
import com.tools20022.repository.dict.entity.SecuritiesAndCashDistribution;
import com.tools20022.repository.dict.entity.SecuritiesDistribution;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.entity.SidePocket;
import com.tools20022.repository.dict.entity.Netting;
import com.tools20022.repository.dict.entity.SecuritiesOrderStatus;
import com.tools20022.repository.dict.entity.FundsCashFlow;
import com.tools20022.repository.dict.entity.Position;

/**
 * Quantity of a security.
 */
public class SecuritiesQuantity {

	private DecimalNumber Unit;
	private SecuritiesTransfer SecuritiesTransfer;
	private Security SecurityIdentification;
	private InvestmentFundOrder Order;
	private UKTaxGroupUnitCode Group1Or2Units;
	private InvestmentFundOrderExecution RelatedOrderExecution;
	private SecuritiesSettlement SecuritiesSettlement;
	private Security MinimumQuantityDebt;
	private LotBreakdown LotBreakdown;
	private SecuritiesConversion MinimumExercisableQuantitySecuritiesConversion;
	private SecuritiesConversion MinimumExercisableMultipleQuantitySecuritiesConversion;
	private SecuritiesBalance AggregateQuantityBalance;
	private SecuritiesProceedsDefinition SecuritiesProceedsDefinition;
	private SecuritiesProceedsDefinition ConditionalQuantitySecuritiesProceeds;
	private SecuritiesProceedsDefinition OverAndAboveQuantitySecuritiesProceeds;
	private SecuritiesEntry Entry;
	private QuantityCode Code;
	private SecuritiesProceedsDefinition ExpectedQuantitySecuritiesProceeds;
	private SecuritiesProceedsDefinition StatusRelatedSecuritiesProceeds;
	private CorporateActionDistribution CorporateActionDistribution;
	private CorporateActionEvent RelatedEventForFractionalQuantity;
	private SecuritiesConversion MaximumExercisableQuantitySecuritiesConversion;
	private SecuritiesProceedsDefinition BoardLotSecuritiesProceeds;
	private SecuritiesProceedsDefinition NewDenominationSecuritiesProceeds;
	private BiddingConditions BackEndOddLotBiddingConditions;
	private CorporateActionSecuritiesEntitlement SecuritiesEntitlement;
	private CorporateActionEvent CorporateActionEvent;
	private BiddingConditions BiddingConditions;
	private Lottery Lottery;
	private SecuritiesBalance RelatedSubBalance;
	private SecuritiesBalance AvailableQuantityBalance;
	private SecuritiesTrade Trade;
	private SecuritiesConversion RatioDenominatorSecuritiesConversion;
	private SecuritiesConversion RatioNumeratorSecuritiesConversion;
	private TradingMarket MinimumTradedQuantityMarket;
	private Debt MinimumDenominationDebt;
	private Debt MinimumIncrementDebt;
	private SecuritiesOrder RelatedOrder;
	private Allocation Allocation;
	private CurrencyAndAmount Amount;
	private UnderlyingRatio DenominatorRatio;
	private UnderlyingRatio NumeratorRatio;
	private SecuritiesTradeExecution SecuritiesTradeExecution;
	private CorporateActionEvent RelatedCorporateActionEvent;
	private CorporateActionElection CorporateActionElection;
	private TaxVoucher TaxVoucher;
	private BuyIn RelatedBuyIn;
	private SecuritiesOrder PreviousDayOrder;
	private Liquidity Liquidity;
	private PercentageRate Rate;
	private SecuritiesOrderParameters MinimumQuantityOrderParameters;
	private Quote MaximumQuantityRelatedQuote;
	private SecuritiesBalance UnavailableQuantityBalance;
	private SecuritiesOrderParameters MatchIncrementOrderParameters;
	private Issuance RelatedIssuance;
	private PairOff Pairoff;
	private Issuance Issuance;
	private SecuritiesAndCashDistribution IntermediateToUnderlyingDenominatorDistributionInformation;
	private SecuritiesAndCashDistribution MaximumHoldingDistributionInformation;
	private SecuritiesAndCashDistribution MaximumExercisableQuantityDistributionInformation;
	private SecuritiesAndCashDistribution MinimumExercisableQuantityDistributionInformation;
	private SecuritiesAndCashDistribution DistributedToUnderlyingDenominatorDistributionInformation;
	private SecuritiesAndCashDistribution IntermediateToUnderlyingNumeratorDistributionInformation;
	private SecuritiesAndCashDistribution MinimumHoldingDistributionInformation;
	private SecuritiesAndCashDistribution DistributedToUnderlyingNumeratorDistributionInformation;
	private SecuritiesDistribution MaximumHoldingRelatedSecuritiesDistribution;
	private SecuritiesDistribution IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	private SecuritiesDistribution IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	private SecuritiesDistribution DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	private SecuritiesDistribution DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	private SecuritiesDistribution MinimumHoldingRelatedSecuritiesDistribution;
	private TradingMarket MaximumTradedQuantityMarket;
	private Quote QuantityRelatedQuote;
	private Quote MinimumQuantityRelatedQuote;
	private NetAssetValueCalculation NetAssetValueCalculation;
	private SidePocket SidePocket;
	private Netting Netting;
	private SecuritiesOrderStatus RelatedOrderStatus;
	private SecuritiesOrderStatus SecuritiesOrderStatus;
	private SecuritiesSettlement RelatedTurnaroundSettlement;
	private FundsCashFlow RelatedCashFlow;
	private Position Position;
	private BiddingConditions MaximumQuantityBiddingConditions;
	private BiddingConditions FrontEndOddLotBiddingConditions;
	private BiddingConditions MinimumQuantityBiddingConditions;

	public DecimalNumber getUnit() {
		return Unit;
	}

	public void setUnit(DecimalNumber Unit) {
		this.Unit = Unit;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return SecuritiesTransfer;
	}

	public void setSecuritiesTransfer(SecuritiesTransfer SecuritiesTransfer) {
		this.SecuritiesTransfer = SecuritiesTransfer;
	}

	public Security getSecurityIdentification() {
		return SecurityIdentification;
	}

	public void setSecurityIdentification(Security SecurityIdentification) {
		this.SecurityIdentification = SecurityIdentification;
	}

	public InvestmentFundOrder getOrder() {
		return Order;
	}

	public void setOrder(InvestmentFundOrder Order) {
		this.Order = Order;
	}

	public UKTaxGroupUnitCode getGroup1Or2Units() {
		return Group1Or2Units;
	}

	public void setGroup1Or2Units(UKTaxGroupUnitCode Group1Or2Units) {
		this.Group1Or2Units = Group1Or2Units;
	}

	public InvestmentFundOrderExecution getRelatedOrderExecution() {
		return RelatedOrderExecution;
	}

	public void setRelatedOrderExecution(
			InvestmentFundOrderExecution RelatedOrderExecution) {
		this.RelatedOrderExecution = RelatedOrderExecution;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public Security getMinimumQuantityDebt() {
		return MinimumQuantityDebt;
	}

	public void setMinimumQuantityDebt(Security MinimumQuantityDebt) {
		this.MinimumQuantityDebt = MinimumQuantityDebt;
	}

	public LotBreakdown getLotBreakdown() {
		return LotBreakdown;
	}

	public void setLotBreakdown(LotBreakdown LotBreakdown) {
		this.LotBreakdown = LotBreakdown;
	}

	public SecuritiesConversion getMinimumExercisableQuantitySecuritiesConversion() {
		return MinimumExercisableQuantitySecuritiesConversion;
	}

	public void setMinimumExercisableQuantitySecuritiesConversion(
			SecuritiesConversion MinimumExercisableQuantitySecuritiesConversion) {
		this.MinimumExercisableQuantitySecuritiesConversion = MinimumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesConversion getMinimumExercisableMultipleQuantitySecuritiesConversion() {
		return MinimumExercisableMultipleQuantitySecuritiesConversion;
	}

	public void setMinimumExercisableMultipleQuantitySecuritiesConversion(
			SecuritiesConversion MinimumExercisableMultipleQuantitySecuritiesConversion) {
		this.MinimumExercisableMultipleQuantitySecuritiesConversion = MinimumExercisableMultipleQuantitySecuritiesConversion;
	}

	public SecuritiesBalance getAggregateQuantityBalance() {
		return AggregateQuantityBalance;
	}

	public void setAggregateQuantityBalance(
			SecuritiesBalance AggregateQuantityBalance) {
		this.AggregateQuantityBalance = AggregateQuantityBalance;
	}

	public SecuritiesProceedsDefinition getSecuritiesProceedsDefinition() {
		return SecuritiesProceedsDefinition;
	}

	public void setSecuritiesProceedsDefinition(
			SecuritiesProceedsDefinition SecuritiesProceedsDefinition) {
		this.SecuritiesProceedsDefinition = SecuritiesProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getConditionalQuantitySecuritiesProceeds() {
		return ConditionalQuantitySecuritiesProceeds;
	}

	public void setConditionalQuantitySecuritiesProceeds(
			SecuritiesProceedsDefinition ConditionalQuantitySecuritiesProceeds) {
		this.ConditionalQuantitySecuritiesProceeds = ConditionalQuantitySecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getOverAndAboveQuantitySecuritiesProceeds() {
		return OverAndAboveQuantitySecuritiesProceeds;
	}

	public void setOverAndAboveQuantitySecuritiesProceeds(
			SecuritiesProceedsDefinition OverAndAboveQuantitySecuritiesProceeds) {
		this.OverAndAboveQuantitySecuritiesProceeds = OverAndAboveQuantitySecuritiesProceeds;
	}

	public SecuritiesEntry getEntry() {
		return Entry;
	}

	public void setEntry(SecuritiesEntry Entry) {
		this.Entry = Entry;
	}

	public QuantityCode getCode() {
		return Code;
	}

	public void setCode(QuantityCode Code) {
		this.Code = Code;
	}

	public SecuritiesProceedsDefinition getExpectedQuantitySecuritiesProceeds() {
		return ExpectedQuantitySecuritiesProceeds;
	}

	public void setExpectedQuantitySecuritiesProceeds(
			SecuritiesProceedsDefinition ExpectedQuantitySecuritiesProceeds) {
		this.ExpectedQuantitySecuritiesProceeds = ExpectedQuantitySecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getStatusRelatedSecuritiesProceeds() {
		return StatusRelatedSecuritiesProceeds;
	}

	public void setStatusRelatedSecuritiesProceeds(
			SecuritiesProceedsDefinition StatusRelatedSecuritiesProceeds) {
		this.StatusRelatedSecuritiesProceeds = StatusRelatedSecuritiesProceeds;
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return CorporateActionDistribution;
	}

	public void setCorporateActionDistribution(
			CorporateActionDistribution CorporateActionDistribution) {
		this.CorporateActionDistribution = CorporateActionDistribution;
	}

	public CorporateActionEvent getRelatedEventForFractionalQuantity() {
		return RelatedEventForFractionalQuantity;
	}

	public void setRelatedEventForFractionalQuantity(
			CorporateActionEvent RelatedEventForFractionalQuantity) {
		this.RelatedEventForFractionalQuantity = RelatedEventForFractionalQuantity;
	}

	public SecuritiesConversion getMaximumExercisableQuantitySecuritiesConversion() {
		return MaximumExercisableQuantitySecuritiesConversion;
	}

	public void setMaximumExercisableQuantitySecuritiesConversion(
			SecuritiesConversion MaximumExercisableQuantitySecuritiesConversion) {
		this.MaximumExercisableQuantitySecuritiesConversion = MaximumExercisableQuantitySecuritiesConversion;
	}

	public SecuritiesProceedsDefinition getBoardLotSecuritiesProceeds() {
		return BoardLotSecuritiesProceeds;
	}

	public void setBoardLotSecuritiesProceeds(
			SecuritiesProceedsDefinition BoardLotSecuritiesProceeds) {
		this.BoardLotSecuritiesProceeds = BoardLotSecuritiesProceeds;
	}

	public SecuritiesProceedsDefinition getNewDenominationSecuritiesProceeds() {
		return NewDenominationSecuritiesProceeds;
	}

	public void setNewDenominationSecuritiesProceeds(
			SecuritiesProceedsDefinition NewDenominationSecuritiesProceeds) {
		this.NewDenominationSecuritiesProceeds = NewDenominationSecuritiesProceeds;
	}

	public BiddingConditions getBackEndOddLotBiddingConditions() {
		return BackEndOddLotBiddingConditions;
	}

	public void setBackEndOddLotBiddingConditions(
			BiddingConditions BackEndOddLotBiddingConditions) {
		this.BackEndOddLotBiddingConditions = BackEndOddLotBiddingConditions;
	}

	public CorporateActionSecuritiesEntitlement getSecuritiesEntitlement() {
		return SecuritiesEntitlement;
	}

	public void setSecuritiesEntitlement(
			CorporateActionSecuritiesEntitlement SecuritiesEntitlement) {
		this.SecuritiesEntitlement = SecuritiesEntitlement;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}

	public BiddingConditions getBiddingConditions() {
		return BiddingConditions;
	}

	public void setBiddingConditions(BiddingConditions BiddingConditions) {
		this.BiddingConditions = BiddingConditions;
	}

	public Lottery getLottery() {
		return Lottery;
	}

	public void setLottery(Lottery Lottery) {
		this.Lottery = Lottery;
	}

	public SecuritiesBalance getRelatedSubBalance() {
		return RelatedSubBalance;
	}

	public void setRelatedSubBalance(SecuritiesBalance RelatedSubBalance) {
		this.RelatedSubBalance = RelatedSubBalance;
	}

	public SecuritiesBalance getAvailableQuantityBalance() {
		return AvailableQuantityBalance;
	}

	public void setAvailableQuantityBalance(
			SecuritiesBalance AvailableQuantityBalance) {
		this.AvailableQuantityBalance = AvailableQuantityBalance;
	}

	public SecuritiesTrade getTrade() {
		return Trade;
	}

	public void setTrade(SecuritiesTrade Trade) {
		this.Trade = Trade;
	}

	public SecuritiesConversion getRatioDenominatorSecuritiesConversion() {
		return RatioDenominatorSecuritiesConversion;
	}

	public void setRatioDenominatorSecuritiesConversion(
			SecuritiesConversion RatioDenominatorSecuritiesConversion) {
		this.RatioDenominatorSecuritiesConversion = RatioDenominatorSecuritiesConversion;
	}

	public SecuritiesConversion getRatioNumeratorSecuritiesConversion() {
		return RatioNumeratorSecuritiesConversion;
	}

	public void setRatioNumeratorSecuritiesConversion(
			SecuritiesConversion RatioNumeratorSecuritiesConversion) {
		this.RatioNumeratorSecuritiesConversion = RatioNumeratorSecuritiesConversion;
	}

	public TradingMarket getMinimumTradedQuantityMarket() {
		return MinimumTradedQuantityMarket;
	}

	public void setMinimumTradedQuantityMarket(
			TradingMarket MinimumTradedQuantityMarket) {
		this.MinimumTradedQuantityMarket = MinimumTradedQuantityMarket;
	}

	public Debt getMinimumDenominationDebt() {
		return MinimumDenominationDebt;
	}

	public void setMinimumDenominationDebt(Debt MinimumDenominationDebt) {
		this.MinimumDenominationDebt = MinimumDenominationDebt;
	}

	public Debt getMinimumIncrementDebt() {
		return MinimumIncrementDebt;
	}

	public void setMinimumIncrementDebt(Debt MinimumIncrementDebt) {
		this.MinimumIncrementDebt = MinimumIncrementDebt;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public Allocation getAllocation() {
		return Allocation;
	}

	public void setAllocation(Allocation Allocation) {
		this.Allocation = Allocation;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public UnderlyingRatio getDenominatorRatio() {
		return DenominatorRatio;
	}

	public void setDenominatorRatio(UnderlyingRatio DenominatorRatio) {
		this.DenominatorRatio = DenominatorRatio;
	}

	public UnderlyingRatio getNumeratorRatio() {
		return NumeratorRatio;
	}

	public void setNumeratorRatio(UnderlyingRatio NumeratorRatio) {
		this.NumeratorRatio = NumeratorRatio;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return SecuritiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(
			SecuritiesTradeExecution SecuritiesTradeExecution) {
		this.SecuritiesTradeExecution = SecuritiesTradeExecution;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return RelatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(
			CorporateActionEvent RelatedCorporateActionEvent) {
		this.RelatedCorporateActionEvent = RelatedCorporateActionEvent;
	}

	public CorporateActionElection getCorporateActionElection() {
		return CorporateActionElection;
	}

	public void setCorporateActionElection(
			CorporateActionElection CorporateActionElection) {
		this.CorporateActionElection = CorporateActionElection;
	}

	public TaxVoucher getTaxVoucher() {
		return TaxVoucher;
	}

	public void setTaxVoucher(TaxVoucher TaxVoucher) {
		this.TaxVoucher = TaxVoucher;
	}

	public BuyIn getRelatedBuyIn() {
		return RelatedBuyIn;
	}

	public void setRelatedBuyIn(BuyIn RelatedBuyIn) {
		this.RelatedBuyIn = RelatedBuyIn;
	}

	public SecuritiesOrder getPreviousDayOrder() {
		return PreviousDayOrder;
	}

	public void setPreviousDayOrder(SecuritiesOrder PreviousDayOrder) {
		this.PreviousDayOrder = PreviousDayOrder;
	}

	public Liquidity getLiquidity() {
		return Liquidity;
	}

	public void setLiquidity(Liquidity Liquidity) {
		this.Liquidity = Liquidity;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public SecuritiesOrderParameters getMinimumQuantityOrderParameters() {
		return MinimumQuantityOrderParameters;
	}

	public void setMinimumQuantityOrderParameters(
			SecuritiesOrderParameters MinimumQuantityOrderParameters) {
		this.MinimumQuantityOrderParameters = MinimumQuantityOrderParameters;
	}

	public Quote getMaximumQuantityRelatedQuote() {
		return MaximumQuantityRelatedQuote;
	}

	public void setMaximumQuantityRelatedQuote(Quote MaximumQuantityRelatedQuote) {
		this.MaximumQuantityRelatedQuote = MaximumQuantityRelatedQuote;
	}

	public SecuritiesBalance getUnavailableQuantityBalance() {
		return UnavailableQuantityBalance;
	}

	public void setUnavailableQuantityBalance(
			SecuritiesBalance UnavailableQuantityBalance) {
		this.UnavailableQuantityBalance = UnavailableQuantityBalance;
	}

	public SecuritiesOrderParameters getMatchIncrementOrderParameters() {
		return MatchIncrementOrderParameters;
	}

	public void setMatchIncrementOrderParameters(
			SecuritiesOrderParameters MatchIncrementOrderParameters) {
		this.MatchIncrementOrderParameters = MatchIncrementOrderParameters;
	}

	public Issuance getRelatedIssuance() {
		return RelatedIssuance;
	}

	public void setRelatedIssuance(Issuance RelatedIssuance) {
		this.RelatedIssuance = RelatedIssuance;
	}

	public PairOff getPairoff() {
		return Pairoff;
	}

	public void setPairoff(PairOff Pairoff) {
		this.Pairoff = Pairoff;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingDenominatorDistributionInformation() {
		return IntermediateToUnderlyingDenominatorDistributionInformation;
	}

	public void setIntermediateToUnderlyingDenominatorDistributionInformation(
			SecuritiesAndCashDistribution IntermediateToUnderlyingDenominatorDistributionInformation) {
		this.IntermediateToUnderlyingDenominatorDistributionInformation = IntermediateToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMaximumHoldingDistributionInformation() {
		return MaximumHoldingDistributionInformation;
	}

	public void setMaximumHoldingDistributionInformation(
			SecuritiesAndCashDistribution MaximumHoldingDistributionInformation) {
		this.MaximumHoldingDistributionInformation = MaximumHoldingDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMaximumExercisableQuantityDistributionInformation() {
		return MaximumExercisableQuantityDistributionInformation;
	}

	public void setMaximumExercisableQuantityDistributionInformation(
			SecuritiesAndCashDistribution MaximumExercisableQuantityDistributionInformation) {
		this.MaximumExercisableQuantityDistributionInformation = MaximumExercisableQuantityDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMinimumExercisableQuantityDistributionInformation() {
		return MinimumExercisableQuantityDistributionInformation;
	}

	public void setMinimumExercisableQuantityDistributionInformation(
			SecuritiesAndCashDistribution MinimumExercisableQuantityDistributionInformation) {
		this.MinimumExercisableQuantityDistributionInformation = MinimumExercisableQuantityDistributionInformation;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingDenominatorDistributionInformation() {
		return DistributedToUnderlyingDenominatorDistributionInformation;
	}

	public void setDistributedToUnderlyingDenominatorDistributionInformation(
			SecuritiesAndCashDistribution DistributedToUnderlyingDenominatorDistributionInformation) {
		this.DistributedToUnderlyingDenominatorDistributionInformation = DistributedToUnderlyingDenominatorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getIntermediateToUnderlyingNumeratorDistributionInformation() {
		return IntermediateToUnderlyingNumeratorDistributionInformation;
	}

	public void setIntermediateToUnderlyingNumeratorDistributionInformation(
			SecuritiesAndCashDistribution IntermediateToUnderlyingNumeratorDistributionInformation) {
		this.IntermediateToUnderlyingNumeratorDistributionInformation = IntermediateToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesAndCashDistribution getMinimumHoldingDistributionInformation() {
		return MinimumHoldingDistributionInformation;
	}

	public void setMinimumHoldingDistributionInformation(
			SecuritiesAndCashDistribution MinimumHoldingDistributionInformation) {
		this.MinimumHoldingDistributionInformation = MinimumHoldingDistributionInformation;
	}

	public SecuritiesAndCashDistribution getDistributedToUnderlyingNumeratorDistributionInformation() {
		return DistributedToUnderlyingNumeratorDistributionInformation;
	}

	public void setDistributedToUnderlyingNumeratorDistributionInformation(
			SecuritiesAndCashDistribution DistributedToUnderlyingNumeratorDistributionInformation) {
		this.DistributedToUnderlyingNumeratorDistributionInformation = DistributedToUnderlyingNumeratorDistributionInformation;
	}

	public SecuritiesDistribution getMaximumHoldingRelatedSecuritiesDistribution() {
		return MaximumHoldingRelatedSecuritiesDistribution;
	}

	public void setMaximumHoldingRelatedSecuritiesDistribution(
			SecuritiesDistribution MaximumHoldingRelatedSecuritiesDistribution) {
		this.MaximumHoldingRelatedSecuritiesDistribution = MaximumHoldingRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public void setIntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution(
			SecuritiesDistribution IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public void setIntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution(
			SecuritiesDistribution IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution() {
		return DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public void setDistributedToUnderlyingDenominatorRelatedSecuritiesDistribution(
			SecuritiesDistribution DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution) {
		this.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution() {
		return DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public void setDistributedToUnderlyingNumeratorRelatedSecuritiesDistribution(
			SecuritiesDistribution DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution) {
		this.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getMinimumHoldingRelatedSecuritiesDistribution() {
		return MinimumHoldingRelatedSecuritiesDistribution;
	}

	public void setMinimumHoldingRelatedSecuritiesDistribution(
			SecuritiesDistribution MinimumHoldingRelatedSecuritiesDistribution) {
		this.MinimumHoldingRelatedSecuritiesDistribution = MinimumHoldingRelatedSecuritiesDistribution;
	}

	public TradingMarket getMaximumTradedQuantityMarket() {
		return MaximumTradedQuantityMarket;
	}

	public void setMaximumTradedQuantityMarket(
			TradingMarket MaximumTradedQuantityMarket) {
		this.MaximumTradedQuantityMarket = MaximumTradedQuantityMarket;
	}

	public Quote getQuantityRelatedQuote() {
		return QuantityRelatedQuote;
	}

	public void setQuantityRelatedQuote(Quote QuantityRelatedQuote) {
		this.QuantityRelatedQuote = QuantityRelatedQuote;
	}

	public Quote getMinimumQuantityRelatedQuote() {
		return MinimumQuantityRelatedQuote;
	}

	public void setMinimumQuantityRelatedQuote(Quote MinimumQuantityRelatedQuote) {
		this.MinimumQuantityRelatedQuote = MinimumQuantityRelatedQuote;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public SidePocket getSidePocket() {
		return SidePocket;
	}

	public void setSidePocket(SidePocket SidePocket) {
		this.SidePocket = SidePocket;
	}

	public Netting getNetting() {
		return Netting;
	}

	public void setNetting(Netting Netting) {
		this.Netting = Netting;
	}

	public SecuritiesOrderStatus getRelatedOrderStatus() {
		return RelatedOrderStatus;
	}

	public void setRelatedOrderStatus(SecuritiesOrderStatus RelatedOrderStatus) {
		this.RelatedOrderStatus = RelatedOrderStatus;
	}

	public SecuritiesOrderStatus getSecuritiesOrderStatus() {
		return SecuritiesOrderStatus;
	}

	public void setSecuritiesOrderStatus(
			SecuritiesOrderStatus SecuritiesOrderStatus) {
		this.SecuritiesOrderStatus = SecuritiesOrderStatus;
	}

	public SecuritiesSettlement getRelatedTurnaroundSettlement() {
		return RelatedTurnaroundSettlement;
	}

	public void setRelatedTurnaroundSettlement(
			SecuritiesSettlement RelatedTurnaroundSettlement) {
		this.RelatedTurnaroundSettlement = RelatedTurnaroundSettlement;
	}

	public FundsCashFlow getRelatedCashFlow() {
		return RelatedCashFlow;
	}

	public void setRelatedCashFlow(FundsCashFlow RelatedCashFlow) {
		this.RelatedCashFlow = RelatedCashFlow;
	}

	public Position getPosition() {
		return Position;
	}

	public void setPosition(Position Position) {
		this.Position = Position;
	}

	public BiddingConditions getMaximumQuantityBiddingConditions() {
		return MaximumQuantityBiddingConditions;
	}

	public void setMaximumQuantityBiddingConditions(
			BiddingConditions MaximumQuantityBiddingConditions) {
		this.MaximumQuantityBiddingConditions = MaximumQuantityBiddingConditions;
	}

	public BiddingConditions getFrontEndOddLotBiddingConditions() {
		return FrontEndOddLotBiddingConditions;
	}

	public void setFrontEndOddLotBiddingConditions(
			BiddingConditions FrontEndOddLotBiddingConditions) {
		this.FrontEndOddLotBiddingConditions = FrontEndOddLotBiddingConditions;
	}

	public BiddingConditions getMinimumQuantityBiddingConditions() {
		return MinimumQuantityBiddingConditions;
	}

	public void setMinimumQuantityBiddingConditions(
			BiddingConditions MinimumQuantityBiddingConditions) {
		this.MinimumQuantityBiddingConditions = MinimumQuantityBiddingConditions;
	}
}