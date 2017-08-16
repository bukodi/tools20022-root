package com.tools20022.repository.catalogue.msgdef.catp;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catp.ATMInquiryRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMInquiryRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMInquiryRequest message is sent by an ATM to an ATM manager to request
 * information about a customer (for example card, account).
 */
@PreviousVersion(ATMInquiryRequestV01.class)
public class ATMInquiryRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMInquiryRequest;
	private Optional<ATMInquiryRequest2> ATMInquiryRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMInquiryRequest() {
		return ProtectedATMInquiryRequest;
	}

	public void setProtectedATMInquiryRequest(
			Optional<ContentInformationType10> ProtectedATMInquiryRequest) {
		this.ProtectedATMInquiryRequest = ProtectedATMInquiryRequest;
	}

	public Optional<ATMInquiryRequest2> getATMInquiryRequest() {
		return ATMInquiryRequest;
	}

	public void setATMInquiryRequest(
			Optional<ATMInquiryRequest2> ATMInquiryRequest) {
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