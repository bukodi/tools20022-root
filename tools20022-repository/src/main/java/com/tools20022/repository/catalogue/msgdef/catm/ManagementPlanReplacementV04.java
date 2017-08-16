package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header14;
import com.tools20022.repository.dict.msg.ManagementPlan4;
import com.tools20022.repository.dict.msg.ContentInformationType12;

/**
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 */
@PreviousVersion(ManagementPlanReplacementV03.class)
@NextVersion(ManagementPlanReplacementV05.class)
public class ManagementPlanReplacementV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header14 Header;
	private ManagementPlan4 ManagementPlan;
	private ContentInformationType12 SecurityTrailer;

	public Header14 getHeader() {
		return Header;
	}

	public void setHeader(Header14 Header) {
		this.Header = Header;
	}

	public ManagementPlan4 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan4 ManagementPlan) {
		this.ManagementPlan = ManagementPlan;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}