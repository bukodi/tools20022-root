package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Incoterms;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Packaging;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.ProductDelivery;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.codeset.FreightChargesCode;
import com.tools20022.repository.dict.entity.ShipmentDateRange;
import com.tools20022.repository.dict.entity.Goods;
import com.tools20022.repository.dict.entity.TransportPartyRole;
import com.tools20022.repository.dict.entity.Document;

/**
 * Moving of goods or people from one place to another by vehicle.
 */
public class Transport {

	private Incoterms Incoterms;
	private Max35Text Identification;
	private Packaging Packaging;
	private ISODateTime ArrivalDateTime;
	private YesNoIndicator PartialShipment;
	private YesNoIndicator TransShipment;
	private ProductDelivery ProductDelivery;
	private Location PlaceOfDeparture;
	private Location PlaceOfDestination;
	private Charges TransportCharges;
	private FreightChargesCode FreightChargesPrepaidOrCollect;
	private ShipmentDateRange ShipmentDates;
	private Goods TransportedGoods;
	private TransportPartyRole PartyRole;
	private Location TransitLocation;
	private Document TransportDocuments;

	public Incoterms getIncoterms() {
		return Incoterms;
	}

	public void setIncoterms(Incoterms Incoterms) {
		this.Incoterms = Incoterms;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Packaging getPackaging() {
		return Packaging;
	}

	public void setPackaging(Packaging Packaging) {
		this.Packaging = Packaging;
	}

	public ISODateTime getArrivalDateTime() {
		return ArrivalDateTime;
	}

	public void setArrivalDateTime(ISODateTime ArrivalDateTime) {
		this.ArrivalDateTime = ArrivalDateTime;
	}

	public YesNoIndicator getPartialShipment() {
		return PartialShipment;
	}

	public void setPartialShipment(YesNoIndicator PartialShipment) {
		this.PartialShipment = PartialShipment;
	}

	public YesNoIndicator getTransShipment() {
		return TransShipment;
	}

	public void setTransShipment(YesNoIndicator TransShipment) {
		this.TransShipment = TransShipment;
	}

	public ProductDelivery getProductDelivery() {
		return ProductDelivery;
	}

	public void setProductDelivery(ProductDelivery ProductDelivery) {
		this.ProductDelivery = ProductDelivery;
	}

	public Location getPlaceOfDeparture() {
		return PlaceOfDeparture;
	}

	public void setPlaceOfDeparture(Location PlaceOfDeparture) {
		this.PlaceOfDeparture = PlaceOfDeparture;
	}

	public Location getPlaceOfDestination() {
		return PlaceOfDestination;
	}

	public void setPlaceOfDestination(Location PlaceOfDestination) {
		this.PlaceOfDestination = PlaceOfDestination;
	}

	public Charges getTransportCharges() {
		return TransportCharges;
	}

	public void setTransportCharges(Charges TransportCharges) {
		this.TransportCharges = TransportCharges;
	}

	public FreightChargesCode getFreightChargesPrepaidOrCollect() {
		return FreightChargesPrepaidOrCollect;
	}

	public void setFreightChargesPrepaidOrCollect(
			FreightChargesCode FreightChargesPrepaidOrCollect) {
		this.FreightChargesPrepaidOrCollect = FreightChargesPrepaidOrCollect;
	}

	public ShipmentDateRange getShipmentDates() {
		return ShipmentDates;
	}

	public void setShipmentDates(ShipmentDateRange ShipmentDates) {
		this.ShipmentDates = ShipmentDates;
	}

	public Goods getTransportedGoods() {
		return TransportedGoods;
	}

	public void setTransportedGoods(Goods TransportedGoods) {
		this.TransportedGoods = TransportedGoods;
	}

	public TransportPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(TransportPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public Location getTransitLocation() {
		return TransitLocation;
	}

	public void setTransitLocation(Location TransitLocation) {
		this.TransitLocation = TransitLocation;
	}

	public Document getTransportDocuments() {
		return TransportDocuments;
	}

	public void setTransportDocuments(Document TransportDocuments) {
		this.TransportDocuments = TransportDocuments;
	}
}