package com.tools20022.repository.catalogue.msgdef.caam;

import com.tools20022.repository.catalogue.msgdef.caam.ATMDeviceControlV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.repository.dict.msg.ContentInformationType10;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ATMDeviceControl1;
import com.tools20022.repository.dict.msg.ContentInformationType13;

/**
 * The ATMDeviceControl message is sent by a maintenance host to an ATM in
 * response to an ATMDeviceReport message. The message contains a sequence of
 * maintenance commands the ATM must perform.
 */
@NextVersion(ATMDeviceControlV02.class)
public class ATMDeviceControlV01 {

	private Header20 Header;
	private Optional<ContentInformationType10> ProtectedATMDeviceControl;
	private Optional<ATMDeviceControl1> ATMDeviceControl;
	private Optional<ContentInformationType13> SecurityTrailer;

	public Header20 getHeader() {
		return Header;
	}

	public void setHeader(Header20 Header) {
		this.Header = Header;
	}

	public Optional<ContentInformationType10> getProtectedATMDeviceControl() {
		return ProtectedATMDeviceControl;
	}

	public void setProtectedATMDeviceControl(
			Optional<ContentInformationType10> ProtectedATMDeviceControl) {
		this.ProtectedATMDeviceControl = ProtectedATMDeviceControl;
	}

	public Optional<ATMDeviceControl1> getATMDeviceControl() {
		return ATMDeviceControl;
	}

	public void setATMDeviceControl(Optional<ATMDeviceControl1> ATMDeviceControl) {
		this.ATMDeviceControl = ATMDeviceControl;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType13> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}