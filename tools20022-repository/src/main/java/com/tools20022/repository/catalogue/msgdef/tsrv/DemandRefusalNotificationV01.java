package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DemandRefusal1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyAndSignature2;

/**
 * The DemandRefusalNotification message is sent to the beneficiary or presenter
 * by the party obligated on the undertaking and to whom a demand for payment
 * has been made, either directly or via one or more advising parties. It
 * notifies the beneficiary or presenter that the demand has been refused.
 */
public class DemandRefusalNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<DemandRefusal1> DemandRefusalNotificationDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public Optional<DemandRefusal1> getDemandRefusalNotificationDetails() {
		return DemandRefusalNotificationDetails;
	}

	public void setDemandRefusalNotificationDetails(
			Optional<DemandRefusal1> DemandRefusalNotificationDetails) {
		this.DemandRefusalNotificationDetails = DemandRefusalNotificationDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}