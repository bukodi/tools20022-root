package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.SecuritiesPricing;

/**
 * Prices related to a corporate action.
 */
public class CorporateActionPrice {

	private CorporateActionEvent CorporateActionEvent;
	private SecuritiesPricing CorporateActionExercisePrice;
	private SecuritiesPricing GenericCashPriceReceivedPerProduct;
	private SecuritiesPricing GenericCashPricePaidPerProduct;
	private SecuritiesPricing CashInLieuOfSharePrice;
	private SecuritiesPricing OverSubscriptionDepositPrice;
	private SecuritiesPricing CashValueForTax;
	private SecuritiesPricing PricingCalculation;

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}

	public SecuritiesPricing getCorporateActionExercisePrice() {
		return CorporateActionExercisePrice;
	}

	public void setCorporateActionExercisePrice(
			SecuritiesPricing CorporateActionExercisePrice) {
		this.CorporateActionExercisePrice = CorporateActionExercisePrice;
	}

	public SecuritiesPricing getGenericCashPriceReceivedPerProduct() {
		return GenericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(
			SecuritiesPricing GenericCashPriceReceivedPerProduct) {
		this.GenericCashPriceReceivedPerProduct = GenericCashPriceReceivedPerProduct;
	}

	public SecuritiesPricing getGenericCashPricePaidPerProduct() {
		return GenericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(
			SecuritiesPricing GenericCashPricePaidPerProduct) {
		this.GenericCashPricePaidPerProduct = GenericCashPricePaidPerProduct;
	}

	public SecuritiesPricing getCashInLieuOfSharePrice() {
		return CashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(
			SecuritiesPricing CashInLieuOfSharePrice) {
		this.CashInLieuOfSharePrice = CashInLieuOfSharePrice;
	}

	public SecuritiesPricing getOverSubscriptionDepositPrice() {
		return OverSubscriptionDepositPrice;
	}

	public void setOverSubscriptionDepositPrice(
			SecuritiesPricing OverSubscriptionDepositPrice) {
		this.OverSubscriptionDepositPrice = OverSubscriptionDepositPrice;
	}

	public SecuritiesPricing getCashValueForTax() {
		return CashValueForTax;
	}

	public void setCashValueForTax(SecuritiesPricing CashValueForTax) {
		this.CashValueForTax = CashValueForTax;
	}

	public SecuritiesPricing getPricingCalculation() {
		return PricingCalculation;
	}

	public void setPricingCalculation(SecuritiesPricing PricingCalculation) {
		this.PricingCalculation = PricingCalculation;
	}
}