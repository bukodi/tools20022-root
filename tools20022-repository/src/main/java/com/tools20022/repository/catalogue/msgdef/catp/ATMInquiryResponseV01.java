package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMInquiryResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMInquiryResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMInquiryResponse message is sent by an ATM manager or its agent to the
 * ATM to provide the information and the outcome of the verifications requested
 * in the ATMInquiryRequest.
 */
@NextVersion(ATMInquiryResponseV02.class)
public class ATMInquiryResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMInquiryResponse;
	private Optional<ATMInquiryResponse1> ATMInquiryResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMInquiryResponse() {
		return ProtectedATMInquiryResponse;
	}

	public void setProtectedATMInquiryResponse(
			Optional<ContentInformationType10> ProtectedATMInquiryResponse) {
		this.ProtectedATMInquiryResponse = ProtectedATMInquiryResponse;
	}

	public Optional<ATMInquiryResponse1> getATMInquiryResponse() {
		return ATMInquiryResponse;
	}

	public void setATMInquiryResponse(
			Optional<ATMInquiryResponse1> ATMInquiryResponse) {
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