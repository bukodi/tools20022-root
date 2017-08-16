package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.TerminalManagementActionCode;
import com.tools20022.repository.dict.codeset.TerminalManagementActionTriggerCode;
import com.tools20022.repository.dict.codeset.TerminalManagementAdditionalProcessCode;
import com.tools20022.repository.dict.codeset.TerminalManagementActionResultCode;
import com.tools20022.repository.dict.codeset.TerminalManagementErrorActionCode;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;

/**
 * Terminal management action to be performed by the point of interaction.
 */
public class TerminalManagementAction extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TerminalManagementActionCode Type;
	private TerminalManagementActionTriggerCode Trigger;
	private TerminalManagementAdditionalProcessCode AdditionalProcess;
	private TerminalManagementActionResultCode ActionResult;
	private TerminalManagementErrorActionCode ActionToProcess;
	private TerminalManagementSystem TerminalManagementSystem;

	public TerminalManagementActionCode getType() {
		return Type;
	}

	public void setType(TerminalManagementActionCode Type) {
		this.Type = Type;
	}

	public TerminalManagementActionTriggerCode getTrigger() {
		return Trigger;
	}

	public void setTrigger(TerminalManagementActionTriggerCode Trigger) {
		this.Trigger = Trigger;
	}

	public TerminalManagementAdditionalProcessCode getAdditionalProcess() {
		return AdditionalProcess;
	}

	public void setAdditionalProcess(
			TerminalManagementAdditionalProcessCode AdditionalProcess) {
		this.AdditionalProcess = AdditionalProcess;
	}

	public TerminalManagementActionResultCode getActionResult() {
		return ActionResult;
	}

	public void setActionResult(TerminalManagementActionResultCode ActionResult) {
		this.ActionResult = ActionResult;
	}

	public TerminalManagementErrorActionCode getActionToProcess() {
		return ActionToProcess;
	}

	public void setActionToProcess(
			TerminalManagementErrorActionCode ActionToProcess) {
		this.ActionToProcess = ActionToProcess;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return TerminalManagementSystem;
	}

	public void setTerminalManagementSystem(
			TerminalManagementSystem TerminalManagementSystem) {
		this.TerminalManagementSystem = TerminalManagementSystem;
	}
}