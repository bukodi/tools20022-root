package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CorporateActionPartyRole;
import com.tools20022.repository.dict.codeset.AgentRoleCode;

/**
 * A firm authorised to act as an intermediary between issuer and shareholders.
 * It takes care of the needs of the shareholders such as reporting, inquiries
 * and regulatory compliance.
 */
public class CorporateActionAgent extends CorporateActionPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AgentRoleCode AgentRole;

	public AgentRoleCode getAgentRole() {
		return AgentRole;
	}

	public void setAgentRole(AgentRoleCode AgentRole) {
		this.AgentRole = AgentRole;
	}
}