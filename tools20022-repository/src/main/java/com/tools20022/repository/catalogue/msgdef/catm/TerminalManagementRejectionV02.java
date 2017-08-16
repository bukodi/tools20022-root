package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.TerminalManagementRejectionV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.TerminalManagementRejectionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header6;
import com.tools20022.repository.dict.msg.AcceptorRejection2;

/**
 * The TerminalManagementRejection message is sent by the terminal manager to
 * reject a message request sent by an acceptor, to indicate that the received
 * message could not be processed.
 */
@PreviousVersion(TerminalManagementRejectionV01.class)
@NextVersion(TerminalManagementRejectionV03.class)
public class TerminalManagementRejectionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header6 Header;
	private AcceptorRejection2 Reject;

	public Header6 getHeader() {
		return Header;
	}

	public void setHeader(Header6 Header) {
		this.Header = Header;
	}

	public AcceptorRejection2 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection2 Reject) {
		this.Reject = Reject;
	}
}