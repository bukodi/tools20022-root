package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundConfirmedCashForecastReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Fund2;
import com.tools20022.repository.dict.msg.FundCashForecast7;
import com.tools20022.repository.dict.msg.NetCashForecast3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundConfirmedCashForecastReport message to the report user, such as an
 * investment manager or pricing agent, to report the confirmed cash incomings
 * and outgoings of one or more share classes of an investment fund on one or
 * more trade dates. The cash movements may result from, for example,
 * redemption, subscription, switch transactions or reinvestment of dividends.
 * Usage The FundConfirmedCashForecastReport is used to report definitive cash
 * movements, that is it is sent after the cut-off time and/or the price
 * valuation of the fund. This message contains incoming and outgoing cash flows
 * that are confirmed, that is, the price has been applied. If the price is not
 * yet definitive, then the FundEstimatedCashForecastReport message must be
 * used. The message structure allows for the following uses: - to provide cash
 * in and cash out amounts for a fund/sub fund (a FundOrSubFundDetails sequence
 * is used), - to provide cash in and cash out amounts for a fund/sub fund and
 * one or more share classes (FundOrSubFundDetails sequence and one or more
 * FundCashForecastDetails sequences are used), - to provide cash in and cash
 * out amounts for one or more share classes (one or more
 * FundCashForecastDetails sequences are used). - to provide cash in and cash
 * out amounts for more than one fund/sub fund, and more than one share classes
 * (two or more FundOrSubFundDetails sequences and two or more
 * FundCashForecastDetails sequences and used); however, it should be noted
 * that, in this usage, there is no way to determine which share class belongs
 * to which fund/sub fund from the message content itself, which may not be
 * desirable and the use of this kind of combination should be bilaterally
 * agreed. This message allows the report provider to report cash movements in
 * or out of a fund, but does not allow the Sender to categorise these
 * movements, for example by country, or to give details of the underlying
 * orders, commission or charges. If the report provider wishes to give detailed
 * information related to cash movements, then the
 * FundDetailedConfirmedCashForecastReport message must be used.
 */
@PreviousVersion(FundConfirmedCashForecastReportV03.class)
public class FundConfirmedCashForecastReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Optional<Fund2> FundOrSubFundDetails;
	private Optional<FundCashForecast7> FundCashForecastDetails;
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

	public Optional<Fund2> getFundOrSubFundDetails() {
		return FundOrSubFundDetails;
	}

	public void setFundOrSubFundDetails(Optional<Fund2> FundOrSubFundDetails) {
		this.FundOrSubFundDetails = FundOrSubFundDetails;
	}

	public Optional<FundCashForecast7> getFundCashForecastDetails() {
		return FundCashForecastDetails;
	}

	public void setFundCashForecastDetails(
			Optional<FundCashForecast7> FundCashForecastDetails) {
		this.FundCashForecastDetails = FundCashForecastDetails;
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