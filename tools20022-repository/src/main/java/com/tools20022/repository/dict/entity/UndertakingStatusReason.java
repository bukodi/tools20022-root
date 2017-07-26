package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.entity.Discrepancy;
import com.tools20022.repository.dict.entity.UndertakingStatus;
import com.tools20022.repository.dict.codeset.TerminationReasonCode;
import com.tools20022.repository.dict.codeset.DemandStatusCode;
import com.tools20022.repository.dict.codeset.SettlementAdviceTypeCode;

/**
 * Specifies the reason for the status or for the action (for instance
 * settlement reason).
 */
public class UndertakingStatusReason extends StatusReason {

	private Discrepancy Discrepancy;
	private UndertakingStatus UndertakingStatus;
	private TerminationReasonCode TerminationReason;
	private DemandStatusCode DemandRefusalStatusReason;
	private SettlementAdviceTypeCode SettlementReason;

	public Discrepancy getDiscrepancy() {
		return Discrepancy;
	}

	public void setDiscrepancy(Discrepancy Discrepancy) {
		this.Discrepancy = Discrepancy;
	}

	public UndertakingStatus getUndertakingStatus() {
		return UndertakingStatus;
	}

	public void setUndertakingStatus(UndertakingStatus UndertakingStatus) {
		this.UndertakingStatus = UndertakingStatus;
	}

	public TerminationReasonCode getTerminationReason() {
		return TerminationReason;
	}

	public void setTerminationReason(TerminationReasonCode TerminationReason) {
		this.TerminationReason = TerminationReason;
	}

	public DemandStatusCode getDemandRefusalStatusReason() {
		return DemandRefusalStatusReason;
	}

	public void setDemandRefusalStatusReason(
			DemandStatusCode DemandRefusalStatusReason) {
		this.DemandRefusalStatusReason = DemandRefusalStatusReason;
	}

	public SettlementAdviceTypeCode getSettlementReason() {
		return SettlementReason;
	}

	public void setSettlementReason(SettlementAdviceTypeCode SettlementReason) {
		this.SettlementReason = SettlementReason;
	}
}