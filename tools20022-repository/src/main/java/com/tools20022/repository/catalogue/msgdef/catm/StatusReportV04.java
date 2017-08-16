package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header14;
import com.tools20022.repository.dict.msg.StatusReport4;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * Informs the master terminal manager (MTM) or the terminal manager (TM) about
 * the status of the acceptor system including the identification of the POI,
 * its components and their installed versions.
 */
@PreviousVersion(StatusReportV03.class)
@NextVersion(StatusReportV05.class)
public class StatusReportV04 implements GeneratedRepoBean<MMMessageDefinition> {

	private Header14 Header;
	private StatusReport4 StatusReport;
	private ContentInformationType12 SecurityTrailer;

	public Header14 getHeader() {
		return Header;
	}

	public void setHeader(Header14 Header) {
		this.Header = Header;
	}

	public StatusReport4 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(StatusReport4 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}