package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.codeset.UnmatchedReasonCode;
import com.tools20022.repository.dict.codeset.DeniedReasonCode;
import com.tools20022.repository.dict.entity.SecuritiesTradeStatus;
import com.tools20022.repository.dict.codeset.GeneratedReasonCode;
import com.tools20022.repository.dict.codeset.AllegementReasonCode;
import com.tools20022.repository.dict.codeset.PendingSettlementStatusReasonCode;
import com.tools20022.repository.dict.codeset.RepoCallAcknowledgementReasonCode;
import com.tools20022.repository.dict.codeset.RepairReasonV2Code;
import com.tools20022.repository.dict.codeset.DeliveryReturnCode;
import com.tools20022.repository.dict.codeset.CounterpartyResponseStatusReasonCode;
import com.tools20022.repository.dict.codeset.ModifiedStatusReasonCode;

/**
 * Specifies the underlying reason for a status of a securities trade.
 */
public class SecuritiesTradeStatusReason extends StatusReason
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private UnmatchedReasonCode UnmatchedReason;
	private DeniedReasonCode DeniedReason;
	private SecuritiesTradeStatus SecuritiesTradeStatus;
	private GeneratedReasonCode GeneratedReason;
	private AllegementReasonCode AllegementReason;
	private PendingSettlementStatusReasonCode PendingSettlementReason;
	private RepoCallAcknowledgementReasonCode RepoCallAcknowledgementReason;
	private RepairReasonV2Code RepairReason;
	private DeliveryReturnCode DeliveryReturnReason;
	private CounterpartyResponseStatusReasonCode CounterpartyStatusReason;
	private ModifiedStatusReasonCode ModifiedStatusReason;

	public UnmatchedReasonCode getUnmatchedReason() {
		return UnmatchedReason;
	}

	public void setUnmatchedReason(UnmatchedReasonCode UnmatchedReason) {
		this.UnmatchedReason = UnmatchedReason;
	}

	public DeniedReasonCode getDeniedReason() {
		return DeniedReason;
	}

	public void setDeniedReason(DeniedReasonCode DeniedReason) {
		this.DeniedReason = DeniedReason;
	}

	public SecuritiesTradeStatus getSecuritiesTradeStatus() {
		return SecuritiesTradeStatus;
	}

	public void setSecuritiesTradeStatus(
			SecuritiesTradeStatus SecuritiesTradeStatus) {
		this.SecuritiesTradeStatus = SecuritiesTradeStatus;
	}

	public GeneratedReasonCode getGeneratedReason() {
		return GeneratedReason;
	}

	public void setGeneratedReason(GeneratedReasonCode GeneratedReason) {
		this.GeneratedReason = GeneratedReason;
	}

	public AllegementReasonCode getAllegementReason() {
		return AllegementReason;
	}

	public void setAllegementReason(AllegementReasonCode AllegementReason) {
		this.AllegementReason = AllegementReason;
	}

	public PendingSettlementStatusReasonCode getPendingSettlementReason() {
		return PendingSettlementReason;
	}

	public void setPendingSettlementReason(
			PendingSettlementStatusReasonCode PendingSettlementReason) {
		this.PendingSettlementReason = PendingSettlementReason;
	}

	public RepoCallAcknowledgementReasonCode getRepoCallAcknowledgementReason() {
		return RepoCallAcknowledgementReason;
	}

	public void setRepoCallAcknowledgementReason(
			RepoCallAcknowledgementReasonCode RepoCallAcknowledgementReason) {
		this.RepoCallAcknowledgementReason = RepoCallAcknowledgementReason;
	}

	public RepairReasonV2Code getRepairReason() {
		return RepairReason;
	}

	public void setRepairReason(RepairReasonV2Code RepairReason) {
		this.RepairReason = RepairReason;
	}

	public DeliveryReturnCode getDeliveryReturnReason() {
		return DeliveryReturnReason;
	}

	public void setDeliveryReturnReason(DeliveryReturnCode DeliveryReturnReason) {
		this.DeliveryReturnReason = DeliveryReturnReason;
	}

	public CounterpartyResponseStatusReasonCode getCounterpartyStatusReason() {
		return CounterpartyStatusReason;
	}

	public void setCounterpartyStatusReason(
			CounterpartyResponseStatusReasonCode CounterpartyStatusReason) {
		this.CounterpartyStatusReason = CounterpartyStatusReason;
	}

	public ModifiedStatusReasonCode getModifiedStatusReason() {
		return ModifiedStatusReason;
	}

	public void setModifiedStatusReason(
			ModifiedStatusReasonCode ModifiedStatusReason) {
		this.ModifiedStatusReason = ModifiedStatusReason;
	}
}