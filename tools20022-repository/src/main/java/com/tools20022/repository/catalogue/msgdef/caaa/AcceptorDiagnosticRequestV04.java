package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticRequest4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to check the end-to-end communication, to
 * test the availability of this acquirer, or to validate the security
 * environment.
 */
@PreviousVersion(AcceptorDiagnosticRequestV03.class)
@NextVersion(AcceptorDiagnosticRequestV05.class)
public class AcceptorDiagnosticRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header10 Header;
	private AcceptorDiagnosticRequest4 DiagnosticRequest;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticRequest4 getDiagnosticRequest() {
		return DiagnosticRequest;
	}

	public void setDiagnosticRequest(
			AcceptorDiagnosticRequest4 DiagnosticRequest) {
		this.DiagnosticRequest = DiagnosticRequest;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}