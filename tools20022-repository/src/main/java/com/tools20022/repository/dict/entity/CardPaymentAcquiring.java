package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.PointOfInteraction;
import com.tools20022.repository.dict.codeset.CardPaymentServiceTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max10000Binary;
import com.tools20022.repository.dict.entity.CardPayment;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.codeset.AttendanceContextCode;
import com.tools20022.repository.dict.codeset.TransactionEnvironmentCode;
import com.tools20022.repository.dict.codeset.TransactionChannelCode;
import com.tools20022.repository.dict.codeset.ISO2ALanguageCode;
import com.tools20022.repository.dict.codeset.CardDataReadingCode;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;
import com.tools20022.repository.dict.datatype.Max35NumericText;
import com.tools20022.repository.dict.entity.CardPaymentValidation;
import com.tools20022.repository.dict.codeset.ActionTypeCode;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.codeset.LocationCategoryCode;
import com.tools20022.repository.dict.entity.Country;

/**
 * Payment processes initiated by a payment card.
 */
public class CardPaymentAcquiring extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PointOfInteraction PointOfInteraction;
	private CardPaymentServiceTypeCode CardPaymentService;
	private Max35Text TransactionIdentification;
	private ISODateTime TransactionDateTime;
	private Max10000Binary ICCRelatedData;
	private CardPayment RelatedCardPayment;
	private TrueFalseIndicator CardPresent;
	private TrueFalseIndicator CardholderPresent;
	private TrueFalseIndicator OnLineContext;
	private AttendanceContextCode AttendanceContext;
	private TransactionEnvironmentCode TransactionEnvironment;
	private TransactionChannelCode TransactionChannel;
	private TrueFalseIndicator AttendantMessageCapable;
	private ISO2ALanguageCode AttendantLanguage;
	private CardDataReadingCode CardDataEntryMode;
	private TrueFalseIndicator FallbackIndicator;
	private TerminalManagementSystem TMSTrigger;
	private Max35Text InitiatorTransactionIdentifier;
	private TrueFalseIndicator Reversal;
	private Max35Text InterchangeData;
	private Max35NumericText UnattendedLevelCategory;
	private CardPaymentValidation Validation;
	private TrueFalseIndicator CompletionRequired;
	private ActionTypeCode ActionType;
	private Max256Text ActionMessage;
	private TrueFalseIndicator CaptureIndicator;
	private Max35Text RecipientTransactionIdentification;
	private LocationCategoryCode Location;
	private Country Country;

	public PointOfInteraction getPointOfInteraction() {
		return PointOfInteraction;
	}

	public void setPointOfInteraction(PointOfInteraction PointOfInteraction) {
		this.PointOfInteraction = PointOfInteraction;
	}

	public CardPaymentServiceTypeCode getCardPaymentService() {
		return CardPaymentService;
	}

	public void setCardPaymentService(
			CardPaymentServiceTypeCode CardPaymentService) {
		this.CardPaymentService = CardPaymentService;
	}

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ISODateTime getTransactionDateTime() {
		return TransactionDateTime;
	}

	public void setTransactionDateTime(ISODateTime TransactionDateTime) {
		this.TransactionDateTime = TransactionDateTime;
	}

	public Max10000Binary getICCRelatedData() {
		return ICCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary ICCRelatedData) {
		this.ICCRelatedData = ICCRelatedData;
	}

	public CardPayment getRelatedCardPayment() {
		return RelatedCardPayment;
	}

	public void setRelatedCardPayment(CardPayment RelatedCardPayment) {
		this.RelatedCardPayment = RelatedCardPayment;
	}

	public TrueFalseIndicator getCardPresent() {
		return CardPresent;
	}

	public void setCardPresent(TrueFalseIndicator CardPresent) {
		this.CardPresent = CardPresent;
	}

	public TrueFalseIndicator getCardholderPresent() {
		return CardholderPresent;
	}

	public void setCardholderPresent(TrueFalseIndicator CardholderPresent) {
		this.CardholderPresent = CardholderPresent;
	}

	public TrueFalseIndicator getOnLineContext() {
		return OnLineContext;
	}

	public void setOnLineContext(TrueFalseIndicator OnLineContext) {
		this.OnLineContext = OnLineContext;
	}

	public AttendanceContextCode getAttendanceContext() {
		return AttendanceContext;
	}

	public void setAttendanceContext(AttendanceContextCode AttendanceContext) {
		this.AttendanceContext = AttendanceContext;
	}

	public TransactionEnvironmentCode getTransactionEnvironment() {
		return TransactionEnvironment;
	}

	public void setTransactionEnvironment(
			TransactionEnvironmentCode TransactionEnvironment) {
		this.TransactionEnvironment = TransactionEnvironment;
	}

	public TransactionChannelCode getTransactionChannel() {
		return TransactionChannel;
	}

	public void setTransactionChannel(TransactionChannelCode TransactionChannel) {
		this.TransactionChannel = TransactionChannel;
	}

	public TrueFalseIndicator getAttendantMessageCapable() {
		return AttendantMessageCapable;
	}

	public void setAttendantMessageCapable(
			TrueFalseIndicator AttendantMessageCapable) {
		this.AttendantMessageCapable = AttendantMessageCapable;
	}

	public ISO2ALanguageCode getAttendantLanguage() {
		return AttendantLanguage;
	}

	public void setAttendantLanguage(ISO2ALanguageCode AttendantLanguage) {
		this.AttendantLanguage = AttendantLanguage;
	}

	public CardDataReadingCode getCardDataEntryMode() {
		return CardDataEntryMode;
	}

	public void setCardDataEntryMode(CardDataReadingCode CardDataEntryMode) {
		this.CardDataEntryMode = CardDataEntryMode;
	}

	public TrueFalseIndicator getFallbackIndicator() {
		return FallbackIndicator;
	}

	public void setFallbackIndicator(TrueFalseIndicator FallbackIndicator) {
		this.FallbackIndicator = FallbackIndicator;
	}

	public TerminalManagementSystem getTMSTrigger() {
		return TMSTrigger;
	}

	public void setTMSTrigger(TerminalManagementSystem TMSTrigger) {
		this.TMSTrigger = TMSTrigger;
	}

	public Max35Text getInitiatorTransactionIdentifier() {
		return InitiatorTransactionIdentifier;
	}

	public void setInitiatorTransactionIdentifier(
			Max35Text InitiatorTransactionIdentifier) {
		this.InitiatorTransactionIdentifier = InitiatorTransactionIdentifier;
	}

	public TrueFalseIndicator getReversal() {
		return Reversal;
	}

	public void setReversal(TrueFalseIndicator Reversal) {
		this.Reversal = Reversal;
	}

	public Max35Text getInterchangeData() {
		return InterchangeData;
	}

	public void setInterchangeData(Max35Text InterchangeData) {
		this.InterchangeData = InterchangeData;
	}

	public Max35NumericText getUnattendedLevelCategory() {
		return UnattendedLevelCategory;
	}

	public void setUnattendedLevelCategory(
			Max35NumericText UnattendedLevelCategory) {
		this.UnattendedLevelCategory = UnattendedLevelCategory;
	}

	public CardPaymentValidation getValidation() {
		return Validation;
	}

	public void setValidation(CardPaymentValidation Validation) {
		this.Validation = Validation;
	}

	public TrueFalseIndicator getCompletionRequired() {
		return CompletionRequired;
	}

	public void setCompletionRequired(TrueFalseIndicator CompletionRequired) {
		this.CompletionRequired = CompletionRequired;
	}

	public ActionTypeCode getActionType() {
		return ActionType;
	}

	public void setActionType(ActionTypeCode ActionType) {
		this.ActionType = ActionType;
	}

	public Max256Text getActionMessage() {
		return ActionMessage;
	}

	public void setActionMessage(Max256Text ActionMessage) {
		this.ActionMessage = ActionMessage;
	}

	public TrueFalseIndicator getCaptureIndicator() {
		return CaptureIndicator;
	}

	public void setCaptureIndicator(TrueFalseIndicator CaptureIndicator) {
		this.CaptureIndicator = CaptureIndicator;
	}

	public Max35Text getRecipientTransactionIdentification() {
		return RecipientTransactionIdentification;
	}

	public void setRecipientTransactionIdentification(
			Max35Text RecipientTransactionIdentification) {
		this.RecipientTransactionIdentification = RecipientTransactionIdentification;
	}

	public LocationCategoryCode getLocation() {
		return Location;
	}

	public void setLocation(LocationCategoryCode Location) {
		this.Location = Location;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}
}