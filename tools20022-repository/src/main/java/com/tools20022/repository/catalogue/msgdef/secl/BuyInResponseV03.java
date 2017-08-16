package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.msg.BuyIn3;
import com.tools20022.repository.dict.msg.SettlementObligation7;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The BuyInResponse message is sent by the clearing member to the central
 * counterparty as a response to the previous buy-in notification message.
 * 
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.
 * 
 * Usage The BuyInResponse may be sent in response to the BuyInNotification
 * message. However, the use of this message in the buy in process is optional
 * and depends on the rules set by each central counterparty.
 */
public class BuyInResponseV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private Optional<Max35Text> TransactionIdentification;
	private BuyIn3 BuyInResponseDetails;
	private Optional<SettlementObligation7> OriginalSettlementObligationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<Max35Text> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<Max35Text> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public BuyIn3 getBuyInResponseDetails() {
		return BuyInResponseDetails;
	}

	public void setBuyInResponseDetails(BuyIn3 BuyInResponseDetails) {
		this.BuyInResponseDetails = BuyInResponseDetails;
	}

	public Optional<SettlementObligation7> getOriginalSettlementObligationDetails() {
		return OriginalSettlementObligationDetails;
	}

	public void setOriginalSettlementObligationDetails(
			Optional<SettlementObligation7> OriginalSettlementObligationDetails) {
		this.OriginalSettlementObligationDetails = OriginalSettlementObligationDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}