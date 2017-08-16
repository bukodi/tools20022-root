package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CollateralMovement;
import com.tools20022.repository.dict.codeset.CollateralProposalResponseCode;
import com.tools20022.repository.dict.codeset.ProposalTypeCode;
import com.tools20022.repository.dict.entity.CollateralManagement;

/**
 * Specifies collateral proposed to the counterparty.
 */
public class CollateralProposal extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CollateralMovement ProposedCollateralMovement;
	private CollateralProposalResponseCode ResponseType;
	private ProposalTypeCode Type;
	private CollateralManagement RelatedManagementProcess;

	public CollateralMovement getProposedCollateralMovement() {
		return ProposedCollateralMovement;
	}

	public void setProposedCollateralMovement(
			CollateralMovement ProposedCollateralMovement) {
		this.ProposedCollateralMovement = ProposedCollateralMovement;
	}

	public CollateralProposalResponseCode getResponseType() {
		return ResponseType;
	}

	public void setResponseType(CollateralProposalResponseCode ResponseType) {
		this.ResponseType = ResponseType;
	}

	public ProposalTypeCode getType() {
		return Type;
	}

	public void setType(ProposalTypeCode Type) {
		this.Type = Type;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return RelatedManagementProcess;
	}

	public void setRelatedManagementProcess(
			CollateralManagement RelatedManagementProcess) {
		this.RelatedManagementProcess = RelatedManagementProcess;
	}
}