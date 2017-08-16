package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCurrencyConversionResponse message is sent by currency conversion
 * service provider to the card acceptor to return the result of a potential
 * currency conversion for the cardholder.
 */
@NextVersion(AcceptorCurrencyConversionResponseV02.class)
public class AcceptorCurrencyConversionResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header7 Header;
	private AcceptorCurrencyConversionResponse1 CurrencyConversionResponse;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionResponse1 getCurrencyConversionResponse() {
		return CurrencyConversionResponse;
	}

	public void setCurrencyConversionResponse(
			AcceptorCurrencyConversionResponse1 CurrencyConversionResponse) {
		this.CurrencyConversionResponse = CurrencyConversionResponse;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}