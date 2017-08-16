package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header2;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdvice2;
import com.tools20022.repository.dict.msg.ContentInformationType6;

/**
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent)
 * to notify the acquirer (or its agent) of the cancellation of a successfully
 * completed transaction. The transaction has been completed without financial
 * transfer, or the acceptor is aware that the transaction was not cleared by
 * the acquirer.
 */
@PreviousVersion(AcceptorCancellationAdviceV01.class)
@NextVersion(AcceptorCancellationAdviceV03.class)
public class AcceptorCancellationAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header2 Header;
	private AcceptorCancellationAdvice2 CancellationAdvice;
	private ContentInformationType6 SecurityTrailer;

	public Header2 getHeader() {
		return Header;
	}

	public void setHeader(Header2 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdvice2 getCancellationAdvice() {
		return CancellationAdvice;
	}

	public void setCancellationAdvice(
			AcceptorCancellationAdvice2 CancellationAdvice) {
		this.CancellationAdvice = CancellationAdvice;
	}

	public ContentInformationType6 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}