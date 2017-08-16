package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.TerminalManagementRejectionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header28;
import com.tools20022.repository.dict.msg.AcceptorRejection3;

/**
 * The TerminalManagementRejection message is sent by the terminal manager to
 * reject a message request sent by an acceptor, to indicate that the received
 * message could not be processed.
 */
@PreviousVersion(TerminalManagementRejectionV03.class)
public class TerminalManagementRejectionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header28 Header;
	private AcceptorRejection3 Reject;

	public Header28 getHeader() {
		return Header;
	}

	public void setHeader(Header28 Header) {
		this.Header = Header;
	}

	public AcceptorRejection3 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection3 Reject) {
		this.Reject = Reject;
	}
}