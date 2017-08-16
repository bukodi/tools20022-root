package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Market;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.MarketTypeCode;
import com.tools20022.repository.dict.entity.SourceOfPrice;
import com.tools20022.repository.dict.entity.LotBreakdown;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.StockExchange;
import com.tools20022.repository.dict.entity.TradingSession;
import com.tools20022.repository.dict.entity.SecuritiesIdentification;
import com.tools20022.repository.dict.entity.Issuance;
import com.tools20022.repository.dict.entity.PlaceOfSettlement;

/**
 * Context or geographic environment in which trading parties may meet in order
 * to negotiate and execute trades among themselves. It also identifies the
 * primary market where an asset is issued.
 */
public class TradingMarket extends Market
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Security TradedSecurity;
	private MarketTypeCode Type;
	private Security ListedSecurity;
	private SourceOfPrice SourceOfPrice;
	private LotBreakdown TradeLotSize;
	private SecuritiesQuantity MinimumTradedNominalQuantity;
	private ISODateTime ListingDate;
	private SecuritiesOrder RelatedOrder;
	private CurrencyCode TradingCurrency;
	private SecuritiesQuantity MaximumTradedNominalQuantity;
	private StockExchange StockExchange;
	private LotBreakdown QuoteLot;
	private LotBreakdown RoundLot;
	private TradingSession TradingSession;
	private SecuritiesIdentification ListedSecurityTradingIdentification;
	private CurrencyCode DefaultCurrency;
	private ISODateTime FirstTradingDate;
	private ISODateTime LastTradingDate;
	private Issuance Issuance;
	private PlaceOfSettlement RelatedPlaceOfSettlement;

	public Security getTradedSecurity() {
		return TradedSecurity;
	}

	public void setTradedSecurity(Security TradedSecurity) {
		this.TradedSecurity = TradedSecurity;
	}

	public MarketTypeCode getType() {
		return Type;
	}

	public void setType(MarketTypeCode Type) {
		this.Type = Type;
	}

	public Security getListedSecurity() {
		return ListedSecurity;
	}

	public void setListedSecurity(Security ListedSecurity) {
		this.ListedSecurity = ListedSecurity;
	}

	public SourceOfPrice getSourceOfPrice() {
		return SourceOfPrice;
	}

	public void setSourceOfPrice(SourceOfPrice SourceOfPrice) {
		this.SourceOfPrice = SourceOfPrice;
	}

	public LotBreakdown getTradeLotSize() {
		return TradeLotSize;
	}

	public void setTradeLotSize(LotBreakdown TradeLotSize) {
		this.TradeLotSize = TradeLotSize;
	}

	public SecuritiesQuantity getMinimumTradedNominalQuantity() {
		return MinimumTradedNominalQuantity;
	}

	public void setMinimumTradedNominalQuantity(
			SecuritiesQuantity MinimumTradedNominalQuantity) {
		this.MinimumTradedNominalQuantity = MinimumTradedNominalQuantity;
	}

	public ISODateTime getListingDate() {
		return ListingDate;
	}

	public void setListingDate(ISODateTime ListingDate) {
		this.ListingDate = ListingDate;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public CurrencyCode getTradingCurrency() {
		return TradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode TradingCurrency) {
		this.TradingCurrency = TradingCurrency;
	}

	public SecuritiesQuantity getMaximumTradedNominalQuantity() {
		return MaximumTradedNominalQuantity;
	}

	public void setMaximumTradedNominalQuantity(
			SecuritiesQuantity MaximumTradedNominalQuantity) {
		this.MaximumTradedNominalQuantity = MaximumTradedNominalQuantity;
	}

	public StockExchange getStockExchange() {
		return StockExchange;
	}

	public void setStockExchange(StockExchange StockExchange) {
		this.StockExchange = StockExchange;
	}

	public LotBreakdown getQuoteLot() {
		return QuoteLot;
	}

	public void setQuoteLot(LotBreakdown QuoteLot) {
		this.QuoteLot = QuoteLot;
	}

	public LotBreakdown getRoundLot() {
		return RoundLot;
	}

	public void setRoundLot(LotBreakdown RoundLot) {
		this.RoundLot = RoundLot;
	}

	public TradingSession getTradingSession() {
		return TradingSession;
	}

	public void setTradingSession(TradingSession TradingSession) {
		this.TradingSession = TradingSession;
	}

	public SecuritiesIdentification getListedSecurityTradingIdentification() {
		return ListedSecurityTradingIdentification;
	}

	public void setListedSecurityTradingIdentification(
			SecuritiesIdentification ListedSecurityTradingIdentification) {
		this.ListedSecurityTradingIdentification = ListedSecurityTradingIdentification;
	}

	public CurrencyCode getDefaultCurrency() {
		return DefaultCurrency;
	}

	public void setDefaultCurrency(CurrencyCode DefaultCurrency) {
		this.DefaultCurrency = DefaultCurrency;
	}

	public ISODateTime getFirstTradingDate() {
		return FirstTradingDate;
	}

	public void setFirstTradingDate(ISODateTime FirstTradingDate) {
		this.FirstTradingDate = FirstTradingDate;
	}

	public ISODateTime getLastTradingDate() {
		return LastTradingDate;
	}

	public void setLastTradingDate(ISODateTime LastTradingDate) {
		this.LastTradingDate = LastTradingDate;
	}

	public Issuance getIssuance() {
		return Issuance;
	}

	public void setIssuance(Issuance Issuance) {
		this.Issuance = Issuance;
	}

	public PlaceOfSettlement getRelatedPlaceOfSettlement() {
		return RelatedPlaceOfSettlement;
	}

	public void setRelatedPlaceOfSettlement(
			PlaceOfSettlement RelatedPlaceOfSettlement) {
		this.RelatedPlaceOfSettlement = RelatedPlaceOfSettlement;
	}
}