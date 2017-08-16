package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerNetworkManagementResponse1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The NetworkManagementResponse message is sent by an acquirer, an issuer or an
 * agent to answer to an NetworkManagementInitiation message.
 */
public class NetworkManagementResponse
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header17 Header;
	private AcquirerNetworkManagementResponse1 NetworkManagementResponse;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerNetworkManagementResponse1 getNetworkManagementResponse() {
		return NetworkManagementResponse;
	}

	public void setNetworkManagementResponse(
			AcquirerNetworkManagementResponse1 NetworkManagementResponse) {
		this.NetworkManagementResponse = NetworkManagementResponse;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}