package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ExternalBankTransactionDomainCode;
import com.tools20022.repository.dict.codeset.ExternalBankTransactionFamilyCode;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.BankOperation;
import com.tools20022.repository.dict.entity.Entry;
import com.tools20022.repository.dict.entity.PaymentProcessing;

/**
 * Code of the underlying bank transaction.
 */
public class BankTransaction {

	private ExternalBankTransactionDomainCode Domain;
	private ExternalBankTransactionFamilyCode Family;
	private ExternalBankTransactionFamilyCode SubFamily;
	private GenericIdentification ProprietaryIdentification;
	private BankOperation BankOperation;
	private Entry RelatedEntry;
	private PaymentProcessing RelatedPayment;

	public ExternalBankTransactionDomainCode getDomain() {
		return Domain;
	}

	public void setDomain(ExternalBankTransactionDomainCode Domain) {
		this.Domain = Domain;
	}

	public ExternalBankTransactionFamilyCode getFamily() {
		return Family;
	}

	public void setFamily(ExternalBankTransactionFamilyCode Family) {
		this.Family = Family;
	}

	public ExternalBankTransactionFamilyCode getSubFamily() {
		return SubFamily;
	}

	public void setSubFamily(ExternalBankTransactionFamilyCode SubFamily) {
		this.SubFamily = SubFamily;
	}

	public GenericIdentification getProprietaryIdentification() {
		return ProprietaryIdentification;
	}

	public void setProprietaryIdentification(
			GenericIdentification ProprietaryIdentification) {
		this.ProprietaryIdentification = ProprietaryIdentification;
	}

	public BankOperation getBankOperation() {
		return BankOperation;
	}

	public void setBankOperation(BankOperation BankOperation) {
		this.BankOperation = BankOperation;
	}

	public Entry getRelatedEntry() {
		return RelatedEntry;
	}

	public void setRelatedEntry(Entry RelatedEntry) {
		this.RelatedEntry = RelatedEntry;
	}

	public PaymentProcessing getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(PaymentProcessing RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}
}