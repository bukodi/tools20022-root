package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Identification14;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.TransactionIdentifications33;
import com.tools20022.repository.dict.choice.ModificationProcessingStatus7Choice;
import com.tools20022.repository.dict.msg.TransactionDetails81;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account
 * owner to advise the status of a SecuritiesSettlementModificationRequest
 * message previously sent by the account owner. The account servicer may be: -
 * a central securities depository or another settlement market infrastructure
 * managing securities settlement transactions on behalf of their participants -
 * an custodian acting as an accounting and/or settlement agent.
 * 
 * Usage The message may also be used to: - re-send a message sent by the
 * account owner to the account servicer, - provide a third party with a copy of
 * a message being sent by the account owner for information, - re-send to a
 * third party a copy of a message being sent by the account owner for
 * information using the relevant elements in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.class)
public class SecuritiesSettlementTransactionModificationRequestStatusAdviceV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Identification14 ModificationRequestReference;
	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount19 SafekeepingAccount;
	private Optional<TransactionIdentifications33> TransactionIdentification;
	private ModificationProcessingStatus7Choice ModificationProcessingStatus;
	private Optional<TransactionDetails81> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification14 getModificationRequestReference() {
		return ModificationRequestReference;
	}

	public void setModificationRequestReference(
			Identification14 ModificationRequestReference) {
		this.ModificationRequestReference = ModificationRequestReference;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification98> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount19 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount19 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<TransactionIdentifications33> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications33> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ModificationProcessingStatus7Choice getModificationProcessingStatus() {
		return ModificationProcessingStatus;
	}

	public void setModificationProcessingStatus(
			ModificationProcessingStatus7Choice ModificationProcessingStatus) {
		this.ModificationProcessingStatus = ModificationProcessingStatus;
	}

	public Optional<TransactionDetails81> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails81> TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}