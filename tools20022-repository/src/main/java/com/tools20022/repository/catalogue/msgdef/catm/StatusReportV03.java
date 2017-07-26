package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.StatusReport3;
import com.tools20022.repository.dict.msg.ContentInformationType9;

/**
 * Informs the master terminal manager (MTM) or the terminal manager (TM) about
 * the status of the acceptor system including the identification of the POI,
 * its components and their installed versions.
 */
@PreviousVersion(StatusReportV02.class)
@NextVersion(StatusReportV04.class)
public class StatusReportV03 {

	private Header4 Header;
	private StatusReport3 StatusReport;
	private ContentInformationType9 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public StatusReport3 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(StatusReport3 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType9 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}