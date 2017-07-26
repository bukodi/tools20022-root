package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundConfirmedCashForecastReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.FundConfirmedCashForecastReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.FundCashForecast3;
import com.tools20022.repository.dict.msg.NetCashForecast3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundConfirmedCashForecastReport message to the report user, such as an
 * investment manager, to report the confirmed cash incomings and outgoings of
 * one or more investment funds on one or more trade dates. The cash movements
 * may result from, for example, redemption, subscription, switch transactions
 * or reinvestment of dividends. Usage The FundConfirmedCashForecastReport is
 * used to report definitive cash movements, that is it is sent after the
 * cut-off time and/or the price valuation of the fund. This message contains
 * incoming and outgoing cash flows that are confirmed, i.e., the price has been
 * applied. If the price is not yet definitive, then the
 * FundEstimatedCashForecastReport message must be used. This message allows the
 * report provider to report cash movements in or out of a fund, but does not
 * allow the Sender to categorise these movements, for example by country, or to
 * give details of the underlying orders, commission or charges. If the report
 * provider wishes to give detailed information related to cash movements, then
 * the FundDetailedConfirmedCashForecastReport message must be used.
 */
@PreviousVersion(FundConfirmedCashForecastReportV02.class)
@NextVersion(FundConfirmedCashForecastReportV04.class)
public class FundConfirmedCashForecastReportV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private FundCashForecast3 FundCashForecastDetails;
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

	public FundCashForecast3 getFundCashForecastDetails() {
		return FundCashForecastDetails;
	}

	public void setFundCashForecastDetails(
			FundCashForecast3 FundCashForecastDetails) {
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