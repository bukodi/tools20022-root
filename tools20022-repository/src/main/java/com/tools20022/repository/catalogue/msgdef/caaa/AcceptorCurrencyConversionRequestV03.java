package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCurrencyConversionRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header30;
import com.tools20022.repository.dict.msg.AcceptorCurrencyConversionRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.
 */
@PreviousVersion(AcceptorCurrencyConversionRequestV02.class)
@NextVersion(AcceptorCurrencyConversionRequestV04.class)
public class AcceptorCurrencyConversionRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header30 Header;
	private AcceptorCurrencyConversionRequest3 CurrencyConversionRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header30 getHeader() {
		return Header;
	}

	public void setHeader(Header30 Header) {
		this.Header = Header;
	}

	public AcceptorCurrencyConversionRequest3 getCurrencyConversionRequest() {
		return CurrencyConversionRequest;
	}

	public void setCurrencyConversionRequest(
			AcceptorCurrencyConversionRequest3 CurrencyConversionRequest) {
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