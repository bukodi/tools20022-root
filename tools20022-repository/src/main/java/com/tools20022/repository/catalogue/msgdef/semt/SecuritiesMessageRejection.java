package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.catalogue.msgdef.semt.SecuritiesMessageRejectionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import com.tools20022.repository.dict.msg.RejectionReason1;

/**
 * Scope The SecuritiesMessageRejection message is sent by an executing party to
 * the instructing party. Typically, this message is sent by an account servicer
 * to the account owner. This message is used to reject a previously received
 * message on which action cannot be taken. Usage The SecuritiesMessageRejection
 * message can be sent for the following reasons: - the executing party does not
 * recognise the linked reference, so the executing party cannot process the
 * message - the instructing party should not have sent the message. This could
 * be because the Receiver does not expect the message, eg, there is no SLA in
 * place between the Sender and the Receiver. The SecuritiesMessageRejection
 * message must not be used to reject an instruction message that cannot be
 * processed for business reasons, eg, if information is missing in an
 * instruction message or because securities are not available for settlement.
 */
@NextVersion(SecuritiesMessageRejectionV02.class)
public class SecuritiesMessageRejection {

	private AdditionalReference2 RelatedReference;
	private RejectionReason1 Reason;

	public AdditionalReference2 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference2 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public RejectionReason1 getReason() {
		return Reason;
	}

	public void setReason(RejectionReason1 Reason) {
		this.Reason = Reason;
	}
}