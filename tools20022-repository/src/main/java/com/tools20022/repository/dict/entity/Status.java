package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.StatusCode;
import com.tools20022.repository.dict.entity.InvestigationPartyRole;
import com.tools20022.repository.dict.codeset.SecuritiesSettlementStatusCode;
import com.tools20022.repository.dict.codeset.CancellationProcessingStatusCode;
import com.tools20022.repository.dict.codeset.InstructionProcessingStatusCode;
import com.tools20022.repository.dict.codeset.ModificationProcessingStatusCode;

/**
 * The status of an instruction, advice or request.
 */
public class Status extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private StatusReason StatusReason;
	private ISODateTime StatusDateTime;
	private DateTimePeriod ValidityTime;
	private Max350Text StatusDescription;
	private StatusCode InstructionProcessingStatus;
	private InvestigationPartyRole PartyRole;
	private SecuritiesSettlementStatusCode SettlementStatus;
	private CancellationProcessingStatusCode CancellationProcessingStatus;
	private InstructionProcessingStatusCode TransactionProcessingStatus;
	private ModificationProcessingStatusCode ModificationProcessingStatus;

	public StatusReason getStatusReason() {
		return StatusReason;
	}

	public void setStatusReason(StatusReason StatusReason) {
		this.StatusReason = StatusReason;
	}

	public ISODateTime getStatusDateTime() {
		return StatusDateTime;
	}

	public void setStatusDateTime(ISODateTime StatusDateTime) {
		this.StatusDateTime = StatusDateTime;
	}

	public DateTimePeriod getValidityTime() {
		return ValidityTime;
	}

	public void setValidityTime(DateTimePeriod ValidityTime) {
		this.ValidityTime = ValidityTime;
	}

	public Max350Text getStatusDescription() {
		return StatusDescription;
	}

	public void setStatusDescription(Max350Text StatusDescription) {
		this.StatusDescription = StatusDescription;
	}

	public StatusCode getInstructionProcessingStatus() {
		return InstructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(
			StatusCode InstructionProcessingStatus) {
		this.InstructionProcessingStatus = InstructionProcessingStatus;
	}

	public InvestigationPartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(InvestigationPartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public SecuritiesSettlementStatusCode getSettlementStatus() {
		return SettlementStatus;
	}

	public void setSettlementStatus(
			SecuritiesSettlementStatusCode SettlementStatus) {
		this.SettlementStatus = SettlementStatus;
	}

	public CancellationProcessingStatusCode getCancellationProcessingStatus() {
		return CancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(
			CancellationProcessingStatusCode CancellationProcessingStatus) {
		this.CancellationProcessingStatus = CancellationProcessingStatus;
	}

	public InstructionProcessingStatusCode getTransactionProcessingStatus() {
		return TransactionProcessingStatus;
	}

	public void setTransactionProcessingStatus(
			InstructionProcessingStatusCode TransactionProcessingStatus) {
		this.TransactionProcessingStatus = TransactionProcessingStatus;
	}

	public ModificationProcessingStatusCode getModificationProcessingStatus() {
		return ModificationProcessingStatus;
	}

	public void setModificationProcessingStatus(
			ModificationProcessingStatusCode ModificationProcessingStatus) {
		this.ModificationProcessingStatus = ModificationProcessingStatus;
	}
}