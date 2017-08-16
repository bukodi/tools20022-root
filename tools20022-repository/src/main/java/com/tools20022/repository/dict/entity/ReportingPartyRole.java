package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.RegulatoryReport;

/**
 * Party responsible for providing regulatory reports.
 */
public class ReportingPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private RegulatoryReport RegulatoryReport;

	public RegulatoryReport getRegulatoryReport() {
		return RegulatoryReport;
	}

	public void setRegulatoryReport(RegulatoryReport RegulatoryReport) {
		this.RegulatoryReport = RegulatoryReport;
	}
}