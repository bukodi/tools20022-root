package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCancellationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCancellationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.PriceReport2;

/**
 * Scope A report provider, eg, a transfer agent, fund accountant or market data
 * provider, sends the PriceReportCancellation message to the report recipient,
 * eg, a fund management company, transfer agent, market data provider,
 * regulator or any other interested party to cancel a previously sent
 * PriceReport message. Usage The PriceReportCancellation is used to cancel an
 * entire PriceReport message that was previously sent. If only a part of the
 * information needs to be cancelled and replaced, the PriceReportCorrection
 * message must be used. This message must contain the reference of the message
 * to be cancelled.This message may also contain details of the message to be
 * cancelled, but this is not recommended.
 */
@PreviousVersion(PriceReportCancellationV02.class)
@NextVersion(PriceReportCancellationV04.class)
public class PriceReportCancellationV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private AdditionalReference3 PreviousReference;
	private Pagination MessagePagination;
	private Optional<PriceReport2> PriceReportToBeCancelled;

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

	public AdditionalReference3 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(AdditionalReference3 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Pagination getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Pagination MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Optional<PriceReport2> getPriceReportToBeCancelled() {
		return PriceReportToBeCancelled;
	}

	public void setPriceReportToBeCancelled(
			Optional<PriceReport2> PriceReportToBeCancelled) {
		this.PriceReportToBeCancelled = PriceReportToBeCancelled;
	}
}