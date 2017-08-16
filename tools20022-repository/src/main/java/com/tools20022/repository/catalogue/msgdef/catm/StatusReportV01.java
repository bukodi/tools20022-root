package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.StatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.StatusReport1;
import com.tools20022.repository.dict.msg.ContentInformationType1;

/**
 * Scope The StatusReport message is sent by the card acceptor to the master
 * terminal manager or delegated terminal manager to inform these entities about
 * the status of the acceptor system. Usage The StatusReport message may embed
 * the information required by the master terminal manager or delegated terminal
 * manager for preparing the needed TMS actions in the management plan to be
 * replaced and the acceptor parameters to be updated.
 */
@NextVersion(StatusReportV02.class)
public class StatusReportV01 implements GeneratedRepoBean<MMMessageDefinition> {

	private Header4 Header;
	private StatusReport1 StatusReport;
	private ContentInformationType1 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public StatusReport1 getStatusReport() {
		return StatusReport;
	}

	public void setStatusReport(StatusReport1 StatusReport) {
		this.StatusReport = StatusReport;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}