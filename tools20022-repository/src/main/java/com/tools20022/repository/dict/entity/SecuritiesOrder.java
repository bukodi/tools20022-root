package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Order;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CashMarginOrderCode;
import com.tools20022.repository.dict.codeset.SideCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CustomerOrderCapacityCode;
import com.tools20022.repository.dict.codeset.PositionEffectCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.EligibilityCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.BusinessProcessTypeCode;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max3Number;
import com.tools20022.repository.dict.codeset.TradeRegulatoryConditionsCode;
import com.tools20022.repository.dict.entity.SecuritiesOrderPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesOrderStatus;
import com.tools20022.repository.dict.entity.Negotiation;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.SecuritiesRegulatoryDetails;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.entity.SecuritiesOrderParameters;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.dict.codeset.TransactionType1Code;
import com.tools20022.repository.dict.entity.TradingSession;
import com.tools20022.repository.dict.entity.OrderBook;
import com.tools20022.repository.dict.entity.ListTrading;
import com.tools20022.repository.dict.entity.CrossTrade;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesPostTradeBooking;
import com.tools20022.repository.dict.entity.ExchangeForPhysicalTrade;
import com.tools20022.repository.dict.codeset.OrderQuantityTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesOrderExecutionInstruction;
import com.tools20022.repository.dict.codeset.OrderTypeCode;

/**
 * Intention to transfer an ownership of a financial instrument.
 */
