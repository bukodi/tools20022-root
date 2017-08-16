package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.BuyIn4;
import com.tools20022.repository.dict.msg.SettlementObligation7;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The BuyInNotification message is sent by the central counterparty (CCP)
 * to a clearing member to notify the start of the buy in process.
 * 
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.
 * 
 * Usage The buy in process is a process by which the CCP buys in stocks to
 * cover failed transactions; the clearing member is notified that this process
 * has started. Depending on each CCP internal rules, this message can also be
 * sent, as a warning, by the central counterparty to the clearing member some
 * days before the buy in process starts.
 */
public class BuyInNotificationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<Max35Text> TransactionIdentification;
	private PartyIdentification35Choice ClearingMember;
	private Optional<BuyIn4> NotificationDetails;
	private SettlementObligation7 OriginalSettlementObligation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<Max35Text> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<Max35Text> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public PartyIdentification35Choice getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public Optional<BuyIn4> getNotificationDetails() {
		return NotificationDetails;
	}

	public void setNotificationDetails(Optional<BuyIn4> NotificationDetails) {
		this.NotificationDetails = NotificationDetails;
	}

	public SettlementObligation7 getOriginalSettlementObligation() {
		return OriginalSettlementObligation;
	}

	public void setOriginalSettlementObligation(
			SettlementObligation7 OriginalSettlementObligation) {
		this.OriginalSettlementObligation = OriginalSettlementObligation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}