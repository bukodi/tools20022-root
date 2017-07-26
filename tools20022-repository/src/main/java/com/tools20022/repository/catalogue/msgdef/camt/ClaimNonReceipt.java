package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.PaymentInstructionExtract;
import com.tools20022.repository.dict.msg.MissingCover;
import java.util.Optional;

/**
 * Scope The Claim Non Receipt message is sent by a case creator/case assigner
 * to a case assignee. This message allows to initiate an investigation in case
 * the beneficiary of a payment has not received an expected payment. Usage Note
 * 1: Although there are cases where a creditor would contact the creditor's
 * bank when claiming non-receipt, the activity only retained the scenario where
 * the beneficiary claims non-receipt with its debtor, the debtor in its turn
 * contacting the first agent. Therefore the investigation follows the same
 * route as the original instruction. Note 2: This message is also used to
 * report a missing cover. The rationale behind this is that the beneficiary of
 * the cover (receiver of the payment instruction) missing the cover would be in
 * the very same position as a beneficiary expecting a credit to its account and
 * would therefore trigger the same processes. In case of a Missing cover, the
 * case will be assigned to the sender of the payment instruction, before
 * following the route of the payment instruction.
 */
public class ClaimNonReceipt {

	private CaseAssignment Assignment;
	private Case Case;
	private PaymentInstructionExtract Underlying;
	private Optional<MissingCover> MissingCover;

	public CaseAssignment getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment Assignment) {
		this.Assignment = Assignment;
	}

	public Case getCase() {
		return Case;
	}

	public void setCase(Case Case) {
		this.Case = Case;
	}

	public PaymentInstructionExtract getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(PaymentInstructionExtract Underlying) {
		this.Underlying = Underlying;
	}

	public Optional<MissingCover> getMissingCover() {
		return MissingCover;
	}

	public void setMissingCover(Optional<MissingCover> MissingCover) {
		this.MissingCover = MissingCover;
	}
}