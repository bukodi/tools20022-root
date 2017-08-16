package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.codeset.BalanceCounterpartyCode;
import com.tools20022.repository.dict.entity.SystemMemberRole;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CashAvailability;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.codeset.BalanceAdjustmentTypeCode;
import com.tools20022.repository.dict.entity.CardPaymentValidation;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time. A cash balance is calculated from a sum of cash
 * credits minus a sum of cash debits.
 */
public class CashBalance extends Balance
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccount CashAccount;
	private BalanceCounterpartyCode CalculationType;
	private SystemMemberRole Counterparty;
	private CurrencyAndAmount Amount;
	private CashAvailability Availability;
	private CashEntry CashBalanceEntry;
	private BalanceAdjustmentTypeCode BalanceAdjustmentCode;
	private CardPaymentValidation RelatedCardPaymentValidationProcess;
	private ISODate CutOffDate;
	private RegisteredContract RelatedRegisteredContract;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public BalanceCounterpartyCode getCalculationType() {
		return CalculationType;
	}

	public void setCalculationType(BalanceCounterpartyCode CalculationType) {
		this.CalculationType = CalculationType;
	}

	public SystemMemberRole getCounterparty() {
		return Counterparty;
	}

	public void setCounterparty(SystemMemberRole Counterparty) {
		this.Counterparty = Counterparty;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public CashAvailability getAvailability() {
		return Availability;
	}

	public void setAvailability(CashAvailability Availability) {
		this.Availability = Availability;
	}

	public CashEntry getCashBalanceEntry() {
		return CashBalanceEntry;
	}

	public void setCashBalanceEntry(CashEntry CashBalanceEntry) {
		this.CashBalanceEntry = CashBalanceEntry;
	}

	public BalanceAdjustmentTypeCode getBalanceAdjustmentCode() {
		return BalanceAdjustmentCode;
	}

	public void setBalanceAdjustmentCode(
			BalanceAdjustmentTypeCode BalanceAdjustmentCode) {
		this.BalanceAdjustmentCode = BalanceAdjustmentCode;
	}

	public CardPaymentValidation getRelatedCardPaymentValidationProcess() {
		return RelatedCardPaymentValidationProcess;
	}

	public void setRelatedCardPaymentValidationProcess(
			CardPaymentValidation RelatedCardPaymentValidationProcess) {
		this.RelatedCardPaymentValidationProcess = RelatedCardPaymentValidationProcess;
	}

	public ISODate getCutOffDate() {
		return CutOffDate;
	}

	public void setCutOffDate(ISODate CutOffDate) {
		this.CutOffDate = CutOffDate;
	}

	public RegisteredContract getRelatedRegisteredContract() {
		return RelatedRegisteredContract;
	}

	public void setRelatedRegisteredContract(
			RegisteredContract RelatedRegisteredContract) {
		this.RelatedRegisteredContract = RelatedRegisteredContract;
	}
}