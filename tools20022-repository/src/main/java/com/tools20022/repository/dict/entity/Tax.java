package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.TaxExemptReasonCode;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.codeset.TaxTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.codeset.TaxationBasisCode;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.codeset.RateTypeCode;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.TaxRecord;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.TaxPartyRole;
import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.codeset.WithholdingTaxRateTypeCode;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.codeset.TaxIdentificationNumberTypeCode;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 */
public class Tax extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TaxExemptReasonCode ExemptionReason;
	private Country Country;
	private NetAssetValueCalculation TaxLiabilityValueCalculation;
	private TaxTypeCode Type;
	private CurrencyAndAmount Amount;
	private PercentageRate Rate;
	private Party TaxableParty;
	private NetAssetValueCalculation TaxRefundValueCalculation;
	private TaxationBasisCode Basis;
	private SecuritiesTransfer SecuritiesTransfer;
	private RateTypeCode TaxRateType;
	private CashAccount TaxAccount;
	private Max350Text TaxationConditions;
	private Adjustment Adjustment;
	private Interest Interest;
	private Max35Text Identification;
	private Payment RelatedPaymentSettlement;
	private CurrencyAndAmount TaxableBaseAmount;
	private ISODate TaxDate;
	private Max35Text CertificateIdentification;
	private Max140Text AdministrationZone;
	private Max35Text Method;
	private TaxRecord Record;
	private Product Product;
	private CurrencyExchange CurrencyExchange;
	private CurrencyCode Currency;
	private TaxPartyRole PartyRole;
	private CurrencyAndAmount TaxDeduction;
	private Distribution RelatedCorporateActionDistribution;
	private ISODate CalculationDate;
	private Dividend Dividend;
	private WithholdingTaxRateTypeCode WithholdingTaxType;
	private CorporateActionEvent CorporateActionEvent;
	private TaxIdentificationNumberTypeCode TaxIdentificationType;

	public TaxExemptReasonCode getExemptionReason() {
		return ExemptionReason;
	}

	public void setExemptionReason(TaxExemptReasonCode ExemptionReason) {
		this.ExemptionReason = ExemptionReason;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}

	public NetAssetValueCalculation getTaxLiabilityValueCalculation() {
		return TaxLiabilityValueCalculation;
	}

	public void setTaxLiabilityValueCalculation(
			NetAssetValueCalculation TaxLiabilityValueCalculation) {
		this.TaxLiabilityValueCalculation = TaxLiabilityValueCalculation;
	}

	public TaxTypeCode getType() {
		return Type;
	}

	public void setType(TaxTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public Party getTaxableParty() {
		return TaxableParty;
	}

	public void setTaxableParty(Party TaxableParty) {
		this.TaxableParty = TaxableParty;
	}

	public NetAssetValueCalculation getTaxRefundValueCalculation() {
		return TaxRefundValueCalculation;
	}

	public void setTaxRefundValueCalculation(
			NetAssetValueCalculation TaxRefundValueCalculation) {
		this.TaxRefundValueCalculation = TaxRefundValueCalculation;
	}

	public TaxationBasisCode getBasis() {
		return Basis;
	}

	public void setBasis(TaxationBasisCode Basis) {
		this.Basis = Basis;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return SecuritiesTransfer;
	}

	public void setSecuritiesTransfer(SecuritiesTransfer SecuritiesTransfer) {
		this.SecuritiesTransfer = SecuritiesTransfer;
	}

	public RateTypeCode getTaxRateType() {
		return TaxRateType;
	}

	public void setTaxRateType(RateTypeCode TaxRateType) {
		this.TaxRateType = TaxRateType;
	}

	public CashAccount getTaxAccount() {
		return TaxAccount;
	}

	public void setTaxAccount(CashAccount TaxAccount) {
		this.TaxAccount = TaxAccount;
	}

	public Max350Text getTaxationConditions() {
		return TaxationConditions;
	}

	public void setTaxationConditions(Max350Text TaxationConditions) {
		this.TaxationConditions = TaxationConditions;
	}

	public Adjustment getAdjustment() {
		return Adjustment;
	}

	public void setAdjustment(Adjustment Adjustment) {
		this.Adjustment = Adjustment;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Payment getRelatedPaymentSettlement() {
		return RelatedPaymentSettlement;
	}

	public void setRelatedPaymentSettlement(Payment RelatedPaymentSettlement) {
		this.RelatedPaymentSettlement = RelatedPaymentSettlement;
	}

	public CurrencyAndAmount getTaxableBaseAmount() {
		return TaxableBaseAmount;
	}

	public void setTaxableBaseAmount(CurrencyAndAmount TaxableBaseAmount) {
		this.TaxableBaseAmount = TaxableBaseAmount;
	}

	public ISODate getTaxDate() {
		return TaxDate;
	}

	public void setTaxDate(ISODate TaxDate) {
		this.TaxDate = TaxDate;
	}

	public Max35Text getCertificateIdentification() {
		return CertificateIdentification;
	}

	public void setCertificateIdentification(Max35Text CertificateIdentification) {
		this.CertificateIdentification = CertificateIdentification;
	}

	public Max140Text getAdministrationZone() {
		return AdministrationZone;
	}

	public void setAdministrationZone(Max140Text AdministrationZone) {
		this.AdministrationZone = AdministrationZone;
	}

	public Max35Text getMethod() {
		return Method;
	}

	public void setMethod(Max35Text Method) {
		this.Method = Method;
	}

	public TaxRecord getRecord() {
		return Record;
	}

	public void setRecord(TaxRecord Record) {
		this.Record = Record;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public TaxPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(TaxPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public CurrencyAndAmount getTaxDeduction() {
		return TaxDeduction;
	}

	public void setTaxDeduction(CurrencyAndAmount TaxDeduction) {
		this.TaxDeduction = TaxDeduction;
	}

	public Distribution getRelatedCorporateActionDistribution() {
		return RelatedCorporateActionDistribution;
	}

	public void setRelatedCorporateActionDistribution(
			Distribution RelatedCorporateActionDistribution) {
		this.RelatedCorporateActionDistribution = RelatedCorporateActionDistribution;
	}

	public ISODate getCalculationDate() {
		return CalculationDate;
	}

	public void setCalculationDate(ISODate CalculationDate) {
		this.CalculationDate = CalculationDate;
	}

	public Dividend getDividend() {
		return Dividend;
	}

	public void setDividend(Dividend Dividend) {
		this.Dividend = Dividend;
	}

	public WithholdingTaxRateTypeCode getWithholdingTaxType() {
		return WithholdingTaxType;
	}

	public void setWithholdingTaxType(
			WithholdingTaxRateTypeCode WithholdingTaxType) {
		this.WithholdingTaxType = WithholdingTaxType;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}

	public TaxIdentificationNumberTypeCode getTaxIdentificationType() {
		return TaxIdentificationType;
	}

	public void setTaxIdentificationType(
			TaxIdentificationNumberTypeCode TaxIdentificationType) {
		this.TaxIdentificationType = TaxIdentificationType;
	}
}