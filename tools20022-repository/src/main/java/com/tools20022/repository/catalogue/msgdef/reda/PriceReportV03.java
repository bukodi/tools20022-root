package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.reda.PriceReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.PriceValuation3;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A report provider, eg, a transfer agent, fund accountant or market data
 * provider, sends the PriceReport message to the report recipient, eg, a fund
 * management company, transfer agent, market data provider, regulator or other
 * interested party to provide the net asset value and price information for
 * financial instruments on specific trade dates and, optionally, to quote price
 * variation information. Usage The PriceReport message is used to: - report
 * prices for one or several different financial instruments for one or several
 * different trade dates, - report statistical information about the valuation
 * of a financial instrument, - inform another party that the quotation of a
 * financial instrument is suspended, - report prices that are used for purposes
 * other than the execution of investment funds orders.
 */
@PreviousVersion(PriceReportV02.class)
@NextVersion(PriceReportV04.class)
public class PriceReportV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private PriceValuation3 PriceValuationDetails;
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

	public PriceValuation3 getPriceValuationDetails() {
		return PriceValuationDetails;
	}

	public void setPriceValuationDetails(PriceValuation3 PriceValuationDetails) {
		this.PriceValuationDetails = PriceValuationDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}