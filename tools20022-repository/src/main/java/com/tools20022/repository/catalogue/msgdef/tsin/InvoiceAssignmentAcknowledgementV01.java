package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingItemList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The InvoiceAssignmentAcknowledgement message is sent from a trade partner to
 * communicate the status of payment obligations related to financial items. The
 * message can be sent independently or as a response to an
 * InvoiceAssignmentNotification message. Depending on legal contexts the
 * message may be required as a response to an InvoiceAssignmentNotification
 * message in order for the assignment to become effective. The trade party may
 * include references to the corresponding items of an InvoiceAssignmentRequest,
 * InvoiceAssignmentStatus or InvoiceAssignmentNotification or other messages
 * and may include referenced data. The message can carry digital signatures if
 * required by context.
 */
public class InvoiceAssignmentAcknowledgementV01 {

	private BusinessLetter1 Header;
	private FinancingItemList1 PaymentStatusList;
	private Optional<Max15NumericText> PaymentStatusCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public FinancingItemList1 getPaymentStatusList() {
		return PaymentStatusList;
	}

	public void setPaymentStatusList(FinancingItemList1 PaymentStatusList) {
		this.PaymentStatusList = PaymentStatusList;
	}

	public Optional<Max15NumericText> getPaymentStatusCount() {
		return PaymentStatusCount;
	}

	public void setPaymentStatusCount(
			Optional<Max15NumericText> PaymentStatusCount) {
		this.PaymentStatusCount = PaymentStatusCount;
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