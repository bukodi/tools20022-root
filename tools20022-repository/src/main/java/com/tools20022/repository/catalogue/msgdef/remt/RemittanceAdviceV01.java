package com.tools20022.repository.catalogue.msgdef.remt;

import com.tools20022.repository.catalogue.msgdef.remt.RemittanceAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader62;
import com.tools20022.repository.dict.msg.RemittanceInformation8;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The RemittanceAdvice message allows the originator to provide remittance
 * details that can be associated with a payment.
 */
@NextVersion(RemittanceAdviceV02.class)
public class RemittanceAdviceV01 {

	private GroupHeader62 GroupHeader;
	private RemittanceInformation8 RemittanceInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader62 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader62 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RemittanceInformation8 getRemittanceInformation() {
		return RemittanceInformation;
	}

	public void setRemittanceInformation(
			RemittanceInformation8 RemittanceInformation) {
		this.RemittanceInformation = RemittanceInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}