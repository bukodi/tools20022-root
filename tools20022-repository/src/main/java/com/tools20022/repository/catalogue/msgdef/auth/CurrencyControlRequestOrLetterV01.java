package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.CurrencyControlHeader3;
import com.tools20022.repository.dict.msg.SupportingDocumentRequestOrLetter1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The CurrencyControlRequestOrLetter message is sent by the reporting party
 * (respectively the registration agent) to the registration agent (respectively
 * the reporting party) to send a currency control related letter or to request
 * for supporting documents.
 */
public class CurrencyControlRequestOrLetterV01 {

	private CurrencyControlHeader3 GroupHeader;
	private SupportingDocumentRequestOrLetter1 RequestOrLetter;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader3 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader3 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public SupportingDocumentRequestOrLetter1 getRequestOrLetter() {
		return RequestOrLetter;
	}

	public void setRequestOrLetter(
			SupportingDocumentRequestOrLetter1 RequestOrLetter) {
		this.RequestOrLetter = RequestOrLetter;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}