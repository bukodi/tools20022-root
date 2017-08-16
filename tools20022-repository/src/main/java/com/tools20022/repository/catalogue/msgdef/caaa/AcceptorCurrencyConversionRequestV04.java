package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionRequest4;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.
 */
@PreviousVersion(AcceptorCurrencyConversionRequestV03.class)
public class AcceptorCurrencyConversionRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorCurrencyConversionRequest4 CurrencyConversionRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionRequest4 getCurrencyConversionRequest() {
		return CurrencyConversionRequest;
	}

	public void setCurrencyConversionRequest(
			AcceptorCurrencyConversionRequest4 CurrencyConversionRequest) {
		this.CurrencyConversionRequest = CurrencyConversionRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}