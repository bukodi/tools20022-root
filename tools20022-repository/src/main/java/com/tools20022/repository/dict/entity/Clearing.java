package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.TradePostingCode;
import com.tools20022.repository.dict.entity.ClearingSystem;

/**
 * Mechanism allowing financial institutions that are members of a clearing
 * house to pay and to receive the amounts linked to the transactions that they
 * have executed on the market. The addition of all the positions per product
 * results in one net position (due or to receive) with the clearing house or
 * the central clearing counterparty.
 */
public class Clearing extends ObligationFulfilment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private YesNoIndicator ClearingThresholdIndicator;
	private Max35Text ClearedIdentification;
	private YesNoIndicator GuaranteedTrade;
	private TradePostingCode TradePostingType;
	private ClearingSystem ClearingSystem;

	public YesNoIndicator getClearingThresholdIndicator() {
		return ClearingThresholdIndicator;
	}

	public void setClearingThresholdIndicator(
			YesNoIndicator ClearingThresholdIndicator) {
		this.ClearingThresholdIndicator = ClearingThresholdIndicator;
	}

	public Max35Text getClearedIdentification() {
		return ClearedIdentification;
	}

	public void setClearedIdentification(Max35Text ClearedIdentification) {
		this.ClearedIdentification = ClearedIdentification;
	}

	public YesNoIndicator getGuaranteedTrade() {
		return GuaranteedTrade;
	}

	public void setGuaranteedTrade(YesNoIndicator GuaranteedTrade) {
		this.GuaranteedTrade = GuaranteedTrade;
	}

	public TradePostingCode getTradePostingType() {
		return TradePostingType;
	}

	public void setTradePostingType(TradePostingCode TradePostingType) {
		this.TradePostingType = TradePostingType;
	}

	public ClearingSystem getClearingSystem() {
		return ClearingSystem;
	}

	public void setClearingSystem(ClearingSystem ClearingSystem) {
		this.ClearingSystem = ClearingSystem;
	}
}