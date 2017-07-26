package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMRejectV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header22;
import com.tools20022.repository.dict.msg.ATMReject1;

/**
 * The ATMReject message is sent by any entity to reject a received message.
 */
@NextVersion(ATMRejectV02.class)
public class ATMRejectV01 {

	private Header22 Header;
	private ATMReject1 ATMReject;

	public Header22 getHeader() {
		return Header;
	}

	public void setHeader(Header22 Header) {
		this.Header = Header;
	}

	public ATMReject1 getATMReject() {
		return ATMReject;
	}

	public void setATMReject(ATMReject1 ATMReject) {
		this.ATMReject = ATMReject;
	}
}