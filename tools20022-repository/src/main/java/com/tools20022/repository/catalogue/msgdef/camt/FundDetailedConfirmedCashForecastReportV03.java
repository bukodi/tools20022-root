package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedConfirmedCashForecastReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedConfirmedCashForecastReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.FundCashForecast4;
import com.tools20022.repository.dict.msg.NetCashForecast3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundDetailedConfirmedCashForecastReport message to the report user, such as
 * an investment manager, to report the confirmed cash incomings and outgoings,
 * sorted by country, institution name or other criteria defined by the user of
 * one or more investment funds on one or more trade dates. The cash movements
 * may result from, for example, redemption, subscription, switch transactions
 * or reinvestment of dividends. Usage The
 * FundDetailedConfirmedCashForecastReport is used to provide definitive cash
 * movements, i.e., it is sent after the cut-off time and/or the price valuation
 * of the fund. If the price is not yet definitive, then the
 * FundDetailedEstimatedCashForecastReport message must be used. The
 * FundDetailedConfirmedCashForecastReport message is used to report cash
 * movements in or out of a fund, organised by party, such as fund management
 * company, country, currency or by some other criteria defined by the report
 * provider. If the report is used to given the cash-in and cash-out for a
 * party, then additional criteria, such as currency and country, can be
 * specified. In addition, the underlying transaction type for the cash-in or
 * cash-out movement can be specified, as well as information about the cash
 * movement's underlying orders, such as commission and charges.
 */
@PreviousVersion(FundDetailedConfirmedCashForecastReportV02.class)
@NextVersion(FundDetailedConfirmedCashForecastReportV04.class)
public class FundDetailedConfirmedCashForecastReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private FundCashForecast4 FundCashForecastDetails;
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

	public FundCashForecast4 getFundCashForecastDetails() {
		return FundCashForecastDetails;
	}

	public void setFundCashForecastDetails(
			FundCashForecast4 FundCashForecastDetails) {
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