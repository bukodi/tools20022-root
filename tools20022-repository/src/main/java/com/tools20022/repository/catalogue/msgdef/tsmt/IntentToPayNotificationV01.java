package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.tsmt.IntentToPayNotificationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.IntentToPay1;

/**
 * Scope The IntentToPayNotification message is sent by a party to the matching
 * application in order to provide details about a future payment. This message
 * contains details about an intention to pay a certain amount, on a certain
 * date, in relation to one or several transactions known to the matching
 * application. Usage The IntentToPayNotification message can be sent by a party
 * to the transaction at any time as long as the transaction is established and
 * not yet closed. The message is unsolicited, that is, it is not sent in
 * response to another message.
 */
@NextVersion(IntentToPayNotificationV02.class)
public class IntentToPayNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private IntentToPay1 IntentToPay;

	public MessageIdentification1 getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			MessageIdentification1 NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
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

	public BICIdentification1 getBuyerBank() {
		return BuyerBank;
	}

	public void setBuyerBank(BICIdentification1 BuyerBank) {
		this.BuyerBank = BuyerBank;
	}

	public BICIdentification1 getSellerBank() {
		return SellerBank;
	}

	public void setSellerBank(BICIdentification1 SellerBank) {
		this.SellerBank = SellerBank;
	}

	public IntentToPay1 getIntentToPay() {
		return IntentToPay;
	}

	public void setIntentToPay(IntentToPay1 IntentToPay) {
		this.IntentToPay = IntentToPay;
	}
}