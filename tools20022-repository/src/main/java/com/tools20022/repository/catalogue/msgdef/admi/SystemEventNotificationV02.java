package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Event2;

/**
 * Scope The SystemEventNotification message is sent by a central system to
 * notify the occurrence of an event in a central system. Usage The message can
 * be used by a central settlement system to inform its participants of an event
 * that is going to occur in the system, for instance that the system will be
 * down at a certain time, etc.
 */
public class SystemEventNotificationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Event2 EventInformation;

	public Event2 getEventInformation() {
		return EventInformation;
	}

	public void setEventInformation(Event2 EventInformation) {
		this.EventInformation = EventInformation;
	}
}