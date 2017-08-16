package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.RolePlayer;
import com.tools20022.repository.dict.entity.ContactPersonRole;
import com.tools20022.repository.dict.codeset.PartyRoleCode;
import com.tools20022.repository.dict.entity.CounterpartyRisk;
import com.tools20022.repository.dict.entity.Entry;

/**
 * Role of a party in an activity.
 */
public class Role extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private RolePlayer Player;
	private ContactPersonRole ContactPersonRole;
	private PartyRoleCode PartyRole;
	private CounterpartyRisk CounterpartyRisk;
	private Entry Entry;

	public RolePlayer getPlayer() {
		return Player;
	}

	public void setPlayer(RolePlayer Player) {
		this.Player = Player;
	}

	public ContactPersonRole getContactPersonRole() {
		return ContactPersonRole;
	}

	public void setContactPersonRole(ContactPersonRole ContactPersonRole) {
		this.ContactPersonRole = ContactPersonRole;
	}

	public PartyRoleCode getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(PartyRoleCode PartyRole) {
		this.PartyRole = PartyRole;
	}

	public CounterpartyRisk getCounterpartyRisk() {
		return CounterpartyRisk;
	}

	public void setCounterpartyRisk(CounterpartyRisk CounterpartyRisk) {
		this.CounterpartyRisk = CounterpartyRisk;
	}

	public Entry getEntry() {
		return Entry;
	}

	public void setEntry(Entry Entry) {
		this.Entry = Entry;
	}
}