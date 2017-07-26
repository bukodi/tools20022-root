package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMRejectV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header33;
import com.tools20022.repository.dict.msg.ATMReject2;

/**
 * The ATMReject message is sent by any entity to reject a received message.
 */
@PreviousVersion(ATMRejectV01.class)
public class ATMRejectV02 {

	private Header33 Header;
	private ATMReject2 ATMReject;

	public Header33 getHeader() {
		return Header;
	}

	public void setHeader(Header33 Header) {
		this.Header = Header;
	}

	public ATMReject2 getATMReject() {
		return ATMReject;
	}

	public void setATMReject(ATMReject2 ATMReject) {
		this.ATMReject = ATMReject;
	}
}