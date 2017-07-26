package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TreasuryTrade;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;

/**
 * Combination of two foreign exchange trades, in opposite directions, for
 * different value dates and for the same pair(s) of currencies.
 */
public class ForeignExchangeSwap extends TreasuryTrade {

	private Max35Text LinkSwapIdentification;
	private ForeignExchangeTrade SwapLeg;

	public Max35Text getLinkSwapIdentification() {
		return LinkSwapIdentification;
	}

	public void setLinkSwapIdentification(Max35Text LinkSwapIdentification) {
		this.LinkSwapIdentification = LinkSwapIdentification;
	}

	public ForeignExchangeTrade getSwapLeg() {
		return SwapLeg;
	}

	public void setSwapLeg(ForeignExchangeTrade SwapLeg) {
		this.SwapLeg = SwapLeg;
	}
}