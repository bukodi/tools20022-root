package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header34;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionAdvice1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCurrencyConversionAdvice message is sent by the card acceptor to
 * inform the currency conversion service provider of the outcome of the card
 * currency conversion.
 */
public class AcceptorCurrencyConversionAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header34 Header;
	private AcceptorCurrencyConversionAdvice1 AcceptorCurrencyConversionAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header34 getHeader() {
		return Header;
	}

	public void setHeader(Header34 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionAdvice1 getAcceptorCurrencyConversionAdvice() {
		return AcceptorCurrencyConversionAdvice;
	}

	public void setAcceptorCurrencyConversionAdvice(
			AcceptorCurrencyConversionAdvice1 AcceptorCurrencyConversionAdvice) {
		this.AcceptorCurrencyConversionAdvice = AcceptorCurrencyConversionAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}