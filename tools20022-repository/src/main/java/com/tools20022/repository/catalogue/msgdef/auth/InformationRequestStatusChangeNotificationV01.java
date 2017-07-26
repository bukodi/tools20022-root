package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * This message is sent by the authorities (police, customs, tax authorities,
 * enforcement authorities) to a financial institution to inform the financial
 * institution that the confidentiality status of the investigation has changed.
 */
public class InformationRequestStatusChangeNotificationV01 {

	private Max35Text OriginalBusinessQuery;
	private YesNoIndicator ConfidentialityStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getOriginalBusinessQuery() {
		return OriginalBusinessQuery;
	}

	public void setOriginalBusinessQuery(Max35Text OriginalBusinessQuery) {
		this.OriginalBusinessQuery = OriginalBusinessQuery;
	}

	public YesNoIndicator getConfidentialityStatus() {
		return ConfidentialityStatus;
	}

	public void setConfidentialityStatus(YesNoIndicator ConfidentialityStatus) {
		this.ConfidentialityStatus = ConfidentialityStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}