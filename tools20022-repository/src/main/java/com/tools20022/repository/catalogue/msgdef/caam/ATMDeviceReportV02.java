package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMDeviceReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header31;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDeviceReport1;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by
 * an agent, to report: - The result of maintenance commands performed by the
 * ATM, - The components of the ATM, - The status of the ATM components
 */
@PreviousVersion(ATMDeviceReportV01.class)
public class ATMDeviceReportV02 {

	private Header31 Header;
	private Optional<ContentInformationType10> ProtectedATMDeviceReport;
	private Optional<ATMDeviceReport1> ATMDeviceReport;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header31 getHeader() {
		return Header;
	}

	public void setHeader(Header31 Header) {
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