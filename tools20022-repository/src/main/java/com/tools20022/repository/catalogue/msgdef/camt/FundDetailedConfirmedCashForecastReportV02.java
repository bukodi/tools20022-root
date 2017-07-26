package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedConfirmedCashForecastReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.FundCashForecast2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The FundDetailedConfirmedCashForecastReport message is sent by a report
 * provider, such as a transfer agent or a designated agent of the fund, to a
 * report user, such as an investment manager, a fund accountant or any other
 * interested party. This message is used to report confirmed cash incomings and
 * outgoings, sorted by country, institution or some other criteria defined by
 * the user. This message can be used to report the confirmed cash movements of
 * one or more investment funds, on one or more trade dates. These cash
 * movements may result from, for example, redemption, subscription, switch
 * transactions or dividends. Usage The FundDetailedConfirmedCashForecastReport
 * is used to provide definitive cash movements, i.e., it is sent after the
 * cut-off time and/or the price valuation of the fund.
 */
@NextVersion(FundDetailedConfirmedCashForecastReportV03.class)
public class FundDetailedConfirmedCashForecastReportV02 {

	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private FundCashForecast2 FundCashForecastDetails;
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

	public FundCashForecast2 getFundCashForecastDetails() {
		return FundCashForecastDetails;
	}

	public void setFundCashForecastDetails(
			FundCashForecast2 FundCashForecastDetails) {
		this.FundCashForecastDetails = FundCashForecastDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}