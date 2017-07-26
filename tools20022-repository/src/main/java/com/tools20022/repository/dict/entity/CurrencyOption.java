package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TreasuryTrade;
import com.tools20022.repository.dict.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.dict.entity.PremiumCalculation;
import com.tools20022.repository.dict.entity.Option;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;
import com.tools20022.repository.dict.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.dict.datatype.BaseOneRate;

/**
 * Right to buy (call) or sell (put) an underlying amount in one currency
 * against another amount in another currency at a predetermined exchange rate,
 * within a specified period of time or at a specified date and time.
 */
public class CurrencyOption extends TreasuryTrade {

	private ActiveOrHistoricCurrencyAndAmount CallAmount;
	private ActiveOrHistoricCurrencyAndAmount PutAmount;
	private PremiumCalculation PremiumCalculation;
	private Option OptionDefinition;
	private PaymentObligation PremiumSettlement;
	private ForeignExchangeTrade ExercisedOption;
	private ActiveOrHistoricCurrencyCode OptionSettlementCurrency;
	private BaseOneRate StrikeRate;

	public ActiveOrHistoricCurrencyAndAmount getCallAmount() {
		return CallAmount;
	}

	public void setCallAmount(ActiveOrHistoricCurrencyAndAmount CallAmount) {
		this.CallAmount = CallAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getPutAmount() {
		return PutAmount;
	}

	public void setPutAmount(ActiveOrHistoricCurrencyAndAmount PutAmount) {
		this.PutAmount = PutAmount;
	}

	public PremiumCalculation getPremiumCalculation() {
		return PremiumCalculation;
	}

	public void setPremiumCalculation(PremiumCalculation PremiumCalculation) {
		this.PremiumCalculation = PremiumCalculation;
	}

	public Option getOptionDefinition() {
		return OptionDefinition;
	}

	public void setOptionDefinition(Option OptionDefinition) {
		this.OptionDefinition = OptionDefinition;
	}

	public PaymentObligation getPremiumSettlement() {
		return PremiumSettlement;
	}

	public void setPremiumSettlement(PaymentObligation PremiumSettlement) {
		this.PremiumSettlement = PremiumSettlement;
	}

	public ForeignExchangeTrade getExercisedOption() {
		return ExercisedOption;
	}

	public void setExercisedOption(ForeignExchangeTrade ExercisedOption) {
		this.ExercisedOption = ExercisedOption;
	}

	public ActiveOrHistoricCurrencyCode getOptionSettlementCurrency() {
		return OptionSettlementCurrency;
	}

	public void setOptionSettlementCurrency(
			ActiveOrHistoricCurrencyCode OptionSettlementCurrency) {
		this.OptionSettlementCurrency = OptionSettlementCurrency;
	}

	public BaseOneRate getStrikeRate() {
		return StrikeRate;
	}

	public void setStrikeRate(BaseOneRate StrikeRate) {
		this.StrikeRate = StrikeRate;
	}
}