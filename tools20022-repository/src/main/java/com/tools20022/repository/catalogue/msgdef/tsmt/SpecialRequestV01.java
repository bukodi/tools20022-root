package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Notification1;

/**
 * Scope The SpecialRequest message is sent by a party to the transaction to the
 * matching application if special circumstances are such that it cannot take
 * part any longer to a specific transaction or that it cannot fulfill its role
 * in the transaction. Usage The SpecialRequest message can be sent at any time
 * during the life time of a transaction as long as the transaction is
 * established and not yet closed.
 */
public class SpecialRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RequestIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private Notification1 Notification;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			SimpleIdentificationInformation TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return SubmitterTransactionReference;
	}

	public void setSubmitterTransactionReference(
			Optional<SimpleIdentificationInformation> SubmitterTransactionReference) {
		this.SubmitterTransactionReference = SubmitterTransactionReference;
	}

	public Notification1 getNotification() {
		return Notification;
	}

	public void setNotification(Notification1 Notification) {
		this.Notification = Notification;
	}
}