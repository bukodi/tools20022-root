package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.AdditionalPaymentInformationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.AdditionalPaymentInformationV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.dict.msg.PaymentComplementaryInformation4;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Additional Payment Information message is sent by an account
 * servicing institution to an account owner. This message is used to provide
 * additional or corrected information on a payment instruction or statement
 * entry, in order to allow reconciliation. Usage The Additional Payment
 * Information message provides elements which are usually not reported in a
 * statement or advice (for example full remittance information or
 * identification of parties other than the account servicing institution and
 * the account owner). It complements information about a payment instruction
 * that has already been received, in the form of one or several entries of the
 * original payment instruction. The Additional Payment Information message
 * covers one and only one original payment instruction. If several payment
 * instructions need further details, multiple Additional Payment Information
 * messages must be used, one for each of the payment instructions. The
 * AdditionalPaymentInformation message may be used as a result of two
 * investigation processes and in a way outlined below. - A Claim Non Receipt
 * workflow raised by the creditor or recipient of the payment: This means that
 * the payment instruction has reached the creditor or beneficiary. The account
 * owner needs further details or correct information for its reconciliation
 * processes. The Additional Payment Information can be used to provide the
 * missing information. - A Request To Modify Payment workflow raised by the
 * debtor or one of the intermediate agents upstream: When the payment
 * instruction has reached its intended recipient and the modification does not
 * affect the accounting at the account servicing institution, this Additional
 * Payment Information message allows the account owner to receive further
 * particulars or correct information about a payment instruction or an entry
 * passed to its account. The Additional Payment Information message cannot be
 * used to trigger a request for modification of a payment instruction activity.
 * A Request To Modify Payment message must be used. In other words, if a debtor
 * or one of intermediate agent (excluding the account servicing institution of
 * the creditor) realises the some information was missing in the original
 * payment instruction, he should not use an Additional Payment Information but
 * instead a Request To Modify Payment message. It is assumed that when an
 * account servicing institution sends out an Additional Payment Information
 * message, the institution is fairly confident that this will resolve the case.
 * Therefore it does not need to wait for a Resolution Of Investigation message.
 * Neither does the account owner, or whoever receives the additional
 * information, need to send back a Resolution Of Investigation message.
 * Positive resolution in this case is implicit. Both parties are expected to
 * close the case. In the event that the problem does not go away, a party can
 * re-open the case.
 */
@PreviousVersion(AdditionalPaymentInformationV04.class)
@NextVersion(AdditionalPaymentInformationV06.class)
public class AdditionalPaymentInformationV05 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private UnderlyingTransaction2Choice Underlying;
	private PaymentComplementaryInformation4 Information;
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

	public PaymentComplementaryInformation4 getInformation() {
		return Information;
	}

	public void setInformation(PaymentComplementaryInformation4 Information) {
		this.Information = Information;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}