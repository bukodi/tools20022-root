package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageReference;
import com.tools20022.repository.dict.msg.RejectionReason2;

/**
 * Scope The MessageReject message is sent by a central system to notify the
 * rejection of a previously received message. Usage The message provides
 * specific information about the rejection reason.
 */
public class MessageRejectV01 implements GeneratedRepoBean<MMMessageDefinition> {

	private MessageReference RelatedReference;
	private RejectionReason2 Reason;

	public MessageReference getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(MessageReference RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public RejectionReason2 getReason() {
		return Reason;
	}

	public void setReason(RejectionReason2 Reason) {
		this.Reason = Reason;
	}
}