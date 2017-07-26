package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Negotiation;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.codeset.RelativeSizeCode;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.codeset.QualityIndicationCode;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.codeset.QualifierCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.codeset.RoutingTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Intention to buy or sell a financial Instrument.
 */
public class BuyOrSellIndicationOfInterest {

	private Negotiation NegotiationDetails;
	private Organisation Organisations;
	private RelativeSizeCode RelativeSize;
	private SecuritiesPricing Price;
	private QualityIndicationCode QualityIndication;
	private TrueFalseIndicator NaturalIndicator;
	private QualifierCode Qualifier;
	private Number NumberOfLegs;
	private Spread SpreadToBenchmark;
	private Spread SwapSpread;
	private SecuritiesFinancing TwoLegTransaction;
	private RoutingTypeCode RoutingType;
	private Max35Text OrganisationListName;

	public Negotiation getNegotiationDetails() {
		return NegotiationDetails;
	}

	public void setNegotiationDetails(Negotiation NegotiationDetails) {
		this.NegotiationDetails = NegotiationDetails;
	}

	public Organisation getOrganisations() {
		return Organisations;
	}

	public void setOrganisations(Organisation Organisations) {
		this.Organisations = Organisations;
	}

	public RelativeSizeCode getRelativeSize() {
		return RelativeSize;
	}

	public void setRelativeSize(RelativeSizeCode RelativeSize) {
		this.RelativeSize = RelativeSize;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public QualityIndicationCode getQualityIndication() {
		return QualityIndication;
	}

	public void setQualityIndication(QualityIndicationCode QualityIndication) {
		this.QualityIndication = QualityIndication;
	}

	public TrueFalseIndicator getNaturalIndicator() {
		return NaturalIndicator;
	}

	public void setNaturalIndicator(TrueFalseIndicator NaturalIndicator) {
		this.NaturalIndicator = NaturalIndicator;
	}

	public QualifierCode getQualifier() {
		return Qualifier;
	}

	public void setQualifier(QualifierCode Qualifier) {
		this.Qualifier = Qualifier;
	}

	public Number getNumberOfLegs() {
		return NumberOfLegs;
	}

	public void setNumberOfLegs(Number NumberOfLegs) {
		this.NumberOfLegs = NumberOfLegs;
	}

	public Spread getSpreadToBenchmark() {
		return SpreadToBenchmark;
	}

	public void setSpreadToBenchmark(Spread SpreadToBenchmark) {
		this.SpreadToBenchmark = SpreadToBenchmark;
	}

	public Spread getSwapSpread() {
		return SwapSpread;
	}

	public void setSwapSpread(Spread SwapSpread) {
		this.SwapSpread = SwapSpread;
	}

	public SecuritiesFinancing getTwoLegTransaction() {
		return TwoLegTransaction;
	}

	public void setTwoLegTransaction(SecuritiesFinancing TwoLegTransaction) {
		this.TwoLegTransaction = TwoLegTransaction;
	}

	public RoutingTypeCode getRoutingType() {
		return RoutingType;
	}

	public void setRoutingType(RoutingTypeCode RoutingType) {
		this.RoutingType = RoutingType;
	}

	public Max35Text getOrganisationListName() {
		return OrganisationListName;
	}

	public void setOrganisationListName(Max35Text OrganisationListName) {
		this.OrganisationListName = OrganisationListName;
	}
}