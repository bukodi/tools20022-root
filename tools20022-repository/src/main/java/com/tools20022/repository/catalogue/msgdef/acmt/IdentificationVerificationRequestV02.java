package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationVerificationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment2;
import com.tools20022.repository.dict.msg.IdentificationVerification2;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The IdentificationVerificationRequest message is sent by an assigner to
 * an assignee. It is used to request the verification of party and/or account
 * identification information. Usage The IdentificationVerificationRequest
 * message is sent before the sending of one or several transactions messages.
 * The IdentificationVerificationRequest message can contain one or more
 * verification requests.
 */
@PreviousVersion(IdentificationVerificationRequestV01.class)
public class IdentificationVerificationRequestV02 {

	private IdentificationAssignment2 Assignment;
	private IdentificationVerification2 Verification;
	private Optional<SupplementaryData1> SupplementaryData;

	public IdentificationAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public IdentificationVerification2 getVerification() {
		return Verification;
	}

	public void setVerification(IdentificationVerification2 Verification) {
		this.Verification = Verification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}