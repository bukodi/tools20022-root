package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.ProcessingStatusCode;
import com.tools20022.repository.dict.codeset.CorporateActionEventProcessingStatusCode;
import com.tools20022.repository.dict.entity.CorporateActionStatusReason;
import com.tools20022.repository.dict.codeset.CorporateActionInstructionCancellationProcessingStatusCode;
import com.tools20022.repository.dict.codeset.CorporateActionInstructionProcessingStatusCode;
import com.tools20022.repository.dict.codeset.RateStatusCode;
import com.tools20022.repository.dict.codeset.OptionAvailabilityStatusCode;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.codeset.CorporateActionEventStatusCode;
import com.tools20022.repository.dict.codeset.CorporateActionProcessedStatusCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.EventConfirmationStatusCode;
import com.tools20022.repository.dict.codeset.EventCompletenessStatusCode;

/**
 * Status of the corporate action process.
 */
public class CorporateActionStatus extends Status
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max350Text AgentStandingInstructionStatus;
	private ProcessingStatusCode ProcessingStatus;
	private CorporateActionEventProcessingStatusCode EventProcessingStatus;
	private CorporateActionStatusReason CorporateActionStatusReason;
	private CorporateActionInstructionCancellationProcessingStatusCode InstructionCancellationStatus;
	private CorporateActionInstructionProcessingStatusCode CorporateActionInstructionProcessingStatus;
	private RateStatusCode RateStatus;
	private OptionAvailabilityStatusCode OptionAvailabilityStatus;
	private CorporateActionEvent CorporateActionEvent;
	private CorporateActionEventStatusCode EventStatus;
	private CorporateActionProcessedStatusCode RelatedInstructionProcessedStatus;
	private ISODateTime DeactivationDateAndTime;
	private EventConfirmationStatusCode EventConfirmationStatus;
	private EventCompletenessStatusCode EventCompletenessStatus;

	public Max350Text getAgentStandingInstructionStatus() {
		return AgentStandingInstructionStatus;
	}

	public void setAgentStandingInstructionStatus(
			Max350Text AgentStandingInstructionStatus) {
		this.AgentStandingInstructionStatus = AgentStandingInstructionStatus;
	}

	public ProcessingStatusCode getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(ProcessingStatusCode ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public CorporateActionEventProcessingStatusCode getEventProcessingStatus() {
		return EventProcessingStatus;
	}

	public void setEventProcessingStatus(
			CorporateActionEventProcessingStatusCode EventProcessingStatus) {
		this.EventProcessingStatus = EventProcessingStatus;
	}

	public CorporateActionStatusReason getCorporateActionStatusReason() {
		return CorporateActionStatusReason;
	}

	public void setCorporateActionStatusReason(
			CorporateActionStatusReason CorporateActionStatusReason) {
		this.CorporateActionStatusReason = CorporateActionStatusReason;
	}

	public CorporateActionInstructionCancellationProcessingStatusCode getInstructionCancellationStatus() {
		return InstructionCancellationStatus;
	}

	public void setInstructionCancellationStatus(
			CorporateActionInstructionCancellationProcessingStatusCode InstructionCancellationStatus) {
		this.InstructionCancellationStatus = InstructionCancellationStatus;
	}

	public CorporateActionInstructionProcessingStatusCode getCorporateActionInstructionProcessingStatus() {
		return CorporateActionInstructionProcessingStatus;
	}

	public void setCorporateActionInstructionProcessingStatus(
			CorporateActionInstructionProcessingStatusCode CorporateActionInstructionProcessingStatus) {
		this.CorporateActionInstructionProcessingStatus = CorporateActionInstructionProcessingStatus;
	}

	public RateStatusCode getRateStatus() {
		return RateStatus;
	}

	public void setRateStatus(RateStatusCode RateStatus) {
		this.RateStatus = RateStatus;
	}

	public OptionAvailabilityStatusCode getOptionAvailabilityStatus() {
		return OptionAvailabilityStatus;
	}

	public void setOptionAvailabilityStatus(
			OptionAvailabilityStatusCode OptionAvailabilityStatus) {
		this.OptionAvailabilityStatus = OptionAvailabilityStatus;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}

	public CorporateActionEventStatusCode getEventStatus() {
		return EventStatus;
	}

	public void setEventStatus(CorporateActionEventStatusCode EventStatus) {
		this.EventStatus = EventStatus;
	}

	public CorporateActionProcessedStatusCode getRelatedInstructionProcessedStatus() {
		return RelatedInstructionProcessedStatus;
	}

	public void setRelatedInstructionProcessedStatus(
			CorporateActionProcessedStatusCode RelatedInstructionProcessedStatus) {
		this.RelatedInstructionProcessedStatus = RelatedInstructionProcessedStatus;
	}

	public ISODateTime getDeactivationDateAndTime() {
		return DeactivationDateAndTime;
	}

	public void setDeactivationDateAndTime(ISODateTime DeactivationDateAndTime) {
		this.DeactivationDateAndTime = DeactivationDateAndTime;
	}

	public EventConfirmationStatusCode getEventConfirmationStatus() {
		return EventConfirmationStatus;
	}

	public void setEventConfirmationStatus(
			EventConfirmationStatusCode EventConfirmationStatus) {
		this.EventConfirmationStatus = EventConfirmationStatus;
	}

	public EventCompletenessStatusCode getEventCompletenessStatus() {
		return EventCompletenessStatus;
	}

	public void setEventCompletenessStatus(
			EventCompletenessStatusCode EventCompletenessStatus) {
		this.EventCompletenessStatus = EventCompletenessStatus;
	}
}