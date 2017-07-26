package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMDiagnosticResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDiagnosticResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDiagnosticResponse message is sent by an acquirer to an ATM in
 * response to an ATMDiagnosticRequest message ensuring the availability and the
 * validity of the parameters.
 */
@NextVersion(ATMDiagnosticResponseV02.class)
public class ATMDiagnosticResponseV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMDiagnosticResponse;
	private Optional<ATMDiagnosticResponse1> ATMDiagnosticResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDiagnosticResponse() {
		return ProtectedATMDiagnosticResponse;
	}

	public void setProtectedATMDiagnosticResponse(
			Optional<ContentInformationType10> ProtectedATMDiagnosticResponse) {
		this.ProtectedATMDiagnosticResponse = ProtectedATMDiagnosticResponse;
	}

	public Optional<ATMDiagnosticResponse1> getATMDiagnosticResponse() {
		return ATMDiagnosticResponse;
	}

	public void setATMDiagnosticResponse(
			Optional<ATMDiagnosticResponse1> ATMDiagnosticResponse) {
		this.ATMDiagnosticResponse = ATMDiagnosticResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}