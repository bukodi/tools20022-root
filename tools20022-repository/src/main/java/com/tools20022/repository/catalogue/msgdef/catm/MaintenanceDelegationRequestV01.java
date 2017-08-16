package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header16;
import com.tools20022.repository.dict.msg.MaintenanceDelegationRequest1;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * A terminal manager requests to the master terminal manager the delegation of
 * maintenance functions or maintenance operation on the terminal estate managed
 * by the master terminal manager.
 */
@NextVersion(MaintenanceDelegationRequestV02.class)
public class MaintenanceDelegationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header16 Header;
	private MaintenanceDelegationRequest1 MaintenanceDelegationRequest;
	private ContentInformationType12 SecurityTrailer;

	public Header16 getHeader() {
		return Header;
	}

	public void setHeader(Header16 Header) {
		this.Header = Header;
	}

	public MaintenanceDelegationRequest1 getMaintenanceDelegationRequest() {
		return MaintenanceDelegationRequest;
	}

	public void setMaintenanceDelegationRequest(
			MaintenanceDelegationRequest1 MaintenanceDelegationRequest) {
		this.MaintenanceDelegationRequest = MaintenanceDelegationRequest;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}