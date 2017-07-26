package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedEstimatedCashForecastReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.EstimatedFundCashForecast2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The FundDetailedEstimatedCashForecastReport message is sent by a report
 * provider, such as a transfer agent or a designated agent of the fund, to a
 * report user, such as an investment manager, a fund accountant or any other
 * interested party. This message is used to report estimated cash incomings and
 * outgoings, sorted by country, institution or some other criteria defined by
 * the user. This message can be used to report the estimated cash movements of
 * one or more investment funds, on one or more trade dates. These cash
 * movements may result from, for example, redemption, subscription, switch
 * transactions or dividends. Usage The FundDetailedEstimatedCashForecastReport
 * is used to provide definitive cash movements, i.e., it is sent prior to the
 * cutoff time and/or the price valuation of the fund.
 */
@NextVersion(FundDetailedEstimatedCashForecastReportV03.class)
public class FundDetailedEstimatedCashForecastReportV02 {

	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private EstimatedFundCashForecast2 EstimatedFundCashForecastDetails;
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

	public EstimatedFundCashForecast2 getEstimatedFundCashForecastDetails() {
		return EstimatedFundCashForecastDetails;
	}

	public void setEstimatedFundCashForecastDetails(
			EstimatedFundCashForecast2 EstimatedFundCashForecastDetails) {
		this.EstimatedFundCashForecastDetails = EstimatedFundCashForecastDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}