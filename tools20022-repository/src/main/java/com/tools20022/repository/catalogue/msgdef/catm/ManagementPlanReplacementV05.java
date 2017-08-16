package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header27;
import com.tools20022.repository.dict.msg.ManagementPlan5;
import com.tools20022.repository.dict.msg.ContentInformationType12;
import java.util.Optional;

/**
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 */
@PreviousVersion(ManagementPlanReplacementV04.class)
@NextVersion(ManagementPlanReplacementV06.class)
public class ManagementPlanReplacementV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header27 Header;
	private ManagementPlan5 ManagementPlan;
	private Optional<ContentInformationType12> SecurityTrailer;

	public Header27 getHeader() {
		return Header;
	}

	public void setHeader(Header27 Header) {
		this.Header = Header;
	}

	public ManagementPlan5 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan5 ManagementPlan) {
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