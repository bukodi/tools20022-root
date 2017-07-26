package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.FundConfirmedCashForecastReportCancellationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.FundConfirmedCashForecastReport1;

/**
 * Scope The FundConfirmedCashForecastReportCancellation message is sent by a
 * report provider, such as a transfer agent or a designated agent of the fund,
 * to a report user, such as an investment manager, a fund accountant or any
 * other interested party. This message is used to cancel a previously sent
 * FundConfirmedCashForecastReport message. Usage The
 * FundConfirmedCashForecastReportCancellation message is used to cancel an
 * entire FundConfirmedCashForecastReport message that was previously sent by
 * the report provider. This message must contain the reference of the message
 * to be cancelled. This message may also contain details of the message to be
 * cancelled, but this is not recommended.
 */
@NextVersion(FundConfirmedCashForecastReportCancellationV02.class)
public class FundConfirmedCashForecastReportCancellationV01 {

	private Optional<AdditionalReference3> PoolReference;
	private AdditionalReference3 PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<FundConfirmedCashForecastReport1> CashForecastReportToBeCancelled;

	public Optional<AdditionalReference3> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference3> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public AdditionalReference3 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(AdditionalReference3 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Optional<FundConfirmedCashForecastReport1> getCashForecastReportToBeCancelled() {
		return CashForecastReportToBeCancelled;
	}

	public void setCashForecastReportToBeCancelled(
			Optional<FundConfirmedCashForecastReport1> CashForecastReportToBeCancelled) {
		this.CashForecastReportToBeCancelled = CashForecastReportToBeCancelled;
	}
}