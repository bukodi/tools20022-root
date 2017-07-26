package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.Max2000Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Location;

/**
 * Expiry parameters.
 */
public class Expiry {

	private ISODateTime ExpiryDateTime;
	private Undertaking Undertaking;
	private Max2000Text ExpiryCondition;
	private YesNoIndicator OpenEndedIndicator;
	private Location ExpiryPlace;

	public ISODateTime getExpiryDateTime() {
		return ExpiryDateTime;
	}

	public void setExpiryDateTime(ISODateTime ExpiryDateTime) {
		this.ExpiryDateTime = ExpiryDateTime;
	}

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public Max2000Text getExpiryCondition() {
		return ExpiryCondition;
	}

	public void setExpiryCondition(Max2000Text ExpiryCondition) {
		this.ExpiryCondition = ExpiryCondition;
	}

	public YesNoIndicator getOpenEndedIndicator() {
		return OpenEndedIndicator;
	}

	public void setOpenEndedIndicator(YesNoIndicator OpenEndedIndicator) {
		this.OpenEndedIndicator = OpenEndedIndicator;
	}

	public Location getExpiryPlace() {
		return ExpiryPlace;
	}

	public void setExpiryPlace(Location ExpiryPlace) {
		this.ExpiryPlace = ExpiryPlace;
	}
}