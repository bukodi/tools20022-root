package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.ResponseStatusCode;
import com.tools20022.repository.dict.codeset.CollateralManagementCancellationReasonCode;
import com.tools20022.repository.dict.codeset.CollateralSubstitutionConfirmationCode;
import com.tools20022.repository.dict.codeset.InterestRejectionReasonCode;
import com.tools20022.repository.dict.codeset.MarginCallResponseCode;
import com.tools20022.repository.dict.codeset.SettlementStatusCode;
import com.tools20022.repository.dict.codeset.CancellationReasonCode;
import com.tools20022.repository.dict.entity.Collateral;

/**
 * Specifies the status of the collateral or of an event related to collateral.
 */
public class CollateralStatus extends Status {

	private ResponseStatusCode ResponseStatus;
	private CollateralManagementCancellationReasonCode CollateralManagementCancellationReason;
	private CollateralSubstitutionConfirmationCode SubstitutionStatus;
	private InterestRejectionReasonCode InterestRejectionReason;
	private MarginCallResponseCode MarginCallResponse;
	private SettlementStatusCode Settlement;
	private CancellationReasonCode CancellationReason;
	private Collateral Collateral;

	public ResponseStatusCode getResponseStatus() {
		return ResponseStatus;
	}

	public void setResponseStatus(ResponseStatusCode ResponseStatus) {
		this.ResponseStatus = ResponseStatus;
	}

	public CollateralManagementCancellationReasonCode getCollateralManagementCancellationReason() {
		return CollateralManagementCancellationReason;
	}

	public void setCollateralManagementCancellationReason(
			CollateralManagementCancellationReasonCode CollateralManagementCancellationReason) {
		this.CollateralManagementCancellationReason = CollateralManagementCancellationReason;
	}

	public CollateralSubstitutionConfirmationCode getSubstitutionStatus() {
		return SubstitutionStatus;
	}

	public void setSubstitutionStatus(
			CollateralSubstitutionConfirmationCode SubstitutionStatus) {
		this.SubstitutionStatus = SubstitutionStatus;
	}

	public InterestRejectionReasonCode getInterestRejectionReason() {
		return InterestRejectionReason;
	}

	public void setInterestRejectionReason(
			InterestRejectionReasonCode InterestRejectionReason) {
		this.InterestRejectionReason = InterestRejectionReason;
	}

	public MarginCallResponseCode getMarginCallResponse() {
		return MarginCallResponse;
	}

	public void setMarginCallResponse(MarginCallResponseCode MarginCallResponse) {
		this.MarginCallResponse = MarginCallResponse;
	}

	public SettlementStatusCode getSettlement() {
		return Settlement;
	}

	public void setSettlement(SettlementStatusCode Settlement) {
		this.Settlement = Settlement;
	}

	public CancellationReasonCode getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(CancellationReasonCode CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}
}