package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedConfirmedCashForecastReportCancellationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.FundDetailedConfirmedCashForecastReportCancellationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.FundDetailedConfirmedCashForecastReport2;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundDetailedConfirmedCashForecastReportCancellation messages to the report
 * user, such as an investment manager, fund accountant or any other interested
 * party, to cancel a previously sent FundDetailedConfirmedCashForecastReport.
 * Usage The FundDetailedConfirmedCashForecastReportCancellation message is used
 * to cancel an entire FundDetailedConfirmedCashForecastReport message that was
 * previously sent. This message must contain the reference of the message to be
 * cancelled. This message may also contain details of the message to be
 * cancelled, but this is not recommended.
 */
@PreviousVersion(FundDetailedConfirmedCashForecastReportCancellationV01.class)
@NextVersion(FundDetailedConfirmedCashForecastReportCancellationV03.class)
public class FundDetailedConfirmedCashForecastReportCancellationV02 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Optional<FundDetailedConfirmedCashForecastReport2> CashForecastReportToBeCancelled;

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

	public Optional<FundDetailedConfirmedCashForecastReport2> getCashForecastReportToBeCancelled() {
		return CashForecastReportToBeCancelled;
	}

	public void setCashForecastReportToBeCancelled(
			Optional<FundDetailedConfirmedCashForecastReport2> CashForecastReportToBeCancelled) {
		this.CashForecastReportToBeCancelled = CashForecastReportToBeCancelled;
	}
}