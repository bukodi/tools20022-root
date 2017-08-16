package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralAndExposureReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ReportParameters5;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import com.tools20022.repository.dict.msg.Collateral13;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CollateralAndExposureReport message is sent: - either by the
 * collateral giver, or its collateral manager, to the collateral taker, or its
 * collateral manager, or - or by the collateral taker, or its collateral
 * manager to the collateral giver, or its collateral manager
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralAndExposureReport is used to provide the details of the
 * valuation of the collateral, that is, the valuation of securities collateral,
 * cash collateral or other type of collateral, posted at a specific calculation
 * date.
 */
@PreviousVersion(CollateralAndExposureReportV02.class)
public class CollateralAndExposureReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportParameters5 ReportParameters;
	private Optional<Pagination> Pagination;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private Collateral13 CollateralReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters5 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters5 ReportParameters) {
		this.ReportParameters = ReportParameters;
	}

	public Optional<Pagination> getPagination() {
		return Pagination;
	}

	public void setPagination(Optional<Pagination> Pagination) {
		this.Pagination = Pagination;
	}

	public Obligation4 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation4 Obligation) {
		this.Obligation = Obligation;
	}

	public Optional<Agreement4> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement4> Agreement) {
		this.Agreement = Agreement;
	}

	public Collateral13 getCollateralReport() {
		return CollateralReport;
	}

	public void setCollateralReport(Collateral13 CollateralReport) {
		this.CollateralReport = CollateralReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}