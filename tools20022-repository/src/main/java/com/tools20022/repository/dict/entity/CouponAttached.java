package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max3NumericText;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Physical certificates representing rights attached to the physical
 * certificates representing a security.
 */
public class CouponAttached {

	private ISODate Date;
	private Max3NumericText Number;
	private Security Security;
	private ISODateTime CouponClippingDate;
	private Max35Text Identification;

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}

	public Max3NumericText getNumber() {
		return Number;
	}

	public void setNumber(Max3NumericText Number) {
		this.Number = Number;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public ISODateTime getCouponClippingDate() {
		return CouponClippingDate;
	}

	public void setCouponClippingDate(ISODateTime CouponClippingDate) {
		this.CouponClippingDate = CouponClippingDate;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}
}