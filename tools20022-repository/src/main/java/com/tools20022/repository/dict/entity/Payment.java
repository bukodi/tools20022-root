package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.CreditInstrument;
import com.tools20022.repository.dict.codeset.PaymentTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.PaymentStatus;
import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.codeset.InstructionCode;
import com.tools20022.repository.dict.entity.PaymentIdentification;
import com.tools20022.repository.dict.entity.PaymentInvestigationCase;
import com.tools20022.repository.dict.entity.SettlementTimeRequest;
import com.tools20022.repository.dict.entity.CommercialTradeSettlement;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.DebitAuthorisation;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.codeset.PaymentInstrumentCode;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 */
public class Payment extends ObligationFulfilment {

	private PaymentObligation PaymentObligation;
	private CurrencyCode CurrencyOfTransfer;
	private CreditInstrument CreditMethod;
	private PaymentTypeCode Type;
	private CurrencyAndAmount InstructedAmount;
	private PriorityCode Priority;
	private ISODate ValueDate;
	private PaymentStatus PaymentStatus;
	private PaymentPartyRole PartyRole;
	private Tax TaxOnPayment;
	private PaymentExecution PaymentExecution;
	private ISODate PoolingAdjustmentDate;
	private ImpliedCurrencyAndAmount EquivalentAmount;
	private CurrencyExchange CurrencyExchange;
	private InstructionCode InstructionForCreditorAgent;
	private InstructionCode InstructionForDebtorAgent;
	private PaymentIdentification PaymentRelatedIdentifications;
	private PaymentInvestigationCase RelatedInvestigationCase;
	private SettlementTimeRequest SettlementTimeRequest;
	private CurrencyAndAmount Amount;
	private CommercialTradeSettlement TradeSettlement;
	private Max140Text StandardSettlementInstructions;
	private DebitAuthorisation RelatedDebitAuthorisation;
	private PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution;
	private Payment OriginalPayment;
	private Payment ReturnPayment;
	private SecuritiesSettlement RelatedSecuritiesSettlement;
	private Invoice InvoiceReconciliation;
	private PaymentInstrumentCode PaymentInstrument;
	private CashAccount Account;
	private Adjustment Adjustments;
	private RegisteredContract ContractRegistration;

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public CurrencyCode getCurrencyOfTransfer() {
		return CurrencyOfTransfer;
	}

	public void setCurrencyOfTransfer(CurrencyCode CurrencyOfTransfer) {
		this.CurrencyOfTransfer = CurrencyOfTransfer;
	}

	public CreditInstrument getCreditMethod() {
		return CreditMethod;
	}

	public void setCreditMethod(CreditInstrument CreditMethod) {
		this.CreditMethod = CreditMethod;
	}

	public PaymentTypeCode getType() {
		return Type;
	}

	public void setType(PaymentTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return InstructedAmount;
	}

	public void setInstructedAmount(CurrencyAndAmount InstructedAmount) {
		this.InstructedAmount = InstructedAmount;
	}

	public PriorityCode getPriority() {
		return Priority;
	}

	public void setPriority(PriorityCode Priority) {
		this.Priority = Priority;
	}

