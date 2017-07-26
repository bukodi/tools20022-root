package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Information related to the transportation of goods by rail.
 */
public class TransportByRail extends Transport {

	private Max35Text CarriageIdentification;

	public Max35Text getCarriageIdentification() {
		return CarriageIdentification;
	}

	public void setCarriageIdentification(Max35Text CarriageIdentification) {
		this.CarriageIdentification = CarriageIdentification;
	}
}