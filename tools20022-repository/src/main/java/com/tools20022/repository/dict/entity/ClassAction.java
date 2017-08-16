package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Form of lawsuit in which a group of shareholders collectively bring a claim
 * to court, mainly because it would be too expensive for each individual
 * shareholder to launch their own lawsuit.
 */
public class ClassAction extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text ClassActionNumber;
	private ISODateTime LeadPlaintiffDeadline;
	private ISODateTime CourtApprovalDate;
	private DateTimePeriod ClaimPeriod;
	private ISODateTime FilingDate;
	private ISODateTime HearingDate;
	private CorporateActionEvent CorporateEvent;

	public Max35Text getClassActionNumber() {
		return ClassActionNumber;
	}

	public void setClassActionNumber(Max35Text ClassActionNumber) {
		this.ClassActionNumber = ClassActionNumber;
	}

	public ISODateTime getLeadPlaintiffDeadline() {
		return LeadPlaintiffDeadline;
	}

	public void setLeadPlaintiffDeadline(ISODateTime LeadPlaintiffDeadline) {
		this.LeadPlaintiffDeadline = LeadPlaintiffDeadline;
	}

	public ISODateTime getCourtApprovalDate() {
		return CourtApprovalDate;
	}

	public void setCourtApprovalDate(ISODateTime CourtApprovalDate) {
		this.CourtApprovalDate = CourtApprovalDate;
	}

	public DateTimePeriod getClaimPeriod() {
		return ClaimPeriod;
	}

	public void setClaimPeriod(DateTimePeriod ClaimPeriod) {
		this.ClaimPeriod = ClaimPeriod;
	}

	public ISODateTime getFilingDate() {
		return FilingDate;
	}

	public void setFilingDate(ISODateTime FilingDate) {
		this.FilingDate = FilingDate;
	}

	public ISODateTime getHearingDate() {
		return HearingDate;
	}

	public void setHearingDate(ISODateTime HearingDate) {
		this.HearingDate = HearingDate;
	}

	public CorporateActionEvent getCorporateEvent() {
		return CorporateEvent;
	}

	public void setCorporateEvent(CorporateActionEvent CorporateEvent) {
		this.CorporateEvent = CorporateEvent;
	}
}