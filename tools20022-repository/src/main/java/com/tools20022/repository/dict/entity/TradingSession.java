package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.codeset.TradingSessionCode;
import com.tools20022.repository.dict.codeset.TradeExecutionSessionCode;
import com.tools20022.repository.dict.entity.ListTrading;

/**
 * Established constraints under which a market operates
 */
public class TradingSession extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max140Text TradingSessionName;
	private DateTimePeriod TimeBracket;
	private TradingMarket Market;
	private SecuritiesQuoteVariable Quote;
	private SecuritiesOrder SecuritiesOrder;
	private TradingSessionCode TradingSessionIndicator;
	private TradeExecutionSessionCode TradingSessionPhase;
	private Max140Text USFuturesTradingSession;
	private ListTrading ListTrading;

	public Max140Text getTradingSessionName() {
		return TradingSessionName;
	}

	public void setTradingSessionName(Max140Text TradingSessionName) {
		this.TradingSessionName = TradingSessionName;
	}

	public DateTimePeriod getTimeBracket() {
		return TimeBracket;
	}

	public void setTimeBracket(DateTimePeriod TimeBracket) {
		this.TimeBracket = TimeBracket;
	}

	public TradingMarket getMarket() {
		return Market;
	}

	public void setMarket(TradingMarket Market) {
		this.Market = Market;
	}

	public SecuritiesQuoteVariable getQuote() {
		return Quote;
	}

	public void setQuote(SecuritiesQuoteVariable Quote) {
		this.Quote = Quote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public TradingSessionCode getTradingSessionIndicator() {
		return TradingSessionIndicator;
	}

	public void setTradingSessionIndicator(
			TradingSessionCode TradingSessionIndicator) {
		this.TradingSessionIndicator = TradingSessionIndicator;
	}

	public TradeExecutionSessionCode getTradingSessionPhase() {
		return TradingSessionPhase;
	}

	public void setTradingSessionPhase(
			TradeExecutionSessionCode TradingSessionPhase) {
		this.TradingSessionPhase = TradingSessionPhase;
	}

	public Max140Text getUSFuturesTradingSession() {
		return USFuturesTradingSession;
	}

	public void setUSFuturesTradingSession(Max140Text USFuturesTradingSession) {
		this.USFuturesTradingSession = USFuturesTradingSession;
	}

	public ListTrading getListTrading() {
		return ListTrading;
	}

	public void setListTrading(ListTrading ListTrading) {
		this.ListTrading = ListTrading;
	}
}