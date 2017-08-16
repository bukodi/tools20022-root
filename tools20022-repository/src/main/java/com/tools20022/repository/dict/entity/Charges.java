package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.codeset.ChargeTypeCode;
import com.tools20022.repository.dict.codeset.CalculationBasisCode;
import com.tools20022.repository.dict.codeset.ChargeBearerTypeCode;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.InvestmentFundTransaction;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.codeset.ChargePaymentMethodCode;

/**
 * Amount of money associated with a service.
 */
public class Charges extends Adjustment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ChargeTypeCode ChargeType;
	private CalculationBasisCode CalculationBasis;
	private ChargeBearerTypeCode BearerType;
	private CashAccount ChargesDebitAccount;
	private CashEntry CashEntry;
	private DebitCreditCode CreditDebitIndicator;
	private CurrencyAndAmount MaximumAmount;
	private InvestmentFundTransaction InvestmentFundTransaction;
	private LineItem LogisticsChargeLineItem;
	private Transport Transport;
	private AccountService Services;
	private Undertaking RelatedUndertaking;
	private LineItem LineItem;
	private LineItem NetPriceChargeLineItem;
	private CurrencyAndAmount BaseAmount;
	private PercentageRate MaximumRate;
	private PercentageRate MinimumRate;
	private CurrencyAndAmount MinimumAmount;
	private InterestCalculation RelatedInterest;
	private ChargePaymentMethodCode ChargePaymentMethod;

	public ChargeTypeCode getChargeType() {
		return ChargeType;
	}

	public void setChargeType(ChargeTypeCode ChargeType) {
		this.ChargeType = ChargeType;
	}

	public CalculationBasisCode getCalculationBasis() {
		return CalculationBasis;
	}

	public void setCalculationBasis(CalculationBasisCode CalculationBasis) {
		this.CalculationBasis = CalculationBasis;
	}

	public ChargeBearerTypeCode getBearerType() {
		return BearerType;
	}

	public void setBearerType(ChargeBearerTypeCode BearerType) {
		this.BearerType = BearerType;
	}

	public CashAccount getChargesDebitAccount() {
		return ChargesDebitAccount;
	}

	public void setChargesDebitAccount(CashAccount ChargesDebitAccount) {
		this.ChargesDebitAccount = ChargesDebitAccount;
	}

	public CashEntry getCashEntry() {
		return CashEntry;
	}

	public void setCashEntry(CashEntry CashEntry) {
		this.CashEntry = CashEntry;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return MaximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount MaximumAmount) {
		this.MaximumAmount = MaximumAmount;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return InvestmentFundTransaction;
	}

	public void setInvestmentFundTransaction(
			InvestmentFundTransaction InvestmentFundTransaction) {
		this.InvestmentFundTransaction = InvestmentFundTransaction;
	}

	public LineItem getLogisticsChargeLineItem() {
		return LogisticsChargeLineItem;
	}

	public void setLogisticsChargeLineItem(LineItem LogisticsChargeLineItem) {
		this.LogisticsChargeLineItem = LogisticsChargeLineItem;
	}

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}

	public AccountService getServices() {
		return Services;
	}

	public void setServices(AccountService Services) {
		this.Services = Services;
	}

	public Undertaking getRelatedUndertaking() {
		return RelatedUndertaking;
	}

	public void setRelatedUndertaking(Undertaking RelatedUndertaking) {
		this.RelatedUndertaking = RelatedUndertaking;
	}

	public LineItem getLineItem() {
		return LineItem;
	}

	public void setLineItem(LineItem LineItem) {
		this.LineItem = LineItem;
	}

	public LineItem getNetPriceChargeLineItem() {
		return NetPriceChargeLineItem;
	}

	public void setNetPriceChargeLineItem(LineItem NetPriceChargeLineItem) {
		this.NetPriceChargeLineItem = NetPriceChargeLineItem;
	}

	public CurrencyAndAmount getBaseAmount() {
		return BaseAmount;
	}

	public void setBaseAmount(CurrencyAndAmount BaseAmount) {
		this.BaseAmount = BaseAmount;
	}

	public PercentageRate getMaximumRate() {
		return MaximumRate;
	}

	public void setMaximumRate(PercentageRate MaximumRate) {
		this.MaximumRate = MaximumRate;
	}

	public PercentageRate getMinimumRate() {
		return MinimumRate;
	}

	public void setMinimumRate(PercentageRate MinimumRate) {
		this.MinimumRate = MinimumRate;
	}

	public CurrencyAndAmount getMinimumAmount() {
		return MinimumAmount;
	}

	public void setMinimumAmount(CurrencyAndAmount MinimumAmount) {
		this.MinimumAmount = MinimumAmount;
	}

	public InterestCalculation getRelatedInterest() {
		return RelatedInterest;
	}

	public void setRelatedInterest(InterestCalculation RelatedInterest) {
		this.RelatedInterest = RelatedInterest;
	}

	public ChargePaymentMethodCode getChargePaymentMethod() {
		return ChargePaymentMethod;
	}

	public void setChargePaymentMethod(
			ChargePaymentMethodCode ChargePaymentMethod) {
		this.ChargePaymentMethod = ChargePaymentMethod;
	}
}