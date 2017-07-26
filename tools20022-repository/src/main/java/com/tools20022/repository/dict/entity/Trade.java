package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Commission;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.TradeIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.NettingEligibleCode;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.entity.Negotiation;
import com.tools20022.repository.dict.entity.MasterAgreement;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.entity.Market;
import com.tools20022.repository.dict.entity.Guarantee;
import com.tools20022.repository.dict.entity.Settlement;
import com.tools20022.repository.dict.entity.Order;
import com.tools20022.repository.dict.entity.Leg;
import com.tools20022.repository.dict.entity.FinancialTransaction;
import com.tools20022.repository.dict.entity.Reconciliation;

/**
 * Result of an order between at least two parties. A trade relates to the
 * delivery of goods and services, cash or securities.
 */
public class Trade {

	private ISODateTime TradeDateTime;
	private Commission TradeCommission;
	private ISODate ValueDate;
	private ISODateTime EndDate;
	private TradeIdentification TradeRelatedIdentifications;
	private Max35Text AllocationIndicator;
	private Max35Text CollateralisationType;
	private YesNoIndicator BlockIndicator;
	private NettingEligibleCode SettlementNetting;
	private TradePartyRole TradePartyRole;
	private Obligation Obligation;
	private Negotiation RelatedNegotiation;
	private MasterAgreement GoverningDocument;
	private ISODateTime StartDate;
	private System System;
	private Asset Asset;
	private Market Market;
	private Guarantee Guarantee;
	private Settlement Settlement;
	private Order Order;
	private Leg Leg;
	private FinancialTransaction FinancialTransaction;
	private Reconciliation Reconciliation;

	public ISODateTime getTradeDateTime() {
		return TradeDateTime;
	}

	public void setTradeDateTime(ISODateTime TradeDateTime) {
		this.TradeDateTime = TradeDateTime;
	}

	public Commission getTradeCommission() {
		return TradeCommission;
	}

	public void setTradeCommission(Commission TradeCommission) {
		this.TradeCommission = TradeCommission;
	}

	public ISODate getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODate ValueDate) {
		this.ValueDate = ValueDate;
	}

	public ISODateTime getEndDate() {
		return EndDate;
	}

	public void setEndDate(ISODateTime EndDate) {
		this.EndDate = EndDate;
	}

	public TradeIdentification getTradeRelatedIdentifications() {
		return TradeRelatedIdentifications;
	}

	public void setTradeRelatedIdentifications(
			TradeIdentification TradeRelatedIdentifications) {
		this.TradeRelatedIdentifications = TradeRelatedIdentifications;
	}

	public Max35Text getAllocationIndicator() {
		return AllocationIndicator;
	}

	public void setAllocationIndicator(Max35Text AllocationIndicator) {
		this.AllocationIndicator = AllocationIndicator;
	}

	public Max35Text getCollateralisationType() {
		return CollateralisationType;
	}

	public void setCollateralisationType(Max35Text CollateralisationType) {
		this.CollateralisationType = CollateralisationType;
	}

	public YesNoIndicator getBlockIndicator() {
		return BlockIndicator;
	}

	public void setBlockIndicator(YesNoIndicator BlockIndicator) {
		this.BlockIndicator = BlockIndicator;
	}

	public NettingEligibleCode getSettlementNetting() {
		return SettlementNetting;
	}

	public void setSettlementNetting(NettingEligibleCode SettlementNetting) {
		this.SettlementNetting = SettlementNetting;
	}

	public TradePartyRole getTradePartyRole() {
		return TradePartyRole;
	}

	public void setTradePartyRole(TradePartyRole TradePartyRole) {
		this.TradePartyRole = TradePartyRole;
	}

	public Obligation getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation Obligation) {
		this.Obligation = Obligation;
	}

	public Negotiation getRelatedNegotiation() {
		return RelatedNegotiation;
	}

	public void setRelatedNegotiation(Negotiation RelatedNegotiation) {
		this.RelatedNegotiation = RelatedNegotiation;
	}

	public MasterAgreement getGoverningDocument() {
		return GoverningDocument;
	}

	public void setGoverningDocument(MasterAgreement GoverningDocument) {
		this.GoverningDocument = GoverningDocument;
	}

	public ISODateTime getStartDate() {
		return StartDate;
	}

	public void setStartDate(ISODateTime StartDate) {
		this.StartDate = StartDate;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}

	public Market getMarket() {
		return Market;
	}

	public void setMarket(Market Market) {
		this.Market = Market;
	}

	public Guarantee getGuarantee() {
		return Guarantee;
	}

	public void setGuarantee(Guarantee Guarantee) {
		this.Guarantee = Guarantee;
	}

	public Settlement getSettlement() {
		return Settlement;
	}

	public void setSettlement(Settlement Settlement) {
		this.Settlement = Settlement;
	}

	public Order getOrder() {
		return Order;
	}

	public void setOrder(Order Order) {
		this.Order = Order;
	}

	public Leg getLeg() {
		return Leg;
	}

	public void setLeg(Leg Leg) {
		this.Leg = Leg;
	}

	public FinancialTransaction getFinancialTransaction() {
		return FinancialTransaction;
	}

	public void setFinancialTransaction(
			FinancialTransaction FinancialTransaction) {
		this.FinancialTransaction = FinancialTransaction;
	}

	public Reconciliation getReconciliation() {
		return Reconciliation;
	}

	public void setReconciliation(Reconciliation Reconciliation) {
		this.Reconciliation = Reconciliation;
	}
}