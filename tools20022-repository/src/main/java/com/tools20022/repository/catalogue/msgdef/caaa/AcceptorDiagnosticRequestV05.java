package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticRequestV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticRequest5;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to check the end-to-end communication, to
 * test the availability of this acquirer, or to validate the security
 * environment.
 */
@PreviousVersion(AcceptorDiagnosticRequestV04.class)
@NextVersion(AcceptorDiagnosticRequestV06.class)
public class AcceptorDiagnosticRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorDiagnosticRequest5 DiagnosticRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticRequest5 getDiagnosticRequest() {
		return DiagnosticRequest;
	}

	public void setDiagnosticRequest(
			AcceptorDiagnosticRequest5 DiagnosticRequest) {
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