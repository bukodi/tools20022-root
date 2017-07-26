package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.entity.BankTransaction;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.codeset.EntryCode;

/**
 * Posting to an account that results in an increase or decrease to a balance.
 */
public class Entry {

	private DebitCreditCode CreditDebitIndicator;
	private ISODateTime EntryDate;
	private Max35Text Identification;
	private Max35Text AccountOwnerTransactionIdentification;
	private Max35Text AccountServicerTransactionIdentification;
	private TrueFalseIndicator ReversalIndicator;
	private ISODateTime ValueDate;
	private BankTransaction BankTransactionCode;
	private YesNoIndicator CommissionWaiverIndicator;
	private Role Role;
	private Account Account;
	private Balance Balance;
	private EntryCode EntryType;

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public ISODateTime getEntryDate() {
		return EntryDate;
	}

	public void setEntryDate(ISODateTime EntryDate) {
		this.EntryDate = EntryDate;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return AccountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(
			Max35Text AccountOwnerTransactionIdentification) {
		this.AccountOwnerTransactionIdentification = AccountOwnerTransactionIdentification;
	}

	public Max35Text getAccountServicerTransactionIdentification() {
		return AccountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(
			Max35Text AccountServicerTransactionIdentification) {
		this.AccountServicerTransactionIdentification = AccountServicerTransactionIdentification;
	}

	public TrueFalseIndicator getReversalIndicator() {
		return ReversalIndicator;
	}

	public void setReversalIndicator(TrueFalseIndicator ReversalIndicator) {
		this.ReversalIndicator = ReversalIndicator;
	}

	public ISODateTime getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODateTime ValueDate) {
		this.ValueDate = ValueDate;
	}

	public BankTransaction getBankTransactionCode() {
		return BankTransactionCode;
	}

	public void setBankTransactionCode(BankTransaction BankTransactionCode) {
		this.BankTransactionCode = BankTransactionCode;
	}

	public YesNoIndicator getCommissionWaiverIndicator() {
		return CommissionWaiverIndicator;
	}

	public void setCommissionWaiverIndicator(
			YesNoIndicator CommissionWaiverIndicator) {
		this.CommissionWaiverIndicator = CommissionWaiverIndicator;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role Role) {
		this.Role = Role;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Balance getBalance() {
		return Balance;
	}

	public void setBalance(Balance Balance) {
		this.Balance = Balance;
	}

	public EntryCode getEntryType() {
		return EntryType;
	}

	public void setEntryType(EntryCode EntryType) {
		this.EntryType = EntryType;
	}
}