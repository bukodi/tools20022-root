package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerNetworkManagementInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The NetworkManagementInitiation message covers the range of activities to
 * control the operating condition of the network and may be initiated by any
 * party to an acquirer, an issuer or an agent.
 */
public class NetworkManagementInitiation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header17 Header;
	private AcquirerNetworkManagementInitiation1 NetworkManagementInitiation;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerNetworkManagementInitiation1 getNetworkManagementInitiation() {
		return NetworkManagementInitiation;
	}

	public void setNetworkManagementInitiation(
			AcquirerNetworkManagementInitiation1 NetworkManagementInitiation) {
		this.NetworkManagementInitiation = NetworkManagementInitiation;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}