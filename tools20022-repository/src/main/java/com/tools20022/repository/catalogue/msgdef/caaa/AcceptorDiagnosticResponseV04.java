package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticResponse4;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent)
 * to provide to the acceptor the result of the diagnostic request.
 */
@PreviousVersion(AcceptorDiagnosticResponseV03.class)
@NextVersion(AcceptorDiagnosticResponseV05.class)
public class AcceptorDiagnosticResponseV04 {

	private Header10 Header;
	private AcceptorDiagnosticResponse4 DiagnosticResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticResponse4 getDiagnosticResponse() {
		return DiagnosticResponse;
	}

	public void setDiagnosticResponse(
			AcceptorDiagnosticResponse4 DiagnosticResponse) {
		this.DiagnosticResponse = DiagnosticResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}