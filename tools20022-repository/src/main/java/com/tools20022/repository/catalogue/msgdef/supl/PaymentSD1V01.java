package com.tools20022.repository.catalogue.msgdef.supl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TransactionData1;

/**
 * Supplementary data for payment message definitions.
 */
public class PaymentSD1V01 implements GeneratedRepoBean<MMMessageDefinition> {

	private TransactionData1 CardRemittanceInformation;

	public TransactionData1 getCardRemittanceInformation() {
		return CardRemittanceInformation;
	}

	public void setCardRemittanceInformation(
			TransactionData1 CardRemittanceInformation) {
		this.CardRemittanceInformation = CardRemittanceInformation;
	}
}