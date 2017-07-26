package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMInquiryRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMInquiryRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMInquiryRequest message is sent by an ATM to an ATM manager to request
 * information about a customer (for example card, account).
 */
@NextVersion(ATMInquiryRequestV02.class)
public class ATMInquiryRequestV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMInquiryRequest;
	private Optional<ATMInquiryRequest1> ATMInquiryRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMInquiryRequest() {
		return ProtectedATMInquiryRequest;
	}

	public void setProtectedATMInquiryRequest(
			Optional<ContentInformationType10> ProtectedATMInquiryRequest) {
		this.ProtectedATMInquiryRequest = ProtectedATMInquiryRequest;
	}

	public Optional<ATMInquiryRequest1> getATMInquiryRequest() {
		return ATMInquiryRequest;
	}

	public void setATMInquiryRequest(
			Optional<ATMInquiryRequest1> ATMInquiryRequest) {
		this.ATMInquiryRequest = ATMInquiryRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}