package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestStatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader46;
import com.tools20022.repository.dict.msg.OriginalGroupInformation25;
import com.tools20022.repository.dict.msg.OriginalPaymentInformation5;
import java.util.Optional;

/**
 * Scope This message is sent by a party to the next party in the creditor
 * payment activation request chain. It is used to inform the latter about the
 * positive or negative status of a creditor payment activation request (either
 * single or file).
 */
@NextVersion(CreditorPaymentActivationRequestStatusReportV02.class)
public class CreditorPaymentActivationRequestStatusReportV01 {

	private GroupHeader46 GroupHeader;
	private OriginalGroupInformation25 OriginalGroupInformationAndStatus;
	private Optional<OriginalPaymentInformation5> OriginalPaymentInformationAndStatus;

	public GroupHeader46 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader46 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public OriginalGroupInformation25 getOriginalGroupInformationAndStatus() {
		return OriginalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(
			OriginalGroupInformation25 OriginalGroupInformationAndStatus) {
		this.OriginalGroupInformationAndStatus = OriginalGroupInformationAndStatus;
	}

	public Optional<OriginalPaymentInformation5> getOriginalPaymentInformationAndStatus() {
		return OriginalPaymentInformationAndStatus;
	}

	public void setOriginalPaymentInformationAndStatus(
			Optional<OriginalPaymentInformation5> OriginalPaymentInformationAndStatus) {
		this.OriginalPaymentInformationAndStatus = OriginalPaymentInformationAndStatus;
	}
}