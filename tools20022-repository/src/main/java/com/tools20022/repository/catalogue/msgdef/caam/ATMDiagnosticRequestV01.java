package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMDiagnosticRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDiagnosticRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify
 * the availability of the acquirer. The acquirer will also validate that this
 * ATM is a valid ATM for its particular network.
 */
@NextVersion(ATMDiagnosticRequestV02.class)
public class ATMDiagnosticRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMDiagnosticRequest;
	private Optional<ATMDiagnosticRequest1> ATMDiagnosticRequest;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDiagnosticRequest() {
		return ProtectedATMDiagnosticRequest;
	}

	public void setProtectedATMDiagnosticRequest(
			Optional<ContentInformationType10> ProtectedATMDiagnosticRequest) {
		this.ProtectedATMDiagnosticRequest = ProtectedATMDiagnosticRequest;
	}

	public Optional<ATMDiagnosticRequest1> getATMDiagnosticRequest() {
		return ATMDiagnosticRequest;
	}

	public void setATMDiagnosticRequest(
			Optional<ATMDiagnosticRequest1> ATMDiagnosticRequest) {
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