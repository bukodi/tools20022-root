package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.repository.dict.msg.MessageReference;

/**
 * Scope The WithdrawalNotification message is sent by a central system to
 * notify the withdrawal of a trade which was previously notified to the
 * receiver as an alleged trade. Usage The message is used to confirm the
 * cancellation of a previously notified trade.
 */
public class WithdrawalNotificationV01 {

	private MessageReference MatchingSystemUniqueReference;

	public MessageReference getMatchingSystemUniqueReference() {
		return MatchingSystemUniqueReference;
	}

	public void setMatchingSystemUniqueReference(
			MessageReference MatchingSystemUniqueReference) {
		this.MatchingSystemUniqueReference = MatchingSystemUniqueReference;
	}
}