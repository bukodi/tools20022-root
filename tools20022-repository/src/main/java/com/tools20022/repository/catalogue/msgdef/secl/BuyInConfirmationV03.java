package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.BuyIn2;
import com.tools20022.repository.dict.msg.SettlementObligation7;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The Buy In Confirmation message is sent by the central counterparty
 * (CCP) to the clearing member to confirm the details of the transaction
 * resulting from the buy in.
 * 
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.
 * 
 * Usage The Buy In Confirmation message is sent by the central counterparty
 * (CCP) to confirm the details of the buy in transaction.
 */
public class BuyInConfirmationV03 {

	private Optional<Max35Text> TransactionIdentification;
	private PartyIdentification35Choice ClearingMember;
	private BuyIn2 BuyInDetails;
	private Optional<SettlementObligation7> OriginalSettlementObligation;
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

	public BuyIn2 getBuyInDetails() {
		return BuyInDetails;
	}

	public void setBuyInDetails(BuyIn2 BuyInDetails) {
		this.BuyInDetails = BuyInDetails;
	}

	public Optional<SettlementObligation7> getOriginalSettlementObligation() {
		return OriginalSettlementObligation;
	}

	public void setOriginalSettlementObligation(
			Optional<SettlementObligation7> OriginalSettlementObligation) {
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