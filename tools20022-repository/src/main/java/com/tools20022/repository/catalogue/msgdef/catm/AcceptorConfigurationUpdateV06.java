package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header27;
import com.tools20022.repository.dict.msg.AcceptorConfiguration6;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * Update of the acceptor configuration to be downloaded by the terminal
 * management system.
 */
@PreviousVersion(AcceptorConfigurationUpdateV05.class)
public class AcceptorConfigurationUpdateV06 {

	private Header27 Header;
	private AcceptorConfiguration6 AcceptorConfiguration;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header27 getHeader() {
		return Header;
	}

	public void setHeader(Header27 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration6 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration6 AcceptorConfiguration) {
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