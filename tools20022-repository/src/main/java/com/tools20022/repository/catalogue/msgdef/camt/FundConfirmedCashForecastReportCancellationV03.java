package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundConfirmedCashForecastReportCancellationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.FundConfirmedCashForecastReport3;

/**
 * Scope A report provider, such as a transfer agent, sends the
 * FundConfirmedCashForecastReportCancellation message to the report user, such
 * as an investment manager or pricing agent, to cancel a previously sent
 * FundConfirmedCashForecastReport message. Usage The
 * FundConfirmedCashForecastReportCancellation message is used to cancel an
 * entire FundConfirmedCashForecastReport message that was previously sent by
 * the report provider. This message must contain reference to the of the
 * message being cancelled. This message may also contain details of the message
 * to be cancelled, but this is not recommended.
 */
@PreviousVersion(FundConfirmedCashForecastReportCancellationV02.class)
public class FundConfirmedCashForecastReportCancellationV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Optional<FundConfirmedCashForecastReport3> CashForecastReportToBeCancelled;

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

	public Optional<FundConfirmedCashForecastReport3> getCashForecastReportToBeCancelled() {
		return CashForecastReportToBeCancelled;
	}

	public void setCashForecastReportToBeCancelled(
			Optional<FundConfirmedCashForecastReport3> CashForecastReportToBeCancelled) {
		this.CashForecastReportToBeCancelled = CashForecastReportToBeCancelled;
	}
}