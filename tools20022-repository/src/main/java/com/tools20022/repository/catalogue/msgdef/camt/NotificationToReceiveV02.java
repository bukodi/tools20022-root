package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader43;
import com.tools20022.repository.dict.msg.AccountNotification4;

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
@NextVersion(NotificationToReceiveV03.class)
public class NotificationToReceiveV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader43 GroupHeader;
	private AccountNotification4 Notification;

	public GroupHeader43 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader43 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountNotification4 getNotification() {
		return Notification;
	}

	public void setNotification(AccountNotification4 Notification) {
		this.Notification = Notification;
	}
}