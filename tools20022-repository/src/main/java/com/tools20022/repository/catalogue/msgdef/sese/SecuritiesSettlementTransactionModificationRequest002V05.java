package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionModificationRequest002V04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionDetails101;
import com.tools20022.repository.dict.choice.UpdateType26Choice;
import java.util.List;

/**
 * Scope This message is sent by an account owner to an account servicer.
 * 
 * The account owner will generally be: - a central securities depository
 * participant which has an account with a central securities depository or a
 * market infrastructure - an investment manager which has an account with a
 * custodian acting as accounting and/or settlement agent.
 * 
 * It is used to request the modification of non core business data (matching or
 * non-matching) information in a pending or settled instruction. It can also be
 * used for the enrichment of an incomplete transaction.
 * 
 * Usage The modification must only contain the data to be modified. The message
 * may also be used to: - re-send a message sent by the account owner to the
 * account servicer, - provide a third party with a copy of a message being sent
 * by the account owner for information, - re-send to a third party a copy of a
 * message being sent by the account owner for information using the relevant
 * elements in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionModificationRequest002V04.class)
public class SecuritiesSettlementTransactionModificationRequest002V05 {

	private TransactionDetails101 ModifiedTransactionDetails;
	private List<UpdateType26Choice> UpdateType;

	public TransactionDetails101 getModifiedTransactionDetails() {
		return ModifiedTransactionDetails;
	}

	public void setModifiedTransactionDetails(
			TransactionDetails101 ModifiedTransactionDetails) {
		this.ModifiedTransactionDetails = ModifiedTransactionDetails;
	}

	public List<UpdateType26Choice> getUpdateType() {
		return UpdateType;
	}

	public void setUpdateType(List<UpdateType26Choice> UpdateType) {
		this.UpdateType = UpdateType;
	}
}