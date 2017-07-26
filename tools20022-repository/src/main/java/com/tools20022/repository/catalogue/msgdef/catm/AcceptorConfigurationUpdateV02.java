package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.AcceptorConfiguration2;
import com.tools20022.repository.dict.msg.ContentInformationType4;

/**
 * Update of the acceptor configuration to be dowloaded by the terminal
 * management system.
 */
@PreviousVersion(AcceptorConfigurationUpdateV01.class)
@NextVersion(AcceptorConfigurationUpdateV03.class)
public class AcceptorConfigurationUpdateV02 {

	private Header4 Header;
	private AcceptorConfiguration2 AcceptorConfiguration;
	private ContentInformationType4 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration2 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration2 AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public ContentInformationType4 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType4 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}