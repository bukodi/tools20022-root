package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header14;
import com.tools20022.repository.dict.msg.AcceptorConfiguration4;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * Update of the acceptor configuration to be downloaded by the terminal
 * management system.
 */
@PreviousVersion(AcceptorConfigurationUpdateV03.class)
@NextVersion(AcceptorConfigurationUpdateV05.class)
public class AcceptorConfigurationUpdateV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header14 Header;
	private AcceptorConfiguration4 AcceptorConfiguration;
	private ContentInformationType12 SecurityTrailer;

	public Header14 getHeader() {
		return Header;
	}

	public void setHeader(Header14 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration4 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration4 AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}