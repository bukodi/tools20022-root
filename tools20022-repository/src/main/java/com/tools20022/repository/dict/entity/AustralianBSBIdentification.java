package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ExtensiveBranchNetworkIdentifier;
import com.tools20022.repository.dict.datatype.SmallNetworkIdentifier;
import com.tools20022.repository.dict.entity.CashClearingSystemMember;

/**
 * Australian Bank State Branch (BSB) Code - identifies Australian financial
 * institutions on the Australian national clearing system. The code is assigned
 * by the Australian Payments Clearing Association (APCA).
 */
public class AustralianBSBIdentification {

	private ExtensiveBranchNetworkIdentifier ExtensiveBranchNetworkIdentification;
	private SmallNetworkIdentifier SmallNetworkIdentification;
	private CashClearingSystemMember ClearingSystemMemberIdentificationType;
	private CashClearingSystemMember ClearingSystemMember;

	public ExtensiveBranchNetworkIdentifier getExtensiveBranchNetworkIdentification() {
		return ExtensiveBranchNetworkIdentification;
	}

	public void setExtensiveBranchNetworkIdentification(
			ExtensiveBranchNetworkIdentifier ExtensiveBranchNetworkIdentification) {
		this.ExtensiveBranchNetworkIdentification = ExtensiveBranchNetworkIdentification;
	}

	public SmallNetworkIdentifier getSmallNetworkIdentification() {
		return SmallNetworkIdentification;
	}

	public void setSmallNetworkIdentification(
			SmallNetworkIdentifier SmallNetworkIdentification) {
		this.SmallNetworkIdentification = SmallNetworkIdentification;
	}

	public CashClearingSystemMember getClearingSystemMemberIdentificationType() {
		return ClearingSystemMemberIdentificationType;
	}

	public void setClearingSystemMemberIdentificationType(
			CashClearingSystemMember ClearingSystemMemberIdentificationType) {
		this.ClearingSystemMemberIdentificationType = ClearingSystemMemberIdentificationType;
	}

	public CashClearingSystemMember getClearingSystemMember() {
		return ClearingSystemMember;
	}

	public void setClearingSystemMember(
			CashClearingSystemMember ClearingSystemMember) {
		this.ClearingSystemMember = ClearingSystemMember;
	}
}