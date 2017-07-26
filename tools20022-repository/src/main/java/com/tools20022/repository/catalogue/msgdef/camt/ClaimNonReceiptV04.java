package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.ClaimNonReceiptV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.ClaimNonReceiptV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.dict.msg.MissingCover3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The Claim Non Receipt message is sent by a case creator/case assigner
 * to a case assignee. This message is used to initiate an investigation for
 * missing funds at the creditor (missing credit entry to its account) or at an
 * agent along the processing chain (missing cover for a received payment
 * instruction). Usage The claim non receipt case occurs in two situations: -
 * The creditor is expecting funds from a particular debtor and cannot find the
 * corresponding credit entry on its account. In this situation, it is
 * understood that the creditor will contact its debtor, and that the debtor
 * will trigger the claim non receipt case on its behalf. A workflow where the
 * creditor directly addresses a Claim Non Receipt message to its account
 * servicing institution is not retained. - An agent in the processing chain
 * cannot find a cover payment corresponding to a received payment instruction.
 * In this situation, the agent may directly trigger the investigation by
 * sending a Claim Non Receipt message to the sender of the original payment
 * instruction. The Claim Non Receipt message covers one and only one payment
 * instruction at a time. If several expected payment instructions/cover
 * instructions are found missing, then multiple Claim Non Receipt messages must
 * be sent. Depending on the result of the investigation by a case assignee
 * (incorrect routing, errors/omissions when processing the instruction or even
 * the absence of an error) and the stage at which the payment instruction is
 * being process, the claim non receipt case may lead to a: - Request To Cancel
 * Payment message, sent to the subsequent agent in the payment processing
 * chain, if the original payment instruction has been incorrectly routed
 * through the chain of agents. (This also implies that a new, corrected,
 * payment instruction is issued). - Request To Modify Payment message, sent to
 * the subsequent agent in the payment processing chain, if a truncation or
 * omission has occurred during the processing of the original payment
 * instruction. If the above situations occur, the assignee wanting to request a
 * payment cancellation or payment modification should first send out a
 * Resolution Of Investigation with a confirmation status that indicates that
 * either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will
 * follow. (See section on Resolution Of Investigation for more details). In the
 * cover is missing, the case assignee may also simply issue the omitted cover
 * payment or when the initial cover information was incorrect, update the cover
 * (through modification and/or cancellation as required) with the correction
 * information provided in the ClaimNonReceipt message. The case assignee will
 * issue a Resolution Of Investigation message with the CorrectionTransaction
 * element mentioning the references of the cover payment. The Claim Non Receipt
 * message may be forwarded to subsequent case assignees. The ClaimNonReceipt
 * message has the following main characteristics: - Case Identification: The
 * case creator assigns a unique case identification. This information will be
 * passed unchanged to subsequent case assignee(s). - Underlying Payment: The
 * case creator refers to the underlying payment instruction for the unambiguous
 * identification of the payment instruction. This identification needs to be
 * updated by the subsequent case assigner(s) in order to match the one used
 * with their case assignee(s). - MissingCoverIndicator: The
 * MissingCoverIndication element distinguishes between a missing cover
 * situation (when set to YES) or a missing funds situation (when set to NO). -
 * CoverCorrection The CoverCorrection element allows the case assigner to
 * provide corrected cover information, when these are incorrect in the
 * underlying payment instruction for which the cover is issued.
 */
@PreviousVersion(ClaimNonReceiptV03.class)
@NextVersion(ClaimNonReceiptV05.class)
public class ClaimNonReceiptV04 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private UnderlyingTransaction2Choice Underlying;
	private Optional<MissingCover3> CoverDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public Case3 getCase() {
		return Case;
	}

	public void setCase(Case3 Case) {
		this.Case = Case;
	}

	public UnderlyingTransaction2Choice getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction2Choice Underlying) {
		this.Underlying = Underlying;
	}

	public Optional<MissingCover3> getCoverDetails() {
		return CoverDetails;
	}

	public void setCoverDetails(Optional<MissingCover3> CoverDetails) {
		this.CoverDetails = CoverDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}