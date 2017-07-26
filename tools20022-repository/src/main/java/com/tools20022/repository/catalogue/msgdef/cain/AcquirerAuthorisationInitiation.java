package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerAuthorisationInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcquirerAuthorisationInitiation message is sent by an acquirer or an
 * agent to an issuer or an agent, to request, advice or notify the approval of
 * a card transaction.
 */
public class AcquirerAuthorisationInitiation {

	private Header17 Header;
	private AcquirerAuthorisationInitiation1 AuthorisationInitiation;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerAuthorisationInitiation1 getAuthorisationInitiation() {
		return AuthorisationInitiation;
	}

	public void setAuthorisationInitiation(
			AcquirerAuthorisationInitiation1 AuthorisationInitiation) {
		this.AuthorisationInitiation = AuthorisationInitiation;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}