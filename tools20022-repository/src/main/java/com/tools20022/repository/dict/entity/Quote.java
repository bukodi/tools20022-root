package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.Negotiation;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.dict.entity.FinancialInstrumentSwap;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.QuoteStatus;
import com.tools20022.repository.dict.entity.Security;

/**
 * Indicates whether the quote details are indicated as an offer, a bid or a mid
 * of a security, commodity, currency (the latter being an average of the offer
 * and the bid).
 */
public class Quote {

	private SecuritiesQuantity MaximumQuantity;
	private SecuritiesQuantity Quantity;
	private SecuritiesQuantity MinimumQuantity;
	private InformationPartyRole PartyRole;
	private Negotiation RelatedNegotiation;
	private CurrencyExchange QuotedRate;
	private SecuritiesPricing PreviousClosingPrice;
	private SecuritiesPricing RequestedPrice;
	private SecuritiesPricing Price;
	private SecuritiesPricing MarketPrice;
	private SecuritiesQuoteVariable MidSideQuoteVariable;
	private SecuritiesQuoteVariable BidSideQuoteVariable;
	private SecuritiesQuoteVariable OfferSideQuoteVariable;
	private SecuritiesQuoteVariable SecurityQuoteVariable;
	private FinancialInstrumentSwap QuoteSwap;
	private ISODateTime ValidUntilDateTime;
	private CurrencyCode Currency;
	private QuoteStatus Status;
	private Security QuotedSecurity;

	public SecuritiesQuantity getMaximumQuantity() {
		return MaximumQuantity;
	}

	public void setMaximumQuantity(SecuritiesQuantity MaximumQuantity) {
		this.MaximumQuantity = MaximumQuantity;
	}

	public SecuritiesQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(SecuritiesQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public SecuritiesQuantity getMinimumQuantity() {
		return MinimumQuantity;
	}

	public void setMinimumQuantity(SecuritiesQuantity MinimumQuantity) {
		this.MinimumQuantity = MinimumQuantity;
	}

	public InformationPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(InformationPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public Negotiation getRelatedNegotiation() {
		return RelatedNegotiation;
	}

	public void setRelatedNegotiation(Negotiation RelatedNegotiation) {
		this.RelatedNegotiation = RelatedNegotiation;
	}

	public CurrencyExchange getQuotedRate() {
		return QuotedRate;
	}

	public void setQuotedRate(CurrencyExchange QuotedRate) {
		this.QuotedRate = QuotedRate;
	}

	public SecuritiesPricing getPreviousClosingPrice() {
		return PreviousClosingPrice;
	}

	public void setPreviousClosingPrice(SecuritiesPricing PreviousClosingPrice) {
		this.PreviousClosingPrice = PreviousClosingPrice;
	}

	public SecuritiesPricing getRequestedPrice() {
		return RequestedPrice;
	}

	public void setRequestedPrice(SecuritiesPricing RequestedPrice) {
		this.RequestedPrice = RequestedPrice;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public SecuritiesPricing getMarketPrice() {
		return MarketPrice;
	}

	public void setMarketPrice(SecuritiesPricing MarketPrice) {
		this.MarketPrice = MarketPrice;
	}

	public SecuritiesQuoteVariable getMidSideQuoteVariable() {
		return MidSideQuoteVariable;
	}

	public void setMidSideQuoteVariable(
			SecuritiesQuoteVariable MidSideQuoteVariable) {
		this.MidSideQuoteVariable = MidSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getBidSideQuoteVariable() {
		return BidSideQuoteVariable;
	}

	public void setBidSideQuoteVariable(
			SecuritiesQuoteVariable BidSideQuoteVariable) {
		this.BidSideQuoteVariable = BidSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getOfferSideQuoteVariable() {
		return OfferSideQuoteVariable;
	}

	public void setOfferSideQuoteVariable(
			SecuritiesQuoteVariable OfferSideQuoteVariable) {
		this.OfferSideQuoteVariable = OfferSideQuoteVariable;
	}

	public SecuritiesQuoteVariable getSecurityQuoteVariable() {
		return SecurityQuoteVariable;
	}

	public void setSecurityQuoteVariable(
			SecuritiesQuoteVariable SecurityQuoteVariable) {
		this.SecurityQuoteVariable = SecurityQuoteVariable;
	}

	public FinancialInstrumentSwap getQuoteSwap() {
		return QuoteSwap;
	}

	public void setQuoteSwap(FinancialInstrumentSwap QuoteSwap) {
		this.QuoteSwap = QuoteSwap;
	}

	public ISODateTime getValidUntilDateTime() {
		return ValidUntilDateTime;
	}

	public void setValidUntilDateTime(ISODateTime ValidUntilDateTime) {
		this.ValidUntilDateTime = ValidUntilDateTime;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public QuoteStatus getStatus() {
		return Status;
	}

	public void setStatus(QuoteStatus Status) {
		this.Status = Status;
	}

	public Security getQuotedSecurity() {
		return QuotedSecurity;
	}

	public void setQuotedSecurity(Security QuotedSecurity) {
		this.QuotedSecurity = QuotedSecurity;
	}
}