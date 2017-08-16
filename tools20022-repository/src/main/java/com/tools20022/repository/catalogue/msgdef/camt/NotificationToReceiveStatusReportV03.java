package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader60;
import com.tools20022.repository.dict.msg.OriginalNotification5;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
@PreviousVersion(NotificationToReceiveStatusReportV02.class)
@NextVersion(NotificationToReceiveStatusReportV04.class)
public class NotificationToReceiveStatusReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader60 GroupHeader;
	private OriginalNotification5 OriginalNotificationAndStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader60 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader60 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalNotification5 getOriginalNotificationAndStatus() {
		return OriginalNotificationAndStatus;
	}

	public void setOriginalNotificationAndStatus(
			OriginalNotification5 OriginalNotificationAndStatus) {
		this.OriginalNotificationAndStatus = OriginalNotificationAndStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}