package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.IndividualPayment;

/**
 * Payment which contains a series of other payments which have been grouped
 * under specific criteria. A bulk payment can only contain individual payments
 * of the same type (credit transfer or direct debit).
 */
public class BulkPayment extends Payment {

	private IndividualPayment Groups;

	public IndividualPayment getGroups() {
		return Groups;
	}

	public void setGroups(IndividualPayment Groups) {
		this.Groups = Groups;
	}
}