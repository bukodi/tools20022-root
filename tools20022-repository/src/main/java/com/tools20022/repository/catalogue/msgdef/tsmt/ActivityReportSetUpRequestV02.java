package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.UTCOffset1;

/**
 * Scope The ActivityReportSetUpRequest message is sent by any party involved in
 * a transaction to the matching application. The ActivityReportSetUpRequest
 * message can be sent to request the reset of the pre-determined time at which
 * the daily production of the activity report should take place. Usage This
 * message is sent to the matching application by a bank, in order to set the
 * UTC offset specifying the hour when the matching application will generate
 * every day an activity report covering the last 24 hours and send it. By
 * default, this offset is equal to 0.
 */
public class ActivityReportSetUpRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RequestIdentification;
	private UTCOffset1 UTCOffset;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
	}

	public UTCOffset1 getUTCOffset() {
		return UTCOffset;
	}

	public void setUTCOffset(UTCOffset1 UTCOffset) {
		this.UTCOffset = UTCOffset;
	}
}