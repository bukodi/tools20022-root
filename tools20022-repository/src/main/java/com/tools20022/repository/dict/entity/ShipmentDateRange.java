package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Transport;

/**
 * Specifies a shipment period or a shipment date.
 */
public class ShipmentDateRange {

	private ISODateTime LatestShipmentDate;
	private Transport RelatedTransport;
	private ISODateTime EarliestShipmentDate;
	private ISODateTime ShipmentDate;

	public ISODateTime getLatestShipmentDate() {
		return LatestShipmentDate;
	}

	public void setLatestShipmentDate(ISODateTime LatestShipmentDate) {
		this.LatestShipmentDate = LatestShipmentDate;
	}

	public Transport getRelatedTransport() {
		return RelatedTransport;
	}

	public void setRelatedTransport(Transport RelatedTransport) {
		this.RelatedTransport = RelatedTransport;
	}

	public ISODateTime getEarliestShipmentDate() {
		return EarliestShipmentDate;
	}

	public void setEarliestShipmentDate(ISODateTime EarliestShipmentDate) {
		this.EarliestShipmentDate = EarliestShipmentDate;
	}

	public ISODateTime getShipmentDate() {
		return ShipmentDate;
	}

	public void setShipmentDate(ISODateTime ShipmentDate) {
		this.ShipmentDate = ShipmentDate;
	}
}