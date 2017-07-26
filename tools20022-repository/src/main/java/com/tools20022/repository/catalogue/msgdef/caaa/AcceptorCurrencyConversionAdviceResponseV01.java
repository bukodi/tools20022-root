package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.dict.msg.Header34;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdviceResponse6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCurrencyConversionAdviceResponse message is sent by the service
 * provider to acknowledge the acceptor about the notification of the reception
 * of the currency conversion advice.
 */
public class AcceptorCurrencyConversionAdviceResponseV01 {

	private Header34 Header;
	private AcceptorCancellationAdviceResponse6 CurrencyConversionAdviceResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header34 getHeader() {
		return Header;
	}

	public void setHeader(Header34 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdviceResponse6 getCurrencyConversionAdviceResponse() {
		return CurrencyConversionAdviceResponse;
	}

	public void setCurrencyConversionAdviceResponse(
			AcceptorCancellationAdviceResponse6 CurrencyConversionAdviceResponse) {
		this.CurrencyConversionAdviceResponse = CurrencyConversionAdviceResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}