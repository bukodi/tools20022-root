package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingItemList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The message InvoiceAssignmentStatus is sent by a factoring service provider
 * to a factoring client and, optionally, to an interested party as a response
 * to assignments requests. The factoring service provider returns a copy of
 * items of corresponding requests together with an information about the status
 * of treatment, for example acceptance, rejection or treatment not yet
 * finished. A rejection can be the result of bad message syntax, but also for
 * other motives such as risk, compliance or covenants. For each reported
 * financial item, the factoring service provider includes a reference to the
 * corresponding item of the InvoiceFinancingRequest message and may include the
 * referenced item as well as data from other related and referenced messages.
 * The message contains information about other parties to be notified and
 * whether these parties are required to acknowledge the assignment. The message
 * can carry digital signatures if required by context.
 */
public class InvoiceAssignmentStatusV01 {

	private BusinessLetter1 Header;
	private FinancingItemList1 AssignmentList;
	private Optional<Max15NumericText> AssignmentCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public FinancingItemList1 getAssignmentList() {
		return AssignmentList;
	}

	public void setAssignmentList(FinancingItemList1 AssignmentList) {
		this.AssignmentList = AssignmentList;
	}

	public Optional<Max15NumericText> getAssignmentCount() {
		return AssignmentCount;
	}

	public void setAssignmentCount(Optional<Max15NumericText> AssignmentCount) {
		this.AssignmentCount = AssignmentCount;
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