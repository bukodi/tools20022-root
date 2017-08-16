package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CardPayment;
import com.tools20022.repository.dict.codeset.CardTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISOYearMonth;
import com.tools20022.repository.dict.datatype.Exact3NumericText;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.codeset.CSCManagementCode;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.datatype.Max5NumericText;
import com.tools20022.repository.dict.codeset.CardAccountTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Country;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
 */
public class PaymentCard extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CardPayment Payment;
	private CardTypeCode Type;
	private Max35Text Number;
	private ISOYearMonth StartDate;
	private ISOYearMonth ExpiryDate;
	private Max35Text SecurityCode;
	private Max35Text SequenceNumber;
	private Exact3NumericText ServiceCode;
	private Max140Text TrackValue;
	private CSCManagementCode SecurityCodeManagement;
	private Max35Text CardBrand;
	private CashAccount RelatedAccount;
	private Max5NumericText ProfileNumber;
	private CardAccountTypeCode RelatedAccountType;
	private CurrencyAndAmount CreditAvailableAmount;
	private Limit Limit;
	private CurrencyCode CardCurrencyCode;
	private Interest Interest;
	private Country CardCountryCode;
	private Max35Text CardProgramme;

	public CardPayment getPayment() {
		return Payment;
	}

	public void setPayment(CardPayment Payment) {
		this.Payment = Payment;
	}

	public CardTypeCode getType() {
		return Type;
	}

	public void setType(CardTypeCode Type) {
		this.Type = Type;
	}

	public Max35Text getNumber() {
		return Number;
	}

	public void setNumber(Max35Text Number) {
		this.Number = Number;
	}

	public ISOYearMonth getStartDate() {
		return StartDate;
	}

	public void setStartDate(ISOYearMonth StartDate) {
		this.StartDate = StartDate;
	}

	public ISOYearMonth getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(ISOYearMonth ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public Max35Text getSecurityCode() {
		return SecurityCode;
	}

	public void setSecurityCode(Max35Text SecurityCode) {
		this.SecurityCode = SecurityCode;
	}

	public Max35Text getSequenceNumber() {
		return SequenceNumber;
	}

	public void setSequenceNumber(Max35Text SequenceNumber) {
		this.SequenceNumber = SequenceNumber;
	}

	public Exact3NumericText getServiceCode() {
		return ServiceCode;
	}

	public void setServiceCode(Exact3NumericText ServiceCode) {
		this.ServiceCode = ServiceCode;
	}

	public Max140Text getTrackValue() {
		return TrackValue;
	}

	public void setTrackValue(Max140Text TrackValue) {
		this.TrackValue = TrackValue;
	}

	public CSCManagementCode getSecurityCodeManagement() {
		return SecurityCodeManagement;
	}

	public void setSecurityCodeManagement(
			CSCManagementCode SecurityCodeManagement) {
		this.SecurityCodeManagement = SecurityCodeManagement;
	}

	public Max35Text getCardBrand() {
		return CardBrand;
	}

	public void setCardBrand(Max35Text CardBrand) {
		this.CardBrand = CardBrand;
	}

	public CashAccount getRelatedAccount() {
		return RelatedAccount;
	}

	public void setRelatedAccount(CashAccount RelatedAccount) {
		this.RelatedAccount = RelatedAccount;
	}

	public Max5NumericText getProfileNumber() {
		return ProfileNumber;
	}

	public void setProfileNumber(Max5NumericText ProfileNumber) {
		this.ProfileNumber = ProfileNumber;
	}

	public CardAccountTypeCode getRelatedAccountType() {
		return RelatedAccountType;
	}

	public void setRelatedAccountType(CardAccountTypeCode RelatedAccountType) {
		this.RelatedAccountType = RelatedAccountType;
	}

	public CurrencyAndAmount getCreditAvailableAmount() {
		return CreditAvailableAmount;
	}

	public void setCreditAvailableAmount(CurrencyAndAmount CreditAvailableAmount) {
		this.CreditAvailableAmount = CreditAvailableAmount;
	}

	public Limit getLimit() {
		return Limit;
	}

	public void setLimit(Limit Limit) {
		this.Limit = Limit;
	}

	public CurrencyCode getCardCurrencyCode() {
		return CardCurrencyCode;
	}

	public void setCardCurrencyCode(CurrencyCode CardCurrencyCode) {
		this.CardCurrencyCode = CardCurrencyCode;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public Country getCardCountryCode() {
		return CardCountryCode;
	}

	public void setCardCountryCode(Country CardCountryCode) {
		this.CardCountryCode = CardCountryCode;
	}

	public Max35Text getCardProgramme() {
		return CardProgramme;
	}

	public void setCardProgramme(Max35Text CardProgramme) {
		this.CardProgramme = CardProgramme;
	}
}