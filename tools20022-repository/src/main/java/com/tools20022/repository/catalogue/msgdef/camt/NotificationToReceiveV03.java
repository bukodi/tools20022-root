package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader59;
import com.tools20022.repository.dict.msg.AccountNotification6;
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
@PreviousVersion(NotificationToReceiveV02.class)
@NextVersion(NotificationToReceiveV04.class)
public class NotificationToReceiveV03 {

	private GroupHeader59 GroupHeader;
	private AccountNotification6 Notification;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader59 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader59 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification6 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification6 Notification) {
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