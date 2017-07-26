package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.MarginCallDisputeNotificationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.choice.DisputeNotification1Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The MarginCallDisputeNotification message is sent by the collateral
 * taker or its collateral manager to the collateral giver or its collateral
 * manager to acknowledge the notification of the dispute (either full or
 * partial dispute) of the MarginCallRequest. The message will detail the amount
 * of the dispute and the reason.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage When there is a dispute by the collateral giver to the collateral taker
 * a MarginCallDisputeNotification message is sent with the disputed amount
 * (full or partial) stating the reason why the margin call is being disputed.
 */
@NextVersion(MarginCallDisputeNotificationV04.class)
public class MarginCallDisputeNotificationV03 {

	private Max35Text TransactionIdentification;
	private Obligation3 Obligation;
	private DisputeNotification1Choice DisputeNotification;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Obligation3 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation3 Obligation) {
		this.Obligation = Obligation;
	}

	public DisputeNotification1Choice getDisputeNotification() {
		return DisputeNotification;
	}

	public void setDisputeNotification(
			DisputeNotification1Choice DisputeNotification) {
		this.DisputeNotification = DisputeNotification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}