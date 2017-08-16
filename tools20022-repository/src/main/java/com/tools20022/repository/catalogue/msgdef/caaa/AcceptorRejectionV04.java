package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header13;
import com.tools20022.repository.dict.msg.AcceptorRejection2;

/**
 * The AcceptorRejection message is sent by the acquirer (or its agent) to
 * reject a message request or advice sent by an acceptor (or its agent), to
 * indicate that the received message could not be processed.
 */
@PreviousVersion(AcceptorRejectionV03.class)
@NextVersion(AcceptorRejectionV05.class)
public class AcceptorRejectionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header13 Header;
	private AcceptorRejection2 Reject;

	public Header13 getHeader() {
		return Header;
	}

	public void setHeader(Header13 Header) {
		this.Header = Header;
	}

	public AcceptorRejection2 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection2 Reject) {
		this.Reject = Reject;
	}
}