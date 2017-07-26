package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorDiagnosticRequest message is sent by the card acceptor to
 * the acquirer to ensure the availability of the acquirer. An agent never
 * forwards the message. Usage The AcceptorDiagnosticRequest message is used to:
 * - test the availability of the acquirer; - validate the security of the
 * exchanges with the acquirer; - validate the version of the configuration
 * parameters.
 */
@NextVersion(AcceptorDiagnosticRequestV02.class)
public class AcceptorDiagnosticRequestV01 {

	private Header1 Header;
	private AcceptorDiagnosticRequest1 DiagnosticRequest;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticRequest1 getDiagnosticRequest() {
		return DiagnosticRequest;
	}

	public void setDiagnosticRequest(
			AcceptorDiagnosticRequest1 DiagnosticRequest) {
		this.DiagnosticRequest = DiagnosticRequest;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}