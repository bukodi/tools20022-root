package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.RegulatoryReport;

/**
 * Party responsible for providing regulatory reports.
 */
public class ReportingPartyRole extends Role {

	private RegulatoryReport RegulatoryReport;

	public RegulatoryReport getRegulatoryReport() {
		return RegulatoryReport;
	}

	public void setRegulatoryReport(RegulatoryReport RegulatoryReport) {
		this.RegulatoryReport = RegulatoryReport;
	}
}