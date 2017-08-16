package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Settlement;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max4AlphaNumericText;
import com.tools20022.repository.dict.entity.PaymentInstruction;
import com.tools20022.repository.dict.codeset.SettlementMethodCode;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.dict.entity.TransactionAdministrator;
import com.tools20022.repository.dict.entity.BookEntry;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.dict.entity.Reservation;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 */
public class CashSettlement extends Settlement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount InterbankSettlementAmount;
	private ISODateTime InterbankSettlementDate;
	private Max4AlphaNumericText RTGS;
	private ISODateTime CreditDateTime;
	private PaymentInstruction RelatedPaymentInstruction;
	private SettlementMethodCode SettlementMethod;
	private CashAccount SettlementAccount;
	private ISODateTime DebitDateTime;
	private CashSettlementInstructionPartyRole PartyRole;
	private TransactionAdministrator RelatedTransactionAdministrator;
	private BookEntry BookEntry;
	private PaymentInvestigationCaseResolution RelatedInvestigationCase;
	private Reservation Reservation;

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return InterbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(
			CurrencyAndAmount InterbankSettlementAmount) {
		this.InterbankSettlementAmount = InterbankSettlementAmount;
	}

	public ISODateTime getInterbankSettlementDate() {
		return InterbankSettlementDate;
	}

	public void setInterbankSettlementDate(ISODateTime InterbankSettlementDate) {
		this.InterbankSettlementDate = InterbankSettlementDate;
	}

	public Max4AlphaNumericText getRTGS() {
		return RTGS;
	}

	public void setRTGS(Max4AlphaNumericText RTGS) {
		this.RTGS = RTGS;
	}

	public ISODateTime getCreditDateTime() {
		return CreditDateTime;
	}

	public void setCreditDateTime(ISODateTime CreditDateTime) {
		this.CreditDateTime = CreditDateTime;
	}

	public PaymentInstruction getRelatedPaymentInstruction() {
		return RelatedPaymentInstruction;
	}

	public void setRelatedPaymentInstruction(
			PaymentInstruction RelatedPaymentInstruction) {
		this.RelatedPaymentInstruction = RelatedPaymentInstruction;
	}

	public SettlementMethodCode getSettlementMethod() {
		return SettlementMethod;
	}

	public void setSettlementMethod(SettlementMethodCode SettlementMethod) {
		this.SettlementMethod = SettlementMethod;
	}

	public CashAccount getSettlementAccount() {
		return SettlementAccount;
	}

	public void setSettlementAccount(CashAccount SettlementAccount) {
		this.SettlementAccount = SettlementAccount;
	}

	public ISODateTime getDebitDateTime() {
		return DebitDateTime;
	}

	public void setDebitDateTime(ISODateTime DebitDateTime) {
		this.DebitDateTime = DebitDateTime;
	}

	public CashSettlementInstructionPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(CashSettlementInstructionPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public TransactionAdministrator getRelatedTransactionAdministrator() {
		return RelatedTransactionAdministrator;
	}

	public void setRelatedTransactionAdministrator(
			TransactionAdministrator RelatedTransactionAdministrator) {
		this.RelatedTransactionAdministrator = RelatedTransactionAdministrator;
	}

	public BookEntry getBookEntry() {
		return BookEntry;
	}

	public void setBookEntry(BookEntry BookEntry) {
		this.BookEntry = BookEntry;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCase() {
		return RelatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(
			PaymentInvestigationCaseResolution RelatedInvestigationCase) {
		this.RelatedInvestigationCase = RelatedInvestigationCase;
	}

	public Reservation getReservation() {
		return Reservation;
	}

	public void setReservation(Reservation Reservation) {
		this.Reservation = Reservation;
	}
}