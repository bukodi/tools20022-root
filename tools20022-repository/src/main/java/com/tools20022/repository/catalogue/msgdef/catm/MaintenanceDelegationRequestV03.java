package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header29;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MaintenanceDelegationRequest3;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * A terminal manager requests to the master terminal manager the delegation of
 * maintenance functions or maintenance operation on the terminal estate managed
 * by the master terminal manager.
 */
@PreviousVersion(MaintenanceDelegationRequestV02.class)
public class MaintenanceDelegationRequestV03 {

	private Optional<Header29> Header;
	private MaintenanceDelegationRequest3 MaintenanceDelegationRequest;
	private ContentInformationType12 SecurityTrailer;

	public Optional<Header29> getHeader() {
		return Header;
	}

	public void setHeader(Optional<Header29> Header) {
		this.Header = Header;
	}

	public MaintenanceDelegationRequest3 getMaintenanceDelegationRequest() {
		return MaintenanceDelegationRequest;
	}

	public void setMaintenanceDelegationRequest(
			MaintenanceDelegationRequest3 MaintenanceDelegationRequest) {
		this.MaintenanceDelegationRequest = MaintenanceDelegationRequest;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}