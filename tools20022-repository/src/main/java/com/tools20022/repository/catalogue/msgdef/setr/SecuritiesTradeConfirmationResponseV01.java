package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.dict.msg.TransactiontIdentification4;
import com.tools20022.repository.dict.msg.Linkages15;
import com.tools20022.repository.dict.msg.StatusAndReason10;
import com.tools20022.repository.dict.msg.Clearing3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ConfirmationParties3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope Sent by an instructing party, a custodian or an affirming party to an
 * executing party (local matching) or to Central Matching Utility (CMU) to
 * affirm (accept) or disaffirm (reject) (central matching) the
 * SecuritiesTradeConfirmation message. If accepting the
 * SecuritiesTradeConfirmation message, then the trade is ready for settlement
 * processing. If rejecting the SecuritiesTradeConfirmation message, then the
 * trade is not ready for settlement. The executing party is typically the
 * broker/dealer or an intermediary system/vendor communicating on behalf of the
 * broker/dealer. The instructing party is typically the investment manager or
 * an intermediary system/vendor communicating on behalf of the investment
 * manager or of other categories of investors. The custodian or an affirming
 * party is typically the custodian, trustee, financial institution,
 * intermediary system/vendor communicating on behalf of them, or their agent.
 * The ISO 20022 Business Application Header must be used Usage Initiator: Both
 * in local and central matching, the Initiator may be the Instructing Party,
 * Custodian or Affirming party. Respondent: Executing party does not need to
 * respond if an affirmation. Executing party may respond with modification or
 * cancellation of the rejected SecuritiesTradeConfirmation message.
 */
public class SecuritiesTradeConfirmationResponseV01 {

	private TransactiontIdentification4 Identification;
	private Linkages15 References;
	private StatusAndReason10 Status;
	private Optional<Clearing3> ClearingDetails;
	private Optional<ConfirmationParties3> ConfirmationParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactiontIdentification4 getIdentification() {
		return Identification;
	}

	public void setIdentification(TransactiontIdentification4 Identification) {
		this.Identification = Identification;
	}

	public Linkages15 getReferences() {
		return References;
	}

	public void setReferences(Linkages15 References) {
		this.References = References;
	}

	public StatusAndReason10 getStatus() {
		return Status;
	}

	public void setStatus(StatusAndReason10 Status) {
		this.Status = Status;
	}

	public Optional<Clearing3> getClearingDetails() {
		return ClearingDetails;
	}

	public void setClearingDetails(Optional<Clearing3> ClearingDetails) {
		this.ClearingDetails = ClearingDetails;
	}

	public Optional<ConfirmationParties3> getConfirmationParties() {
		return ConfirmationParties;
	}

	public void setConfirmationParties(
			Optional<ConfirmationParties3> ConfirmationParties) {
		this.ConfirmationParties = ConfirmationParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}