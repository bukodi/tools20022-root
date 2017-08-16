package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TransactiontIdentification4;
import com.tools20022.repository.dict.msg.Linkages15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.OtherParties18;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope Sent by an executing party to an instructing party directly or through
 * Central Matching Utility (CMU) to cancel the referenced
 * SecuritiesTradeConfirmation message that was previously sent. The instructing
 * party is typically the investment manager or an intermediary system/vendor
 * communicating on behalf of the investment manager or of other categories of
 * investors. The executing party is typically the broker/dealer or an
 * intermediary system/vendor communicating on behalf of the broker/dealer. It
 * may also be used to cancel the trade confirmation previously sent from an
 * executing party or an instructing party to a custodian or an affirming party
 * directly or through CMU. The ISO 20022 Business Application Header must be
 * used Usage Initiator: Both in local and central matching, the Initiator may
 * be either the Executing Party or Instructing Party. Respondent: Instructing
 * party, a custodian or an affirming party optionally responds with
 * SecuritiesTradeConfirmationResponse (accept or reject) message.
 */
public class SecuritiesTradeConfirmationCancellationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactiontIdentification4 Identification;
	private Optional<Linkages15> References;
	private Optional<OtherParties18> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactiontIdentification4 getIdentification() {
		return Identification;
	}

	public void setIdentification(TransactiontIdentification4 Identification) {
		this.Identification = Identification;
	}

	public Optional<Linkages15> getReferences() {
		return References;
	}

	public void setReferences(Optional<Linkages15> References) {
		this.References = References;
	}

	public Optional<OtherParties18> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties18> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}