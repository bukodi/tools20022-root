package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.CurrencyControlHeader3;
import com.tools20022.repository.dict.msg.RegulatoryReportingNotification1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The PaymentRegulatoryInformationNotification message is sent by the reporting
 * party to the registration agent to provide details on the transaction
 * details, when a payment has to be recorded against the registered currency
 * control contract.
 * 
 * In some cases, the registration agent may also sent this message to the
 * reporting party.
 */
public class PaymentRegulatoryInformationNotificationV01 {

	private CurrencyControlHeader3 GroupHeader;
	private RegulatoryReportingNotification1 TransactionNotification;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader3 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader3 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RegulatoryReportingNotification1 getTransactionNotification() {
		return TransactionNotification;
	}

	public void setTransactionNotification(
			RegulatoryReportingNotification1 TransactionNotification) {
		this.TransactionNotification = TransactionNotification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}