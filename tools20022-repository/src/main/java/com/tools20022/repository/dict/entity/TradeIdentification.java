package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.ClearingBrokerIdentification;

/**
 * Specifies the different identifications associated with a trade.
 */
public class TradeIdentification {

	private Max35Text CounterpartyReference;
	private Max35Text Identification;
	private Max35Text CommonIdentification;
	private Max35Text MatchingReference;
	private Trade Trade;
	private Max35Text UniqueTradeIdentifier;
	private ClearingBrokerIdentification ClearingBrokerIdentification;

	public Max35Text getCounterpartyReference() {
		return CounterpartyReference;
	}

	public void setCounterpartyReference(Max35Text CounterpartyReference) {
		this.CounterpartyReference = CounterpartyReference;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Max35Text getCommonIdentification() {
		return CommonIdentification;
	}

	public void setCommonIdentification(Max35Text CommonIdentification) {
		this.CommonIdentification = CommonIdentification;
	}

	public Max35Text getMatchingReference() {
		return MatchingReference;
	}

	public void setMatchingReference(Max35Text MatchingReference) {
		this.MatchingReference = MatchingReference;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public Max35Text getUniqueTradeIdentifier() {
		return UniqueTradeIdentifier;
	}

	public void setUniqueTradeIdentifier(Max35Text UniqueTradeIdentifier) {
		this.UniqueTradeIdentifier = UniqueTradeIdentifier;
	}

	public ClearingBrokerIdentification getClearingBrokerIdentification() {
		return ClearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(
			ClearingBrokerIdentification ClearingBrokerIdentification) {
		this.ClearingBrokerIdentification = ClearingBrokerIdentification;
	}
}