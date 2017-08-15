package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.Authentication;
import com.tools20022.repository.dict.datatype.Max35NumericText;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Authorisation given by an issuing party to a holder party to act on the
 * issuer's behalf.
 */
public class Mandate implements InstanceOf<MMBusinessComponent> {

	private Max35Text MandateIdentification;
	private Mandate Amendment;
	private Authentication Authentication;
	private Max35NumericText TrackingDays;
	private TrueFalseIndicator TrackingIndicator;
	private PercentageRate Rate;

	public Max35Text getMandateIdentification() {
		return MandateIdentification;
	}

	public void setMandateIdentification(Max35Text MandateIdentification) {
		this.MandateIdentification = MandateIdentification;
	}

	public Mandate getAmendment() {
		return Amendment;
	}

	public void setAmendment(Mandate Amendment) {
		this.Amendment = Amendment;
	}

	public Authentication getAuthentication() {
		return Authentication;
	}

	public void setAuthentication(Authentication Authentication) {
		this.Authentication = Authentication;
	}

	public Max35NumericText getTrackingDays() {
		return TrackingDays;
	}

	public void setTrackingDays(Max35NumericText TrackingDays) {
		this.TrackingDays = TrackingDays;
	}

	public TrueFalseIndicator getTrackingIndicator() {
		return TrackingIndicator;
	}

	public void setTrackingIndicator(TrueFalseIndicator TrackingIndicator) {
		this.TrackingIndicator = TrackingIndicator;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}
}