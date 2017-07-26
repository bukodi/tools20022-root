package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.CommissionWaiver;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.codeset.CommissionTypeV2Code;
import com.tools20022.repository.dict.codeset.TaxationBasisCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Broker;
import com.tools20022.repository.dict.entity.CommissionPartyRole;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.SecuritiesQuoteVariable;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.CorporateActionFeesAndCharges;

/**
 * Amount of money due to a party as compensation for a service.
 */
public class Commission extends Adjustment {

	private CommissionWaiver CommissionWaiving;
	private Trade Trade;
	private CommissionTypeV2Code CommissionType;
	private TaxationBasisCode Basis;
	private Max35Text CommercialAgreementReference;
	private ISODateTime CalculationDate;
	private PercentageRate Rate;
	private CurrencyAndAmount CommissionAmount;
	private Broker Broker;
	private CommissionPartyRole CommissionPartyRole;
	private CashAccount Account;
	private SecuritiesQuoteVariable RelatedQuote;
	private PercentageRate SplitRate;
	private CurrencyCode Currency;
	private CorporateActionFeesAndCharges CorporateActionFeesAndCharges;

	public CommissionWaiver getCommissionWaiving() {
		return CommissionWaiving;
	}

	public void setCommissionWaiving(CommissionWaiver CommissionWaiving) {
		this.CommissionWaiving = CommissionWaiving;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public CommissionTypeV2Code getCommissionType() {
		return CommissionType;
	}

	public void setCommissionType(CommissionTypeV2Code CommissionType) {
		this.CommissionType = CommissionType;
	}

	public TaxationBasisCode getBasis() {
		return Basis;
	}

	public void setBasis(TaxationBasisCode Basis) {
		this.Basis = Basis;
	}

	public Max35Text getCommercialAgreementReference() {
		return CommercialAgreementReference;
	}

	public void setCommercialAgreementReference(
			Max35Text CommercialAgreementReference) {
		this.CommercialAgreementReference = CommercialAgreementReference;
	}

	public ISODateTime getCalculationDate() {
		return CalculationDate;
	}

	public void setCalculationDate(ISODateTime CalculationDate) {
		this.CalculationDate = CalculationDate;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public CurrencyAndAmount getCommissionAmount() {
		return CommissionAmount;
	}

	public void setCommissionAmount(CurrencyAndAmount CommissionAmount) {
		this.CommissionAmount = CommissionAmount;
	}

	public Broker getBroker() {
		return Broker;
	}

	public void setBroker(Broker Broker) {
		this.Broker = Broker;
	}

	public CommissionPartyRole getCommissionPartyRole() {
		return CommissionPartyRole;
	}

	public void setCommissionPartyRole(CommissionPartyRole CommissionPartyRole) {
		this.CommissionPartyRole = CommissionPartyRole;
	}

	public CashAccount getAccount() {
		return Account;
	}

	public void setAccount(CashAccount Account) {
		this.Account = Account;
	}

	public SecuritiesQuoteVariable getRelatedQuote() {
		return RelatedQuote;
	}

	public void setRelatedQuote(SecuritiesQuoteVariable RelatedQuote) {
		this.RelatedQuote = RelatedQuote;
	}

	public PercentageRate getSplitRate() {
		return SplitRate;
	}

	public void setSplitRate(PercentageRate SplitRate) {
		this.SplitRate = SplitRate;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public CorporateActionFeesAndCharges getCorporateActionFeesAndCharges() {
		return CorporateActionFeesAndCharges;
	}

	public void setCorporateActionFeesAndCharges(
			CorporateActionFeesAndCharges CorporateActionFeesAndCharges) {
		this.CorporateActionFeesAndCharges = CorporateActionFeesAndCharges;
	}
}