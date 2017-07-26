package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SecuritiesTradeConfirmationStatusAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactiontIdentification4;
import com.tools20022.repository.dict.msg.Linkages18;
import com.tools20022.repository.dict.choice.AffirmationStatus6Choice;
import java.util.Optional;
import com.tools20022.repository.dict.choice.ProcessingStatus17Choice;
import com.tools20022.repository.dict.choice.MatchingStatus23Choice;
import com.tools20022.repository.dict.choice.ReplacementProcessingStatus7Choice;
import com.tools20022.repository.dict.choice.CancellationProcessingStatus6Choice;
import com.tools20022.repository.dict.msg.Order18;
import com.tools20022.repository.dict.msg.ConfirmationParties4;
import com.tools20022.repository.dict.msg.SettlementParties23;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This message is sent from Central Matching Utility (CMU) to an
 * executing party or an instructing party to advise the status of the
 * SecuritiesTradeConfirmation message previously sent by the party. The status
 * may be a processing, pending processing, affirmed or disaffirmed, cancel or
 * replacement by an instructing party, a custodian or an affirming party,
 * internal matching, and/or matching status. The instructing party is typically
 * the investment manager or an intermediary system/vendor communicating on
 * behalf of the investment manager or of other categories of investors. The
 * executing party is typically the broker/dealer or an intermediary
 * system/vendor communicating on behalf of the broker/dealer. The ISO 20022
 * Business Application Header must be used Usage Initiator: In central matching
 * the Initiator is the Central Matching Utility. Respondent: no response is
 * needed by the recipient of the message.
 */
@PreviousVersion(SecuritiesTradeConfirmationStatusAdviceV01.class)
public class SecuritiesTradeConfirmationStatusAdviceV02 {

	private TransactiontIdentification4 Identification;
	private Linkages18 References;
	private Optional<AffirmationStatus6Choice> AffirmationStatus;
	private Optional<ProcessingStatus17Choice> ProcessingStatus;
	private Optional<MatchingStatus23Choice> MatchingStatus;
	private Optional<ReplacementProcessingStatus7Choice> ReplacementProcessingStatus;
	private Optional<CancellationProcessingStatus6Choice> CancellationProcessingStatus;
	private Optional<Order18> PartyTradingDetails;
	private Optional<Order18> CounterpartyTradingDetails;
	private Optional<ConfirmationParties4> ConfirmationParties;
	private Optional<SettlementParties23> DeliveringSettlementParties;
	private Optional<SettlementParties23> ReceivingSettlementParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactiontIdentification4 getIdentification() {
		return Identification;
	}

	public void setIdentification(TransactiontIdentification4 Identification) {
		this.Identification = Identification;
	}

	public Linkages18 getReferences() {
		return References;
	}

	public void setReferences(Linkages18 References) {
		this.References = References;
	}

	public Optional<AffirmationStatus6Choice> getAffirmationStatus() {
		return AffirmationStatus;
	}

	public void setAffirmationStatus(
			Optional<AffirmationStatus6Choice> AffirmationStatus) {
		this.AffirmationStatus = AffirmationStatus;
	}

	public Optional<ProcessingStatus17Choice> getProcessingStatus() {
		return ProcessingStatus;
	}

	public void setProcessingStatus(
			Optional<ProcessingStatus17Choice> ProcessingStatus) {
		this.ProcessingStatus = ProcessingStatus;
	}

	public Optional<MatchingStatus23Choice> getMatchingStatus() {
		return MatchingStatus;
	}

	public void setMatchingStatus(
			Optional<MatchingStatus23Choice> MatchingStatus) {
		this.MatchingStatus = MatchingStatus;
	}

	public Optional<ReplacementProcessingStatus7Choice> getReplacementProcessingStatus() {
		return ReplacementProcessingStatus;
	}

	public void setReplacementProcessingStatus(
			Optional<ReplacementProcessingStatus7Choice> ReplacementProcessingStatus) {
		this.ReplacementProcessingStatus = ReplacementProcessingStatus;
	}

	public Optional<CancellationProcessingStatus6Choice> getCancellationProcessingStatus() {
		return CancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(
			Optional<CancellationProcessingStatus6Choice> CancellationProcessingStatus) {
		this.CancellationProcessingStatus = CancellationProcessingStatus;
	}

	public Optional<Order18> getPartyTradingDetails() {
		return PartyTradingDetails;
	}

	public void setPartyTradingDetails(Optional<Order18> PartyTradingDetails) {
		this.PartyTradingDetails = PartyTradingDetails;
	}

	public Optional<Order18> getCounterpartyTradingDetails() {
		return CounterpartyTradingDetails;
	}

	public void setCounterpartyTradingDetails(
			Optional<Order18> CounterpartyTradingDetails) {
		this.CounterpartyTradingDetails = CounterpartyTradingDetails;
	}

	public Optional<ConfirmationParties4> getConfirmationParties() {
		return ConfirmationParties;
	}

	public void setConfirmationParties(
			Optional<ConfirmationParties4> ConfirmationParties) {
		this.ConfirmationParties = ConfirmationParties;
	}

	public Optional<SettlementParties23> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties23> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties23> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties23> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}