package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.CardPaymentAcquiring;
import com.tools20022.repository.dict.entity.Response;
import com.tools20022.repository.dict.datatype.Min6Max8Text;
import com.tools20022.repository.dict.codeset.OnLineReasonCode;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.codeset.CardholderAddressVerificationResultCode;
import com.tools20022.repository.dict.codeset.CSCResultCode;
import com.tools20022.repository.dict.entity.ProductCategory;
import com.tools20022.repository.dict.datatype.Max500Text;
import com.tools20022.repository.dict.codeset.FailureReasonCode;
import com.tools20022.repository.dict.entity.Signature;

/**
 * Results and parameters of the card payment verification.
 */
public class CardPaymentValidation {

	private TrueFalseIndicator TransactionSuccess;
	private TrueFalseIndicator MerchantOverride;
	private ISODate ValidityDate;
	private CardPaymentAcquiring CardPayment;
	private Response Response;
	private Min6Max8Text AuthorisationCode;
	private OnLineReasonCode OnLineReason;
	private CashBalance Balance;
	private CardholderAddressVerificationResultCode CardholderAddressVerificationResult;
	private CSCResultCode CSCResult;
	private ProductCategory DeclinedProductCode;
	private Max500Text ElectronicCommerceAuthenticationResult;
	private FailureReasonCode FailureReason;
	private Signature Signature;

	public TrueFalseIndicator getTransactionSuccess() {
		return TransactionSuccess;
	}

	public void setTransactionSuccess(TrueFalseIndicator TransactionSuccess) {
		this.TransactionSuccess = TransactionSuccess;
	}

	public TrueFalseIndicator getMerchantOverride() {
		return MerchantOverride;
	}

	public void setMerchantOverride(TrueFalseIndicator MerchantOverride) {
		this.MerchantOverride = MerchantOverride;
	}

	public ISODate getValidityDate() {
		return ValidityDate;
	}

	public void setValidityDate(ISODate ValidityDate) {
		this.ValidityDate = ValidityDate;
	}

	public CardPaymentAcquiring getCardPayment() {
		return CardPayment;
	}

	public void setCardPayment(CardPaymentAcquiring CardPayment) {
		this.CardPayment = CardPayment;
	}

	public Response getResponse() {
		return Response;
	}

	public void setResponse(Response Response) {
		this.Response = Response;
	}

	public Min6Max8Text getAuthorisationCode() {
		return AuthorisationCode;
	}

	public void setAuthorisationCode(Min6Max8Text AuthorisationCode) {
		this.AuthorisationCode = AuthorisationCode;
	}

	public OnLineReasonCode getOnLineReason() {
		return OnLineReason;
	}

	public void setOnLineReason(OnLineReasonCode OnLineReason) {
		this.OnLineReason = OnLineReason;
	}

	public CashBalance getBalance() {
		return Balance;
	}

	public void setBalance(CashBalance Balance) {
		this.Balance = Balance;
	}

	public CardholderAddressVerificationResultCode getCardholderAddressVerificationResult() {
		return CardholderAddressVerificationResult;
	}

	public void setCardholderAddressVerificationResult(
			CardholderAddressVerificationResultCode CardholderAddressVerificationResult) {
		this.CardholderAddressVerificationResult = CardholderAddressVerificationResult;
	}

	public CSCResultCode getCSCResult() {
		return CSCResult;
	}

	public void setCSCResult(CSCResultCode CSCResult) {
		this.CSCResult = CSCResult;
	}

	public ProductCategory getDeclinedProductCode() {
		return DeclinedProductCode;
	}

	public void setDeclinedProductCode(ProductCategory DeclinedProductCode) {
		this.DeclinedProductCode = DeclinedProductCode;
	}

	public Max500Text getElectronicCommerceAuthenticationResult() {
		return ElectronicCommerceAuthenticationResult;
	}

	public void setElectronicCommerceAuthenticationResult(
			Max500Text ElectronicCommerceAuthenticationResult) {
		this.ElectronicCommerceAuthenticationResult = ElectronicCommerceAuthenticationResult;
	}

	public FailureReasonCode getFailureReason() {
		return FailureReason;
	}

	public void setFailureReason(FailureReasonCode FailureReason) {
		this.FailureReason = FailureReason;
	}

	public Signature getSignature() {
		return Signature;
	}

	public void setSignature(Signature Signature) {
		this.Signature = Signature;
	}
}