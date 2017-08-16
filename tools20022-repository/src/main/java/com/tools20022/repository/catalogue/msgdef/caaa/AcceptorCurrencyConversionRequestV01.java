package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header7;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.
 */
@NextVersion(AcceptorCurrencyConversionRequestV02.class)
public class AcceptorCurrencyConversionRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header7 Header;
	private AcceptorCurrencyConversionRequest1 CurrencyConversionRequest;
	private ContentInformationType8 SecurityTrailer;

	public Header7 getHeader() {
		return Header;
	}

	public void setHeader(Header7 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionRequest1 getCurrencyConversionRequest() {
		return CurrencyConversionRequest;
	}

	public void setCurrencyConversionRequest(
			AcceptorCurrencyConversionRequest1 CurrencyConversionRequest) {
		this.CurrencyConversionRequest = CurrencyConversionRequest;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}