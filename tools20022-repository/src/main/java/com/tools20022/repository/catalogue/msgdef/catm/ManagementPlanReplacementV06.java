package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header27;
import com.tools20022.repository.dict.msg.ManagementPlan6;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 */
@PreviousVersion(ManagementPlanReplacementV05.class)
public class ManagementPlanReplacementV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header27 Header;
	private ManagementPlan6 ManagementPlan;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header27 getHeader() {
		return Header;
	}

	public void setHeader(Header27 Header) {
		this.Header = Header;
	}

	public ManagementPlan6 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan6 ManagementPlan) {
		this.ManagementPlan = ManagementPlan;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType12> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}