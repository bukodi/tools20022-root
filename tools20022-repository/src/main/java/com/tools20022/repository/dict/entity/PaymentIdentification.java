package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradeIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Payment;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 */
public class PaymentIdentification extends TradeIdentification
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text ExecutionIdentification;
	private Max35Text EndToEndIdentification;
	private Max35Text InstructionIdentification;
	private Max35Text TransactionIdentification;
	private Max35Text ClearingSystemReference;
	private Max35Text CreditorReference;
	private Payment Payment;

	public Max35Text getExecutionIdentification() {
		return ExecutionIdentification;
	}

	public void setExecutionIdentification(Max35Text ExecutionIdentification) {
		this.ExecutionIdentification = ExecutionIdentification;
	}

	public Max35Text getEndToEndIdentification() {
		return EndToEndIdentification;
	}

	public void setEndToEndIdentification(Max35Text EndToEndIdentification) {
		this.EndToEndIdentification = EndToEndIdentification;
	}

	public Max35Text getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(Max35Text InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Max35Text getClearingSystemReference() {
		return ClearingSystemReference;
	}

	public void setClearingSystemReference(Max35Text ClearingSystemReference) {
		this.ClearingSystemReference = ClearingSystemReference;
	}

	public Max35Text getCreditorReference() {
		return CreditorReference;
	}

	public void setCreditorReference(Max35Text CreditorReference) {
		this.CreditorReference = CreditorReference;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}
}