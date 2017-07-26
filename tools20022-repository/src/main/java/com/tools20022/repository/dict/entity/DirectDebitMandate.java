package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.entity.DirectDebit;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.MandateClassificationCode;

/**
 * Authorisation in favour of the creditor given by the debtor to debit its own
 * account.
 */
public class DirectDebitMandate extends Mandate {

	private DirectDebit RelatedDirectDebit;
	private ISODate FinalCollectionDate;
	private FrequencyCode Frequency;
	private ISODate FirstCollectionDate;
	private PaymentProcessing MandatePaymentType;
	private CurrencyAndAmount CollectionAmount;
	private CurrencyAndAmount MaximumAmount;
	private TrueFalseIndicator PreNotification;
	private Number PreNotificationThreshold;
	private MandateClassificationCode Classification;
	private FrequencyCode PointInTime;

	public DirectDebit getRelatedDirectDebit() {
		return RelatedDirectDebit;
	}

	public void setRelatedDirectDebit(DirectDebit RelatedDirectDebit) {
		this.RelatedDirectDebit = RelatedDirectDebit;
	}

	public ISODate getFinalCollectionDate() {
		return FinalCollectionDate;
	}

	public void setFinalCollectionDate(ISODate FinalCollectionDate) {
		this.FinalCollectionDate = FinalCollectionDate;
	}

	public FrequencyCode getFrequency() {
		return Frequency;
	}

	public void setFrequency(FrequencyCode Frequency) {
		this.Frequency = Frequency;
	}

	public ISODate getFirstCollectionDate() {
		return FirstCollectionDate;
	}

	public void setFirstCollectionDate(ISODate FirstCollectionDate) {
		this.FirstCollectionDate = FirstCollectionDate;
	}

	public PaymentProcessing getMandatePaymentType() {
		return MandatePaymentType;
	}

	public void setMandatePaymentType(PaymentProcessing MandatePaymentType) {
		this.MandatePaymentType = MandatePaymentType;
	}

	public CurrencyAndAmount getCollectionAmount() {
		return CollectionAmount;
	}

	public void setCollectionAmount(CurrencyAndAmount CollectionAmount) {
		this.CollectionAmount = CollectionAmount;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return MaximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount MaximumAmount) {
		this.MaximumAmount = MaximumAmount;
	}

	public TrueFalseIndicator getPreNotification() {
		return PreNotification;
	}

	public void setPreNotification(TrueFalseIndicator PreNotification) {
		this.PreNotification = PreNotification;
	}

	public Number getPreNotificationThreshold() {
		return PreNotificationThreshold;
	}

	public void setPreNotificationThreshold(Number PreNotificationThreshold) {
		this.PreNotificationThreshold = PreNotificationThreshold;
	}

	public MandateClassificationCode getClassification() {
		return Classification;
	}

	public void setClassification(MandateClassificationCode Classification) {
		this.Classification = Classification;
	}

	public FrequencyCode getPointInTime() {
		return PointInTime;
	}

	public void setPointInTime(FrequencyCode PointInTime) {
		this.PointInTime = PointInTime;
	}
}