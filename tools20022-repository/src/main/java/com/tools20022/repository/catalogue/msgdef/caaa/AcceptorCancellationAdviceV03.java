package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorCancellationAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header8;
import com.tools20022.repository.dict.msg.AcceptorCancellationAdvice3;
import com.tools20022.repository.dict.msg.ContentInformationType8;

/**
 * The AcceptorCancellationAdvice message is sent by an acceptor (or its agent)
 * to notify the acquirer (or its agent) of the cancellation of a successfully
 * completed transaction. The transaction has been completed without financial
 * transfer, or the acceptor is aware that the transaction was not cleared by
 * the acquirer.
 */
@PreviousVersion(AcceptorCancellationAdviceV02.class)
@NextVersion(AcceptorCancellationAdviceV04.class)
public class AcceptorCancellationAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header8 Header;
	private AcceptorCancellationAdvice3 CancellationAdvice;
	private ContentInformationType8 SecurityTrailer;

	public Header8 getHeader() {
		return Header;
	}

	public void setHeader(Header8 Header) {
		this.Header = Header;
	}

	public AcceptorCancellationAdvice3 getCancellationAdvice() {
		return CancellationAdvice;
	}

	public void setCancellationAdvice(
			AcceptorCancellationAdvice3 CancellationAdvice) {
		this.CancellationAdvice = CancellationAdvice;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType8 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}