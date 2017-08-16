package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ListTrading;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * List trading by which the buy-side provides details to the sell-side
 * information about the sector, country, index and potential market impact of
 * the financial instrument to be bought or sold. Using this information, the
 * sell-side firms bid for the trade.
 */
public class NonDisclosedListTrading extends ListTrading
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CountryCode BidByCurrency;
	private Max140Text BidBySector;
	private Max140Text BidByIndex;
	private Number NumberOfBidders;
	private CurrencyAndAmount SideValue;

	public CountryCode getBidByCurrency() {
		return BidByCurrency;
	}

	public void setBidByCurrency(CountryCode BidByCurrency) {
		this.BidByCurrency = BidByCurrency;
	}

	public Max140Text getBidBySector() {
		return BidBySector;
	}

	public void setBidBySector(Max140Text BidBySector) {
		this.BidBySector = BidBySector;
	}

	public Max140Text getBidByIndex() {
		return BidByIndex;
	}

	public void setBidByIndex(Max140Text BidByIndex) {
		this.BidByIndex = BidByIndex;
	}

	public Number getNumberOfBidders() {
		return NumberOfBidders;
	}

	public void setNumberOfBidders(Number NumberOfBidders) {
		this.NumberOfBidders = NumberOfBidders;
	}

	public CurrencyAndAmount getSideValue() {
		return SideValue;
	}

	public void setSideValue(CurrencyAndAmount SideValue) {
		this.SideValue = SideValue;
	}
}