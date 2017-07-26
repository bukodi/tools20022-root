package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Obligation;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.PaymentPurposeCode;
import com.tools20022.repository.dict.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.InterestManagement;
import com.tools20022.repository.dict.entity.CommercialTrade;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.entity.BuyIn;
import com.tools20022.repository.dict.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.dict.entity.CollateralMovement;
import com.tools20022.repository.dict.entity.Demand;
import com.tools20022.repository.dict.entity.PaymentObligationPartyRole;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.entity.CashAccountContract;
import com.tools20022.repository.dict.entity.PortfolioTransfer;
import com.tools20022.repository.dict.entity.CurrencyOption;
import com.tools20022.repository.dict.entity.ForeignExchangeTrade;
import com.tools20022.repository.dict.entity.Dividend;
import com.tools20022.repository.dict.entity.RepurchaseAgreement;
import com.tools20022.repository.dict.entity.Assignment;
import com.tools20022.repository.dict.entity.BankingTransaction;
import com.tools20022.repository.dict.entity.PaymentTerms;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Obligation for the debtor to pay the creditor an amount of cash.
 */
public class PaymentObligation extends Obligation {

	private Payment PaymentOffset;
	private PaymentPurposeCode Purpose;
	private RemittanceLocationMethodCode RemittanceDeliveryMethod;
	private Document AssociatedDocument;
	private CurrencyAndAmount Amount;
	private ContactPoint RemittanceLocation;
	private InterestManagement Interest;
	private CommercialTrade CommercialTrade;
	private PercentageRate Percentage;
	private CurrencyAndAmount MaximumAmount;
	private ISODateTime ExpiryDate;
	private CountryCode ApplicableLaw;
	private BuyIn PaymentSourceBuyIn;
	private CorporateActionProceedsDeliveryInstruction RelatedCorporateAction;
	private CollateralMovement RelatedCollateralMovement;
	private Demand PaymentSourceUndertakingDemand;
	private PaymentObligationPartyRole PartyRole;
	private SecuritiesTradeExecution ExecutedSecuritiesTrade;
	private CashAccountContract RelatedAccountClosingTerms;
	private PortfolioTransfer PaymentSourcePortfolioTransfer;
	private CurrencyOption PaymentSourceCurrencyOption;
	private ForeignExchangeTrade ExchangeRateInformation;
	private Dividend Dividend;
	private RepurchaseAgreement RepurchaseAgreement;
	private Assignment RelatedAssignment;
	private BankingTransaction BankingTransaction;
	private PaymentTerms PaymentTerms;
	private ISODate PaymentDueDate;

	public Payment getPaymentOffset() {
		return PaymentOffset;
	}

	public void setPaymentOffset(Payment PaymentOffset) {
		this.PaymentOffset = PaymentOffset;
	}

	public PaymentPurposeCode getPurpose() {
		return Purpose;
	}

	public void setPurpose(PaymentPurposeCode Purpose) {
		this.Purpose = Purpose;
	}

	public RemittanceLocationMethodCode getRemittanceDeliveryMethod() {
		return RemittanceDeliveryMethod;
	}

	public void setRemittanceDeliveryMethod(
			RemittanceLocationMethodCode RemittanceDeliveryMethod) {
		this.RemittanceDeliveryMethod = RemittanceDeliveryMethod;
	}

	public Document getAssociatedDocument() {
		return AssociatedDocument;
	}

	public void setAssociatedDocument(Document AssociatedDocument) {
		this.AssociatedDocument = AssociatedDocument;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public ContactPoint getRemittanceLocation() {
		return RemittanceLocation;
	}

	public void setRemittanceLocation(ContactPoint RemittanceLocation) {
		this.RemittanceLocation = RemittanceLocation;
	}

	public InterestManagement getInterest() {
		return Interest;
	}

	public void setInterest(InterestManagement Interest) {
		this.Interest = Interest;
	}

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return MaximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount MaximumAmount) {
		this.MaximumAmount = MaximumAmount;
	}

	public ISODateTime getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISODateTime ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public CountryCode getApplicableLaw() {
		return ApplicableLaw;
	}

