package com.tools20022.repository.catalogue.msgdef.catm;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.catm.ManagementPlanReplacementV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header4;
import com.tools20022.repository.dict.msg.ManagementPlan2;
import com.tools20022.repository.dict.msg.ContentInformationType4;

/**
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 */
@PreviousVersion(ManagementPlanReplacementV01.class)
@NextVersion(ManagementPlanReplacementV03.class)
public class ManagementPlanReplacementV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header4 Header;
	private ManagementPlan2 ManagementPlan;
	private ContentInformationType4 SecurityTrailer;

	public Header4 getHeader() {
		return Header;
	}

	public void setHeader(Header4 Header) {
		this.Header = Header;
	}

	public ManagementPlan2 getManagementPlan() {
		return ManagementPlan;
	}

	public void setManagementPlan(ManagementPlan2 ManagementPlan) {
		this.ManagementPlan = ManagementPlan;
	}

	public ContentInformationType4 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType4 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}