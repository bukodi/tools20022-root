package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PriceValuation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The PriceReport message is sent by a report provider, eg, a fund
 * accountant, transfer agent, market data provider, or any other interested
 * party, to a report user, eg, a fund management company, a transfer agent,
 * market data provider, regulator or any other interested party. This message
 * is used to provide net asset value and price information for financial
 * instruments on given trade dates and, optionally, to quote price variation
 * information. Usage The PriceReport message can be used to: - report prices
 * for one or several different financial instruments for one or several
 * different trade dates, - report statistical information about the valuation
 * of a financial instrument, - inform another party that the quotation of a
 * financial instrument is suspended, - report prices that are used for other
 * purposes than the execution of investment funds orders.
 */
@NextVersion(PriceReportV03.class)
public class PriceReportV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private PriceValuation2 PriceValuationDetails;
	private Optional<Extension1> Extension;

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

	public PriceValuation2 getPriceValuationDetails() {
		return PriceValuationDetails;
	}

	public void setPriceValuationDetails(PriceValuation2 PriceValuationDetails) {
		this.PriceValuationDetails = PriceValuationDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}