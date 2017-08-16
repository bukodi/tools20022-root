package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.AutomaticVariation;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Trigger that causes the variation to come into effect.
 */
public class Trigger extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AutomaticVariation AutomaticVariation;
	private ISODate TriggerDate;
	private Max35Text TriggerEvent;

	public AutomaticVariation getAutomaticVariation() {
		return AutomaticVariation;
	}

	public void setAutomaticVariation(AutomaticVariation AutomaticVariation) {
		this.AutomaticVariation = AutomaticVariation;
	}

	public ISODate getTriggerDate() {
		return TriggerDate;
	}

	public void setTriggerDate(ISODate TriggerDate) {
		this.TriggerDate = TriggerDate;
	}

	public Max35Text getTriggerEvent() {
		return TriggerEvent;
	}

	public void setTriggerEvent(Max35Text TriggerEvent) {
		this.TriggerEvent = TriggerEvent;
	}
}