package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Option;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.codeset.UnitOfMeasureCode;
import com.tools20022.repository.dict.entity.Tolerance;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.entity.Netting;
import com.tools20022.repository.dict.entity.SecuritiesPricing;

/**
 * Amount of money for which goods, services or assets are offered, sold, or
 * bought.
 */
public class Price extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount Amount;
	private Option Option;
	private Product UnitPriceProduct;
	private Product NetPriceProduct;
	private Adjustment PriceAdjustment;
	private Product GrossPriceProduct;
	private UnitOfMeasureCode UnitOfMeasure;
	private Tolerance PriceTolerance;
	private CurrencyCode Currency;
	private Max15NumericText Factor;
	private Netting Netting;
	private SecuritiesPricing SecuritiesPricing;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public Option getOption() {
		return Option;
	}

	public void setOption(Option Option) {
		this.Option = Option;
	}

	public Product getUnitPriceProduct() {
		return UnitPriceProduct;
	}

	public void setUnitPriceProduct(Product UnitPriceProduct) {
		this.UnitPriceProduct = UnitPriceProduct;
	}

	public Product getNetPriceProduct() {
		return NetPriceProduct;
	}

	public void setNetPriceProduct(Product NetPriceProduct) {
		this.NetPriceProduct = NetPriceProduct;
	}

	public Adjustment getPriceAdjustment() {
		return PriceAdjustment;
	}

	public void setPriceAdjustment(Adjustment PriceAdjustment) {
		this.PriceAdjustment = PriceAdjustment;
	}

	public Product getGrossPriceProduct() {
		return GrossPriceProduct;
	}

	public void setGrossPriceProduct(Product GrossPriceProduct) {
		this.GrossPriceProduct = GrossPriceProduct;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return UnitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode UnitOfMeasure) {
		this.UnitOfMeasure = UnitOfMeasure;
	}

	public Tolerance getPriceTolerance() {
		return PriceTolerance;
	}

	public void setPriceTolerance(Tolerance PriceTolerance) {
		this.PriceTolerance = PriceTolerance;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public Max15NumericText getFactor() {
		return Factor;
	}

	public void setFactor(Max15NumericText Factor) {
		this.Factor = Factor;
	}

	public Netting getNetting() {
		return Netting;
	}

	public void setNetting(Netting Netting) {
		this.Netting = Netting;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}
}