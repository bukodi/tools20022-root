package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.RoundingDirectionCode;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Distribution of the (block) trade (transactions) by the investor or
 * investment manager to different underlying clients, ie, investment funds.
 */
public class Allocation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PercentageRate Percentage;
	private SecuritiesQuantity AllocatedQuantity;
	private CurrencyCode SettlementCurrency;
	private SecuritiesAccount AllocationAccount;
	private SecuritiesPricing AllocatedPrice;
	private CurrencyAndAmount AllocationAmount;
	private RoundingDirectionCode Method;
	private DecimalNumber AveragePricePrecision;
	private SecuritiesSettlement SettlementExecutionParameters;
	private SecuritiesOrder SecuritiesOrder;
	private SecuritiesTrade SecuritiesTrade;
	private Max35Text Identification;

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}

	public SecuritiesQuantity getAllocatedQuantity() {
		return AllocatedQuantity;
	}

	public void setAllocatedQuantity(SecuritiesQuantity AllocatedQuantity) {
		this.AllocatedQuantity = AllocatedQuantity;
	}

	public CurrencyCode getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}

	public SecuritiesAccount getAllocationAccount() {
		return AllocationAccount;
	}

	public void setAllocationAccount(SecuritiesAccount AllocationAccount) {
		this.AllocationAccount = AllocationAccount;
	}

	public SecuritiesPricing getAllocatedPrice() {
		return AllocatedPrice;
	}

	public void setAllocatedPrice(SecuritiesPricing AllocatedPrice) {
		this.AllocatedPrice = AllocatedPrice;
	}

	public CurrencyAndAmount getAllocationAmount() {
		return AllocationAmount;
	}

	public void setAllocationAmount(CurrencyAndAmount AllocationAmount) {
		this.AllocationAmount = AllocationAmount;
	}

	public RoundingDirectionCode getMethod() {
		return Method;
	}

	public void setMethod(RoundingDirectionCode Method) {
		this.Method = Method;
	}

	public DecimalNumber getAveragePricePrecision() {
		return AveragePricePrecision;
	}

	public void setAveragePricePrecision(DecimalNumber AveragePricePrecision) {
		this.AveragePricePrecision = AveragePricePrecision;
	}

	public SecuritiesSettlement getSettlementExecutionParameters() {
		return SettlementExecutionParameters;
	}

	public void setSettlementExecutionParameters(
			SecuritiesSettlement SettlementExecutionParameters) {
		this.SettlementExecutionParameters = SettlementExecutionParameters;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return SecuritiesTrade;
	}

	public void setSecuritiesTrade(SecuritiesTrade SecuritiesTrade) {
		this.SecuritiesTrade = SecuritiesTrade;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}
}