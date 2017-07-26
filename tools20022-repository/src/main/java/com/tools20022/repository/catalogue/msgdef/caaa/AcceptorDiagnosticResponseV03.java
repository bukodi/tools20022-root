package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent)
 * to provide to the acceptor the result of the diagnostic request.
 */
@PreviousVersion(AcceptorDiagnosticResponseV02.class)
@NextVersion(AcceptorDiagnosticResponseV04.class)
public class AcceptorDiagnosticResponseV03 {

	private Header7 Header;
	private AcceptorDiagnosticResponse3 DiagnosticResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticResponse3 getDiagnosticResponse() {
		return DiagnosticResponse;
	}

	public void setDiagnosticResponse(
			AcceptorDiagnosticResponse3 DiagnosticResponse) {
		this.DiagnosticResponse = DiagnosticResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}