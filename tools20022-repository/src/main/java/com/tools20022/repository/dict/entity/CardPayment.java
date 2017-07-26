package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.IndividualPayment;
import com.tools20022.repository.dict.entity.PaymentCard;
import com.tools20022.repository.dict.entity.Product;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.TypeOfAmountCode;
import com.tools20022.repository.dict.entity.CardPaymentAcquiring;
import com.tools20022.repository.dict.entity.CardPaymentPartyRole;
import com.tools20022.repository.dict.entity.CardPaymentStatus;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.ReconciliationTransaction;
import com.tools20022.repository.dict.codeset.ExternalCardTransactionCategoryCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.ATMTotal;

/**
 * Payment through an electronic money product.
 */
public class CardPayment extends IndividualPayment {

	private PaymentCard PaymentCard;
	private Product Product;
	private ImpliedCurrencyAndAmount DetailedAmount;
	private TypeOfAmountCode AmountQualifier;
	private CardPaymentAcquiring CardPaymentAcquiring;
	private CardPaymentPartyRole PaymentCardPartyRole;
	private CardPaymentStatus CardPaymentStatus;
	private Max35Text DetailedAmountLabel;
	private ReconciliationTransaction Reconciliation;
	private ExternalCardTransactionCategoryCode TransactionCategory;
	private CurrencyAndAmount CashBackAmount;
	private CurrencyAndAmount Gratuity;
	private DebitCreditCode DebitCreditDirection;
	private ATMTotal ATMTotal;

	public PaymentCard getPaymentCard() {
		return PaymentCard;
	}

	public void setPaymentCard(PaymentCard PaymentCard) {
		this.PaymentCard = PaymentCard;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public ImpliedCurrencyAndAmount getDetailedAmount() {
		return DetailedAmount;
	}

	public void setDetailedAmount(ImpliedCurrencyAndAmount DetailedAmount) {
		this.DetailedAmount = DetailedAmount;
	}

	public TypeOfAmountCode getAmountQualifier() {
		return AmountQualifier;
	}

	public void setAmountQualifier(TypeOfAmountCode AmountQualifier) {
		this.AmountQualifier = AmountQualifier;
	}

	public CardPaymentAcquiring getCardPaymentAcquiring() {
		return CardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(
			CardPaymentAcquiring CardPaymentAcquiring) {
		this.CardPaymentAcquiring = CardPaymentAcquiring;
	}

	public CardPaymentPartyRole getPaymentCardPartyRole() {
		return PaymentCardPartyRole;
	}

	public void setPaymentCardPartyRole(
			CardPaymentPartyRole PaymentCardPartyRole) {
		this.PaymentCardPartyRole = PaymentCardPartyRole;
	}

	public CardPaymentStatus getCardPaymentStatus() {
		return CardPaymentStatus;
	}

	public void setCardPaymentStatus(CardPaymentStatus CardPaymentStatus) {
		this.CardPaymentStatus = CardPaymentStatus;
	}

	public Max35Text getDetailedAmountLabel() {
		return DetailedAmountLabel;
	}

	public void setDetailedAmountLabel(Max35Text DetailedAmountLabel) {
		this.DetailedAmountLabel = DetailedAmountLabel;
	}

	public ReconciliationTransaction getReconciliation() {
		return Reconciliation;
	}

	public void setReconciliation(ReconciliationTransaction Reconciliation) {
		this.Reconciliation = Reconciliation;
	}

	public ExternalCardTransactionCategoryCode getTransactionCategory() {
		return TransactionCategory;
	}

	public void setTransactionCategory(
			ExternalCardTransactionCategoryCode TransactionCategory) {
		this.TransactionCategory = TransactionCategory;
	}

	public CurrencyAndAmount getCashBackAmount() {
		return CashBackAmount;
	}

	public void setCashBackAmount(CurrencyAndAmount CashBackAmount) {
		this.CashBackAmount = CashBackAmount;
	}

	public CurrencyAndAmount getGratuity() {
		return Gratuity;
	}

	public void setGratuity(CurrencyAndAmount Gratuity) {
		this.Gratuity = Gratuity;
	}

	public DebitCreditCode getDebitCreditDirection() {
		return DebitCreditDirection;
	}

	public void setDebitCreditDirection(DebitCreditCode DebitCreditDirection) {
		this.DebitCreditDirection = DebitCreditDirection;
	}

	public ATMTotal getATMTotal() {
		return ATMTotal;
	}

	public void setATMTotal(ATMTotal ATMTotal) {
		this.ATMTotal = ATMTotal;
	}
}