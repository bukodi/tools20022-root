package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerAuthorisationResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcquirerAuthorisationResponse message is sent by an issuer or an agent to
 * answer to an AcquirerAuthorisationInitiation message.
 */
public class AcquirerAuthorisationResponse
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header17 Header;
	private AcquirerAuthorisationResponse1 AuthorisationResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerAuthorisationResponse1 getAuthorisationResponse() {
		return AuthorisationResponse;
	}

	public void setAuthorisationResponse(
			AcquirerAuthorisationResponse1 AuthorisationResponse) {
		this.AuthorisationResponse = AuthorisationResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}