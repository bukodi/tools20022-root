package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CreditInstrument;
import com.tools20022.repository.dict.entity.Cheque;
import com.tools20022.repository.dict.codeset.ChequeDeliveryCode;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Action to issue a cheque in order to settle an amount due to a creditor.
 */
public class ChequeIssue extends CreditInstrument
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Cheque Cheque;
	private ChequeDeliveryCode DeliveryMethod;
	private PostalAddress DeliverTo;
	private Max35Text PrintLocation;

	public Cheque getCheque() {
		return Cheque;
	}

	public void setCheque(Cheque Cheque) {
		this.Cheque = Cheque;
	}

	public ChequeDeliveryCode getDeliveryMethod() {
		return DeliveryMethod;
	}

	public void setDeliveryMethod(ChequeDeliveryCode DeliveryMethod) {
		this.DeliveryMethod = DeliveryMethod;
	}

	public PostalAddress getDeliverTo() {
		return DeliverTo;
	}

	public void setDeliverTo(PostalAddress DeliverTo) {
		this.DeliverTo = DeliverTo;
	}

	public Max35Text getPrintLocation() {
		return PrintLocation;
	}

	public void setPrintLocation(Max35Text PrintLocation) {
		this.PrintLocation = PrintLocation;
	}
}