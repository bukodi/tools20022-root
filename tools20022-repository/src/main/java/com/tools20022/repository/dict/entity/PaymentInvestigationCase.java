package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestigationCase;
import com.tools20022.repository.dict.entity.PaymentStatus;
import com.tools20022.repository.dict.codeset.CancellationReasonCode;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.codeset.UnableToApplyIncorrectInfoCode;
import com.tools20022.repository.dict.codeset.UnableToApplyMissingInformationV2Code;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Set of activities performed to handle an exception to a normal payment
 * transaction flow, such as: - a payment has not been received. - a payment has
 * been received but is incorrect. - a payment must be corrected or cancelled
 * (requested by the party which ordered the payment).
 */
public class PaymentInvestigationCase extends InvestigationCase {

	private PaymentStatus PaymentStatus;
	private CancellationReasonCode CancellationReason;
	private Payment UnderlyingPayment;
	private YesNoIndicator MissingCoverIndication;
	private PaymentExecution UnderlyingInstruction;
	private CashEntry UnderlyingCashEntry;
	private UnableToApplyIncorrectInfoCode IncorrectInformationReason;
	private UnableToApplyMissingInformationV2Code MissingInformationReason;
	private Max35Text CaseType;

	public PaymentStatus getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(PaymentStatus PaymentStatus) {
		this.PaymentStatus = PaymentStatus;
	}

	public CancellationReasonCode getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(CancellationReasonCode CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Payment getUnderlyingPayment() {
		return UnderlyingPayment;
	}

	public void setUnderlyingPayment(Payment UnderlyingPayment) {
		this.UnderlyingPayment = UnderlyingPayment;
	}

	public YesNoIndicator getMissingCoverIndication() {
		return MissingCoverIndication;
	}

	public void setMissingCoverIndication(YesNoIndicator MissingCoverIndication) {
		this.MissingCoverIndication = MissingCoverIndication;
	}

	public PaymentExecution getUnderlyingInstruction() {
		return UnderlyingInstruction;
	}

	public void setUnderlyingInstruction(PaymentExecution UnderlyingInstruction) {
		this.UnderlyingInstruction = UnderlyingInstruction;
	}

	public CashEntry getUnderlyingCashEntry() {
		return UnderlyingCashEntry;
	}

	public void setUnderlyingCashEntry(CashEntry UnderlyingCashEntry) {
		this.UnderlyingCashEntry = UnderlyingCashEntry;
	}

	public UnableToApplyIncorrectInfoCode getIncorrectInformationReason() {
		return IncorrectInformationReason;
	}

	public void setIncorrectInformationReason(
			UnableToApplyIncorrectInfoCode IncorrectInformationReason) {
		this.IncorrectInformationReason = IncorrectInformationReason;
	}

	public UnableToApplyMissingInformationV2Code getMissingInformationReason() {
		return MissingInformationReason;
	}

	public void setMissingInformationReason(
			UnableToApplyMissingInformationV2Code MissingInformationReason) {
		this.MissingInformationReason = MissingInformationReason;
	}

	public Max35Text getCaseType() {
		return CaseType;
	}

	public void setCaseType(Max35Text CaseType) {
		this.CaseType = CaseType;
	}
}