package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header24;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdvice6;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent)
 * to notify the acquirer (or its agent) of the cancellation of a successfully
 * completed transaction. The transaction has been completed without financial
 * transfer, or the acceptor is aware that the transaction was not cleared by
 * the acquirer.
 */
@PreviousVersion(AcceptorCancellationAdviceV05.class)
public class AcceptorCancellationAdviceV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header24 Header;
	private AcceptorCancellationAdvice6 CancellationAdvice;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header24 getHeader() {
		return Header;
	}

	public void setHeader(Header24 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdvice6 getCancellationAdvice() {
		return CancellationAdvice;
	}

	public void setCancellationAdvice(
			AcceptorCancellationAdvice6 CancellationAdvice) {
		this.CancellationAdvice = CancellationAdvice;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}