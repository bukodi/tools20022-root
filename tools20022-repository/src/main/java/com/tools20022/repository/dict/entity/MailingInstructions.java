package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.PostalAddress;

/**
 * Characteristics of an address.
 */
public class MailingInstructions {

	private YesNoIndicator MailingIndicator;
	private YesNoIndicator RegistrationAddressIndicator;
	private PostalAddress RelatedPostalAddress;

	public YesNoIndicator getMailingIndicator() {
		return MailingIndicator;
	}

	public void setMailingIndicator(YesNoIndicator MailingIndicator) {
		this.MailingIndicator = MailingIndicator;
	}

	public YesNoIndicator getRegistrationAddressIndicator() {
		return RegistrationAddressIndicator;
	}

	public void setRegistrationAddressIndicator(
			YesNoIndicator RegistrationAddressIndicator) {
		this.RegistrationAddressIndicator = RegistrationAddressIndicator;
	}

	public PostalAddress getRelatedPostalAddress() {
		return RelatedPostalAddress;
	}

	public void setRelatedPostalAddress(PostalAddress RelatedPostalAddress) {
		this.RelatedPostalAddress = RelatedPostalAddress;
	}
}