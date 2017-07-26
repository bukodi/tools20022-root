package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageRejection;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageRejectionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import com.tools20022.repository.dict.msg.RejectionReason3;

/**
 * Scope An account servicer, for example, a registrar, transfer agent or
 * custodian bank, sends the SecuritiesMessageRejection message to the account
 * owner, for example, an investor or its authorised agent, to reject a
 * previously received message on which action cannot be taken. The message may
 * also be sent by an executing party, for example, transfer agent to the
 * instructing party, for example, investment manager or its authorised
 * representative to reject a previously received message on which action cannot
 * be taken. Usage The SecuritiesMessageRejection message is used for the
 * following reasons: - the executing party does not recognise the linked
 * reference, so the executing party cannot process the message - the
 * instructing party should not have sent the message. Reasons that a receiver
 * does not expect a message include no SLA in place between the Sender and the
 * Receiver. The SecuritiesMessageRejection message must not be used to reject
 * an instruction message that cannot be processed for business reasons, for
 * example, if information is missing in an instruction message or because
 * securities are not available for settlement.
 */
@PreviousVersion(SecuritiesMessageRejection.class)
@NextVersion(SecuritiesMessageRejectionV03.class)
public class SecuritiesMessageRejectionV02 {

	private MessageIdentification1 MessageIdentification;
	private AdditionalReference3 RelatedReference;
	private RejectionReason3 Reason;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public AdditionalReference3 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference3 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public RejectionReason3 getReason() {
		return Reason;
	}

	public void setReason(RejectionReason3 Reason) {
		this.Reason = Reason;
	}
}