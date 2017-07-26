package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification22;
import com.tools20022.repository.dict.msg.Identification16;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.TransactionDetails83;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a SecuritiesSettlementAllegementRemovalAdvice
 * to an account owner to acknowledge that a previously sent allegement is no
 * longer outstanding, because the alleged party sent its instruction. The
 * account servicer/owner relationship may be: - a central securities depository
 * or another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
public class SecuritiesSettlementAllegementRemovalAdvice002V04 {

	private SettlementTypeAndIdentification22 AccountServicerTransactionIdentification;
	private Optional<Identification16> MarketInfrastructureTransactionIdentification;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount30 SafekeepingAccount;
	private Optional<TransactionDetails83> TransactionDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification22 getAccountServicerTransactionIdentification() {
		return AccountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(
			SettlementTypeAndIdentification22 AccountServicerTransactionIdentification) {
		this.AccountServicerTransactionIdentification = AccountServicerTransactionIdentification;
	}

	public Optional<Identification16> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<Identification16> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
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

	public Optional<TransactionDetails83> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails83> TransactionDetails) {
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