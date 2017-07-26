package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.InstructionCode;
import com.tools20022.repository.dict.entity.CashSettlement;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.StandingOrder;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 */
public class PaymentInstruction extends PaymentExecution {

	private DateTimePeriod ProcessingValidityTime;
	private InstructionCode InstructionForNextAgent;
	private CashSettlement SettlementInstruction;
	private CurrencyAndAmount ClearingChargeAmount;
	private StandingOrder StandingOrder;
	private PaymentExecution Previous;

	public DateTimePeriod getProcessingValidityTime() {
		return ProcessingValidityTime;
	}

	public void setProcessingValidityTime(DateTimePeriod ProcessingValidityTime) {
		this.ProcessingValidityTime = ProcessingValidityTime;
	}

	public InstructionCode getInstructionForNextAgent() {
		return InstructionForNextAgent;
	}

	public void setInstructionForNextAgent(
			InstructionCode InstructionForNextAgent) {
		this.InstructionForNextAgent = InstructionForNextAgent;
	}

	public CashSettlement getSettlementInstruction() {
		return SettlementInstruction;
	}

	public void setSettlementInstruction(CashSettlement SettlementInstruction) {
		this.SettlementInstruction = SettlementInstruction;
	}

	public CurrencyAndAmount getClearingChargeAmount() {
		return ClearingChargeAmount;
	}

	public void setClearingChargeAmount(CurrencyAndAmount ClearingChargeAmount) {
		this.ClearingChargeAmount = ClearingChargeAmount;
	}

	public StandingOrder getStandingOrder() {
		return StandingOrder;
	}

	public void setStandingOrder(StandingOrder StandingOrder) {
		this.StandingOrder = StandingOrder;
	}

	public PaymentExecution getPrevious() {
		return Previous;
	}

	public void setPrevious(PaymentExecution Previous) {
		this.Previous = Previous;
	}
}