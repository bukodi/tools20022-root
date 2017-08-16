package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMDiagnosticRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDiagnosticRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify
 * the availability of the acquirer. The acquirer will also validate that this
 * ATM is a valid ATM for its particular network.
 */
@PreviousVersion(ATMDiagnosticRequestV01.class)
public class ATMDiagnosticRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMDiagnosticRequest;
	private Optional<ATMDiagnosticRequest2> ATMDiagnosticRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDiagnosticRequest() {
		return ProtectedATMDiagnosticRequest;
	}

	public void setProtectedATMDiagnosticRequest(
			Optional<ContentInformationType10> ProtectedATMDiagnosticRequest) {
		this.ProtectedATMDiagnosticRequest = ProtectedATMDiagnosticRequest;
	}

	public Optional<ATMDiagnosticRequest2> getATMDiagnosticRequest() {
		return ATMDiagnosticRequest;
	}

	public void setATMDiagnosticRequest(
			Optional<ATMDiagnosticRequest2> ATMDiagnosticRequest) {
		this.ATMDiagnosticRequest = ATMDiagnosticRequest;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}