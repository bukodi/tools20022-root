package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent)
 * to provide to the acceptor the result of the diagnostic request.
 */
@PreviousVersion(AcceptorDiagnosticResponseV04.class)
public class AcceptorDiagnosticResponseV05 {

	private Header30 Header;
	private AcceptorDiagnosticResponse4 DiagnosticResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticResponse4 getDiagnosticResponse() {
		return DiagnosticResponse;
	}

	public void setDiagnosticResponse(
			AcceptorDiagnosticResponse4 DiagnosticResponse) {
		this.DiagnosticResponse = DiagnosticResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}