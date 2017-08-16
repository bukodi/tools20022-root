package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caam.ATMDeviceReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDeviceReport1;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by
 * an agent, to report: - The result of maintenance commands performed by the
 * ATM, - The components of the ATM, - The status of the ATM components
 */
@NextVersion(ATMDeviceReportV02.class)
public class ATMDeviceReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMDeviceReport;
	private Optional<ATMDeviceReport1> ATMDeviceReport;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDeviceReport() {
		return ProtectedATMDeviceReport;
	}

	public void setProtectedATMDeviceReport(
			Optional<ContentInformationType10> ProtectedATMDeviceReport) {
		this.ProtectedATMDeviceReport = ProtectedATMDeviceReport;
	}

	public Optional<ATMDeviceReport1> getATMDeviceReport() {
		return ATMDeviceReport;
	}

	public void setATMDeviceReport(Optional<ATMDeviceReport1> ATMDeviceReport) {
		this.ATMDeviceReport = ATMDeviceReport;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}