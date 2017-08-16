package com.tools20022.repository.catalogue.msgdef.remt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.remt.RemittanceAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader62;
import com.tools20022.repository.dict.msg.RemittanceInformation13;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The RemittanceAdvice message allows the originator to provide remittance
 * details that can be associated with a payment.
 */
@PreviousVersion(RemittanceAdviceV02.class)
public class RemittanceAdviceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader62 GroupHeader;
	private RemittanceInformation13 RemittanceInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader62 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader62 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public RemittanceInformation13 getRemittanceInformation() {
		return RemittanceInformation;
	}

	public void setRemittanceInformation(
			RemittanceInformation13 RemittanceInformation) {
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