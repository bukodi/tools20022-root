package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.LotteryTypeCode;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * The parameters required to manage the organisation of a lottery.
 */
public class Lottery {

	private ISODateTime LotteryDate;
	private SecuritiesQuantity IncrementalDenomination;
	private LotteryTypeCode LotteryType;
	private CorporateActionEvent RelatedCorporateEvent;

	public ISODateTime getLotteryDate() {
		return LotteryDate;
	}

	public void setLotteryDate(ISODateTime LotteryDate) {
		this.LotteryDate = LotteryDate;
	}

	public SecuritiesQuantity getIncrementalDenomination() {
		return IncrementalDenomination;
	}

	public void setIncrementalDenomination(
			SecuritiesQuantity IncrementalDenomination) {
		this.IncrementalDenomination = IncrementalDenomination;
	}

	public LotteryTypeCode getLotteryType() {
		return LotteryType;
	}

	public void setLotteryType(LotteryTypeCode LotteryType) {
		this.LotteryType = LotteryType;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return RelatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(
			CorporateActionEvent RelatedCorporateEvent) {
		this.RelatedCorporateEvent = RelatedCorporateEvent;
	}
}