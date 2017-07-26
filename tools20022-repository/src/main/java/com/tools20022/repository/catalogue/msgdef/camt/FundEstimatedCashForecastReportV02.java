package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundEstimatedCashForecastReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.EstimatedFundCashForecast1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The FundEstimatedCashForecastReport message is sent by a report
 * provider, such as a transfer agent or a designated agent of the fund, to a
 * report user, such as an investment manager, a fund accountant or any other
 * interested party. This message is used to report the estimated cash incomings
 * and outgoings of one or more investment funds, on one or more trade dates.
 * These cash movements may result from, for example, redemption, subscription,
 * switch transactions or dividends. Usage The FundEstimatedCashForecastReport
 * message is used to report estimated cash movements, i.e., it is sent prior to
 * the cutoff time and/or the price valuation of the fund.
 */
@NextVersion(FundEstimatedCashForecastReportV03.class)
public class FundEstimatedCashForecastReportV02 {

	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private EstimatedFundCashForecast1 EstimatedFundCashForecastDetails;
	private Optional<Extension1> Extension;

	public Optional<AdditionalReference3> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference3> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public EstimatedFundCashForecast1 getEstimatedFundCashForecastDetails() {
		return EstimatedFundCashForecastDetails;
	}

	public void setEstimatedFundCashForecastDetails(
			EstimatedFundCashForecast1 EstimatedFundCashForecastDetails) {
		this.EstimatedFundCashForecastDetails = EstimatedFundCashForecastDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}