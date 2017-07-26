package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingAgreementList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The message PartyManagementPaymentAcknowledgement is sent from a trade
 * partner to any partner requested through a
 * PartyManagementPaymentAcknowledgemenNotification message to acknowledge the
 * notified factoring service agreement. Depending on legal contexts, the
 * acknowledgement may be required in order for the financial service agreement
 * to become effective. The message references related messages and may include
 * referenced data. The message can carry digital signatures if required by
 * context.
 */
public class PartyRegistrationAndGuaranteeAcknowledgementV01 {

	private BusinessLetter1 Header;
	private FinancingAgreementList1 AcknowledgementList;
	private Max15NumericText AcknowledgementCount;
	private Optional<Max15NumericText> ItemCount;
	private Optional<DecimalNumber> ControlSum;
	private Optional<EncapsulatedBusinessMessage1> AttachedMessage;

	public BusinessLetter1 getHeader() {
		return Header;
	}

	public void setHeader(BusinessLetter1 Header) {
		this.Header = Header;
	}

	public FinancingAgreementList1 getAcknowledgementList() {
		return AcknowledgementList;
	}

	public void setAcknowledgementList(
			FinancingAgreementList1 AcknowledgementList) {
		this.AcknowledgementList = AcknowledgementList;
	}

	public Max15NumericText getAcknowledgementCount() {
		return AcknowledgementCount;
	}

	public void setAcknowledgementCount(Max15NumericText AcknowledgementCount) {
		this.AcknowledgementCount = AcknowledgementCount;
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