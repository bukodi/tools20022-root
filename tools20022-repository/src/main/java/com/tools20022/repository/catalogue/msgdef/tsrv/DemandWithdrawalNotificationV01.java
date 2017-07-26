package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.repository.dict.msg.UndertakingDemandWithdrawal1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The DemandWithdrawalNotification message is sent by the beneficiary to the
 * party that issued the undertaking, either directly or via a presenting or
 * nominated party, to inform the issuer or nominated party that it has elected
 * to withdraw its demand under the demand guarantee or standby letter of
 * credit.
 */
public class DemandWithdrawalNotificationV01 {

	private UndertakingDemandWithdrawal1 DemandWithdrawalNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public UndertakingDemandWithdrawal1 getDemandWithdrawalNotificationDetails() {
		return DemandWithdrawalNotificationDetails;
	}

	public void setDemandWithdrawalNotificationDetails(
			UndertakingDemandWithdrawal1 DemandWithdrawalNotificationDetails) {
		this.DemandWithdrawalNotificationDetails = DemandWithdrawalNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}