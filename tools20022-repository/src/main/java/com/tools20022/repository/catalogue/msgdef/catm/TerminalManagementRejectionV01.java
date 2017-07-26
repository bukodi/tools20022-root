package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.TerminalManagementRejectionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header6;
import com.tools20022.repository.dict.msg.AcceptorRejection1;

/**
 * The TerminalManagementRejection message is sent by the terminal manager to
 * reject a message request sent by an acceptor, to indicate that the received
 * message could not be processed.
 */
@NextVersion(TerminalManagementRejectionV02.class)
public class TerminalManagementRejectionV01 {

	private Header6 Header;
	private AcceptorRejection1 Reject;

	public Header6 getHeader() {
		return Header;
	}

	public void setHeader(Header6 Header) {
		this.Header = Header;
	}

	public AcceptorRejection1 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection1 Reject) {
		this.Reject = Reject;
	}
}