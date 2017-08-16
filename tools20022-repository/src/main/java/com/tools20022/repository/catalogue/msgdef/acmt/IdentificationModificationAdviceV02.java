package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationModificationAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment2;
import com.tools20022.repository.dict.msg.OriginalTransactionReference18;
import java.util.Optional;
import com.tools20022.repository.dict.msg.IdentificationModification2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
@PreviousVersion(IdentificationModificationAdviceV01.class)
public class IdentificationModificationAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private IdentificationAssignment2 Assignment;
	private Optional<OriginalTransactionReference18> OriginalTransactionReference;
	private IdentificationModification2 Modification;
	private Optional<SupplementaryData1> SupplementaryData;

	public IdentificationAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<OriginalTransactionReference18> getOriginalTransactionReference() {
		return OriginalTransactionReference;
	}

	public void setOriginalTransactionReference(
			Optional<OriginalTransactionReference18> OriginalTransactionReference) {
		this.OriginalTransactionReference = OriginalTransactionReference;
	}

	public IdentificationModification2 getModification() {
		return Modification;
	}

	public void setModification(IdentificationModification2 Modification) {
		this.Modification = Modification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}