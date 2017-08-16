package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Processes that reallocate corporate action proceeds to the entitled party and
 * that compensate financial penalties or indirect costs due to late delivery or
 * payment.
 */
public class MarketClaim extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount MarketClaimAmount;
	private ISODateTime MarketClaimTrackingEndDate;
	private CorporateActionEvent RelatedCorporateEvent;

	public CurrencyAndAmount getMarketClaimAmount() {
		return MarketClaimAmount;
	}

	public void setMarketClaimAmount(CurrencyAndAmount MarketClaimAmount) {
		this.MarketClaimAmount = MarketClaimAmount;
	}

	public ISODateTime getMarketClaimTrackingEndDate() {
		return MarketClaimTrackingEndDate;
	}

	public void setMarketClaimTrackingEndDate(
			ISODateTime MarketClaimTrackingEndDate) {
		this.MarketClaimTrackingEndDate = MarketClaimTrackingEndDate;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return RelatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(
			CorporateActionEvent RelatedCorporateEvent) {
		this.RelatedCorporateEvent = RelatedCorporateEvent;
	}
}