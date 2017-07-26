package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.AcceptorConfiguration;
import com.tools20022.repository.dict.entity.NetworkAccess;
import com.tools20022.repository.dict.entity.CardPaymentAcquiring;
import com.tools20022.repository.dict.codeset.TMSContactLevelCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.TerminalManagerRole;
import com.tools20022.repository.dict.entity.PointOfInteraction;
import com.tools20022.repository.dict.entity.TerminalManagementAction;

/**
 * Terminal management system (TMS), has in charge the maintenance of the
 * terminal, including monitoring, software update, configuration parameters
 * management.
 */
public class TerminalManagementSystem extends System {

	private AcceptorConfiguration AcceptorConfiguration;
	private NetworkAccess NetworkAccess;
	private CardPaymentAcquiring CardPaymentAcquiring;
	private TMSContactLevelCode ContactLevel;
	private ISODateTime ContactDateTime;
	private TerminalManagerRole TerminalManagerRole;
	private PointOfInteraction ControlledPointOfInteraction;
	private TerminalManagementAction Action;

	public AcceptorConfiguration getAcceptorConfiguration() {
		return AcceptorConfiguration;
	}

	public void setAcceptorConfiguration(
			AcceptorConfiguration AcceptorConfiguration) {
		this.AcceptorConfiguration = AcceptorConfiguration;
	}

	public NetworkAccess getNetworkAccess() {
		return NetworkAccess;
	}

	public void setNetworkAccess(NetworkAccess NetworkAccess) {
		this.NetworkAccess = NetworkAccess;
	}

	public CardPaymentAcquiring getCardPaymentAcquiring() {
		return CardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(
			CardPaymentAcquiring CardPaymentAcquiring) {
		this.CardPaymentAcquiring = CardPaymentAcquiring;
	}

	public TMSContactLevelCode getContactLevel() {
		return ContactLevel;
	}

	public void setContactLevel(TMSContactLevelCode ContactLevel) {
		this.ContactLevel = ContactLevel;
	}

	public ISODateTime getContactDateTime() {
		return ContactDateTime;
	}

	public void setContactDateTime(ISODateTime ContactDateTime) {
		this.ContactDateTime = ContactDateTime;
	}

	public TerminalManagerRole getTerminalManagerRole() {
		return TerminalManagerRole;
	}

	public void setTerminalManagerRole(TerminalManagerRole TerminalManagerRole) {
		this.TerminalManagerRole = TerminalManagerRole;
	}

	public PointOfInteraction getControlledPointOfInteraction() {
		return ControlledPointOfInteraction;
	}

	public void setControlledPointOfInteraction(
			PointOfInteraction ControlledPointOfInteraction) {
		this.ControlledPointOfInteraction = ControlledPointOfInteraction;
	}

	public TerminalManagementAction getAction() {
		return Action;
	}

	public void setAction(TerminalManagementAction Action) {
		this.Action = Action;
	}
}