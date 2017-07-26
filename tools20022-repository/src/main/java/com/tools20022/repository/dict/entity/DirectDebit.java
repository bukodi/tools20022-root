package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.IndividualPayment;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.DirectDebitMandate;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Payment, initiated by the creditor, to debit a debtor's account in favour of
 * the creditor. A direct debit can be pre-authorised or not. In most countries,
 * authorisation is in the form of a mandate between the debtor and creditor.
 */
public class DirectDebit extends IndividualPayment {

	private Max35Text RegistrationIdentification;
	private DirectDebitMandate DirectDebitMandate;
	private Max35Text PreNotificationIdentification;
	private ISODate PreNotificationDate;

	public Max35Text getRegistrationIdentification() {
		return RegistrationIdentification;
	}

	public void setRegistrationIdentification(
			Max35Text RegistrationIdentification) {
		this.RegistrationIdentification = RegistrationIdentification;
	}

	public DirectDebitMandate getDirectDebitMandate() {
		return DirectDebitMandate;
	}

	public void setDirectDebitMandate(DirectDebitMandate DirectDebitMandate) {
		this.DirectDebitMandate = DirectDebitMandate;
	}

	public Max35Text getPreNotificationIdentification() {
		return PreNotificationIdentification;
	}

	public void setPreNotificationIdentification(
			Max35Text PreNotificationIdentification) {
		this.PreNotificationIdentification = PreNotificationIdentification;
	}

	public ISODate getPreNotificationDate() {
		return PreNotificationDate;
	}

	public void setPreNotificationDate(ISODate PreNotificationDate) {
		this.PreNotificationDate = PreNotificationDate;
	}
}