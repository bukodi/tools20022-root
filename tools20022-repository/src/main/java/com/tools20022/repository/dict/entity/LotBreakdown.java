package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.TradingMarket;

/**
 * Number of securities purchased or sold in one transaction. In terms of
 * options, a lot represents the number of contracts contained in one derivative
 * security.
 */
public class LotBreakdown extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DecimalNumber LotUnit;
	private SecuritiesQuantity SecuritiesQuantity;
	private GenericIdentification LotNumber;
	private ISODateTime LotDateTime;
	private SecuritiesPricing LotPrice;
	private Max35Text LotIdentifier;
	private TradingMarket TradeLotMarket;
	private TradingMarket QuoteLotMarket;
	private TradingMarket RoundLotMarket;

	public DecimalNumber getLotUnit() {
		return LotUnit;
	}

	public void setLotUnit(DecimalNumber LotUnit) {
		this.LotUnit = LotUnit;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return SecuritiesQuantity;
	}

	public void setSecuritiesQuantity(SecuritiesQuantity SecuritiesQuantity) {
		this.SecuritiesQuantity = SecuritiesQuantity;
	}

	public GenericIdentification getLotNumber() {
		return LotNumber;
	}

	public void setLotNumber(GenericIdentification LotNumber) {
		this.LotNumber = LotNumber;
	}

	public ISODateTime getLotDateTime() {
		return LotDateTime;
	}

	public void setLotDateTime(ISODateTime LotDateTime) {
		this.LotDateTime = LotDateTime;
	}

	public SecuritiesPricing getLotPrice() {
		return LotPrice;
	}

	public void setLotPrice(SecuritiesPricing LotPrice) {
		this.LotPrice = LotPrice;
	}

	public Max35Text getLotIdentifier() {
		return LotIdentifier;
	}

	public void setLotIdentifier(Max35Text LotIdentifier) {
		this.LotIdentifier = LotIdentifier;
	}

	public TradingMarket getTradeLotMarket() {
		return TradeLotMarket;
	}

	public void setTradeLotMarket(TradingMarket TradeLotMarket) {
		this.TradeLotMarket = TradeLotMarket;
	}

	public TradingMarket getQuoteLotMarket() {
		return QuoteLotMarket;
	}

	public void setQuoteLotMarket(TradingMarket QuoteLotMarket) {
		this.QuoteLotMarket = QuoteLotMarket;
	}

	public TradingMarket getRoundLotMarket() {
		return RoundLotMarket;
	}

	public void setRoundLotMarket(TradingMarket RoundLotMarket) {
		this.RoundLotMarket = RoundLotMarket;
	}
}