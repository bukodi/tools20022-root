package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CurrencyControlHeader2;
import com.tools20022.repository.dict.msg.CurrencyControlGroupStatus1;
import com.tools20022.repository.dict.msg.CurrencyControlPackageStatus1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The CurrencyControlStatusAdvice message is sent by either the reporting party
 * (respectively the registration agent or the registration agent (respectively
 * the reporting party) to provide a status advice on a previously sent currency
 * control message.
 * 
 * Usage: The message may be sent in response to requests on the registration of
 * the currency control contract, supporting document or on the payment
 * regulatory information notification.
 */
public class CurrencyControlStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CurrencyControlHeader2 GroupHeader;
	private CurrencyControlGroupStatus1 GroupStatus;
	private Optional<CurrencyControlPackageStatus1> PackageStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public CurrencyControlHeader2 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(CurrencyControlHeader2 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public CurrencyControlGroupStatus1 getGroupStatus() {
		return GroupStatus;
	}

	public void setGroupStatus(CurrencyControlGroupStatus1 GroupStatus) {
		this.GroupStatus = GroupStatus;
	}

	public Optional<CurrencyControlPackageStatus1> getPackageStatus() {
		return PackageStatus;
	}

	public void setPackageStatus(
			Optional<CurrencyControlPackageStatus1> PackageStatus) {
		this.PackageStatus = PackageStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}