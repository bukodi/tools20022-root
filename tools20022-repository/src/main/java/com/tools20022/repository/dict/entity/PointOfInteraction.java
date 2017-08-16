package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.CardPaymentAcquiring;
import com.tools20022.repository.dict.codeset.CardDataReadingCode;
import com.tools20022.repository.dict.codeset.CardholderVerificationCapabilityCode;
import com.tools20022.repository.dict.codeset.OnLineCapabilityCode;
import com.tools20022.repository.dict.codeset.UserInterfaceCode;
import com.tools20022.repository.dict.datatype.Max3NumericText;
import com.tools20022.repository.dict.codeset.POIComponentTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max2NumericText;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;

/**
 * Point of interaction (POI) is the entry point to a card payment system. It
 * could be a physical or logical card payment terminal containing software and
 * hardware components, it could be a payment system including a set of card
 * payment terminals linked to a local or remote server, or it could be just an
 * interface to make payments as telephone or Internet browser.
 */
public class PointOfInteraction extends System
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CardPaymentAcquiring CardPaymentAcquiring;
	private CardDataReadingCode CardReadingCapabilities;
	private CardholderVerificationCapabilityCode CardholderVerificationCapabilities;
	private OnLineCapabilityCode OnLineCapabilities;
	private UserInterfaceCode DisplayCapabilities;
	private Max3NumericText PrintLineWidth;
	private POIComponentTypeCode Component;
	private Max35Text ComponentIdentification;
	private Max35Text GroupIdentifier;
	private Max3NumericText LineWidth;
	private Max2NumericText NumberOfLines;
	private Max140Text ErrorLog;
	private Max16Text ComponentVersionNumber;
	private TerminalManagementSystem ControllingTerminalManagementSystem;

	public CardPaymentAcquiring getCardPaymentAcquiring() {
		return CardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(
			CardPaymentAcquiring CardPaymentAcquiring) {
		this.CardPaymentAcquiring = CardPaymentAcquiring;
	}

	public CardDataReadingCode getCardReadingCapabilities() {
		return CardReadingCapabilities;
	}

	public void setCardReadingCapabilities(
			CardDataReadingCode CardReadingCapabilities) {
		this.CardReadingCapabilities = CardReadingCapabilities;
	}

	public CardholderVerificationCapabilityCode getCardholderVerificationCapabilities() {
		return CardholderVerificationCapabilities;
	}

	public void setCardholderVerificationCapabilities(
			CardholderVerificationCapabilityCode CardholderVerificationCapabilities) {
		this.CardholderVerificationCapabilities = CardholderVerificationCapabilities;
	}

	public OnLineCapabilityCode getOnLineCapabilities() {
		return OnLineCapabilities;
	}

	public void setOnLineCapabilities(OnLineCapabilityCode OnLineCapabilities) {
		this.OnLineCapabilities = OnLineCapabilities;
	}

	public UserInterfaceCode getDisplayCapabilities() {
		return DisplayCapabilities;
	}

	public void setDisplayCapabilities(UserInterfaceCode DisplayCapabilities) {
		this.DisplayCapabilities = DisplayCapabilities;
	}

	public Max3NumericText getPrintLineWidth() {
		return PrintLineWidth;
	}

	public void setPrintLineWidth(Max3NumericText PrintLineWidth) {
		this.PrintLineWidth = PrintLineWidth;
	}

	public POIComponentTypeCode getComponent() {
		return Component;
	}

	public void setComponent(POIComponentTypeCode Component) {
		this.Component = Component;
	}

	public Max35Text getComponentIdentification() {
		return ComponentIdentification;
	}

	public void setComponentIdentification(Max35Text ComponentIdentification) {
		this.ComponentIdentification = ComponentIdentification;
	}

	public Max35Text getGroupIdentifier() {
		return GroupIdentifier;
	}

	public void setGroupIdentifier(Max35Text GroupIdentifier) {
		this.GroupIdentifier = GroupIdentifier;
	}

	public Max3NumericText getLineWidth() {
		return LineWidth;
	}

	public void setLineWidth(Max3NumericText LineWidth) {
		this.LineWidth = LineWidth;
	}

	public Max2NumericText getNumberOfLines() {
		return NumberOfLines;
	}

	public void setNumberOfLines(Max2NumericText NumberOfLines) {
		this.NumberOfLines = NumberOfLines;
	}

	public Max140Text getErrorLog() {
		return ErrorLog;
	}

	public void setErrorLog(Max140Text ErrorLog) {
		this.ErrorLog = ErrorLog;
	}

	public Max16Text getComponentVersionNumber() {
		return ComponentVersionNumber;
	}

	public void setComponentVersionNumber(Max16Text ComponentVersionNumber) {
		this.ComponentVersionNumber = ComponentVersionNumber;
	}

	public TerminalManagementSystem getControllingTerminalManagementSystem() {
		return ControllingTerminalManagementSystem;
	}

	public void setControllingTerminalManagementSystem(
			TerminalManagementSystem ControllingTerminalManagementSystem) {
		this.ControllingTerminalManagementSystem = ControllingTerminalManagementSystem;
	}
}