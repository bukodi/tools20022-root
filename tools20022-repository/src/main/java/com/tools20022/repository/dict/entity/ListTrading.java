package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.TradingSession;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.codeset.BasisPriceTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Liquidity;
import com.tools20022.repository.dict.codeset.BidTypeCode;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio. One example is index arbitrage, which
 * consists in the purchase or sale of a basket of stocks in conjunction with
 * the sale or purchase of a derivative product (for example index futures) to
 * profit from price differences between the basket and the derivative product.
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 */
public class ListTrading {

	private Max35Text ListIdentification;
	private SecuritiesOrder SecuritiesListOrder;
	private TradingSession ListTradingSession;
	private Max140Text ListName;
	private BasisPriceTypeCode BasisPriceType;
	private ISODateTime StrikeTime;
	private YesNoIndicator GrossAmountIndicator;
	private Max35Text SellSideIdentification;
	private Max35Text BuySideIdentification;
	private Liquidity Liquidity;
	private BidTypeCode BidType;

	public Max35Text getListIdentification() {
		return ListIdentification;
	}

	public void setListIdentification(Max35Text ListIdentification) {
		this.ListIdentification = ListIdentification;
	}

	public SecuritiesOrder getSecuritiesListOrder() {
		return SecuritiesListOrder;
	}

	public void setSecuritiesListOrder(SecuritiesOrder SecuritiesListOrder) {
		this.SecuritiesListOrder = SecuritiesListOrder;
	}

	public TradingSession getListTradingSession() {
		return ListTradingSession;
	}

	public void setListTradingSession(TradingSession ListTradingSession) {
		this.ListTradingSession = ListTradingSession;
	}

	public Max140Text getListName() {
		return ListName;
	}

	public void setListName(Max140Text ListName) {
		this.ListName = ListName;
	}

	public BasisPriceTypeCode getBasisPriceType() {
		return BasisPriceType;
	}

	public void setBasisPriceType(BasisPriceTypeCode BasisPriceType) {
		this.BasisPriceType = BasisPriceType;
	}

	public ISODateTime getStrikeTime() {
		return StrikeTime;
	}

	public void setStrikeTime(ISODateTime StrikeTime) {
		this.StrikeTime = StrikeTime;
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return GrossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator GrossAmountIndicator) {
		this.GrossAmountIndicator = GrossAmountIndicator;
	}

	public Max35Text getSellSideIdentification() {
		return SellSideIdentification;
	}

	public void setSellSideIdentification(Max35Text SellSideIdentification) {
		this.SellSideIdentification = SellSideIdentification;
	}

	public Max35Text getBuySideIdentification() {
		return BuySideIdentification;
	}

	public void setBuySideIdentification(Max35Text BuySideIdentification) {
		this.BuySideIdentification = BuySideIdentification;
	}

	public Liquidity getLiquidity() {
		return Liquidity;
	}

	public void setLiquidity(Liquidity Liquidity) {
		this.Liquidity = Liquidity;
	}

	public BidTypeCode getBidType() {
		return BidType;
	}

	public void setBidType(BidTypeCode BidType) {
		this.BidType = BidType;
	}
}