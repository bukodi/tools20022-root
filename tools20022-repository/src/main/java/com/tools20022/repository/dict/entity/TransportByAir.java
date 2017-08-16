package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.datatype.Max6Text;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Information related to the transportation of goods by air.
 */
public class TransportByAir extends Transport
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max6Text AirportName;
	private Max35Text FlightNumber;

	public Max6Text getAirportName() {
		return AirportName;
	}

	public void setAirportName(Max6Text AirportName) {
		this.AirportName = AirportName;
	}

	public Max35Text getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(Max35Text FlightNumber) {
		this.FlightNumber = FlightNumber;
	}
}