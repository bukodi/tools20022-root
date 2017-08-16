package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralAndExposureReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReportParameters2;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.Agreement2;
import com.tools20022.repository.dict.msg.Collateral9;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This message is sent: - either by the collateral giver, or its
 * collateral manager, to the collateral taker, or its collateral manager, or -
 * or by the collateral taker, or its collateral manager to the collateral
 * giver, or its collateral manager
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralAndExposureReport is used to provide the details of the
 * valuation of the collateral, that is, the valuation of securities collateral,
 * cash collateral or other type of collateral, posted at a specific calculation
 * date.
 */
@NextVersion(CollateralAndExposureReportV03.class)
public class CollateralAndExposureReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportParameters2 ReportParameters;
	private Optional<Pagination> Pagination;
	private Obligation3 Obligation;
	private Optional<Agreement2> Agreement;
	private Collateral9 CollateralReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters2 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters2 ReportParameters) {
		this.ReportParameters = ReportParameters;
	}

	public Optional<Pagination> getPagination() {
		return Pagination;
	}

	public void setPagination(Optional<Pagination> Pagination) {
		this.Pagination = Pagination;
	}

	public Obligation3 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation3 Obligation) {
		this.Obligation = Obligation;
	}

	public Optional<Agreement2> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement2> Agreement) {
		this.Agreement = Agreement;
	}

	public Collateral9 getCollateralReport() {
		return CollateralReport;
	}

	public void setCollateralReport(Collateral9 CollateralReport) {
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