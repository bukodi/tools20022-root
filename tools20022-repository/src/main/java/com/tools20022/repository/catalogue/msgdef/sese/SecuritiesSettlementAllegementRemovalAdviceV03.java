package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementAllegementRemovalAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementAllegementRemovalAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification3;
import com.tools20022.repository.dict.msg.Identification1;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.TransactionDetails29;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * This version is identical to the previous version. It was created
 * automatically during the 2011/2012 maintenance cycle, at the same time as new
 * versions of other Settlement and Reconciliation messages that were truly
 * impacted by change requests. This should not have been the case. In future
 * releases, SWIFT will ensure that a new version of a message is not created if
 * identical to the previous version. Scope An account servicer sends a
 * SecuritiesSettlementAllegementRemovalAdvice to an account owner to
 * acknowledge that a previously sent allegement is no longer outstanding,
 * because the alleged party sent its instruction. The account servicer/owner
 * relationship may be: - a central securities depository or another settlement
 * market infrastructure acting on behalf of their participants - an agent
 * (sub-custodian) acting on behalf of their global custodian customer, or - a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
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
@PreviousVersion(SecuritiesSettlementAllegementRemovalAdviceV02.class)
@NextVersion(SecuritiesSettlementAllegementRemovalAdviceV04.class)
public class SecuritiesSettlementAllegementRemovalAdviceV03 {

	private SettlementTypeAndIdentification3 AccountServicerTransactionIdentification;
	private Optional<Identification1> MarketInfrastructureTransactionIdentification;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<TransactionDetails29> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification3 getAccountServicerTransactionIdentification() {
		return AccountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(
			SettlementTypeAndIdentification3 AccountServicerTransactionIdentification) {
		this.AccountServicerTransactionIdentification = AccountServicerTransactionIdentification;
	}

	public Optional<Identification1> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<Identification1> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
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

	public Optional<TransactionDetails29> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails29> TransactionDetails) {
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