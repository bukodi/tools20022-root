package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveCancellationAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader43;
import com.tools20022.repository.dict.msg.OriginalNotification4;

/**
 * Scope The NotificationToReceiveCancellationAdvice message is sent by an
 * account owner or by a party acting on the account owner's behalf to one of
 * the account owner's account servicing institutions. It is used to advise the
 * account servicing institution about the cancellation of one or more
 * notifications in a previous NotificationToReceive message. Usage The
 * NotificationToReceiveCancellationAdvice message is used to advise the account
 * servicing institution that the funds are no longer expected. The message can
 * be used in either a direct or a relay scenario.
 */
@NextVersion(NotificationToReceiveCancellationAdviceV03.class)
public class NotificationToReceiveCancellationAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader43 GroupHeader;
	private OriginalNotification4 OriginalNotification;

	public GroupHeader43 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader43 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalNotification4 getOriginalNotification() {
		return OriginalNotification;
	}

	public void setOriginalNotification(
			OriginalNotification4 OriginalNotification) {
		this.OriginalNotification = OriginalNotification;
	}
}