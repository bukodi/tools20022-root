package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.TransactionIdentifications25;
import com.tools20022.repository.dict.choice.ModificationProcessingStatus4Choice;
import com.tools20022.repository.dict.msg.TransactionDetails45;
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
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.class)
@NextVersion(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.class)
public class SecuritiesSettlementTransactionModificationRequestStatusAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Identification1 ModificationRequestReference;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<TransactionIdentifications25> TransactionIdentification;
	private ModificationProcessingStatus4Choice ModificationProcessingStatus;
	private Optional<TransactionDetails45> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Identification1 getModificationRequestReference() {
		return ModificationRequestReference;
	}

	public void setModificationRequestReference(
			Identification1 ModificationRequestReference) {
		this.ModificationRequestReference = ModificationRequestReference;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return AccountOwner;
	}

	public void setAccountOwner(
			Optional<PartyIdentification36Choice> AccountOwner) {
		this.AccountOwner = AccountOwner;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return SafekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount13 SafekeepingAccount) {
		this.SafekeepingAccount = SafekeepingAccount;
	}

	public Optional<TransactionIdentifications25> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<TransactionIdentifications25> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public ModificationProcessingStatus4Choice getModificationProcessingStatus() {
		return ModificationProcessingStatus;
	}

	public void setModificationProcessingStatus(
			ModificationProcessingStatus4Choice ModificationProcessingStatus) {
		this.ModificationProcessingStatus = ModificationProcessingStatus;
	}

	public Optional<TransactionDetails45> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails45> TransactionDetails) {
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