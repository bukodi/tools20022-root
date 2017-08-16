package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Header17;
import com.tools20022.repository.dict.msg.AcquirerFinancialInitiation1;
import com.tools20022.repository.dict.msg.ContentInformationType15;

/**
 * The AcquirerFinancialInitiation message is sent by an acquirer or an agent to
 * an issuer or an agent, to request, advice or notify the approval and the
 * clearing of a card transaction.
 */
public class AcquirerFinancialInitiation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header17 Header;
	private AcquirerFinancialInitiation1 FinancialInitiation;
	private ContentInformationType15 SecurityTrailer;

	public Header17 getHeader() {
		return Header;
	}

	public void setHeader(Header17 Header) {
		this.Header = Header;
	}

	public AcquirerFinancialInitiation1 getFinancialInitiation() {
		return FinancialInitiation;
	}

	public void setFinancialInitiation(
			AcquirerFinancialInitiation1 FinancialInitiation) {
		this.FinancialInitiation = FinancialInitiation;
	}

	public ContentInformationType15 getSecurityTrailer() {
		return SecurityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 SecurityTrailer) {
		this.SecurityTrailer = SecurityTrailer;
	}
}