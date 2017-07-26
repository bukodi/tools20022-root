package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.ManagementPlan1;
import com.tools20022.repository.dict.msg.ContentInformationType1;

/**
 * Scope The ManagementPlanReplacement message is sent by the master terminal
 * manager or delegated terminal manager to the acceptor system to replace the
 * TMS action list of the POI system. Usage The ManagementPlanReplacement
 * message may embed the information required by the acceptor system for the
 * planning of the TMS actions to be performed by the POI including the trigger,
 * time conditions and TMS addresses.
 */
@NextVersion(ManagementPlanReplacementV02.class)
public class ManagementPlanReplacementV01 {

	private Header4 Header;
	private ManagementPlan1 ManagementPlan;
	private ContentInformationType1 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public ManagementPlan1 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan1 ManagementPlan) {
		this.ManagementPlan = ManagementPlan;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}