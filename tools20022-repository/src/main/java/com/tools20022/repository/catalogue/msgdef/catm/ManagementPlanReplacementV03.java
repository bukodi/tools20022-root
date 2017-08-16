package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.ManagementPlan3;
import com.tools20022.repository.dict.msg.ContentInformationType9;

/**
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 */
@PreviousVersion(ManagementPlanReplacementV02.class)
@NextVersion(ManagementPlanReplacementV04.class)
public class ManagementPlanReplacementV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header4 Header;
	private ManagementPlan3 ManagementPlan;
	private ContentInformationType9 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public ManagementPlan3 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan3 ManagementPlan) {
		this.ManagementPlan = ManagementPlan;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType9 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}