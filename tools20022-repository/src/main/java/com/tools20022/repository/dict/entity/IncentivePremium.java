package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.entity.Distribution;

/**
 * Cash premium made available if the securities holder consents or participates
 * to an event.
 */
public class IncentivePremium extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Number PerSecurity;
	private Number PerVote;
	private YesNoIndicator PerAttendee;
	private Max350Text Description;
	private CurrencyAndAmount PremiumAmount;
	private ISODateTime PaymentDate;
	private Meeting Meeting;
	private Distribution CorporateActionDistribution;

	public Number getPerSecurity() {
		return PerSecurity;
	}

	public void setPerSecurity(Number PerSecurity) {
		this.PerSecurity = PerSecurity;
	}

	public Number getPerVote() {
		return PerVote;
	}

	public void setPerVote(Number PerVote) {
		this.PerVote = PerVote;
	}

	public YesNoIndicator getPerAttendee() {
		return PerAttendee;
	}

	public void setPerAttendee(YesNoIndicator PerAttendee) {
		this.PerAttendee = PerAttendee;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return PremiumAmount;
	}

	public void setPremiumAmount(CurrencyAndAmount PremiumAmount) {
		this.PremiumAmount = PremiumAmount;
	}

	public ISODateTime getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(ISODateTime PaymentDate) {
		this.PaymentDate = PaymentDate;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public Distribution getCorporateActionDistribution() {
		return CorporateActionDistribution;
	}

	public void setCorporateActionDistribution(
			Distribution CorporateActionDistribution) {
		this.CorporateActionDistribution = CorporateActionDistribution;
	}
}