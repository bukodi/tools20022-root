package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedEstimatedCashForecastReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Fund3;
import com.tools20022.repository.dict.msg.EstimatedFundCashForecast5;
import com.tools20022.repository.dict.msg.NetCashForecast3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundDetailedEstimatedCashForecastReport message to the report user, such as
 * an investment manager or pricing agent, to report the estimated cash
 * incomings and outgoings, sorted by country, institution name or other
 * criteria defined by the user of one or more share classes of an investment
 * fund on one or more trade dates. The cash movements may result from, for
 * example, redemption, subscription, switch transactions or reinvestment of
 * dividends. Usage The FundDetailedEstimatedCashForecastReport is used to
 * provide estimated cash movements, that is, it is sent prior to the cut-off
 * time and/or the price valuation of the fund. The message contains incoming
 * and outgoing cash flows that are estimated, that is, the price has not been
 * applied. If the price is definitive, then the
 * FundDetailedConfirmedCashForecastReport message must be used. The message
 * structure allows for the following uses: - to provide cash in and cash out
 * amounts for a fund/sub fund and one or more share classes (a
 * FundOrSubFundDetails sequence and one or more
 * EstimatedFundCashForecastDetails sequences are used), - to provide cash in
 * and cash out amounts for one or more share classes (one or more
 * EstimatedFundCashForecastDetails sequences are used). If the report is to
 * provide estimated cash in and cash out for a fund/sub fund only and not for
 * one or more share classes, then the FundEstimatedCashForecastReport message
 * must be used. The FundDetailedEstimatedCashForecastReport message is used to
 * report cash movements in or out of a fund, organised by party, such as fund
 * management company, country, currency or by some other criteria defined by
 * the report provider. If the report is used to give the cash-in and cash-out
 * for a party, then additional criteria, such as currency and country, can be
 * specified. In addition, the underlying transaction type for the cash-in or
 * cash-out movement can be specified, as well as information about the cash
 * movement's underlying orders, such as commission and charges.
 */
@PreviousVersion(FundDetailedEstimatedCashForecastReportV03.class)
public class FundDetailedEstimatedCashForecastReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Optional<Fund3> FundOrSubFundDetails;
	private EstimatedFundCashForecast5 EstimatedFundCashForecastDetails;
	private Optional<NetCashForecast3> ConsolidatedNetCashForecast;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

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

	public Pagination getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Pagination MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Optional<Fund3> getFundOrSubFundDetails() {
		return FundOrSubFundDetails;
	}

	public void setFundOrSubFundDetails(Optional<Fund3> FundOrSubFundDetails) {
		this.FundOrSubFundDetails = FundOrSubFundDetails;
	}

	public EstimatedFundCashForecast5 getEstimatedFundCashForecastDetails() {
		return EstimatedFundCashForecastDetails;
	}

	public void setEstimatedFundCashForecastDetails(
			EstimatedFundCashForecast5 EstimatedFundCashForecastDetails) {
		this.EstimatedFundCashForecastDetails = EstimatedFundCashForecastDetails;
	}

	public Optional<NetCashForecast3> getConsolidatedNetCashForecast() {
		return ConsolidatedNetCashForecast;
	}

	public void setConsolidatedNetCashForecast(
			Optional<NetCashForecast3> ConsolidatedNetCashForecast) {
		this.ConsolidatedNetCashForecast = ConsolidatedNetCashForecast;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}