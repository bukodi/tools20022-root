package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.MarketInfrastructure;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Defines the link between the accounts held with a market infrastructure.
 */
public class AccountLink {

	private CashAccount CashAccount;
	private DateTimePeriod ValidityPeriod;
	private SecuritiesAccount SecuritiesAccount;
	private MarketInfrastructure MarketInfrastructure;
	private YesNoIndicator CashSettlementIndicator;
	private YesNoIndicator CollateralisationIndicator;
	private YesNoIndicator DefaultIndicator;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public MarketInfrastructure getMarketInfrastructure() {
		return MarketInfrastructure;
	}

	public void setMarketInfrastructure(
			MarketInfrastructure MarketInfrastructure) {
		this.MarketInfrastructure = MarketInfrastructure;
	}

	public YesNoIndicator getCashSettlementIndicator() {
		return CashSettlementIndicator;
	}

	public void setCashSettlementIndicator(
			YesNoIndicator CashSettlementIndicator) {
		this.CashSettlementIndicator = CashSettlementIndicator;
	}

	public YesNoIndicator getCollateralisationIndicator() {
		return CollateralisationIndicator;
	}

	public void setCollateralisationIndicator(
			YesNoIndicator CollateralisationIndicator) {
		this.CollateralisationIndicator = CollateralisationIndicator;
	}

	public YesNoIndicator getDefaultIndicator() {
		return DefaultIndicator;
	}

	public void setDefaultIndicator(YesNoIndicator DefaultIndicator) {
		this.DefaultIndicator = DefaultIndicator;
	}
}