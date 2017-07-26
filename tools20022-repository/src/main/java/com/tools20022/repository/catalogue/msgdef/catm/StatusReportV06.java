package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header27;
import com.tools20022.repository.dict.msg.StatusReport6;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * Informs the master terminal manager (MTM) or the terminal manager (TM) about
 * the status of the acceptor system including the identification of the POI,
 * its components and their installed versions.
 */
@PreviousVersion(StatusReportV05.class)
public class StatusReportV06 {

	private Header27 Header;
	private StatusReport6 StatusReport;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header27 getHeader() {
		return Header;
	}

	public void setHeader(Header27 Header) {
		this.Header = Header;
	}

	public StatusReport6 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(StatusReport6 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}