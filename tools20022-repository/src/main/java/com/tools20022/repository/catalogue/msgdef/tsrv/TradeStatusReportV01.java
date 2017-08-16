package com.tools20022.repository.catalogue.msgdef.tsrv;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeStatusReport1;
import com.tools20022.repository.dict.msg.PartyAndSignature2;
import java.util.Optional;

/**
 * The TradeStatusReport message is exchanged between parties involved in the
 * trade finance domain to report the transaction level status of a transaction
 * previously received. It informs the sender about the positive or negative
 * status of the referenced transaction, such as acceptance or rejection
 * resulting from technical validation performed by the parser and/or
 * front-office applications. It can be used, for example, to acknowledge
 * receipt of a transaction, to report a syntactical error, to report an
 * unrecognised digital signature, to indicate that further processing is
 * pending, and to indicate that a transaction has been technically accepted for
 * processing by the back-office application. Multiple TradeStatusReport
 * messages may be progressively sent in response to the incremental processing
 * of a single transaction.
 */
public class TradeStatusReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeStatusReport1 TradeStatusAdviceDetails;
	private Optional<PartyAndSignature2> DigitalSignature;

	public TradeStatusReport1 getTradeStatusAdviceDetails() {
		return TradeStatusAdviceDetails;
	}

	public void setTradeStatusAdviceDetails(
			TradeStatusReport1 TradeStatusAdviceDetails) {
		this.TradeStatusAdviceDetails = TradeStatusAdviceDetails;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return DigitalSignature;
	}

	public void setDigitalSignature(
			Optional<PartyAndSignature2> DigitalSignature) {
		this.DigitalSignature = DigitalSignature;
	}
}