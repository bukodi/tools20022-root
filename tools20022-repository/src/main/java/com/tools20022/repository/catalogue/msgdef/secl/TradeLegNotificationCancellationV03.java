package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount18;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentificationAndAccount31;
import com.tools20022.repository.dict.msg.Clearing4;
import com.tools20022.repository.dict.msg.TradeLeg8;
import com.tools20022.repository.dict.msg.Settlement1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The TradeLegNotificationCancellation message is sent by the central
 * counterparty (CCP) to a clearing member to notify the cancellation of a
 * TradeLegNotification message previously sent.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The previously sent message must be the Trade Leg Notification message.
 */
public class TradeLegNotificationCancellationV03 {

	private PartyIdentification35Choice ClearingMember;
	private SecuritiesAccount18 ClearingAccount;
	private Optional<SecuritiesAccount19> DeliveryAccount;
	private Optional<PartyIdentificationAndAccount31> NonClearingMember;
	private Optional<Clearing4> ClearingDetails;
	private TradeLeg8 TradeLegDetails;
	private Settlement1 SettlementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public PartyIdentification35Choice getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public SecuritiesAccount18 getClearingAccount() {
		return ClearingAccount;
	}

	public void setClearingAccount(SecuritiesAccount18 ClearingAccount) {
		this.ClearingAccount = ClearingAccount;
	}

	public Optional<SecuritiesAccount19> getDeliveryAccount() {
		return DeliveryAccount;
	}

	public void setDeliveryAccount(Optional<SecuritiesAccount19> DeliveryAccount) {
		this.DeliveryAccount = DeliveryAccount;
	}

	public Optional<PartyIdentificationAndAccount31> getNonClearingMember() {
		return NonClearingMember;
	}

	public void setNonClearingMember(
			Optional<PartyIdentificationAndAccount31> NonClearingMember) {
		this.NonClearingMember = NonClearingMember;
	}

	public Optional<Clearing4> getClearingDetails() {
		return ClearingDetails;
	}

	public void setClearingDetails(Optional<Clearing4> ClearingDetails) {
		this.ClearingDetails = ClearingDetails;
	}

	public TradeLeg8 getTradeLegDetails() {
		return TradeLegDetails;
	}

	public void setTradeLegDetails(TradeLeg8 TradeLegDetails) {
		this.TradeLegDetails = TradeLegDetails;
	}

	public Settlement1 getSettlementDetails() {
		return SettlementDetails;
	}

	public void setSettlementDetails(Settlement1 SettlementDetails) {
		this.SettlementDetails = SettlementDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}