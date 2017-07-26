package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.repository.catalogue.msgdef.catp.ATMInquiryResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMInquiryResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMInquiryResponse message is sent by an ATM manager or its agent to the
 * ATM to provide the information and the outcome of the verifications requested
 * in the ATMInquiryRequest.
 */
@PreviousVersion(ATMInquiryResponseV01.class)
public class ATMInquiryResponseV02 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMInquiryResponse;
	private Optional<ATMInquiryResponse2> ATMInquiryResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMInquiryResponse() {
		return ProtectedATMInquiryResponse;
	}

	public void setProtectedATMInquiryResponse(
			Optional<ContentInformationType10> ProtectedATMInquiryResponse) {
		this.ProtectedATMInquiryResponse = ProtectedATMInquiryResponse;
	}

	public Optional<ATMInquiryResponse2> getATMInquiryResponse() {
		return ATMInquiryResponse;
	}

	public void setATMInquiryResponse(
			Optional<ATMInquiryResponse2> ATMInquiryResponse) {
		this.ATMInquiryResponse = ATMInquiryResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}