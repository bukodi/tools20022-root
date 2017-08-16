package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header27;
import com.tools20022.repository.dict.msg.AcceptorConfiguration5;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * Update of the acceptor configuration to be downloaded by the terminal
 * management system.
 */
@PreviousVersion(AcceptorConfigurationUpdateV04.class)
@NextVersion(AcceptorConfigurationUpdateV06.class)
public class AcceptorConfigurationUpdateV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header27 Header;
	private AcceptorConfiguration5 AcceptorConfiguration;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header27 getHeader() {
		return Header;
	}

	public void setHeader(Header27 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration5 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration5 AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}