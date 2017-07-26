package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.ReconciliationList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The message InvoicePaymentReconciliationAdvice is sent by a payer to a payee
 * to indicate attribution of payments to instalment of payment obligations in
 * order to simplify the account netting or clearing when a lot of invoices are
 * paid with a unique payment (for instance an SCT or an SDD). The message
 * contains references to payment instructions, may reference other messages and
 * may include referenced data. The message can carry digital signatures if
 * required by context.
 */
public class InvoicePaymentReconciliationAdviceV01 {

	private BusinessLetter1 Header;
	private ReconciliationList1 ReconciliationList;
	private Optional<Max15NumericText> ReconciliationCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public ReconciliationList1 getReconciliationList() {
		return ReconciliationList;
	}

	public void setReconciliationList(ReconciliationList1 ReconciliationList) {
		this.ReconciliationList = ReconciliationList;
	}

	public Optional<Max15NumericText> getReconciliationCount() {
		return ReconciliationCount;
	}

	public void setReconciliationCount(
			Optional<Max15NumericText> ReconciliationCount) {
		this.ReconciliationCount = ReconciliationCount;
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