package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;

/**
 * Scope The RoleAndBaselineAcceptance message is sent by a secondary bank to
 * the matching application if it accepts to join the transaction based on the
 * baseline and the role that it is expected to play. Usage The
 * RoleAndBaselineAcceptance message is sent in response to a message that is a
 * direct request to join a transaction.
 */
public class RoleAndBaselineAcceptanceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 AcceptanceIdentification;
	private MessageIdentification1 RelatedMessageReference;
	private SimpleIdentificationInformation TransactionIdentification;

	public MessageIdentification1 getAcceptanceIdentification() {
		return AcceptanceIdentification;
	}

	public void setAcceptanceIdentification(
			MessageIdentification1 AcceptanceIdentification) {
		this.AcceptanceIdentification = AcceptanceIdentification;
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
}