package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.References45Choice;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification98;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.TransactionDetails74;
import com.tools20022.repository.dict.msg.CancellationReason13;
import com.tools20022.repository.dict.choice.FXCancellation3Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a SecuritiesTransactionCancellationRequest to an
 * account servicer to request the cancellation of a securities transaction. The
 * account owner/servicer relationship may be: - a global custodian which has an
 * account with a local custodian, or - an investment management institution
 * which manage a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct to a central securities depository ot another settlement
 * market infrastructure.
 * 
 * Usage The transaction may be: - a securities settlement transaction - an
 * intra-position movement - a securities financing transaction The instruction
 * cannot be: - a securities settlement conditions modification (another
 * transaction processing command should be sent to reverse a processing change
 * previously requested). - a securities financing modification The message may
 * also be used to: - re-send a message previously sent, - provide a third party
 * with a copy of a message for information, - re-send to a third party a copy
 * of a message for information using the relevant elements in the Business
 * Application Header.
 */
@PreviousVersion(SecuritiesTransactionCancellationRequestV04.class)
public class SecuritiesTransactionCancellationRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References45Choice AccountOwnerTransactionIdentification;
	private Optional<Max35Text> AccountServicerTransactionIdentification;
	private Optional<Max35Text> MarketInfrastructureTransactionIdentification;
	private Optional<Max35Text> ProcessorTransactionIdentification;
	private Optional<PartyIdentification98> AccountOwner;
	private SecuritiesAccount19 SafekeepingAccount;
	private Optional<TransactionDetails74> TransactionDetails;
	private Optional<CancellationReason13> CancellationReason;
	private Optional<FXCancellation3Choice> FXCancellation;
	private Optional<SupplementaryData1> SupplementaryData;

	public References45Choice getAccountOwnerTransactionIdentification() {
		return AccountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(
			References45Choice AccountOwnerTransactionIdentification) {
		this.AccountOwnerTransactionIdentification = AccountOwnerTransactionIdentification;
	}

	public Optional<Max35Text> getAccountServicerTransactionIdentification() {
		return AccountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(
			Optional<Max35Text> AccountServicerTransactionIdentification) {
		this.AccountServicerTransactionIdentification = AccountServicerTransactionIdentification;
	}

	public Optional<Max35Text> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<Max35Text> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
	}

	public Optional<Max35Text> getProcessorTransactionIdentification() {
		return ProcessorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(
			Optional<Max35Text> ProcessorTransactionIdentification) {
		this.ProcessorTransactionIdentification = ProcessorTransactionIdentification;
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

	public Optional<TransactionDetails74> getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(
			Optional<TransactionDetails74> TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
	}

	public Optional<CancellationReason13> getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(
			Optional<CancellationReason13> CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Optional<FXCancellation3Choice> getFXCancellation() {
		return FXCancellation;
	}

	public void setFXCancellation(Optional<FXCancellation3Choice> FXCancellation) {
		this.FXCancellation = FXCancellation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}