package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.TradingCapacityCode;
import com.tools20022.repository.dict.codeset.OptionPartyCode;
import com.tools20022.repository.dict.entity.Trade;

/**
 * Trading party in a commercial, securities, treasury trade. This role may also
 * represent parties which play different intermediary roles in a trade.
 */
public class TradePartyRole extends Role {

	private Account Account;
	private TradingCapacityCode TradingPartyCapacity;
	private OptionPartyCode BuyerOrSeller;
	private Trade Trade;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public TradingCapacityCode getTradingPartyCapacity() {
		return TradingPartyCapacity;
	}

	public void setTradingPartyCapacity(TradingCapacityCode TradingPartyCapacity) {
		this.TradingPartyCapacity = TradingPartyCapacity;
	}

	public OptionPartyCode getBuyerOrSeller() {
		return BuyerOrSeller;
	}

	public void setBuyerOrSeller(OptionPartyCode BuyerOrSeller) {
		this.BuyerOrSeller = BuyerOrSeller;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}
}