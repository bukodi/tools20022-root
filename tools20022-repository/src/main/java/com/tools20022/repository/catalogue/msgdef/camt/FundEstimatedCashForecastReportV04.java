package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundEstimatedCashForecastReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Fund1;
import com.tools20022.repository.dict.msg.EstimatedFundCashForecast6;
import com.tools20022.repository.dict.msg.NetCashForecast3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundEstimatedCashForecastReport message to the report user, such as an
 * investment manager or pricing agent, to report the estimated cash incomings
 * and outgoings of one or more share classes of an investment fund on one or
 * more trade dates. The cash movements may result from, for example,
 * redemption, subscription, switch transactions or reinvestment of dividends.
 * Usage The FundEstimatedCashForecastReport is used to report estimated cash
 * movements, that is, it is sent prior to the cut-off time and/or the price
 * valuation of the fund. The message contains incoming and outgoing cash flows
 * that are estimated, that is, the price has not been applied. If the price is
 * definitive, then the FundConfirmedCashForecastReport message must be used.
 * The message structure allows for the following uses: - to provide cash in and
 * cash out amounts for a fund/sub fund (FundOrSubFundDetails sequence is used),
 * - to provide cash in and cash out amounts for a fund/sub fund and one or more
 * share classes (a FundOrSubFundDetails sequence and one or more
 * EstimatedFundCashForecastDetails sequences are used), - to provide cash in
 * and cash out amounts for one or more share classes (one or more
 * EstimatedFundCashForecastDetails sequences are used). - to provide cash in
 * and cash out amounts for more than one fund/sub fund, and more than one share
 * classes (two or more FundOrSubFundDetails sequences and two or more
 * EstimatedFundCashForecastDetails sequences and used); however, it should be
 * noted that, in this usage, there is no way to determine which share class
 * belongs to which fund/sub fund from the message content itself, which may not
 * be desirable and the use of this kind of combination should be bilaterally
 * agreed. This message allows the report provider to report estimated cash
 * movements in or out of a fund, but does not allow the Sender to categorise
 * these movements, for example by country, or to give details of the underlying
 * orders, commission or charges. If the report provider wishes to give detailed
 * information related to estimated cash movements, then the
 * FundDetailedEstimatedCashForecastReport message must be used.
 */
@PreviousVersion(FundEstimatedCashForecastReportV03.class)
public class FundEstimatedCashForecastReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Optional<Fund1> FundOrSubFundDetails;
	private Optional<EstimatedFundCashForecast6> EstimatedFundCashForecastDetails;
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

	public Optional<Fund1> getFundOrSubFundDetails() {
		return FundOrSubFundDetails;
	}

	public void setFundOrSubFundDetails(Optional<Fund1> FundOrSubFundDetails) {
		this.FundOrSubFundDetails = FundOrSubFundDetails;
	}

	public Optional<EstimatedFundCashForecast6> getEstimatedFundCashForecastDetails() {
		return EstimatedFundCashForecastDetails;
	}

	public void setEstimatedFundCashForecastDetails(
			Optional<EstimatedFundCashForecast6> EstimatedFundCashForecastDetails) {
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