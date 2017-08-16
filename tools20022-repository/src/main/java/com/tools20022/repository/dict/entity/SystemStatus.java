package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.SystemStatusCode;
import com.tools20022.repository.dict.codeset.MemberStatusCode;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.SystemMemberRole;

/**
 * Status of a system and the period of time during which the status is valid.
 */
public class SystemStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SystemStatusCode Status;
	private MemberStatusCode MemberStatus;
	private System System;
	private SystemMemberRole SystemMemberRole;

	public SystemStatusCode getStatus() {
		return Status;
	}

	public void setStatus(SystemStatusCode Status) {
		this.Status = Status;
	}

	public MemberStatusCode getMemberStatus() {
		return MemberStatus;
	}

	public void setMemberStatus(MemberStatusCode MemberStatus) {
		this.MemberStatus = MemberStatus;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public SystemMemberRole getSystemMemberRole() {
		return SystemMemberRole;
	}

	public void setSystemMemberRole(SystemMemberRole SystemMemberRole) {
		this.SystemMemberRole = SystemMemberRole;
	}
}