package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCancellationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.choice.DateAndDateTime1Choice;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.msg.PriceReport3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * SCOPE A report provider, for example, a transfer agent, fund accountant or
 * market data provider, sends the PriceReportCancellation message to the report
 * recipient, for example, a fund management company, transfer agent, market
 * data provider, regulator or any other interested party to cancel previously
 * sent prices.
 * 
 * USAGE The PriceReportCancellation message is used to either: - cancel an
 * entire PriceReport that was previously sent (by quoting the business
 * reference of the original price report in the PriceReportIdentification
 * element), or, - cancel one or more individual prices from a previously sent
 * price report (by using the PriceDetailsToBeCancelled sequence). Technically,
 * it is possible to cancel all the prices individually by using the
 * PriceDetailsToBeCancelled sequence, but this is not recommended. The
 * cancellation should not contain the cancellation of prices for more than one
 * NAV date.
 */
@PreviousVersion(PriceReportCancellationV03.class)
public class PriceReportCancellationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Pagination MessagePagination;
	private Max35Text PriceReportIdentification;
	private Max35Text CancellationIdentification;
	private Optional<Max350Text> CancellationReason;
	private Optional<DateAndDateTime1Choice> ExpectedPriceCorrectionDate;
	private YesNoIndicator CompletePriceCancellation;
	private Optional<PriceReport3> CancelledPriceValuationDetails;
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

	public Pagination getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Pagination MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Max35Text getPriceReportIdentification() {
		return PriceReportIdentification;
	}

	public void setPriceReportIdentification(Max35Text PriceReportIdentification) {
		this.PriceReportIdentification = PriceReportIdentification;
	}

	public Max35Text getCancellationIdentification() {
		return CancellationIdentification;
	}

	public void setCancellationIdentification(
			Max35Text CancellationIdentification) {
		this.CancellationIdentification = CancellationIdentification;
	}

	public Optional<Max350Text> getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(Optional<Max350Text> CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Optional<DateAndDateTime1Choice> getExpectedPriceCorrectionDate() {
		return ExpectedPriceCorrectionDate;
	}

	public void setExpectedPriceCorrectionDate(
			Optional<DateAndDateTime1Choice> ExpectedPriceCorrectionDate) {
		this.ExpectedPriceCorrectionDate = ExpectedPriceCorrectionDate;
	}

	public YesNoIndicator getCompletePriceCancellation() {
		return CompletePriceCancellation;
	}

	public void setCompletePriceCancellation(
			YesNoIndicator CompletePriceCancellation) {
		this.CompletePriceCancellation = CompletePriceCancellation;
	}

	public Optional<PriceReport3> getCancelledPriceValuationDetails() {
		return CancelledPriceValuationDetails;
	}

	public void setCancelledPriceValuationDetails(
			Optional<PriceReport3> CancelledPriceValuationDetails) {
		this.CancelledPriceValuationDetails = CancelledPriceValuationDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}