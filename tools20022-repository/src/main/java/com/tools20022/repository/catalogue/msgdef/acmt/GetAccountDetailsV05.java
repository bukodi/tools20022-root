package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.choice.AccountSelection2Choice;
import com.tools20022.repository.dict.msg.InvestmentAccountInformationType1;

/**
 * Scope The GetAccountDetails message is sent by an account owner, for example,
 * an investor or its designated agent to the account servicer, for example, a
 * registrar, transfer agent, custodian bank or securities depository to query
 * the details of an existing account. Usage The GetAccountDetails message is
 * used to query all or some of the account details for a given account held
 * with an account servicer. The message is used prior to an
 * AccountModificationInstruction in order to validate account information
 * before requesting a modification. The GetAccountDetails message may also be
 * used to collect account information for general account reconciliation
 * purposes. The response to a GetAccountDetails message is via an
 * AccountDetailsConfirmation message.
 */
public class GetAccountDetailsV05 {

	private MessageIdentification1 MessageIdentification;
	private AccountSelection2Choice InvestmentAccountSelection;
	private InvestmentAccountInformationType1 SelectedInformationType;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public AccountSelection2Choice getInvestmentAccountSelection() {
		return InvestmentAccountSelection;
	}

	public void setInvestmentAccountSelection(
			AccountSelection2Choice InvestmentAccountSelection) {
		this.InvestmentAccountSelection = InvestmentAccountSelection;
	}

	public InvestmentAccountInformationType1 getSelectedInformationType() {
		return SelectedInformationType;
	}

	public void setSelectedInformationType(
			InvestmentAccountInformationType1 SelectedInformationType) {
		this.SelectedInformationType = SelectedInformationType;
	}
}