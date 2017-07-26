package com.tools20022.repository.catalogue.msgdef.pain;

import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.pain.CreditorPaymentActivationRequestStatusReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader46;
import com.tools20022.repository.dict.msg.OriginalGroupInformation25;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction14;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The CreditorPaymentActivationRequestStatusReport message is sent by a party
 * to the next party in the creditor payment activation request chain. It is
 * used to inform the latter about the positive or negative status of a creditor
 * payment activation request (either single or file).
 */
@PreviousVersion(CreditorPaymentActivationRequestStatusReportV03.class)
@NextVersion(CreditorPaymentActivationRequestStatusReportV05.class)
public class CreditorPaymentActivationRequestStatusReportV04 {

	private GroupHeader46 GroupHeader;
	private OriginalGroupInformation25 OriginalGroupInformationAndStatus;
	private Optional<OriginalPaymentInstruction14> OriginalPaymentInformationAndStatus;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public Optional<OriginalPaymentInstruction14> getOriginalPaymentInformationAndStatus() {
		return OriginalPaymentInformationAndStatus;
	}

	public void setOriginalPaymentInformationAndStatus(
			Optional<OriginalPaymentInstruction14> OriginalPaymentInformationAndStatus) {
		this.OriginalPaymentInformationAndStatus = OriginalPaymentInformationAndStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}