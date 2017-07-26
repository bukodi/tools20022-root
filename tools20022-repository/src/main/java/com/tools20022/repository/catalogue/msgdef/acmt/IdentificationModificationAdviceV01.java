package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationModificationAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment1;
import com.tools20022.repository.dict.msg.OriginalTransactionReference14;
import java.util.Optional;
import com.tools20022.repository.dict.msg.IdentificationModification1;

/**
 * Scope The IdentificationModificationAdvice message is sent by an assigner to
 * an assignee. The message is used to advice on the correct party and/or
 * account identification information. Usage The
 * IdentificationModificationAdvice message is sent after the receipt of one or
 * several transaction messages that included no longer valid party and/or
 * account identification information. The IdentificationModificationAdvice
 * message is exchanged between financial institutions and between financial
 * institutions and non financial institutions and can contain one or more
 * modification advises. There is no time limit on the time between the sending
 * of an IdentificationModificationAdvice message and the receipt of the
 * transaction messages that the IdentificationModificationAdvice refers to. The
 * IdentificationModificationAdvice includes the correct party and/or account
 * identification information, the IdentificationModificationAdvice or the
 * included information may be forwarded to the initiating party of the
 * transaction messages.
 */
@NextVersion(IdentificationModificationAdviceV02.class)
public class IdentificationModificationAdviceV01 {

	private IdentificationAssignment1 Assignment;
	private Optional<OriginalTransactionReference14> OriginalTransactionReference;
	private IdentificationModification1 Modification;

	public IdentificationAssignment1 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment1 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<OriginalTransactionReference14> getOriginalTransactionReference() {
		return OriginalTransactionReference;
	}

	public void setOriginalTransactionReference(
			Optional<OriginalTransactionReference14> OriginalTransactionReference) {
		this.OriginalTransactionReference = OriginalTransactionReference;
	}

	public IdentificationModification1 getModification() {
		return Modification;
	}

	public void setModification(IdentificationModification1 Modification) {
		this.Modification = Modification;
	}
}