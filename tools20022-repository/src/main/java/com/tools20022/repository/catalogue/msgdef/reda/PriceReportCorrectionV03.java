package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCorrectionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.PriceCorrection3;

/**
 * Scope A report provider, eg, a transfer agent, fund accountant or market data
 * provider, sends the PriceReportCorrection message to the report recipient,
 * eg, a fund management company, transfer agent, market data provider,
 * regulator or any other interested party to correct at least one of the prices
 * for a financial instrument that was reported in a previously sent PriceReport
 * message. Usage The PriceReportCorrection message is used to correct
 * information reported in a previously sent PriceReport. If an entire
 * PriceReport message must be corrected, eg, due to an incorrect trade date, it
 * is recommended that a PriceReportCancellation message is used to cancel the
 * entire PriceReport message and a new PriceReport sent.
 */
@PreviousVersion(PriceReportCorrectionV02.class)
public class PriceReportCorrectionV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Pagination MessagePagination;
	private PriceCorrection3 PriceCorrectionDetails;

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

	public PriceCorrection3 getPriceCorrectionDetails() {
		return PriceCorrectionDetails;
	}

	public void setPriceCorrectionDetails(
			PriceCorrection3 PriceCorrectionDetails) {
		this.PriceCorrectionDetails = PriceCorrectionDetails;
	}
}