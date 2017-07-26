package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ListTrading;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.SettlementDateCode;

/**
 * List trading by which the buy-side details the exact stocks and sizes to be
 * traded and the sell-side offers the buy-side a two-way price, to buy or to
 * sell the indicated stocks. All sell-side firms see all of the stocks and
 * quantities in the portfolio during the bidding phase regardless of whether or
 * not they win the business.
 */
public class DisclosedListTrading extends ListTrading {

	private SecuritiesAccount DisclosedListTradingAccount;
	private CurrencyAndAmount BuyAmount;
	private CurrencyAndAmount SellAmount;
	private SettlementDateCode RequestedSettlementDateCode;

	public SecuritiesAccount getDisclosedListTradingAccount() {
		return DisclosedListTradingAccount;
	}

	public void setDisclosedListTradingAccount(
			SecuritiesAccount DisclosedListTradingAccount) {
		this.DisclosedListTradingAccount = DisclosedListTradingAccount;
	}

	public CurrencyAndAmount getBuyAmount() {
		return BuyAmount;
	}

	public void setBuyAmount(CurrencyAndAmount BuyAmount) {
		this.BuyAmount = BuyAmount;
	}

	public CurrencyAndAmount getSellAmount() {
		return SellAmount;
	}

	public void setSellAmount(CurrencyAndAmount SellAmount) {
		this.SellAmount = SellAmount;
	}

	public SettlementDateCode getRequestedSettlementDateCode() {
		return RequestedSettlementDateCode;
	}

	public void setRequestedSettlementDateCode(
			SettlementDateCode RequestedSettlementDateCode) {
		this.RequestedSettlementDateCode = RequestedSettlementDateCode;
	}
}