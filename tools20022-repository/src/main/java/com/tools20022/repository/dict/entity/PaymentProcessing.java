package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.entity.ServiceLevel;
import com.tools20022.repository.dict.codeset.ClearingChannelCode;
import com.tools20022.repository.dict.codeset.ExternalCode;
import com.tools20022.repository.dict.codeset.PaymentCategoryPurposeCode;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.codeset.SequenceTypeCode;
import com.tools20022.repository.dict.entity.DirectDebitMandate;
import com.tools20022.repository.dict.entity.BankTransaction;
import com.tools20022.repository.dict.entity.ContactPoint;

/**
 * Specifies how a payment must be processed, for instance through which
 * specific clearing channel.
 */
public class PaymentProcessing {

	private PriorityCode Priority;
	private ServiceLevel ServiceLevel;
	private ClearingChannelCode ClearingChannel;
	private ExternalCode LocalInstrument;
	private PaymentCategoryPurposeCode CategoryPurpose;
	private PaymentExecution PaymentExecution;
	private SequenceTypeCode SequenceType;
	private DirectDebitMandate RelatedMandate;
	private BankTransaction BankTransaction;
	private ContactPoint ContactPoint;

	public PriorityCode getPriority() {
		return Priority;
	}

	public void setPriority(PriorityCode Priority) {
		this.Priority = Priority;
	}

	public ServiceLevel getServiceLevel() {
		return ServiceLevel;
	}

	public void setServiceLevel(ServiceLevel ServiceLevel) {
		this.ServiceLevel = ServiceLevel;
	}

	public ClearingChannelCode getClearingChannel() {
		return ClearingChannel;
	}

	public void setClearingChannel(ClearingChannelCode ClearingChannel) {
		this.ClearingChannel = ClearingChannel;
	}

	public ExternalCode getLocalInstrument() {
		return LocalInstrument;
	}

	public void setLocalInstrument(ExternalCode LocalInstrument) {
		this.LocalInstrument = LocalInstrument;
	}

	public PaymentCategoryPurposeCode getCategoryPurpose() {
		return CategoryPurpose;
	}

	public void setCategoryPurpose(PaymentCategoryPurposeCode CategoryPurpose) {
		this.CategoryPurpose = CategoryPurpose;
	}

	public PaymentExecution getPaymentExecution() {
		return PaymentExecution;
	}

	public void setPaymentExecution(PaymentExecution PaymentExecution) {
		this.PaymentExecution = PaymentExecution;
	}

	public SequenceTypeCode getSequenceType() {
		return SequenceType;
	}

	public void setSequenceType(SequenceTypeCode SequenceType) {
		this.SequenceType = SequenceType;
	}

	public DirectDebitMandate getRelatedMandate() {
		return RelatedMandate;
	}

	public void setRelatedMandate(DirectDebitMandate RelatedMandate) {
		this.RelatedMandate = RelatedMandate;
	}

	public BankTransaction getBankTransaction() {
		return BankTransaction;
	}

	public void setBankTransaction(BankTransaction BankTransaction) {
		this.BankTransaction = BankTransaction;
	}

	public ContactPoint getContactPoint() {
		return ContactPoint;
	}

	public void setContactPoint(ContactPoint ContactPoint) {
		this.ContactPoint = ContactPoint;
	}
}