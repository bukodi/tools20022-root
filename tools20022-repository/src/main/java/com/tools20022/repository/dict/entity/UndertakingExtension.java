package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.ExternalTypeOfPartyCode;

/**
 * Specifies information related to the extension of an undertaking.
 */
public class UndertakingExtension {

	private Undertaking Undertaking;
	private Max35Text AutoExtensionPeriod;
	private ISODate AutoExtensionFinalExpiryDate;
	private Number NonExtensionNoticePeriod;
	private YesNoIndicator NonExtensionIndicator;
	private Number AutoExtensionNotificationPeriod;
	private ExternalTypeOfPartyCode NotificationRecipientType;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public Max35Text getAutoExtensionPeriod() {
		return AutoExtensionPeriod;
	}

	public void setAutoExtensionPeriod(Max35Text AutoExtensionPeriod) {
		this.AutoExtensionPeriod = AutoExtensionPeriod;
	}

	public ISODate getAutoExtensionFinalExpiryDate() {
		return AutoExtensionFinalExpiryDate;
	}

	public void setAutoExtensionFinalExpiryDate(
			ISODate AutoExtensionFinalExpiryDate) {
		this.AutoExtensionFinalExpiryDate = AutoExtensionFinalExpiryDate;
	}

	public Number getNonExtensionNoticePeriod() {
		return NonExtensionNoticePeriod;
	}

	public void setNonExtensionNoticePeriod(Number NonExtensionNoticePeriod) {
		this.NonExtensionNoticePeriod = NonExtensionNoticePeriod;
	}

	public YesNoIndicator getNonExtensionIndicator() {
		return NonExtensionIndicator;
	}

	public void setNonExtensionIndicator(YesNoIndicator NonExtensionIndicator) {
		this.NonExtensionIndicator = NonExtensionIndicator;
	}

	public Number getAutoExtensionNotificationPeriod() {
		return AutoExtensionNotificationPeriod;
	}

	public void setAutoExtensionNotificationPeriod(
			Number AutoExtensionNotificationPeriod) {
		this.AutoExtensionNotificationPeriod = AutoExtensionNotificationPeriod;
	}

	public ExternalTypeOfPartyCode getNotificationRecipientType() {
		return NotificationRecipientType;
	}

	public void setNotificationRecipientType(
			ExternalTypeOfPartyCode NotificationRecipientType) {
		this.NotificationRecipientType = NotificationRecipientType;
	}
}