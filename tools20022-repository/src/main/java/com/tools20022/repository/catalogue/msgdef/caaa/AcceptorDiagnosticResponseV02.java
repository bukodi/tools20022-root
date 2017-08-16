package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorDiagnosticResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorDiagnosticResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent)
 * to provide to the acceptor the result of the diagnostic request.
 */
@PreviousVersion(AcceptorDiagnosticResponseV01.class)
@NextVersion(AcceptorDiagnosticResponseV03.class)
public class AcceptorDiagnosticResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header1 Header;
	private AcceptorDiagnosticResponse2 DiagnosticResponse;
	private ContentInformationType6 SecurityTrailer;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorDiagnosticResponse2 getDiagnosticResponse() {
		return DiagnosticResponse;
	}

	public void setDiagnosticResponse(
			AcceptorDiagnosticResponse2 DiagnosticResponse) {
		this.DiagnosticResponse = DiagnosticResponse;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}