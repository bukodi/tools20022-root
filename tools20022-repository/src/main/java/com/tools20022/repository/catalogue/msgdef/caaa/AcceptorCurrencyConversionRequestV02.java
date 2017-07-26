package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header10;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType11;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.
 */
@PreviousVersion(AcceptorCurrencyConversionRequestV01.class)
@NextVersion(AcceptorCurrencyConversionRequestV03.class)
public class AcceptorCurrencyConversionRequestV02 {

	private Header10 Header;
	private AcceptorCurrencyConversionRequest2 CurrencyConversionRequest;
	private ContentInformationType11 SecurityTrailer;

	public Header10 getHeader() {
		return Header;
	}

	public void setHeader(Header10 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionRequest2 getCurrencyConversionRequest() {
		return CurrencyConversionRequest;
	}

	public void setCurrencyConversionRequest(
			AcceptorCurrencyConversionRequest2 CurrencyConversionRequest) {
		this.CurrencyConversionRequest = CurrencyConversionRequest;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType11 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}