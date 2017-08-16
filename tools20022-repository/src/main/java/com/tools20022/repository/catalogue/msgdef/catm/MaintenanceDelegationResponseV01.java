package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationResponseV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header16;
import com.tools20022.repository.dict.msg.MaintenanceDelegationResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * The master terminal manager provides the outcome of a maintenance delegation
 * request to a terminal manager.
 */
@NextVersion(MaintenanceDelegationResponseV02.class)
public class MaintenanceDelegationResponseV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header16 Header;
	private MaintenanceDelegationResponse1 MaintenanceDelegationResponse;
	private ContentInformationType12 SecurityTrailer;

	public Header16 getHeader() {
		return Header;
	}

	public void setHeader(Header16 Header) {
		this.Header = Header;
	}

	public MaintenanceDelegationResponse1 getMaintenanceDelegationResponse() {
		return MaintenanceDelegationResponse;
	}

	public void setMaintenanceDelegationResponse(
			MaintenanceDelegationResponse1 MaintenanceDelegationResponse) {
		this.MaintenanceDelegationResponse = MaintenanceDelegationResponse;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}