package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.AcceptorConfiguration3;
import com.tools20022.repository.dict.msg.ContentInformationType9;

/**
 * Update of the acceptor configuration to be dowloaded by the terminal
 * management system.
 */
@PreviousVersion(AcceptorConfigurationUpdateV02.class)
@NextVersion(AcceptorConfigurationUpdateV04.class)
public class AcceptorConfigurationUpdateV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header4 Header;
	private AcceptorConfiguration3 AcceptorConfiguration;
	private ContentInformationType9 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration3 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration3 AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType9 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}