package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Provides information on the requested settlement time(s) of the payment
 * instruction.
 */
public class SettlementTimeRequest {

	private Payment Payment;
	private ISODateTime CLSTime;
	private ISODateTime TillTime;
	private ISODateTime FromTime;
	private ISODateTime RejectTime;

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public ISODateTime getCLSTime() {
		return CLSTime;
	}

	public void setCLSTime(ISODateTime CLSTime) {
		this.CLSTime = CLSTime;
	}

	public ISODateTime getTillTime() {
		return TillTime;
	}

	public void setTillTime(ISODateTime TillTime) {
		this.TillTime = TillTime;
	}

	public ISODateTime getFromTime() {
		return FromTime;
	}

	public void setFromTime(ISODateTime FromTime) {
		this.FromTime = FromTime;
	}

	public ISODateTime getRejectTime() {
		return RejectTime;
	}

	public void setRejectTime(ISODateTime RejectTime) {
		this.RejectTime = RejectTime;
	}
}