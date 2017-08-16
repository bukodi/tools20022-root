package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.entity.MeetingServicing;

/**
 * Notification of the entitlement that one party has in relation with a
 * specific meeting.
 */
public class MeetingEntitlement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODate EntitlementFixingDate;
	private Number EntitlementRatio;
	private SecuritiesBalance EligiblePosition;
	private MeetingServicing RelatedServicing;
	private ISODate EntitlementCalculationDate;

	public ISODate getEntitlementFixingDate() {
		return EntitlementFixingDate;
	}

	public void setEntitlementFixingDate(ISODate EntitlementFixingDate) {
		this.EntitlementFixingDate = EntitlementFixingDate;
	}

	public Number getEntitlementRatio() {
		return EntitlementRatio;
	}

	public void setEntitlementRatio(Number EntitlementRatio) {
		this.EntitlementRatio = EntitlementRatio;
	}

	public SecuritiesBalance getEligiblePosition() {
		return EligiblePosition;
	}

	public void setEligiblePosition(SecuritiesBalance EligiblePosition) {
		this.EligiblePosition = EligiblePosition;
	}

	public MeetingServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(MeetingServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}

	public ISODate getEntitlementCalculationDate() {
		return EntitlementCalculationDate;
	}

	public void setEntitlementCalculationDate(ISODate EntitlementCalculationDate) {
		this.EntitlementCalculationDate = EntitlementCalculationDate;
	}
}