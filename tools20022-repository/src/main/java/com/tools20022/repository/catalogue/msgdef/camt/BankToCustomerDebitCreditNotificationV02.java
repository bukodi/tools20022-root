package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerDebitCreditNotificationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerDebitCreditNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader42;
import com.tools20022.repository.dict.msg.AccountNotification2;

/**
 * Scope The BankToCustomerDebitCreditNotification message is sent by the
 * account servicer to an account owner or to a party authorised by the account
 * owner to receive the message. It can be used to inform the account owner, or
 * authorised party, of single or multiple debit and/or credit entries reported
 * to the account. Usage The BankToCustomerDebitCreditNotification message can
 * contain reports for more than one account. It provides information for cash
 * management and/or reconciliation. It can be used to : - report pending and
 * booked items; - notify one or more debit entries; - notify one or more credit
 * entries; - notify a combination of debit and credit entries. It can include
 * underlying details of transactions that have been included in the entry. It
 * is possible that the receiver of the message is not the account owner, but a
 * party entitled by the account owner to receive the account information (also
 * known as recipient). It does not contain balance information.
 */
@PreviousVersion(BankToCustomerDebitCreditNotificationV01.class)
@NextVersion(BankToCustomerDebitCreditNotificationV03.class)
public class BankToCustomerDebitCreditNotificationV02 {

	private GroupHeader42 GroupHeader;
	private AccountNotification2 Notification;

	public GroupHeader42 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader42 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification2 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification2 Notification) {
		this.Notification = Notification;
	}
}