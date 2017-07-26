package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerReconciliationInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType15;
import java.util.Optional;

/**
 * The ReconciliationInitiation message is sent by an acquirer or an agent to an
 * issuer or an agent, to initiate an exchange of totals to be reconciled for
 * debits, credits, chargebacks and other transactions.
 */
public class ReconciliationInitiation {

	private Header17 Header;
	private AcquirerReconciliationInitiation1 ReconciliationInitiation;
	private Optional<ContentInformationType15> SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerReconciliationInitiation1 getReconciliationInitiation() {
		return ReconciliationInitiation;
	}

	public void setReconciliationInitiation(
			AcquirerReconciliationInitiation1 ReconciliationInitiation) {
		this.ReconciliationInitiation = ReconciliationInitiation;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(
			Optional<ContentInformationType15> SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}