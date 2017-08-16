package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to check the end-to-end communication, to
 * test the availability of this acquirer, or to validate the security
 * environment.
 */
@PreviousVersion(AcceptorDiagnosticRequestV02.class)
@NextVersion(AcceptorDiagnosticRequestV04.class)
public class AcceptorDiagnosticRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header7 Header;
	private AcceptorDiagnosticRequest3 DiagnosticRequest;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticRequest3 getDiagnosticRequest() {
		return DiagnosticRequest;
	}

	public void setDiagnosticRequest(
			AcceptorDiagnosticRequest3 DiagnosticRequest) {
		this.DiagnosticRequest = DiagnosticRequest;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}