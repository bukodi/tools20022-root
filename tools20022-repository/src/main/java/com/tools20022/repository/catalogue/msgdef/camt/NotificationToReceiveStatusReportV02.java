package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader44;
import com.tools20022.repository.dict.msg.OriginalNotification3;

/**
 * Scope The NotificationToReceiveStatusReport message is sent by an account
 * servicing institution to an account owner or to a party acting on the account
 * owner's behalf. It is used to notify the account owner about the status of
 * one or more expected payments that were advised in a previous
 * NotificationToReceive message. Usage The NotificationToReceiveStatusReport
 * message is sent in response to a NotificationToReceive message and can be
 * used in either a direct or a relay scenario. It is used to advise the account
 * owner of receipt of the funds as expected. It is also used to notify the
 * account owner of non-receipt of funds or of discrepancies in the funds
 * received.
 */
@NextVersion(NotificationToReceiveStatusReportV03.class)
public class NotificationToReceiveStatusReportV02 {

	private GroupHeader44 GroupHeader;
	private OriginalNotification3 OriginalNotificationAndStatus;

	public GroupHeader44 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader44 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalNotification3 getOriginalNotificationAndStatus() {
		return OriginalNotificationAndStatus;
	}

	public void setOriginalNotificationAndStatus(
			OriginalNotification3 OriginalNotificationAndStatus) {
		this.OriginalNotificationAndStatus = OriginalNotificationAndStatus;
	}
}