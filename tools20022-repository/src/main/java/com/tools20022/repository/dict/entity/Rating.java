package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.RatingValueIdentifier;

/**
 * Assessment of securities credit and investment risk.
 */
public class Rating {

	private Security Security;
	private Scheme RatingScheme;
	private ISODateTime ValueDate;
	private RatingValueIdentifier Value;

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public Scheme getRatingScheme() {
		return RatingScheme;
	}

	public void setRatingScheme(Scheme RatingScheme) {
		this.RatingScheme = RatingScheme;
	}

	public ISODateTime getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODateTime ValueDate) {
		this.ValueDate = ValueDate;
	}

	public RatingValueIdentifier getValue() {
		return Value;
	}

	public void setValue(RatingValueIdentifier Value) {
		this.Value = Value;
	}
}