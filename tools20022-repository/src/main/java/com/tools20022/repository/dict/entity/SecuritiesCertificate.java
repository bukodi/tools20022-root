package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.dict.entity.PhysicalDelivery;

/**
 * Physical representation of a security.
 */
public class SecuritiesCertificate {

	private GenericIdentification Number;
	private BasicSecuritiesRegistration BasicRegistration;
	private PhysicalDelivery RelatedDelivery;

	public GenericIdentification getNumber() {
		return Number;
	}

	public void setNumber(GenericIdentification Number) {
		this.Number = Number;
	}

	public BasicSecuritiesRegistration getBasicRegistration() {
		return BasicRegistration;
	}

	public void setBasicRegistration(
			BasicSecuritiesRegistration BasicRegistration) {
		this.BasicRegistration = BasicRegistration;
	}

	public PhysicalDelivery getRelatedDelivery() {
		return RelatedDelivery;
	}

	public void setRelatedDelivery(PhysicalDelivery RelatedDelivery) {
		this.RelatedDelivery = RelatedDelivery;
	}
}