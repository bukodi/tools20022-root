package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Transport;

/**
 * Specifies a shipment period or a shipment date.
 */
public class ShipmentDateRange extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

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