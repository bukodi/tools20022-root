package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.QuoteStatusCode;
import com.tools20022.repository.dict.codeset.RejectionReasonV2Code;
import com.tools20022.repository.dict.entity.Quote;

/**
 * Status of a quote and if required, the rejection reason.
 */
public class QuoteStatus extends Status {

	private QuoteStatusCode Status;
	private RejectionReasonV2Code RejectionReason;
	private Quote RelatedQuote;

	public QuoteStatusCode getStatus() {
		return Status;
	}

	public void setStatus(QuoteStatusCode Status) {
		this.Status = Status;
	}

	public RejectionReasonV2Code getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectionReasonV2Code RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public Quote getRelatedQuote() {
		return RelatedQuote;
	}

	public void setRelatedQuote(Quote RelatedQuote) {
		this.RelatedQuote = RelatedQuote;
	}
}