public class SecuritiesOrder extends Order
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime OrderEffectiveDate;
	private ISODateTime OrderExpiryDate;
	private Max35Text Identification;
	private CashMarginOrderCode CashMargin;
	private SideCode Side;
	private YesNoIndicator SolicitedOrder;
	private CustomerOrderCapacityCode CustomerCapacity;
	private PositionEffectCode PositionEffect;
	private YesNoIndicator ForeignExchangeExecutionRequested;
	private CurrencyCode SettlementCurrency;
	private EligibilityCode OrderOriginatorEligibility;
	private SecuritiesQuantity OrderedQuantity;
	private BusinessProcessTypeCode BusinessProcessType;
	private TradingMarket PlaceOfTrade;
	private CurrencyAndAmount OrderedAmount;
	private Max3Number GiveUpNumberOfDays;
	private TradeRegulatoryConditionsCode TradeRegulatoryConditionsType;
	private SecuritiesQuantity DayOrderQuantity;
	private SecuritiesOrderPartyRole SecuritiesOrderPartyRole;
	private SecuritiesOrderStatus Status;
	private Negotiation RelatedNegotiation;
	private Adjustment Adjustments;
	private SecuritiesRegulatoryDetails LegalParameters;
	private SecuritiesPricing OrderPrice;
	private SecuritiesPricing StopPrice;
	private Allocation SecuritiesOrderAllocation;
	private SecuritiesOrderParameters OrderExecutionParameters;
	private SecuritiesTrade OrderExecution;
	private SecuritiesAccount OrderingAccount;
	private SecuritiesQuoteVariable Quote;
	private TransactionType1Code FundTransactionDirectionIndicator;
	private ISODateTime OrderDate;
	private CurrencyAndAmount PegDifference;
	private TradingSession SecuritiesOrderTradingSession;
	private OrderBook RelatedOrderBook;
	private ListTrading ListTrading;
	private CrossTrade BuySideRelatedCrossTrade;
	private CrossTrade SellSideRelatedCrossTrade;
	private Security OrderedSecurity;
	private SecuritiesPostTradeBooking BookingInstructions;
	private ExchangeForPhysicalTrade ExchangeForPhysicalTrade;
	private OrderQuantityTypeCode QuantityType;
	private Max35Text ClientOrderIdentification;
	private SecuritiesOrderExecutionInstruction ExecutionInstructions;
	private OrderTypeCode Type;

	public ISODateTime getOrderEffectiveDate() {
		return OrderEffectiveDate;
	}

	public void setOrderEffectiveDate(ISODateTime OrderEffectiveDate) {
		this.OrderEffectiveDate = OrderEffectiveDate;
	}

	public ISODateTime getOrderExpiryDate() {
		return OrderExpiryDate;
	}

	public void setOrderExpiryDate(ISODateTime OrderExpiryDate) {
		this.OrderExpiryDate = OrderExpiryDate;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public CashMarginOrderCode getCashMargin() {
		return CashMargin;
	}

	public void setCashMargin(CashMarginOrderCode CashMargin) {
		this.CashMargin = CashMargin;
	}

	public SideCode getSide() {
		return Side;
	}

	public void setSide(SideCode Side) {
		this.Side = Side;
	}

	public YesNoIndicator getSolicitedOrder() {
		return SolicitedOrder;
	}

	public void setSolicitedOrder(YesNoIndicator SolicitedOrder) {
		this.SolicitedOrder = SolicitedOrder;
	}

	public CustomerOrderCapacityCode getCustomerCapacity() {
		return CustomerCapacity;
	}

	public void setCustomerCapacity(CustomerOrderCapacityCode CustomerCapacity) {
		this.CustomerCapacity = CustomerCapacity;
	}

	public PositionEffectCode getPositionEffect() {
		return PositionEffect;
	}

	public void setPositionEffect(PositionEffectCode PositionEffect) {
		this.PositionEffect = PositionEffect;
	}

	public YesNoIndicator getForeignExchangeExecutionRequested() {
		return ForeignExchangeExecutionRequested;
	}

	public void setForeignExchangeExecutionRequested(
			YesNoIndicator ForeignExchangeExecutionRequested) {
		this.ForeignExchangeExecutionRequested = ForeignExchangeExecutionRequested;
	}

	public CurrencyCode getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}

	public EligibilityCode getOrderOriginatorEligibility() {
		return OrderOriginatorEligibility;
	}

	public void setOrderOriginatorEligibility(
			EligibilityCode OrderOriginatorEligibility) {
		this.OrderOriginatorEligibility = OrderOriginatorEligibility;
	}

	public SecuritiesQuantity getOrderedQuantity() {
		return OrderedQuantity;
	}

	public void setOrderedQuantity(SecuritiesQuantity OrderedQuantity) {
		this.OrderedQuantity = OrderedQuantity;
	}

	public BusinessProcessTypeCode getBusinessProcessType() {
		return BusinessProcessType;
	}

	public void setBusinessProcessType(
			BusinessProcessTypeCode BusinessProcessType) {
		this.BusinessProcessType = BusinessProcessType;
	}

	public TradingMarket getPlaceOfTrade() {
		return PlaceOfTrade;
	}

	public void setPlaceOfTrade(TradingMarket PlaceOfTrade) {
		this.PlaceOfTrade = PlaceOfTrade;
	}

	public CurrencyAndAmount getOrderedAmount() {
		return OrderedAmount;
	}

	public void setOrderedAmount(CurrencyAndAmount OrderedAmount) {
		this.OrderedAmount = OrderedAmount;
	}

	public Max3Number getGiveUpNumberOfDays() {
		return GiveUpNumberOfDays;
	}

	public void setGiveUpNumberOfDays(Max3Number GiveUpNumberOfDays) {
		this.GiveUpNumberOfDays = GiveUpNumberOfDays;
	}

	public TradeRegulatoryConditionsCode getTradeRegulatoryConditionsType() {
		return TradeRegulatoryConditionsType;
	}

	public void setTradeRegulatoryConditionsType(
			TradeRegulatoryConditionsCode TradeRegulatoryConditionsType) {
		this.TradeRegulatoryConditionsType = TradeRegulatoryConditionsType;
	}

	public SecuritiesQuantity getDayOrderQuantity() {
		return DayOrderQuantity;
	}

	public void setDayOrderQuantity(SecuritiesQuantity DayOrderQuantity) {
		this.DayOrderQuantity = DayOrderQuantity;
	}

	public SecuritiesOrderPartyRole getSecuritiesOrderPartyRole() {
		return SecuritiesOrderPartyRole;
	}

	public void setSecuritiesOrderPartyRole(
			SecuritiesOrderPartyRole SecuritiesOrderPartyRole) {
		this.SecuritiesOrderPartyRole = SecuritiesOrderPartyRole;
	}

	public SecuritiesOrderStatus getStatus() {
		return Status;
	}

	public void setStatus(SecuritiesOrderStatus Status) {
		this.Status = Status;
	}

	public Negotiation getRelatedNegotiation() {
		return RelatedNegotiation;
	}

	public void setRelatedNegotiation(Negotiation RelatedNegotiation) {
		this.RelatedNegotiation = RelatedNegotiation;
	}

	public Adjustment getAdjustments() {
		return Adjustments;
	}

	public void setAdjustments(Adjustment Adjustments) {
		this.Adjustments = Adjustments;
	}

	public SecuritiesRegulatoryDetails getLegalParameters() {
		return LegalParameters;
	}

	public void setLegalParameters(SecuritiesRegulatoryDetails LegalParameters) {
		this.LegalParameters = LegalParameters;
	}

	public SecuritiesPricing getOrderPrice() {
		return OrderPrice;
	}

	public void setOrderPrice(SecuritiesPricing OrderPrice) {
		this.OrderPrice = OrderPrice;
	}

	public SecuritiesPricing getStopPrice() {
		return StopPrice;
	}

	public void setStopPrice(SecuritiesPricing StopPrice) {
		this.StopPrice = StopPrice;
	}

	public Allocation getSecuritiesOrderAllocation() {
		return SecuritiesOrderAllocation;
	}

	public void setSecuritiesOrderAllocation(
			Allocation SecuritiesOrderAllocation) {
		this.SecuritiesOrderAllocation = SecuritiesOrderAllocation;
	}

	public SecuritiesOrderParameters getOrderExecutionParameters() {
		return OrderExecutionParameters;
	}

	public void setOrderExecutionParameters(
			SecuritiesOrderParameters OrderExecutionParameters) {
		this.OrderExecutionParameters = OrderExecutionParameters;
	}

	public SecuritiesTrade getOrderExecution() {
		return OrderExecution;
	}

	public void setOrderExecution(SecuritiesTrade OrderExecution) {
		this.OrderExecution = OrderExecution;
	}

	public SecuritiesAccount getOrderingAccount() {
		return OrderingAccount;
	}

	public void setOrderingAccount(SecuritiesAccount OrderingAccount) {
		this.OrderingAccount = OrderingAccount;
	}

	public SecuritiesQuoteVariable getQuote() {
		return Quote;
	}

	public void setQuote(SecuritiesQuoteVariable Quote) {
		this.Quote = Quote;
	}

	public TransactionType1Code getFundTransactionDirectionIndicator() {
		return FundTransactionDirectionIndicator;
	}

	public void setFundTransactionDirectionIndicator(
			TransactionType1Code FundTransactionDirectionIndicator) {
		this.FundTransactionDirectionIndicator = FundTransactionDirectionIndicator;
	}

	public ISODateTime getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(ISODateTime OrderDate) {
		this.OrderDate = OrderDate;
	}

	public CurrencyAndAmount getPegDifference() {
		return PegDifference;
	}

	public void setPegDifference(CurrencyAndAmount PegDifference) {
		this.PegDifference = PegDifference;
	}

	public TradingSession getSecuritiesOrderTradingSession() {
		return SecuritiesOrderTradingSession;
	}

	public void setSecuritiesOrderTradingSession(
			TradingSession SecuritiesOrderTradingSession) {
		this.SecuritiesOrderTradingSession = SecuritiesOrderTradingSession;
	}

	public OrderBook getRelatedOrderBook() {
		return RelatedOrderBook;
	}

	public void setRelatedOrderBook(OrderBook RelatedOrderBook) {
		this.RelatedOrderBook = RelatedOrderBook;
	}

	public ListTrading getListTrading() {
		return ListTrading;
	}

	public void setListTrading(ListTrading ListTrading) {
		this.ListTrading = ListTrading;
	}

	public CrossTrade getBuySideRelatedCrossTrade() {
		return BuySideRelatedCrossTrade;
	}

	public void setBuySideRelatedCrossTrade(CrossTrade BuySideRelatedCrossTrade) {
		this.BuySideRelatedCrossTrade = BuySideRelatedCrossTrade;
	}

	public CrossTrade getSellSideRelatedCrossTrade() {
		return SellSideRelatedCrossTrade;
	}

	public void setSellSideRelatedCrossTrade(
			CrossTrade SellSideRelatedCrossTrade) {
		this.SellSideRelatedCrossTrade = SellSideRelatedCrossTrade;
	}

	public Security getOrderedSecurity() {
		return OrderedSecurity;
	}

	public void setOrderedSecurity(Security OrderedSecurity) {
		this.OrderedSecurity = OrderedSecurity;
	}

	public SecuritiesPostTradeBooking getBookingInstructions() {
		return BookingInstructions;
	}

	public void setBookingInstructions(
			SecuritiesPostTradeBooking BookingInstructions) {
		this.BookingInstructions = BookingInstructions;
	}

	public ExchangeForPhysicalTrade getExchangeForPhysicalTrade() {
		return ExchangeForPhysicalTrade;
	}

	public void setExchangeForPhysicalTrade(
			ExchangeForPhysicalTrade ExchangeForPhysicalTrade) {
		this.ExchangeForPhysicalTrade = ExchangeForPhysicalTrade;
	}

	public OrderQuantityTypeCode getQuantityType() {
		return QuantityType;
	}

	public void setQuantityType(OrderQuantityTypeCode QuantityType) {
		this.QuantityType = QuantityType;
	}

	public Max35Text getClientOrderIdentification() {
		return ClientOrderIdentification;
	}

	public void setClientOrderIdentification(Max35Text ClientOrderIdentification) {
		this.ClientOrderIdentification = ClientOrderIdentification;
	}

	public SecuritiesOrderExecutionInstruction getExecutionInstructions() {
		return ExecutionInstructions;
	}

	public void setExecutionInstructions(
			SecuritiesOrderExecutionInstruction ExecutionInstructions) {
		this.ExecutionInstructions = ExecutionInstructions;
	}

	public OrderTypeCode getType() {
		return Type;
	}

	public void setType(OrderTypeCode Type) {
		this.Type = Type;
	}
}