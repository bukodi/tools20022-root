package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradeIdentification;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Specifies the different identifications associated with a securities
 * transaction.
 */
public class SecuritiesTradeIdentification extends TradeIdentification
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesTrade IdentifiedTrade;
	private Max35Text MarketInfrastructureTransactionIdentification;
	private Max35Text ProcessorTransactionIdentification;
	private Max35Text PoolIdentification;
	private Max35Text CollateralTransactionIdentification;
	private Max35Text ClientTripartyCollateralTransactionIdentification;
	private Max35Text TripartyAgentCollateralTransactionIdentification;
	private Max35Text BasketIdentification;
	private Max35Text ProgramIdentification;
	private Max35Text BlockIdentification;
	private Max35Text AllocationIdentification;
	private Max35Text ComplianceIdentification;
	private Max35Text CSDTransactionIdentification;
	private Max35Text CentralCounterpartyTransactionIdentification;
	private Max35Text CancellationRequestIdentification;

	public SecuritiesTrade getIdentifiedTrade() {
		return IdentifiedTrade;
	}

	public void setIdentifiedTrade(SecuritiesTrade IdentifiedTrade) {
		this.IdentifiedTrade = IdentifiedTrade;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Max35Text MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
	}

	public Max35Text getProcessorTransactionIdentification() {
		return ProcessorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(
			Max35Text ProcessorTransactionIdentification) {
		this.ProcessorTransactionIdentification = ProcessorTransactionIdentification;
	}

	public Max35Text getPoolIdentification() {
		return PoolIdentification;
	}

	public void setPoolIdentification(Max35Text PoolIdentification) {
		this.PoolIdentification = PoolIdentification;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return CollateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(
			Max35Text CollateralTransactionIdentification) {
		this.CollateralTransactionIdentification = CollateralTransactionIdentification;
	}

	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return ClientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(
			Max35Text ClientTripartyCollateralTransactionIdentification) {
		this.ClientTripartyCollateralTransactionIdentification = ClientTripartyCollateralTransactionIdentification;
	}

	public Max35Text getTripartyAgentCollateralTransactionIdentification() {
		return TripartyAgentCollateralTransactionIdentification;
	}

	public void setTripartyAgentCollateralTransactionIdentification(
			Max35Text TripartyAgentCollateralTransactionIdentification) {
		this.TripartyAgentCollateralTransactionIdentification = TripartyAgentCollateralTransactionIdentification;
	}

	public Max35Text getBasketIdentification() {
		return BasketIdentification;
	}

	public void setBasketIdentification(Max35Text BasketIdentification) {
		this.BasketIdentification = BasketIdentification;
	}

	public Max35Text getProgramIdentification() {
		return ProgramIdentification;
	}

	public void setProgramIdentification(Max35Text ProgramIdentification) {
		this.ProgramIdentification = ProgramIdentification;
	}

	public Max35Text getBlockIdentification() {
		return BlockIdentification;
	}

	public void setBlockIdentification(Max35Text BlockIdentification) {
		this.BlockIdentification = BlockIdentification;
	}

	public Max35Text getAllocationIdentification() {
		return AllocationIdentification;
	}

	public void setAllocationIdentification(Max35Text AllocationIdentification) {
		this.AllocationIdentification = AllocationIdentification;
	}

	public Max35Text getComplianceIdentification() {
		return ComplianceIdentification;
	}

	public void setComplianceIdentification(Max35Text ComplianceIdentification) {
		this.ComplianceIdentification = ComplianceIdentification;
	}

	public Max35Text getCSDTransactionIdentification() {
		return CSDTransactionIdentification;
	}

	public void setCSDTransactionIdentification(
			Max35Text CSDTransactionIdentification) {
		this.CSDTransactionIdentification = CSDTransactionIdentification;
	}

	public Max35Text getCentralCounterpartyTransactionIdentification() {
		return CentralCounterpartyTransactionIdentification;
	}

	public void setCentralCounterpartyTransactionIdentification(
			Max35Text CentralCounterpartyTransactionIdentification) {
		this.CentralCounterpartyTransactionIdentification = CentralCounterpartyTransactionIdentification;
	}

	public Max35Text getCancellationRequestIdentification() {
		return CancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(
			Max35Text CancellationRequestIdentification) {
		this.CancellationRequestIdentification = CancellationRequestIdentification;
	}
}