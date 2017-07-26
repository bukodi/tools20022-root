package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Contract;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Mandate;
import com.tools20022.repository.dict.codeset.TransactionChannelCode;

/**
 * Agreement between an account servicer and an account owner about the services
 * linked to an account.
 */
public class AccountContract extends Contract {

	private ISODateTime TargetClosingDate;
	private TrueFalseIndicator UrgencyFlag;
	private YesNoIndicator RemovalIndicator;
	private ISODateTime TargetGoLiveDate;
	private AccountService AccountService;
	private Account Account;
	private Interest Interest;
	private ISODateTime RequestDate;
	private Mandate AccountAuthorisation;
	private TransactionChannelCode TransactionChannel;

	public ISODateTime getTargetClosingDate() {
		return TargetClosingDate;
	}

	public void setTargetClosingDate(ISODateTime TargetClosingDate) {
		this.TargetClosingDate = TargetClosingDate;
	}

	public TrueFalseIndicator getUrgencyFlag() {
		return UrgencyFlag;
	}

	public void setUrgencyFlag(TrueFalseIndicator UrgencyFlag) {
		this.UrgencyFlag = UrgencyFlag;
	}

	public YesNoIndicator getRemovalIndicator() {
		return RemovalIndicator;
	}

	public void setRemovalIndicator(YesNoIndicator RemovalIndicator) {
		this.RemovalIndicator = RemovalIndicator;
	}

	public ISODateTime getTargetGoLiveDate() {
		return TargetGoLiveDate;
	}

	public void setTargetGoLiveDate(ISODateTime TargetGoLiveDate) {
		this.TargetGoLiveDate = TargetGoLiveDate;
	}

	public AccountService getAccountService() {
		return AccountService;
	}

	public void setAccountService(AccountService AccountService) {
		this.AccountService = AccountService;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public ISODateTime getRequestDate() {
		return RequestDate;
	}

	public void setRequestDate(ISODateTime RequestDate) {
		this.RequestDate = RequestDate;
	}

	public Mandate getAccountAuthorisation() {
		return AccountAuthorisation;
	}

	public void setAccountAuthorisation(Mandate AccountAuthorisation) {
		this.AccountAuthorisation = AccountAuthorisation;
	}

	public TransactionChannelCode getTransactionChannel() {
		return TransactionChannel;
	}

	public void setTransactionChannel(TransactionChannelCode TransactionChannel) {
		this.TransactionChannel = TransactionChannel;
	}
}