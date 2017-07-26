package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.System;

/**
 * Role played by a party in a system.
 */
public class SystemPartyRole extends Role {

	private System RelatedSystem;

	public System getRelatedSystem() {
		return RelatedSystem;
	}

	public void setRelatedSystem(System RelatedSystem) {
		this.RelatedSystem = RelatedSystem;
	}
}