package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticRequest6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to check the end-to-end communication, to
 * test the availability of this acquirer, or to validate the security
 * environment.
 */
@PreviousVersion(AcceptorDiagnosticRequestV05.class)
public class AcceptorDiagnosticRequestV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorDiagnosticRequest6 DiagnosticRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticRequest6 getDiagnosticRequest() {
		return DiagnosticRequest;
	}

	public void setDiagnosticRequest(
			AcceptorDiagnosticRequest6 DiagnosticRequest) {
		this.DiagnosticRequest = DiagnosticRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}