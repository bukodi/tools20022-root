package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.IdentificationVerificationReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.IdentificationAssignment2;
import com.tools20022.repository.dict.msg.MessageIdentification5;
import java.util.Optional;
import com.tools20022.repository.dict.msg.VerificationReport2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
@PreviousVersion(IdentificationVerificationReportV01.class)
public class IdentificationVerificationReportV02 {

	private IdentificationAssignment2 Assignment;
	private Optional<MessageIdentification5> OriginalAssignment;
	private VerificationReport2 Report;
	private Optional<SupplementaryData1> SupplementaryData;

	public IdentificationAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(IdentificationAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<MessageIdentification5> getOriginalAssignment() {
		return OriginalAssignment;
	}

	public void setOriginalAssignment(
			Optional<MessageIdentification5> OriginalAssignment) {
		this.OriginalAssignment = OriginalAssignment;
	}

	public VerificationReport2 getReport() {
		return Report;
	}

	public void setReport(VerificationReport2 Report) {
		this.Report = Report;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}