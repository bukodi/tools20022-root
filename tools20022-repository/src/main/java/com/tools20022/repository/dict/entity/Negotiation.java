package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.TradingMethodCode;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.BuyOrSellIndicationOfInterest;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Decision making on the transfer of a financial instrument.
 */
public class Negotiation {

	private TradingMethodCode TradingMethod;
	private Trade TradeExecution;
	private System TradingSystem;
	private Max35Text NegotiationIdentification;
	private Quote Quote;
	private BuyOrSellIndicationOfInterest IndicationOfInterest;
	private SecuritiesOrder SecuritiesOrder;

	public TradingMethodCode getTradingMethod() {
		return TradingMethod;
	}

	public void setTradingMethod(TradingMethodCode TradingMethod) {
		this.TradingMethod = TradingMethod;
	}

	public Trade getTradeExecution() {
		return TradeExecution;
	}

	public void setTradeExecution(Trade TradeExecution) {
		this.TradeExecution = TradeExecution;
	}

	public System getTradingSystem() {
		return TradingSystem;
	}

	public void setTradingSystem(System TradingSystem) {
		this.TradingSystem = TradingSystem;
	}

	public Max35Text getNegotiationIdentification() {
		return NegotiationIdentification;
	}

	public void setNegotiationIdentification(Max35Text NegotiationIdentification) {
		this.NegotiationIdentification = NegotiationIdentification;
	}

	public Quote getQuote() {
		return Quote;
	}

	public void setQuote(Quote Quote) {
		this.Quote = Quote;
	}

	public BuyOrSellIndicationOfInterest getIndicationOfInterest() {
		return IndicationOfInterest;
	}

	public void setIndicationOfInterest(
			BuyOrSellIndicationOfInterest IndicationOfInterest) {
		this.IndicationOfInterest = IndicationOfInterest;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}
}