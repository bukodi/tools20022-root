package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.RegisteredContract;

/**
 * Party which plays a role for regulatory reporting.
 */
public class RegulatoryReportingRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private RegisteredContract RelatedReportingParty;
	private RegisteredContract RelatedRegistrationAgent;
	private RegisteredContract RelatedReceivingParty;
	private RegisteredContract RelatedSendingParty;

	public RegisteredContract getRelatedReportingParty() {
		return RelatedReportingParty;
	}

	public void setRelatedReportingParty(
			RegisteredContract RelatedReportingParty) {
		this.RelatedReportingParty = RelatedReportingParty;
	}

	public RegisteredContract getRelatedRegistrationAgent() {
		return RelatedRegistrationAgent;
	}

	public void setRelatedRegistrationAgent(
			RegisteredContract RelatedRegistrationAgent) {
		this.RelatedRegistrationAgent = RelatedRegistrationAgent;
	}

	public RegisteredContract getRelatedReceivingParty() {
		return RelatedReceivingParty;
	}

	public void setRelatedReceivingParty(
			RegisteredContract RelatedReceivingParty) {
		this.RelatedReceivingParty = RelatedReceivingParty;
	}

	public RegisteredContract getRelatedSendingParty() {
		return RelatedSendingParty;
	}

	public void setRelatedSendingParty(RegisteredContract RelatedSendingParty) {
		this.RelatedSendingParty = RelatedSendingParty;
	}
}