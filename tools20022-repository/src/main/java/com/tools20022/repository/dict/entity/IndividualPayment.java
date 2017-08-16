package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.BulkPayment;

/**
 * Payment which consists of one single transaction. This payment may be grouped
 * with other similar payments to form a bulk payment.
 */
public class IndividualPayment extends Payment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private BulkPayment BulkPayment;

	public BulkPayment getBulkPayment() {
		return BulkPayment;
	}

	public void setBulkPayment(BulkPayment BulkPayment) {
		this.BulkPayment = BulkPayment;
	}
}