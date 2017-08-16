package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.QualifierCode;
import com.tools20022.repository.dict.codeset.QuoteTypeCode;
import com.tools20022.repository.dict.entity.TradingSession;
import com.tools20022.repository.dict.codeset.LegSwapTypeCode;
import com.tools20022.repository.dict.codeset.PriceValueTypeCode;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.Commission;

/**
 * Proposition of price for a financial instrument.
 */
public class SecuritiesQuoteVariable extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private QualifierCode Qualifier;
	private QuoteTypeCode Type;
	private TradingSession QuoteTradingSession;
	private LegSwapTypeCode LegSwapType;
	private PriceValueTypeCode PriceType;
	private Quote MidSide;
	private Quote BidSide;
	private Quote OfferSide;
	private Quote RelatedQuote;
	private SecuritiesOrder SecuritiesOrder;
	private Commission Commission;

	public QualifierCode getQualifier() {
		return Qualifier;
	}

	public void setQualifier(QualifierCode Qualifier) {
		this.Qualifier = Qualifier;
	}

	public QuoteTypeCode getType() {
		return Type;
	}

	public void setType(QuoteTypeCode Type) {
		this.Type = Type;
	}

	public TradingSession getQuoteTradingSession() {
		return QuoteTradingSession;
	}

	public void setQuoteTradingSession(TradingSession QuoteTradingSession) {
		this.QuoteTradingSession = QuoteTradingSession;
	}

	public LegSwapTypeCode getLegSwapType() {
		return LegSwapType;
	}

	public void setLegSwapType(LegSwapTypeCode LegSwapType) {
		this.LegSwapType = LegSwapType;
	}

	public PriceValueTypeCode getPriceType() {
		return PriceType;
	}

	public void setPriceType(PriceValueTypeCode PriceType) {
		this.PriceType = PriceType;
	}

	public Quote getMidSide() {
		return MidSide;
	}

	public void setMidSide(Quote MidSide) {
		this.MidSide = MidSide;
	}

	public Quote getBidSide() {
		return BidSide;
	}

	public void setBidSide(Quote BidSide) {
		this.BidSide = BidSide;
	}

	public Quote getOfferSide() {
		return OfferSide;
	}

	public void setOfferSide(Quote OfferSide) {
		this.OfferSide = OfferSide;
	}

	public Quote getRelatedQuote() {
		return RelatedQuote;
	}

	public void setRelatedQuote(Quote RelatedQuote) {
		this.RelatedQuote = RelatedQuote;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}
}