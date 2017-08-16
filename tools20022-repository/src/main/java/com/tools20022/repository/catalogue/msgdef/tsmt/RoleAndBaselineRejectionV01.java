package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.Reason2;
import java.util.Optional;

/**
 * Scope The RoleAndBaselineRejection message is sent by a secondary bank to the
 * matching application if it rejects to join the transaction based on the
 * baseline and the role that it is expected to play. Usage The
 * RoleAndBaselineRejection message is sent in response to a message that is a
 * direct request to join a transaction.
 */
public class RoleAndBaselineRejectionV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RejectionIdentification;
	private MessageIdentification1 RelatedMessageReference;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<Reason2> RejectionReason;

	public MessageIdentification1 getRejectionIdentification() {
		return RejectionIdentification;
	}

	public void setRejectionIdentification(
			MessageIdentification1 RejectionIdentification) {
		this.RejectionIdentification = RejectionIdentification;
	}

	public MessageIdentification1 getRelatedMessageReference() {
		return RelatedMessageReference;
	}

	public void setRelatedMessageReference(
			MessageIdentification1 RelatedMessageReference) {
		this.RelatedMessageReference = RelatedMessageReference;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			SimpleIdentificationInformation TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<Reason2> getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(Optional<Reason2> RejectionReason) {
		this.RejectionReason = RejectionReason;
	}
}