package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.BusinessLetter1;
import com.tools20022.repository.dict.msg.FinancingAgreementList1;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.DecimalNumber;
import com.tools20022.repository.dict.msg.EncapsulatedBusinessMessage1;

/**
 * The PartyRegistrationAndGuaranteeNotification message is sent by a factoring
 * client or a financial service to a trade partner and, optionally, to an
 * interested party in order to notify the status of a requested financial
 * service agreement. The trade partner is given information to explain the
 * consequences of a financial service agreement, for instance, the trade
 * partner must pay the financial institution and must use the electronic
 * address to inform it and pay it using the bank account given. The message may
 * reference related messages and may include referenced data. The message can
 * carry digital signatures if required by context.
 */
public class PartyRegistrationAndGuaranteeNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private BusinessLetter1 Header;
	private FinancingAgreementList1 NotificationList;
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

	public FinancingAgreementList1 getNotificationList() {
		return NotificationList;
	}

	public void setNotificationList(FinancingAgreementList1 NotificationList) {
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