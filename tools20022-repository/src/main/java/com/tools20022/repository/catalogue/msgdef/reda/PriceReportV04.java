package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.repository.catalogue.msgdef.reda.PriceReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.PriceReportFunction1Code;
import com.tools20022.repository.dict.msg.PriceValuation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * SCOPE
 * 
 * A report provider, for example, a transfer agent, fund accountant or market
 * data provider, sends the PriceReport message to the report recipient, for
 * example, a fund management company, transfer agent, market data provider,
 * regulator or any other interested party to provide the net asset value and
 * price information for financial instruments on specific trade dates and,
 * optionally, to quote price variation information.
 * 
 * USAGE
 * 
 * The PriceReport message is sent by the report provider to the report
 * recipient to: - report prices for one or several different financial
 * instruments for one or several different trade dates, - report statistical
 * information about the valuation of a financial instrument, - inform another
 * party that the quotation of a financial instrument is suspended, - report
 * prices that are used for other purposes than the execution of investment
 * funds orders.
 */
@PreviousVersion(PriceReportV03.class)
public class PriceReportV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Pagination MessagePagination;
	private Max35Text PriceReportIdentification;
	private PriceReportFunction1Code Function;
	private Optional<Max35Text> CancellationIdentification;
	private PriceValuation4 PriceValuationDetails;
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

	public Max35Text getPriceReportIdentification() {
		return PriceReportIdentification;
	}

	public void setPriceReportIdentification(Max35Text PriceReportIdentification) {
		this.PriceReportIdentification = PriceReportIdentification;
	}

	public PriceReportFunction1Code getFunction() {
		return Function;
	}

	public void setFunction(PriceReportFunction1Code Function) {
		this.Function = Function;
	}

	public Optional<Max35Text> getCancellationIdentification() {
		return CancellationIdentification;
	}

	public void setCancellationIdentification(
			Optional<Max35Text> CancellationIdentification) {
		this.CancellationIdentification = CancellationIdentification;
	}

	public PriceValuation4 getPriceValuationDetails() {
		return PriceValuationDetails;
	}

	public void setPriceValuationDetails(PriceValuation4 PriceValuationDetails) {
		this.PriceValuationDetails = PriceValuationDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}