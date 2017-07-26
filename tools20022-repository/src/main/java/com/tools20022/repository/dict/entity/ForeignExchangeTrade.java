package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TreasuryTrade;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.NonDeliverableTrade;
import com.tools20022.repository.dict.entity.ForeignExchangeSwap;
import com.tools20022.repository.dict.entity.CurrencyOption;
import com.tools20022.repository.dict.entity.TaxVoucher;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Agreement between two parties in which one party buys a currency and the
 * other party sells a different currency.
 */
public class ForeignExchangeTrade extends TreasuryTrade {

	private CurrencyExchange AgreedRate;
	private Max35Text TypeOfProduct;
	private CurrencyAndAmount BuyAmount;
	private CurrencyAndAmount SellAmount;
	private PaymentObligation ResultingSettlement;
	private SecuritiesSettlement CurrencyExchangeForSecuritiesSettlement;
	private NonDeliverableTrade OpeningLegRelatedNonDeliverableTrade;
	private NonDeliverableTrade ClosingLegRelatedNonDeliverableTrade;
	private ForeignExchangeSwap RelatedSwap;
	private CurrencyOption RelatedOption;
	private TaxVoucher CurrencyExchangeForTaxVoucher;
	private DecimalNumber ExchangeForwardPoint;

	public CurrencyExchange getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(CurrencyExchange AgreedRate) {
		this.AgreedRate = AgreedRate;
	}

	public Max35Text getTypeOfProduct() {
		return TypeOfProduct;
	}

	public void setTypeOfProduct(Max35Text TypeOfProduct) {
		this.TypeOfProduct = TypeOfProduct;
	}

	public CurrencyAndAmount getBuyAmount() {
		return BuyAmount;
	}

	public void setBuyAmount(CurrencyAndAmount BuyAmount) {
		this.BuyAmount = BuyAmount;
	}

	public CurrencyAndAmount getSellAmount() {
		return SellAmount;
	}

	public void setSellAmount(CurrencyAndAmount SellAmount) {
		this.SellAmount = SellAmount;
	}

	public PaymentObligation getResultingSettlement() {
		return ResultingSettlement;
	}

	public void setResultingSettlement(PaymentObligation ResultingSettlement) {
		this.ResultingSettlement = ResultingSettlement;
	}

	public SecuritiesSettlement getCurrencyExchangeForSecuritiesSettlement() {
		return CurrencyExchangeForSecuritiesSettlement;
	}

	public void setCurrencyExchangeForSecuritiesSettlement(
			SecuritiesSettlement CurrencyExchangeForSecuritiesSettlement) {
		this.CurrencyExchangeForSecuritiesSettlement = CurrencyExchangeForSecuritiesSettlement;
	}

	public NonDeliverableTrade getOpeningLegRelatedNonDeliverableTrade() {
		return OpeningLegRelatedNonDeliverableTrade;
	}

	public void setOpeningLegRelatedNonDeliverableTrade(
			NonDeliverableTrade OpeningLegRelatedNonDeliverableTrade) {
		this.OpeningLegRelatedNonDeliverableTrade = OpeningLegRelatedNonDeliverableTrade;
	}

	public NonDeliverableTrade getClosingLegRelatedNonDeliverableTrade() {
		return ClosingLegRelatedNonDeliverableTrade;
	}

	public void setClosingLegRelatedNonDeliverableTrade(
			NonDeliverableTrade ClosingLegRelatedNonDeliverableTrade) {
		this.ClosingLegRelatedNonDeliverableTrade = ClosingLegRelatedNonDeliverableTrade;
	}

	public ForeignExchangeSwap getRelatedSwap() {
		return RelatedSwap;
	}

	public void setRelatedSwap(ForeignExchangeSwap RelatedSwap) {
		this.RelatedSwap = RelatedSwap;
	}

	public CurrencyOption getRelatedOption() {
		return RelatedOption;
	}

	public void setRelatedOption(CurrencyOption RelatedOption) {
		this.RelatedOption = RelatedOption;
	}

	public TaxVoucher getCurrencyExchangeForTaxVoucher() {
		return CurrencyExchangeForTaxVoucher;
	}

	public void setCurrencyExchangeForTaxVoucher(
			TaxVoucher CurrencyExchangeForTaxVoucher) {
		this.CurrencyExchangeForTaxVoucher = CurrencyExchangeForTaxVoucher;
	}

	public DecimalNumber getExchangeForwardPoint() {
		return ExchangeForwardPoint;
	}

	public void setExchangeForwardPoint(DecimalNumber ExchangeForwardPoint) {
		this.ExchangeForwardPoint = ExchangeForwardPoint;
	}
}