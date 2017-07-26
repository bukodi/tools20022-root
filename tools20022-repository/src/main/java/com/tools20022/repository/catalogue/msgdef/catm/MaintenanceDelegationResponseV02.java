package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationResponseV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header29;
import com.tools20022.repository.dict.msg.MaintenanceDelegationResponse2;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * The master terminal manager provides the outcome of a maintenance delegation
 * request to a terminal manager.
 */
@PreviousVersion(MaintenanceDelegationResponseV01.class)
public class MaintenanceDelegationResponseV02 {

	private Header29 Header;
	private MaintenanceDelegationResponse2 MaintenanceDelegationResponse;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header29 getHeader() {
		return Header;
	}

	public void setHeader(Header29 Header) {
		this.Header = Header;
	}

	public MaintenanceDelegationResponse2 getMaintenanceDelegationResponse() {
		return MaintenanceDelegationResponse;
	}

	public void setMaintenanceDelegationResponse(
			MaintenanceDelegationResponse2 MaintenanceDelegationResponse) {
		this.MaintenanceDelegationResponse = MaintenanceDelegationResponse;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}