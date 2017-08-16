package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader3;
import com.tools20022.repository.dict.msg.SupportingDocument1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The CurrencyControlSupportingDocumentDelivery message is sent by either the
 * reporting party (respectively the registration agent or the registration
 * agent (respectively the reporting party) in response to the supporting
 * document request.
 */
public class CurrencyControlSupportingDocumentDeliveryV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader3 GroupHeader;
	private SupportingDocument1 SupportingDocument;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader3 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader3 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public SupportingDocument1 getSupportingDocument() {
		return SupportingDocument;
	}

	public void setSupportingDocument(SupportingDocument1 SupportingDocument) {
		this.SupportingDocument = SupportingDocument;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}