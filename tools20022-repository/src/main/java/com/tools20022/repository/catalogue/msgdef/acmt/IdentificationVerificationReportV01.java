package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationVerificationReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment1;
import com.tools20022.repository.dict.msg.MessageIdentification4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.VerificationReport1;

/**
 * Scope The IdentificationVerificationReport message is sent by an assigner to
 * an assignee. It is used to confirm whether or not the presented party and/or
 * account identification information is correct. Usage The
 * IdentificationVerificationReport message is sent as a response to an
 * IdentificationVerificationRequest message. The
 * IdentificationVerificationReport message can contain one or more reports. The
 * IdentificationVerificationReport message may include a reason if the
 * presented party and/or account identification information is confirmed to be
 * incorrect. The IdentificationVerificationReport message may include the
 * correct party and/or account identification information.
 */
@NextVersion(IdentificationVerificationReportV02.class)
public class IdentificationVerificationReportV01 {

	private IdentificationAssignment1 Assignment;
	private Optional<MessageIdentification4> OriginalAssignment;
	private VerificationReport1 Report;

	public IdentificationAssignment1 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment1 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<MessageIdentification4> getOriginalAssignment() {
		return OriginalAssignment;
	}

	public void setOriginalAssignment(
			Optional<MessageIdentification4> OriginalAssignment) {
		this.OriginalAssignment = OriginalAssignment;
	}

	public VerificationReport1 getReport() {
		return Report;
	}

	public void setReport(VerificationReport1 Report) {
		this.Report = Report;
	}
}