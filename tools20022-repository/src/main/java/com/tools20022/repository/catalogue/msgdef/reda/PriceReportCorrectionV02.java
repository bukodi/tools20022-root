package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.repository.catalogue.msgdef.reda.PriceReportCorrectionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PriceCorrection2;

/**
 * Scope The PriceReportCorrection message is sent by a report provider, eg, a
 * fund accountant, transfer agent, market data provider, or any other
 * interested party, to a report user, eg, a fund management company, a transfer
 * agent, market data provider, regulator or any other interested party. The
 * message is used to correct at least one of the prices, of a financial
 * instrument, that was quoted in a previously sent PriceReport message. Usage
 * The PriceReportCorrection message is used to correct information in a
 * PriceReport message that was previously sent by the fund accountant. If an
 * entire PriceReport message must be corrected, eg, due to an incorrect trade
 * date, it is recommended that a PriceReportCancellation message is used to
 * cancel the entire PriceReport message and a new PriceReport message is sent.
 */
@NextVersion(PriceReportCorrectionV03.class)
public class PriceReportCorrectionV02 {

	private Optional<AdditionalReference3> PoolReference;
	private AdditionalReference3 PreviousReference;
	private PriceCorrection2 PriceCorrectionDetails;

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

	public PriceCorrection2 getPriceCorrectionDetails() {
		return PriceCorrectionDetails;
	}

	public void setPriceCorrectionDetails(
			PriceCorrection2 PriceCorrectionDetails) {
		this.PriceCorrectionDetails = PriceCorrectionDetails;
	}
}