package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.StatusReport2;
import com.tools20022.repository.dict.msg.ContentInformationType4;

/**
 * Informs the master terminal manager (MTM) or the terminal manager (TM) about
 * the status of the acceptor system including the identification of the POI,
 * its components and their installed versions.
 */
@PreviousVersion(StatusReportV01.class)
@NextVersion(StatusReportV03.class)
public class StatusReportV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private Header4 Header;
	private StatusReport2 StatusReport;
	private ContentInformationType4 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public StatusReport2 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(StatusReport2 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public ContentInformationType4 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType4 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}