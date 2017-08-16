package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCancellationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PriceReport1;

/**
 * Scope The PriceReportCancellation message is sent by a report provider, eg, a
 * fund accountant, transfer agent, market data provider, or any other
 * interested party, to a report user, eg, a fund management company, a transfer
 * agent, market data provider, regulator or any other interested party. The
 * message is used to cancel a previously sent PriceReport message. Usage The
 * PriceReportCancellation message is used to cancel an entire PriceReport
 * message that was previously sent by the report provider. If only a part of
 * the information needs to be cancelled and replaced, the PriceReportCorrection
 * message must be used. This message must contain the reference of the message
 * to be cancelled. This message may also contain details of the message to be
 * cancelled, but this is not recommended.
 */
@NextVersion(PriceReportCancellationV03.class)
public class PriceReportCancellationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> PoolReference;
	private AdditionalReference3 PreviousReference;
	private Optional<PriceReport1> PriceReportToBeCancelled;

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

	public Optional<PriceReport1> getPriceReportToBeCancelled() {
		return PriceReportToBeCancelled;
	}

	public void setPriceReportToBeCancelled(
			Optional<PriceReport1> PriceReportToBeCancelled) {
		this.PriceReportToBeCancelled = PriceReportToBeCancelled;
	}
}