package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.RequestGroupInformation1;
import com.tools20022.repository.dict.msg.InvoiceRequestInformation1;

/**
 * Scope The InvoiceFinancingRequest message is sent by Financing Requestor to
 * the Intermediary Agent or First agent. It is used to request financing of a
 * set of invoices, referenced in the request message itself. If the whole
 * financing request (or a selection of single invoice requests included) is
 * accepted, the amount financed by the First Agent will be credited either to
 * the account specified in the financing request or to another account held by
 * Financing Requestor to First Agent. Usage The InvoiceFinancingRequest message
 * is issued by the Financing Requestor and represents a bulk financing request
 * since it can contain one or more single financing requests, each request
 * related to an invoice. For every invoice it is always possible to identify a
 * supplier and a buyer. The subject playing the role of supplier can be
 * different from the Financing Requestor; in this case the Financing Requestor
 * is allowed to send the request message on behalf of the supplier itself. This
 * caters for example in the scenario of a collection agency initiating all
 * requests on behalf of a large corporate. In instances where an invoice is
 * going to be paid by means of instalments, the Financing Requestor can request
 * financing for one or more instalments related to the invoice payment. In this
 * case, together with the general information related to the invoice,
 * references about instalments to be financed are specified into the request
 * message. The request message must contain information only about the
 * instalments that the Financing Requestor wants to be financed. The
 * InvoiceFinancingRequest message is used to exchange: - One instance of
 * general information related to the invoice financing request; - One instance
 * of information for each single invoice financing request; - Optionally, one
 * instance of information for each single instalment to be financed. The
 * message can be used in a direct or a relay scenario: - In a direct scenario,
 * the message is sent directly to the First Agent. The First Agent is the
 * account servicer of the Financing Requestor; - In a relay scenario, the
 * message is sent to an Intermediary Agent. The Intermediary Agent acts as an
 * access point that will forward the InvoiceFinancingRequest message to the
 * First Agent.
 */
public class InvoiceFinancingRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private RequestGroupInformation1 RequestGroupInformation;
	private InvoiceRequestInformation1 InvoiceRequestInformation;

	public RequestGroupInformation1 getRequestGroupInformation() {
		return RequestGroupInformation;
	}

	public void setRequestGroupInformation(
			RequestGroupInformation1 RequestGroupInformation) {
		this.RequestGroupInformation = RequestGroupInformation;
	}

	public InvoiceRequestInformation1 getInvoiceRequestInformation() {
		return InvoiceRequestInformation;
	}

	public void setInvoiceRequestInformation(
			InvoiceRequestInformation1 InvoiceRequestInformation) {
		this.InvoiceRequestInformation = InvoiceRequestInformation;
	}
}