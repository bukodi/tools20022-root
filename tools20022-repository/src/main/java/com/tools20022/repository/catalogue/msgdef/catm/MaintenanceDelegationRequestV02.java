package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.MaintenanceDelegationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header29;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MaintenanceDelegationRequest2;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * A terminal manager requests to the master terminal manager the delegation of
 * maintenance functions or maintenance operation on the terminal estate managed
 * by the master terminal manager.
 */
@PreviousVersion(MaintenanceDelegationRequestV01.class)
@NextVersion(MaintenanceDelegationRequestV03.class)
public class MaintenanceDelegationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<Header29> Header;
	private MaintenanceDelegationRequest2 MaintenanceDelegationRequest;
	private ContentInformationType12 SecurityTrailer;

	public Optional<Header29> getHeader() {
		return Header;
	}

	public void setHeader(Optional<Header29> Header) {
		this.Header = Header;
	}

	public MaintenanceDelegationRequest2 getMaintenanceDelegationRequest() {
		return MaintenanceDelegationRequest;
	}

	public void setMaintenanceDelegationRequest(
			MaintenanceDelegationRequest2 MaintenanceDelegationRequest) {
		this.MaintenanceDelegationRequest = MaintenanceDelegationRequest;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}