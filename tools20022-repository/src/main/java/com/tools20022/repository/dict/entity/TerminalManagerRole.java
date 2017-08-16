package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;

/**
 * Identifies the party which is the terminal manager (TM) to contact for the
 * maintenance.
 */
public class TerminalManagerRole extends SystemPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TerminalManagementSystem TerminalManagementSystem;

	public TerminalManagementSystem getTerminalManagementSystem() {
		return TerminalManagementSystem;
	}

	public void setTerminalManagementSystem(
			TerminalManagementSystem TerminalManagementSystem) {
		this.TerminalManagementSystem = TerminalManagementSystem;
	}
}