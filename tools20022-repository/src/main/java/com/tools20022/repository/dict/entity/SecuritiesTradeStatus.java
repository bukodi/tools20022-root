package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.MatchingStatusCode;
import com.tools20022.repository.dict.codeset.AffirmationStatusCode;
import com.tools20022.repository.dict.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.dict.entity.SecuritiesTrade;
import com.tools20022.repository.dict.codeset.TransactionStatusCode;
import com.tools20022.repository.dict.codeset.ReplacementProcessingStatusCode;
import com.tools20022.repository.dict.codeset.CancellationStatusCode;
import com.tools20022.repository.dict.codeset.CancellationRightCode;
import com.tools20022.repository.dict.codeset.TransferStatusCode;
import com.tools20022.repository.dict.codeset.AllegementStatusCode;
import com.tools20022.repository.dict.codeset.AllocationStatusCode;
import com.tools20022.repository.dict.codeset.RepoCallRequestStatusCode;
import com.tools20022.repository.dict.codeset.SettlementConditionModificationStatusStatusCode;
import com.tools20022.repository.dict.codeset.MatchingProcessCode;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;

/**
 * Status of a securities trade.
 */
public class SecuritiesTradeStatus extends Status {

	private MatchingStatusCode MatchingStatus;
	private AffirmationStatusCode AffirmationStatus;
	private SecuritiesTradeStatusReason Reason;
	private SecuritiesTrade SecuritiesTrade;
	private TransactionStatusCode TransactionStatus;
	private ReplacementProcessingStatusCode ReplacementProcessingStatus;
	private CancellationStatusCode CancellationStatus;
	private CancellationRightCode CancellationRight;
	private TransferStatusCode TransferStatus;
	private AllegementStatusCode AllegedStatus;
	private AllocationStatusCode CollateralAllocationStatus;
	private RepoCallRequestStatusCode RepoCallRequestStatus;
	private SettlementConditionModificationStatusStatusCode SettlementConditionModificationStatus;
	private MatchingProcessCode MatchingProcess;
	private SecuritiesTransfer RelatedSecuritiesTransfer;

	public MatchingStatusCode getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(MatchingStatusCode MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public AffirmationStatusCode getAffirmationStatus() {
		return AffirmationStatus;
	}

	public void setAffirmationStatus(AffirmationStatusCode AffirmationStatus) {
		this.AffirmationStatus = AffirmationStatus;
	}

	public SecuritiesTradeStatusReason getReason() {
		return Reason;
	}

	public void setReason(SecuritiesTradeStatusReason Reason) {
		this.Reason = Reason;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return SecuritiesTrade;
	}

	public void setSecuritiesTrade(SecuritiesTrade SecuritiesTrade) {
		this.SecuritiesTrade = SecuritiesTrade;
	}

	public TransactionStatusCode getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(TransactionStatusCode TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public ReplacementProcessingStatusCode getReplacementProcessingStatus() {
		return ReplacementProcessingStatus;
	}

	public void setReplacementProcessingStatus(
			ReplacementProcessingStatusCode ReplacementProcessingStatus) {
		this.ReplacementProcessingStatus = ReplacementProcessingStatus;
	}

	public CancellationStatusCode getCancellationStatus() {
		return CancellationStatus;
	}

	public void setCancellationStatus(CancellationStatusCode CancellationStatus) {
		this.CancellationStatus = CancellationStatus;
	}

	public CancellationRightCode getCancellationRight() {
		return CancellationRight;
	}

	public void setCancellationRight(CancellationRightCode CancellationRight) {
		this.CancellationRight = CancellationRight;
	}

	public TransferStatusCode getTransferStatus() {
		return TransferStatus;
	}

	public void setTransferStatus(TransferStatusCode TransferStatus) {
		this.TransferStatus = TransferStatus;
	}

	public AllegementStatusCode getAllegedStatus() {
		return AllegedStatus;
	}

	public void setAllegedStatus(AllegementStatusCode AllegedStatus) {
		this.AllegedStatus = AllegedStatus;
	}

	public AllocationStatusCode getCollateralAllocationStatus() {
		return CollateralAllocationStatus;
	}

	public void setCollateralAllocationStatus(
			AllocationStatusCode CollateralAllocationStatus) {
		this.CollateralAllocationStatus = CollateralAllocationStatus;
	}

	public RepoCallRequestStatusCode getRepoCallRequestStatus() {
		return RepoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(
			RepoCallRequestStatusCode RepoCallRequestStatus) {
		this.RepoCallRequestStatus = RepoCallRequestStatus;
	}

	public SettlementConditionModificationStatusStatusCode getSettlementConditionModificationStatus() {
		return SettlementConditionModificationStatus;
	}

	public void setSettlementConditionModificationStatus(
			SettlementConditionModificationStatusStatusCode SettlementConditionModificationStatus) {
		this.SettlementConditionModificationStatus = SettlementConditionModificationStatus;
	}

	public MatchingProcessCode getMatchingProcess() {
		return MatchingProcess;
	}

	public void setMatchingProcess(MatchingProcessCode MatchingProcess) {
		this.MatchingProcess = MatchingProcess;
	}

	public SecuritiesTransfer getRelatedSecuritiesTransfer() {
		return RelatedSecuritiesTransfer;
	}

	public void setRelatedSecuritiesTransfer(
			SecuritiesTransfer RelatedSecuritiesTransfer) {
		this.RelatedSecuritiesTransfer = RelatedSecuritiesTransfer;
	}
}