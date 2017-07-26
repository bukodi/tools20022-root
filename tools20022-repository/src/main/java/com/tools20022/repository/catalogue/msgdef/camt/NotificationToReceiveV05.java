package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader59;
import com.tools20022.repository.dict.msg.AccountNotification13;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The NotificationToReceive message is sent by an account owner or by a
 * party acting on the account owner's behalf to one of the account owner's
 * account servicing institutions. It is an advance notice that the account
 * servicing institution will receive funds to be credited to the account of the
 * account owner. Usage The NotificationToReceive message is used to advise the
 * account servicing institution of funds that the account owner expects to have
 * credited to its account. The message can be used in either a direct or a
 * relay scenario.
 */
@PreviousVersion(NotificationToReceiveV04.class)
public class NotificationToReceiveV05 {

	private GroupHeader59 GroupHeader;
	private AccountNotification13 Notification;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader59 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader59 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification13 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification13 Notification) {
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