	public ISODate getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODate ValueDate) {
		this.ValueDate = ValueDate;
	}

	public PaymentStatus getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(PaymentStatus PaymentStatus) {
		this.PaymentStatus = PaymentStatus;
	}

	public PaymentPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(PaymentPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public Tax getTaxOnPayment() {
		return TaxOnPayment;
	}

	public void setTaxOnPayment(Tax TaxOnPayment) {
		this.TaxOnPayment = TaxOnPayment;
	}

	public PaymentExecution getPaymentExecution() {
		return PaymentExecution;
	}

	public void setPaymentExecution(PaymentExecution PaymentExecution) {
		this.PaymentExecution = PaymentExecution;
	}

	public ISODate getPoolingAdjustmentDate() {
		return PoolingAdjustmentDate;
	}

	public void setPoolingAdjustmentDate(ISODate PoolingAdjustmentDate) {
		this.PoolingAdjustmentDate = PoolingAdjustmentDate;
	}

	public ImpliedCurrencyAndAmount getEquivalentAmount() {
		return EquivalentAmount;
	}

	public void setEquivalentAmount(ImpliedCurrencyAndAmount EquivalentAmount) {
		this.EquivalentAmount = EquivalentAmount;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public InstructionCode getInstructionForCreditorAgent() {
		return InstructionForCreditorAgent;
	}

	public void setInstructionForCreditorAgent(
			InstructionCode InstructionForCreditorAgent) {
		this.InstructionForCreditorAgent = InstructionForCreditorAgent;
	}

	public InstructionCode getInstructionForDebtorAgent() {
		return InstructionForDebtorAgent;
	}

	public void setInstructionForDebtorAgent(
			InstructionCode InstructionForDebtorAgent) {
		this.InstructionForDebtorAgent = InstructionForDebtorAgent;
	}

	public PaymentIdentification getPaymentRelatedIdentifications() {
		return PaymentRelatedIdentifications;
	}

	public void setPaymentRelatedIdentifications(
			PaymentIdentification PaymentRelatedIdentifications) {
		this.PaymentRelatedIdentifications = PaymentRelatedIdentifications;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return RelatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(
			PaymentInvestigationCase RelatedInvestigationCase) {
		this.RelatedInvestigationCase = RelatedInvestigationCase;
	}

	public SettlementTimeRequest getSettlementTimeRequest() {
		return SettlementTimeRequest;
	}

	public void setSettlementTimeRequest(
			SettlementTimeRequest SettlementTimeRequest) {
		this.SettlementTimeRequest = SettlementTimeRequest;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public CommercialTradeSettlement getTradeSettlement() {
		return TradeSettlement;
	}

	public void setTradeSettlement(CommercialTradeSettlement TradeSettlement) {
		this.TradeSettlement = TradeSettlement;
	}

	public Max140Text getStandardSettlementInstructions() {
		return StandardSettlementInstructions;
	}

	public void setStandardSettlementInstructions(
			Max140Text StandardSettlementInstructions) {
		this.StandardSettlementInstructions = StandardSettlementInstructions;
	}

	public DebitAuthorisation getRelatedDebitAuthorisation() {
		return RelatedDebitAuthorisation;
	}

	public void setRelatedDebitAuthorisation(
			DebitAuthorisation RelatedDebitAuthorisation) {
		this.RelatedDebitAuthorisation = RelatedDebitAuthorisation;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return RelatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(
			PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution) {
		this.RelatedInvestigationCaseResolution = RelatedInvestigationCaseResolution;
	}

	public Payment getOriginalPayment() {
		return OriginalPayment;
	}

	public void setOriginalPayment(Payment OriginalPayment) {
		this.OriginalPayment = OriginalPayment;
	}

	public Payment getReturnPayment() {
		return ReturnPayment;
	}

	public void setReturnPayment(Payment ReturnPayment) {
		this.ReturnPayment = ReturnPayment;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return RelatedSecuritiesSettlement;
	}

	public void setRelatedSecuritiesSettlement(
			SecuritiesSettlement RelatedSecuritiesSettlement) {
		this.RelatedSecuritiesSettlement = RelatedSecuritiesSettlement;
	}

	public Invoice getInvoiceReconciliation() {
		return InvoiceReconciliation;
	}

	public void setInvoiceReconciliation(Invoice InvoiceReconciliation) {
		this.InvoiceReconciliation = InvoiceReconciliation;
	}

	public PaymentInstrumentCode getPaymentInstrument() {
		return PaymentInstrument;
	}

	public void setPaymentInstrument(PaymentInstrumentCode PaymentInstrument) {
		this.PaymentInstrument = PaymentInstrument;
	}

	public CashAccount getAccount() {
		return Account;
	}

	public void setAccount(CashAccount Account) {
		this.Account = Account;
	}

	public Adjustment getAdjustments() {
		return Adjustments;
	}

	public void setAdjustments(Adjustment Adjustments) {
		this.Adjustments = Adjustments;
	}

	public RegisteredContract getContractRegistration() {
		return ContractRegistration;
	}

	public void setContractRegistration(RegisteredContract ContractRegistration) {
		this.ContractRegistration = ContractRegistration;
	}
}