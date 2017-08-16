package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationVerificationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment1;
import com.tools20022.repository.dict.msg.IdentificationVerification1;

/**
 * Scope The IdentificationVerificationRequest message is sent by an assigner to
 * an assignee. It is used to request the verification of party and/or account
 * identification information. Usage The IdentificationVerificationRequest
 * message is sent before the sending of one or several transactions messages.
 * The IdentificationVerificationRequest message can contain one or more
 * verification requests.
 */
@NextVersion(IdentificationVerificationRequestV02.class)
public class IdentificationVerificationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private IdentificationAssignment1 Assignment;
	private IdentificationVerification1 Verification;

	public IdentificationAssignment1 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment1 Assignment) {
		this.Assignment = Assignment;
	}

	public IdentificationVerification1 getVerification() {
		return Verification;
	}

	public void setVerification(IdentificationVerification1 Verification) {
		this.Verification = Verification;
	}
}