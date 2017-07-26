package com.tools20022.repository.catalogue.msgdef.remt;

import com.tools20022.repository.dict.msg.GroupHeader62;
import com.tools20022.repository.dict.msg.RemittanceLocation3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The RemittanceLocationAdvice message allows the originator of the message to
 * identify where the remittance advice is located for a related payment.
 */
public class RemittanceLocationAdviceV01 {

	private GroupHeader62 GroupHeader;
	private RemittanceLocation3 RemittanceLocation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader62 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader62 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RemittanceLocation3 getRemittanceLocation() {
		return RemittanceLocation;
	}

	public void setRemittanceLocation(RemittanceLocation3 RemittanceLocation) {
		this.RemittanceLocation = RemittanceLocation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}