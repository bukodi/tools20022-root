package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.NotificationToReceiveCancellationAdviceV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader59;
import com.tools20022.repository.dict.msg.OriginalNotification10;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
@PreviousVersion(NotificationToReceiveCancellationAdviceV04.class)
public class NotificationToReceiveCancellationAdviceV05 {

	private GroupHeader59 GroupHeader;
	private OriginalNotification10 OriginalNotification;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader59 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader59 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalNotification10 getOriginalNotification() {
		return OriginalNotification;
	}

	public void setOriginalNotification(
			OriginalNotification10 OriginalNotification) {
		this.OriginalNotification = OriginalNotification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}