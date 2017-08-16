package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Identification16;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.TransactionIdentifications37;
import com.tools20022.repository.dict.choice.ModificationProcessingStatus8Choice;
import com.tools20022.repository.dict.msg.TransactionDetails84;
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
public class SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Identification16 ModificationRequestReference;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount30 SafekeepingAccount;
	private Optional<TransactionIdentifications37> TransactionIdentification;
	private ModificationProcessingStatus8Choice ModificationProcessingStatus;
	private Optional<TransactionDetails84> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification16 getModificationRequestReference() {
		return ModificationRequestReference;
	}

	public void setModificationRequestReference(
			Identification16 ModificationRequestReference) {
		this.ModificationRequestReference = ModificationRequestReference;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(Optional<PartyIdentification109> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount30 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount30 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<TransactionIdentifications37> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications37> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ModificationProcessingStatus8Choice getModificationProcessingStatus() {
		return ModificationProcessingStatus;
	}

	public void setModificationProcessingStatus(
			ModificationProcessingStatus8Choice ModificationProcessingStatus) {
		this.ModificationProcessingStatus = ModificationProcessingStatus;
	}

	public Optional<TransactionDetails84> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails84> TransactionDetails) {
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