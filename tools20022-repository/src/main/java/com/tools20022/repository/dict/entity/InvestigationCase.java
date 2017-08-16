package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.InvestigationCaseStatus;
import com.tools20022.repository.dict.entity.InvestigationPartyRole;
import com.tools20022.repository.dict.entity.DuplicateCase;
import com.tools20022.repository.dict.entity.InvestigationResolution;
import com.tools20022.repository.dict.entity.InvestigationCase;
import com.tools20022.repository.dict.entity.Reassignment;

/**
 * Set of activities performed to handle an exception to a normal transaction
 * flow..
 */
public class InvestigationCase extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text AssignmentIdentification;
	private ISODateTime CreationDateTime;
	private Max35Text Identification;
	private InvestigationCaseStatus Status;
	private InvestigationPartyRole InvestigationPartyRole;
	private DuplicateCase DuplicateCaseResolution;
	private InvestigationResolution InvestigationResolution;
	private InvestigationCase OriginalInvestigationCase;
	private InvestigationCase LinkedCase;
	private Reassignment Reassignment;

	public Max35Text getAssignmentIdentification() {
		return AssignmentIdentification;
	}

	public void setAssignmentIdentification(Max35Text AssignmentIdentification) {
		this.AssignmentIdentification = AssignmentIdentification;
	}

	public ISODateTime getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(ISODateTime CreationDateTime) {
		this.CreationDateTime = CreationDateTime;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public InvestigationCaseStatus getStatus() {
		return Status;
	}

	public void setStatus(InvestigationCaseStatus Status) {
		this.Status = Status;
	}

	public InvestigationPartyRole getInvestigationPartyRole() {
		return InvestigationPartyRole;
	}

	public void setInvestigationPartyRole(
			InvestigationPartyRole InvestigationPartyRole) {
		this.InvestigationPartyRole = InvestigationPartyRole;
	}

	public DuplicateCase getDuplicateCaseResolution() {
		return DuplicateCaseResolution;
	}

	public void setDuplicateCaseResolution(DuplicateCase DuplicateCaseResolution) {
		this.DuplicateCaseResolution = DuplicateCaseResolution;
	}

	public InvestigationResolution getInvestigationResolution() {
		return InvestigationResolution;
	}

	public void setInvestigationResolution(
			InvestigationResolution InvestigationResolution) {
		this.InvestigationResolution = InvestigationResolution;
	}

	public InvestigationCase getOriginalInvestigationCase() {
		return OriginalInvestigationCase;
	}

	public void setOriginalInvestigationCase(
			InvestigationCase OriginalInvestigationCase) {
		this.OriginalInvestigationCase = OriginalInvestigationCase;
	}

	public InvestigationCase getLinkedCase() {
		return LinkedCase;
	}

	public void setLinkedCase(InvestigationCase LinkedCase) {
		this.LinkedCase = LinkedCase;
	}

	public Reassignment getReassignment() {
		return Reassignment;
	}

	public void setReassignment(Reassignment Reassignment) {
		this.Reassignment = Reassignment;
	}
}