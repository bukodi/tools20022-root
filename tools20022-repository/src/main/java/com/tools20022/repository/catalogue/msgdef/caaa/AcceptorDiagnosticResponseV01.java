package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType3;

/**
 * Scope The AcceptorDiagnosticResponse message is sent by the acquirer to the
 * card acceptor to confirm the availability of the acquirer. An agent never
 * forwards the message. Usage The AcceptorDiagnosticResponse message is used
 * to: - confirm the availability of the acquirer; - validate the security of
 * the exchanges with the acquirer; - validate the version of the configuration
 * parameters.
 */
@NextVersion(AcceptorDiagnosticResponseV02.class)
public class AcceptorDiagnosticResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorDiagnosticResponse1 DiagnosticResponse;
	private ContentInformationType3 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticResponse1 getDiagnosticResponse() {
		return DiagnosticResponse;
	}

	public void setDiagnosticResponse(
			AcceptorDiagnosticResponse1 DiagnosticResponse) {
		this.DiagnosticResponse = DiagnosticResponse;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}