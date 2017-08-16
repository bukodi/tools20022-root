package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.choice.References60Choice;
import com.tools20022.repository.dict.datatype.RestrictedFINXMax16Text;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PartyIdentification109;
import com.tools20022.repository.dict.msg.SecuritiesAccount30;
import com.tools20022.repository.dict.msg.TransactionDetails83;
import com.tools20022.repository.dict.msg.CancellationReason19;
import com.tools20022.repository.dict.choice.FXCancellation4Choice;
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
public class SecuritiesTransactionCancellationRequest002V05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private References60Choice AccountOwnerTransactionIdentification;
	private Optional<RestrictedFINXMax16Text> AccountServicerTransactionIdentification;
	private Optional<RestrictedFINXMax16Text> MarketInfrastructureTransactionIdentification;
	private Optional<RestrictedFINXMax16Text> ProcessorTransactionIdentification;
	private Optional<PartyIdentification109> AccountOwner;
	private SecuritiesAccount30 SafekeepingAccount;
	private Optional<TransactionDetails83> TransactionDetails;
	private Optional<CancellationReason19> CancellationReason;
	private Optional<FXCancellation4Choice> FXCancellation;
	private Optional<SupplementaryData1> SupplementaryData;

	public References60Choice getAccountOwnerTransactionIdentification() {
		return AccountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(
			References60Choice AccountOwnerTransactionIdentification) {
		this.AccountOwnerTransactionIdentification = AccountOwnerTransactionIdentification;
	}

	public Optional<RestrictedFINXMax16Text> getAccountServicerTransactionIdentification() {
		return AccountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(
			Optional<RestrictedFINXMax16Text> AccountServicerTransactionIdentification) {
		this.AccountServicerTransactionIdentification = AccountServicerTransactionIdentification;
	}

	public Optional<RestrictedFINXMax16Text> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<RestrictedFINXMax16Text> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
	}

	public Optional<RestrictedFINXMax16Text> getProcessorTransactionIdentification() {
		return ProcessorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(
			Optional<RestrictedFINXMax16Text> ProcessorTransactionIdentification) {
		this.ProcessorTransactionIdentification = ProcessorTransactionIdentification;
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

	public Optional<CancellationReason19> getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(
			Optional<CancellationReason19> CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Optional<FXCancellation4Choice> getFXCancellation() {
		return FXCancellation;
	}

	public void setFXCancellation(Optional<FXCancellation4Choice> FXCancellation) {
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