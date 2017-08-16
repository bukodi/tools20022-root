package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerDebitCreditNotificationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader23;
import com.tools20022.repository.dict.msg.AccountNotification1;

/**
 * Scope The Bank-to-Customer Debit/Credit Notification message is sent by the
 * account servicer to an account owner or to a party authorised by the account
 * owner to receive the message. It can be used to inform the account owner, or
 * authorised party, of single or multiple debit and/or credit entries reported
 * to the account. Usage The Bank-to-Customer Debit/Credit Notification message
 * can contain reports for more than 1 account. It provides information for cash
 * management and/or reconciliation. It can be used to : - report pending and
 * booked items; - notify one or more debit entries; - notify one or more credit
 * entries; - notify a combination of debit and credit entries It can include
 * underlying details of transactions that have been included in the entry. It
 * is possible that the receiver of the message is not the account owner, but a
 * party entitled by the account owner to receive the account information (also
 * known as recipient). It does not contain balance information.
 */
@NextVersion(BankToCustomerDebitCreditNotificationV02.class)
public class BankToCustomerDebitCreditNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader23 GroupHeader;
	private AccountNotification1 Notification;

	public GroupHeader23 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader23 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification1 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification1 Notification) {
		this.Notification = Notification;
	}
}