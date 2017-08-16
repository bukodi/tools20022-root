package com.tools20022.repository.catalogue.msgdef.fxtr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.WithdrawalReason1;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeWithdrawalNotification message is sent by a
 * central system to notify the withdrawal of a foreign exchange trade which was
 * previously notified to the receiver as an alleged trade. Usage The
 * ForeignExchangeTradeWithdrawalNotification message is used to confirm the
 * cancellation of a previously notified trade.
 */
public class ForeignExchangeTradeWithdrawalNotificationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text MessageIdentification;
	private Max35Text MatchingSystemUniqueReference;
	private Optional<WithdrawalReason1> WithdrawalReason;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(Max35Text MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Max35Text getMatchingSystemUniqueReference() {
		return MatchingSystemUniqueReference;
	}

	public void setMatchingSystemUniqueReference(
			Max35Text MatchingSystemUniqueReference) {
		this.MatchingSystemUniqueReference = MatchingSystemUniqueReference;
	}

	public Optional<WithdrawalReason1> getWithdrawalReason() {
		return WithdrawalReason;
	}

	public void setWithdrawalReason(Optional<WithdrawalReason1> WithdrawalReason) {
		this.WithdrawalReason = WithdrawalReason;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return SettlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(
			Optional<Exact4AlphaNumericText> SettlementSessionIdentifier) {
		this.SettlementSessionIdentifier = SettlementSessionIdentifier;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}