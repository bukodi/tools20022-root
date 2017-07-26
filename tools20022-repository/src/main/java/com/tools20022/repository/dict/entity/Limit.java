package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.LimitTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.FloorLimitTypeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.LimitStatus;
import com.tools20022.repository.dict.entity.DebitCreditFacility;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.PaymentCard;

/**
 * Value used for risk containment in a system or towards counterparts. The
 * limit may be a current limit or a default limit.
 */
public class Limit {

	private LimitTypeCode Type;
	private CurrencyAndAmount Amount;
	private FloorLimitTypeCode CreditDebitIndicator;
	private CurrencyAndAmount UsedAmount;
	private PercentageRate UsedPercentage;
	private CurrencyCode Currency;
	private LimitStatus LimitStatus;
	private PercentageRate Percentage;
	private DebitCreditFacility RelatedDebitCreditFacility;
	private FrequencyCode Periodicity;
	private DecimalNumber Quantity;
	private DateTimePeriod ValidityPeriod;
	private PaymentCard RelatedPaymentCard;
	private CurrencyAndAmount AvailableAmount;

	public LimitTypeCode getType() {
		return Type;
	}

	public void setType(LimitTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public FloorLimitTypeCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(FloorLimitTypeCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CurrencyAndAmount getUsedAmount() {
		return UsedAmount;
	}

	public void setUsedAmount(CurrencyAndAmount UsedAmount) {
		this.UsedAmount = UsedAmount;
	}

	public PercentageRate getUsedPercentage() {
		return UsedPercentage;
	}

	public void setUsedPercentage(PercentageRate UsedPercentage) {
		this.UsedPercentage = UsedPercentage;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public LimitStatus getLimitStatus() {
		return LimitStatus;
	}

	public void setLimitStatus(LimitStatus LimitStatus) {
		this.LimitStatus = LimitStatus;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return RelatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(
			DebitCreditFacility RelatedDebitCreditFacility) {
		this.RelatedDebitCreditFacility = RelatedDebitCreditFacility;
	}

	public FrequencyCode getPeriodicity() {
		return Periodicity;
	}

	public void setPeriodicity(FrequencyCode Periodicity) {
		this.Periodicity = Periodicity;
	}

	public DecimalNumber getQuantity() {
		return Quantity;
	}

	public void setQuantity(DecimalNumber Quantity) {
		this.Quantity = Quantity;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public PaymentCard getRelatedPaymentCard() {
		return RelatedPaymentCard;
	}

	public void setRelatedPaymentCard(PaymentCard RelatedPaymentCard) {
		this.RelatedPaymentCard = RelatedPaymentCard;
	}

	public CurrencyAndAmount getAvailableAmount() {
		return AvailableAmount;
	}

	public void setAvailableAmount(CurrencyAndAmount AvailableAmount) {
		this.AvailableAmount = AvailableAmount;
	}
}