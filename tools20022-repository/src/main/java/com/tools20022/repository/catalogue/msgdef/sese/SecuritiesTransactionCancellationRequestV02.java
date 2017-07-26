package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesTransactionCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.References2Choice;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.choice.PartyIdentification36Choice;
import com.tools20022.repository.dict.msg.SecuritiesAccount13;
import com.tools20022.repository.dict.msg.TransactionDetails29;
import com.tools20022.repository.dict.choice.FXCancellation1Choice;
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
 * market infrastructure. Usage The transaction may be: - a securities
 * settlement transaction - an intra-position movement - a securities financing
 * transaction The instruction cannot be: - a securities settlement conditions
 * modification (another transaction processing command should be sent to
 * reverse a processing change previously requested). - a securities financing
 * modification. The message may also be used to: - re-send a message previously
 * sent, - provide a third party with a copy of a message for information, -
 * re-send to a third party a copy of a message for information. using the
 * relevant elements in the Business Application Header. ISO 15022 - 20022
 * Coexistence This ISO 20022 message is reversed engineered from ISO 15022.
 * Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesTransactionCancellationRequestV01.class)
@NextVersion(SecuritiesTransactionCancellationRequestV03.class)
public class SecuritiesTransactionCancellationRequestV02 {

	private References2Choice AccountOwnerTransactionIdentification;
	private Optional<Max35Text> AccountServicerTransactionIdentification;
	private Optional<Max35Text> MarketInfrastructureTransactionIdentification;
	private Optional<Max35Text> ProcessorTransactionIdentification;
	private Optional<PartyIdentification36Choice> AccountOwner;
	private SecuritiesAccount13 SafekeepingAccount;
	private Optional<TransactionDetails29> TransactionDetails;
	private Optional<FXCancellation1Choice> FXCancellation;
	private Optional<SupplementaryData1> SupplementaryData;

	public References2Choice getAccountOwnerTransactionIdentification() {
		return AccountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(
			References2Choice AccountOwnerTransactionIdentification) {
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

	public Optional<FXCancellation1Choice> getFXCancellation() {
		return FXCancellation;
	}

	public void setFXCancellation(Optional<FXCancellation1Choice> FXCancellation) {
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