package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion
 * service provider to the card acceptor to return the result of a potential
 * currency conversion for the cardholder.
 */
@PreviousVersion(AcceptorCurrencyConversionResponseV01.class)
@NextVersion(AcceptorCurrencyConversionResponseV03.class)
public class AcceptorCurrencyConversionResponseV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header10 Header;
	private AcceptorCurrencyConversionResponse2 CurrencyConversionResponse;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionResponse2 getCurrencyConversionResponse() {
		return CurrencyConversionResponse;
	}

	public void setCurrencyConversionResponse(
			AcceptorCurrencyConversionResponse2 CurrencyConversionResponse) {
		this.CurrencyConversionResponse = CurrencyConversionResponse;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}