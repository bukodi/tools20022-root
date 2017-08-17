package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerDebitCreditNotificationV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader58;
import com.tools20022.repository.dict.msg.AccountNotification12;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The BankToCustomerDebitCreditNotification message is sent by the
 * account servicer to an account owner or to a party authorised by the account
 * owner to receive the message. It can be used to inform the account owner, or
 * authorised party, of single or multiple debit and/or credit entries reported
 * to the account. Usage The BankToCustomerDebitCreditNotification message can
 * contain reports for more than one account. It provides information for cash
 * management and/or reconciliation. The BankToCustomerDebitCreditNotification
 * message can be used to : - report pending and booked items; - notify one or
 * more debit entries; - notify one or more credit entries; - notify a
 * combination of debit and credit entries. It can include underlying details of
 * transactions that have been included in the entry. It is possible that the
 * receiver of the message is not the account owner, but a party entitled by the
 * account owner to receive the account information (also known as recipient).
 * It does not contain balance information.
 */
@PreviousVersion(BankToCustomerDebitCreditNotificationV05.class)
public class BankToCustomerDebitCreditNotificationV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader58 GroupHeader;
	private AccountNotification12 Notification;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader58 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader58 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification12 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification12 Notification) {
		this.Notification = Notification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}