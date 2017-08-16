package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.StandingOrderTypeCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.PaymentInstruction;
import com.tools20022.repository.dict.entity.StandingOrder;

/**
 * Instruction given by an account holder to an account servicer to make regular
 * transfers on given dates to the same beneficiary.
 */
public class StandingOrder extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text Identification;
	private StandingOrderTypeCode Type;
	private DateTimePeriod ValidityPeriod;
	private Max35Text LinkSetIdentification;
	private Number StandingOrderSequence;
	private CurrencyAndAmount Amount;
	private CashAccount CreditAccount;
	private CashAccount DebitAccount;
	private FrequencyCode Frequency;
	private Max140Text EventDescription;
	private Number Day;
	private Max35Text TimeSpecification;
	private PaymentInstruction PaymentInstructionTrigger;
	private StandingOrder IncludedStandingOrder;
	private StandingOrder LinkSet;

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public StandingOrderTypeCode getType() {
		return Type;
	}

	public void setType(StandingOrderTypeCode Type) {
		this.Type = Type;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public Max35Text getLinkSetIdentification() {
		return LinkSetIdentification;
	}

	public void setLinkSetIdentification(Max35Text LinkSetIdentification) {
		this.LinkSetIdentification = LinkSetIdentification;
	}

	public Number getStandingOrderSequence() {
		return StandingOrderSequence;
	}

	public void setStandingOrderSequence(Number StandingOrderSequence) {
		this.StandingOrderSequence = StandingOrderSequence;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public CashAccount getCreditAccount() {
		return CreditAccount;
	}

	public void setCreditAccount(CashAccount CreditAccount) {
		this.CreditAccount = CreditAccount;
	}

	public CashAccount getDebitAccount() {
		return DebitAccount;
	}

	public void setDebitAccount(CashAccount DebitAccount) {
		this.DebitAccount = DebitAccount;
	}

	public FrequencyCode getFrequency() {
		return Frequency;
	}

	public void setFrequency(FrequencyCode Frequency) {
		this.Frequency = Frequency;
	}

	public Max140Text getEventDescription() {
		return EventDescription;
	}

	public void setEventDescription(Max140Text EventDescription) {
		this.EventDescription = EventDescription;
	}

	public Number getDay() {
		return Day;
	}

	public void setDay(Number Day) {
		this.Day = Day;
	}

	public Max35Text getTimeSpecification() {
		return TimeSpecification;
	}

	public void setTimeSpecification(Max35Text TimeSpecification) {
		this.TimeSpecification = TimeSpecification;
	}

	public PaymentInstruction getPaymentInstructionTrigger() {
		return PaymentInstructionTrigger;
	}

	public void setPaymentInstructionTrigger(
			PaymentInstruction PaymentInstructionTrigger) {
		this.PaymentInstructionTrigger = PaymentInstructionTrigger;
	}

	public StandingOrder getIncludedStandingOrder() {
		return IncludedStandingOrder;
	}

	public void setIncludedStandingOrder(StandingOrder IncludedStandingOrder) {
		this.IncludedStandingOrder = IncludedStandingOrder;
	}

	public StandingOrder getLinkSet() {
		return LinkSet;
	}

	public void setLinkSet(StandingOrder LinkSet) {
		this.LinkSet = LinkSet;
	}
}