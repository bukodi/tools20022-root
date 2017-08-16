package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionResponseV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionResponse3;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion
 * service provider to the card acceptor to return the result of a potential
 * currency conversion for the cardholder.
 */
@PreviousVersion(AcceptorCurrencyConversionResponseV02.class)
@NextVersion(AcceptorCurrencyConversionResponseV04.class)
public class AcceptorCurrencyConversionResponseV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorCurrencyConversionResponse3 CurrencyConversionResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionResponse3 getCurrencyConversionResponse() {
		return CurrencyConversionResponse;
	}

	public void setCurrencyConversionResponse(
			AcceptorCurrencyConversionResponse3 CurrencyConversionResponse) {
		this.CurrencyConversionResponse = CurrencyConversionResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}