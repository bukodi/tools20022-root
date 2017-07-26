package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingItemList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * This message is sent from a factoring service provider or a factoring client
 * to a trade partner to inform about assignments of financing items and,
 * optionally, to an interested party. The information given to the trade party
 * indicates that property of the payment obligation has been or is being
 * transferred to the financial institution and that payments have to be done
 * between the trade partner and the factoring service provider. The message
 * indicates whether the notified party is required to acknowledge the notified
 * assignment and to which party an acknowledgement has to be sent. This message
 * can also be used outside a factoring context directly between a payer and a
 * payee for example as a reminder about a payment obligation or to make an
 * adjustment. If applicable, the message may reference corresponding items of
 * an InvoiceFinancingRequest or InvoiceFinancingStatus or other related
 * messages and may contain referenced data. The message can carry digital
 * signatures if required by context.
 */
public class InvoiceAssignmentNotificationV01 {

	private BusinessLetter1 Header;
	private FinancingItemList1 NotificationList;
	private Optional<Max15NumericText> NotificationCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public FinancingItemList1 getNotificationList() {
		return NotificationList;
	}

	public void setNotificationList(FinancingItemList1 NotificationList) {
		this.NotificationList = NotificationList;
	}

	public Optional<Max15NumericText> getNotificationCount() {
		return NotificationCount;
	}

	public void setNotificationCount(
			Optional<Max15NumericText> NotificationCount) {
		this.NotificationCount = NotificationCount;
	}

	public Optional<Max15NumericText> getItemCount() {
		return ItemCount;
	}

	public void setItemCount(Optional<Max15NumericText> ItemCount) {
		this.ItemCount = ItemCount;
	}

	public Optional<DecimalNumber> getControlSum() {
		return ControlSum;
	}

	public void setControlSum(Optional<DecimalNumber> ControlSum) {
		this.ControlSum = ControlSum;
	}

	public Optional<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return AttachedMessage;
	}

	public void setAttachedMessage(
			Optional<EncapsulatedBusinessMessage1> AttachedMessage) {
		this.AttachedMessage = AttachedMessage;
	}
}