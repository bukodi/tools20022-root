package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.ProxyTypeCode;

/**
 * Conditions that must be met to appoint a proxy.
 */
public class ProxyAppointmentCondition extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ContactPoint NotificationAddress;
	private Meeting Meeting;
	private Max350Text RegistrationMethod;
	private ProxyTypeCode AllowedProxyType;

	public ContactPoint getNotificationAddress() {
		return NotificationAddress;
	}

	public void setNotificationAddress(ContactPoint NotificationAddress) {
		this.NotificationAddress = NotificationAddress;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public Max350Text getRegistrationMethod() {
		return RegistrationMethod;
	}

	public void setRegistrationMethod(Max350Text RegistrationMethod) {
		this.RegistrationMethod = RegistrationMethod;
	}

	public ProxyTypeCode getAllowedProxyType() {
		return AllowedProxyType;
	}

	public void setAllowedProxyType(ProxyTypeCode AllowedProxyType) {
		this.AllowedProxyType = AllowedProxyType;
	}
}