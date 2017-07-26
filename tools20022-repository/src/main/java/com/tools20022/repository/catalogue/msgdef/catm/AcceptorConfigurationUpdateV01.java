package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.AcceptorConfigurationUpdateV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.AcceptorConfiguration1;
import com.tools20022.repository.dict.msg.ContentInformationType1;

/**
 * Scope The AcceptorConfigurationUpdate message is sent by the master terminal
 * manager or delegated terminal manager to the acceptor system for the update
 * of acquirer parameters, merchant parameters, vendor parameters or
 * cryptographic keys of the acquirer. Usage The AcceptorConfigurationUpdate
 * message may embed the information required by the acceptor system for the
 * configuration of: - the application parameters necessary for software
 * applications processed by the POI system, - the acquirer protocol parameters
 * for the message content and message exchange behaviour of the acquirer
 * protocol supported by the POI system, - the host communication parameters to
 * define the addresses of the connected acquirer hosts, and - the merchant
 * parameters needed for the retailer protocol settings of the POI system.
 */
@NextVersion(AcceptorConfigurationUpdateV02.class)
public class AcceptorConfigurationUpdateV01 {

	private Header4 Header;
	private AcceptorConfiguration1 AcceptorConfiguration;
	private ContentInformationType1 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public AcceptorConfiguration1 getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration1 AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}