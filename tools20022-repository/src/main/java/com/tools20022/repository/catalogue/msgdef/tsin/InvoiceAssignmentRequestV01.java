package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingItemList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The InvoiceAssignmentRequest message is sent from a factoring client to a
 * factoring service provider and, optionally, to an interested party. It
 * indicates the transfer of payment obligations concerning financial documents.
 * The message contains a list of financing requests together with data that are
 * necessary to transfer the related rights for example regarding legal
 * references for example jurisdiction, language or country. Furthermore, the
 * message can reference related messages and can include data from other
 * messages. A factoring client combines a set of financial documents with same
 * characteristics and assigns them to a factoring service. The client can send
 * several assignments in one message and combine them according to different
 * criteria for example for different clients or different currencies.
 */
public class InvoiceAssignmentRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

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