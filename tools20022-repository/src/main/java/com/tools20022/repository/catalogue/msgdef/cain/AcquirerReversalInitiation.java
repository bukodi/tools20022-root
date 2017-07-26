package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header18;
import com.tools20022.repository.dict.msg.AcquirerReversalInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcquirerReversalInitiation message is sent by an acquirer or an agent to
 * an issuer or an agent, to request, advice or notify the reversal of a card
 * transaction.
 */
public class AcquirerReversalInitiation {

	private Header18 Header;
	private AcquirerReversalInitiation1 ReversalInitiation;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header18 getHeader() {
		return Header;
	}

	public void setHeader(Header18 Header) {
		this.Header = Header;
	}

	public AcquirerReversalInitiation1 getReversalInitiation() {
		return ReversalInitiation;
	}

	public void setReversalInitiation(
			AcquirerReversalInitiation1 ReversalInitiation) {
		this.ReversalInitiation = ReversalInitiation;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}