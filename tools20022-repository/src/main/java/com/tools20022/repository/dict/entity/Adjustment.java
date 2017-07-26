package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.TaxationBasisCode;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.dict.datatype.Max4AlphaNumericText;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Price;
import com.tools20022.repository.dict.codeset.AdjustmentTypeCode;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.entity.ChargePartyRole;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.entity.Tax;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 */
public class Adjustment {

	private CurrencyAndAmount Amount;
	private PercentageRate ChargeRate;
	private TaxationBasisCode CalculationMethod;
	private Payment Payment;
	private AdjustmentDirectionCode Direction;
	private Max4AlphaNumericText Reason;
	private LineItem RelatedLineItem;
	private YesNoIndicator AllowanceChargeIndicator;
	private Price Price;
	private YesNoIndicator ChargeIndicator;
	private AdjustmentTypeCode Type;
	private CollateralManagement CollateralManagement;
	private Balance AdjustedBalance;
	private ChargePartyRole ChargesPartyRole;
	private DateTimePeriod EffectivePeriod;
	private CurrencyExchange CurrencyExchange;
	private SecuritiesOrder SecuritiesOrder;
	private Tax Tax;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public PercentageRate getChargeRate() {
		return ChargeRate;
	}

	public void setChargeRate(PercentageRate ChargeRate) {
		this.ChargeRate = ChargeRate;
	}

	public TaxationBasisCode getCalculationMethod() {
		return CalculationMethod;
	}

	public void setCalculationMethod(TaxationBasisCode CalculationMethod) {
		this.CalculationMethod = CalculationMethod;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public AdjustmentDirectionCode getDirection() {
		return Direction;
	}

	public void setDirection(AdjustmentDirectionCode Direction) {
		this.Direction = Direction;
	}

	public Max4AlphaNumericText getReason() {
		return Reason;
	}

	public void setReason(Max4AlphaNumericText Reason) {
		this.Reason = Reason;
	}

	public LineItem getRelatedLineItem() {
		return RelatedLineItem;
	}

	public void setRelatedLineItem(LineItem RelatedLineItem) {
		this.RelatedLineItem = RelatedLineItem;
	}

	public YesNoIndicator getAllowanceChargeIndicator() {
		return AllowanceChargeIndicator;
	}

	public void setAllowanceChargeIndicator(
			YesNoIndicator AllowanceChargeIndicator) {
		this.AllowanceChargeIndicator = AllowanceChargeIndicator;
	}

	public Price getPrice() {
		return Price;
	}

	public void setPrice(Price Price) {
		this.Price = Price;
	}

	public YesNoIndicator getChargeIndicator() {
		return ChargeIndicator;
	}

	public void setChargeIndicator(YesNoIndicator ChargeIndicator) {
		this.ChargeIndicator = ChargeIndicator;
	}

	public AdjustmentTypeCode getType() {
		return Type;
	}

	public void setType(AdjustmentTypeCode Type) {
		this.Type = Type;
	}

	public CollateralManagement getCollateralManagement() {
		return CollateralManagement;
	}

	public void setCollateralManagement(
			CollateralManagement CollateralManagement) {
		this.CollateralManagement = CollateralManagement;
	}

	public Balance getAdjustedBalance() {
		return AdjustedBalance;
	}

	public void setAdjustedBalance(Balance AdjustedBalance) {
		this.AdjustedBalance = AdjustedBalance;
	}

	public ChargePartyRole getChargesPartyRole() {
		return ChargesPartyRole;
	}

	public void setChargesPartyRole(ChargePartyRole ChargesPartyRole) {
		this.ChargesPartyRole = ChargesPartyRole;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}

	public Tax getTax() {
		return Tax;
	}

	public void setTax(Tax Tax) {
		this.Tax = Tax;
	}
}