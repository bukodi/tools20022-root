package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;

/**
 * Identifies the party which is the terminal manager (TM) to contact for the
 * maintenance.
 */
public class TerminalManagerRole extends SystemPartyRole {

	private TerminalManagementSystem TerminalManagementSystem;

	public TerminalManagementSystem getTerminalManagementSystem() {
		return TerminalManagementSystem;
	}

	public void setTerminalManagementSystem(
			TerminalManagementSystem TerminalManagementSystem) {
		this.TerminalManagementSystem = TerminalManagementSystem;
	}
}