	public void setApplicableLaw(CountryCode ApplicableLaw) {
		this.ApplicableLaw = ApplicableLaw;
	}

	public BuyIn getPaymentSourceBuyIn() {
		return PaymentSourceBuyIn;
	}

	public void setPaymentSourceBuyIn(BuyIn PaymentSourceBuyIn) {
		this.PaymentSourceBuyIn = PaymentSourceBuyIn;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return RelatedCorporateAction;
	}

	public void setRelatedCorporateAction(
			CorporateActionProceedsDeliveryInstruction RelatedCorporateAction) {
		this.RelatedCorporateAction = RelatedCorporateAction;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return RelatedCollateralMovement;
	}

	public void setRelatedCollateralMovement(
			CollateralMovement RelatedCollateralMovement) {
		this.RelatedCollateralMovement = RelatedCollateralMovement;
	}

	public Demand getPaymentSourceUndertakingDemand() {
		return PaymentSourceUndertakingDemand;
	}

	public void setPaymentSourceUndertakingDemand(
			Demand PaymentSourceUndertakingDemand) {
		this.PaymentSourceUndertakingDemand = PaymentSourceUndertakingDemand;
	}

	public PaymentObligationPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(PaymentObligationPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public SecuritiesTradeExecution getExecutedSecuritiesTrade() {
		return ExecutedSecuritiesTrade;
	}

	public void setExecutedSecuritiesTrade(
			SecuritiesTradeExecution ExecutedSecuritiesTrade) {
		this.ExecutedSecuritiesTrade = ExecutedSecuritiesTrade;
	}

	public CashAccountContract getRelatedAccountClosingTerms() {
		return RelatedAccountClosingTerms;
	}

	public void setRelatedAccountClosingTerms(
			CashAccountContract RelatedAccountClosingTerms) {
		this.RelatedAccountClosingTerms = RelatedAccountClosingTerms;
	}

	public PortfolioTransfer getPaymentSourcePortfolioTransfer() {
		return PaymentSourcePortfolioTransfer;
	}

	public void setPaymentSourcePortfolioTransfer(
			PortfolioTransfer PaymentSourcePortfolioTransfer) {
		this.PaymentSourcePortfolioTransfer = PaymentSourcePortfolioTransfer;
	}

	public CurrencyOption getPaymentSourceCurrencyOption() {
		return PaymentSourceCurrencyOption;
	}

	public void setPaymentSourceCurrencyOption(
			CurrencyOption PaymentSourceCurrencyOption) {
		this.PaymentSourceCurrencyOption = PaymentSourceCurrencyOption;
	}

	public ForeignExchangeTrade getExchangeRateInformation() {
		return ExchangeRateInformation;
	}

	public void setExchangeRateInformation(
			ForeignExchangeTrade ExchangeRateInformation) {
		this.ExchangeRateInformation = ExchangeRateInformation;
	}

	public Dividend getDividend() {
		return Dividend;
	}

	public void setDividend(Dividend Dividend) {
		this.Dividend = Dividend;
	}

	public RepurchaseAgreement getRepurchaseAgreement() {
		return RepurchaseAgreement;
	}

	public void setRepurchaseAgreement(RepurchaseAgreement RepurchaseAgreement) {
		this.RepurchaseAgreement = RepurchaseAgreement;
	}

	public Assignment getRelatedAssignment() {
		return RelatedAssignment;
	}

	public void setRelatedAssignment(Assignment RelatedAssignment) {
		this.RelatedAssignment = RelatedAssignment;
	}

	public BankingTransaction getBankingTransaction() {
		return BankingTransaction;
	}

	public void setBankingTransaction(BankingTransaction BankingTransaction) {
		this.BankingTransaction = BankingTransaction;
	}

	public PaymentTerms getPaymentTerms() {
		return PaymentTerms;
	}

	public void setPaymentTerms(PaymentTerms PaymentTerms) {
		this.PaymentTerms = PaymentTerms;
	}

	public ISODate getPaymentDueDate() {
		return PaymentDueDate;
	}

	public void setPaymentDueDate(ISODate PaymentDueDate) {
		this.PaymentDueDate = PaymentDueDate;
	}
}